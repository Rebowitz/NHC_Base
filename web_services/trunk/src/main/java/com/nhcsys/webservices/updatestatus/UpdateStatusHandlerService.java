package com.nhcsys.webservices.updatestatus;

/**
 *  UpdateStatusHandlerService java skeleton for the axisService
 *  This class is responsible of storing Status of the Products 
 *  installed in the customer's PC.
 *  @author mouad.zouitni
 *  @version 1.0
 *  @since Nov. 14th, 2007
 */

import java.sql.Connection;

import org.apache.log4j.Logger;

import com.nhcsys.common.SessionHelper;
import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.common.exception.SessionException;
import com.nhcsys.dataaccess.dao.UpdateStatusDao;
import com.nhcsys.dataaccess.dto.UpdateStatus;
import com.nhcsys.dataaccess.dto.WsSessions;
import com.nhcsys.dataaccess.factory.UpdateStatusDaoFactory;
import com.nhcsys.dataaccess.jdbc.ResourceManager;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.FaultTypeElementDocument.FaultTypeElement;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement;

public class UpdateStatusHandlerService implements UpdateStatusServiceSkeletonInterface {
	
	private static final Logger log = Logger
				.getLogger(UpdateStatusHandlerService.class);
	private static final String CLASS = UpdateStatusHandlerService.class.getName();

	public UpdateStatusHandlerService(){
		super();
	}
	public ProcessCompletedStatusElementDocument UpdateStatus(UpdateStatusElementDocument updateStatusElement)
			throws UpdateStatusFailure {
		String methodName = CLASS+"::StoreInstalledSoftware() -- ";
		log.debug(methodName + " Starting...");
		Connection conn = null;
		

		try {
			ProcessCompletedStatusElementDocument resp = ProcessCompletedStatusElementDocument.Factory.newInstance();
			//Let's make sure we have an element
			if (updateStatusElement != null && updateStatusElement.getUpdateStatusElement() != null) {
				// Get the Connection
				conn = ResourceManager.getConnection(); 
				conn.setAutoCommit(false);
				UpdateStatusElement updateElement = updateStatusElement.getUpdateStatusElement();
				String sessionId = updateElement.getSessionID();
				WsSessions wsSession = null;
				try {
					wsSession = SessionHelper.validateSession(sessionId);
					// Update session timestamp
					SessionHelper.updateSessionTimeStamp(wsSession,conn);
					log.debug(methodName + "successfully retreived data for sessionId: " + sessionId);
				} catch (SessionException ex) {
					log.error(methodName + "Problems updating session information given Session id"+ sessionId, ex);
					
					throw createException(ex.getMessage(),
										  ex.getFaultCode(),
										  ex.getFaultDescription(),
										  ex.getFaultCause());
				} catch (Throwable t) {
					log.error(methodName + "Problems updating session information given Session id"+ sessionId, t);
					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
					throw createException(t.getMessage(),
							  myEnum.getCode(),
							  myEnum.getDescription(),
							  t.getMessage());
				}
				// The method call above guarrantees that the object is not null if we don't get an exception
				Long machineId = wsSession.getMachineId();
				log.debug(methodName + "Found machine Id: "+ machineId +" for sessionId: " + sessionId);
				//Time to store the information now
				UpdateStatusDao updateStatusDao = UpdateStatusDaoFactory.create(conn);
				UpdateStatus updateStatus = null;
				UpdateStatusType[] statusList = updateElement.getTaskListArray();
				if (statusList != null) {
					for (UpdateStatusType statusType:statusList) {
						validateUpdateStatusType(statusType);
						updateStatus = new UpdateStatus();
						updateStatus.setSessionId(sessionId);
						updateStatus.setMachineId(machineId);
						updateStatus.setProductId(statusType.getProductID().trim());
						updateStatus.setDescription(statusType.getDescription().trim());
						updateStatus.setReport(statusType.getReport().trim());
						updateStatus.setStatus(statusType.getStatus().toString());
						updateStatusDao.insert(updateStatus);
						log.debug(methodName + "Inserted record into the database");
					}
				} else {
					log.error(methodName + "Empty Element List");
					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_UPDATE_STATUS_LIST;
					
					throw createException("Invalid Update Status List. List is either empty or null", 
										  myEnum.getCode(),
										  myEnum.getDescription(),
										  null);
				} //end if list is empty
			} else {
				log.error(methodName+" the response document or element is null");
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_UPDATE_STATUS_ELEMENT;
				throw createException("Invalid Update Status Request. Request is either empty or null", 
									  myEnum.getCode(),
									  myEnum.getDescription(),
									  null);
			} //end if element is null
			ProcessCompletedStatusElement element = resp.addNewProcessCompletedStatusElement();
			element.setProcesscompleted(true);
			conn.commit();
			return resp;
		} catch (UpdateStatusFailure usEx) {
			if (conn != null) {
				// Rollback
				try {
					conn.rollback();
				} catch (Exception ex){
					log.error(methodName + "Error rollingback: " + ex.getMessage(), ex);
				}
			}
			throw usEx;
		}catch (Exception ex) {
			if (conn != null) {
				// Rollback
				try {
					conn.rollback();
				} catch (Exception exConn){
					log.error(methodName + "Error rollingback: " + exConn.getMessage(), exConn);
				}
			}
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			log.error(methodName + "Caught an exception ",ex);
			throw createException("Caught an exception::"+ ex.getMessage(), 
					  myEnum.getCode(),
					  myEnum.getDescription(ex.getMessage()),
					  ex.getMessage());
		} finally {
			if (conn != null){
				try {
				conn.close();
				} catch (Exception ex){
					log.error(methodName + "Error while closing Connection: " + ex.getMessage(), ex);
				}
			}
			log.debug(methodName + " Ending...");
		}
	}
	
	/**
	 * validate storeType data. Throw an exception if not valid
	 * @author mouad.zouitni
	 * @since Nov. 2nd 2007
	 */
	private void validateUpdateStatusType (UpdateStatusType statusType) 
		throws UpdateStatusFailure{
		
		WebServicesFaultTypesEnum myEnum = null;
		
		String methodName = CLASS+"validateUpdateStatusType: --";
		log.debug(methodName + "Starting Validation ");
		
		String productId = statusType.getProductID();
				
		if (productId == null || "".equals(productId.trim())) {
			log.error(methodName + "Missing Product Id");
			myEnum = WebServicesFaultTypesEnum.INVALID_UPDATE_STATUS_PRODUCT_ID;
			throw createException("Invalid Product Id. Product Id is either empty or null", 
								  myEnum.getCode(),
								  myEnum.getDescription(),
								  null);
		}
		String desc = statusType.getDescription();
		
		if (desc == null || "".equals(desc.trim())) {
			log.error(methodName + "Missing Description");
			myEnum = WebServicesFaultTypesEnum.INVALID_UPDATE_STATUS_DESCRIPTION;
			throw createException("Invalid Description. Description is either empty or null", 
								  myEnum.getCode(),
								  myEnum.getDescription(),
								  null);
		}
		
		String report = statusType.getDescription();
		
		if (report == null || "".equals(report.trim())) {
			log.error(methodName + "Missing Report");
			myEnum = WebServicesFaultTypesEnum.INVALID_UPDATE_STATUS_REPORT;
			throw createException("Invalid Report. Report is either empty or null", 
								  myEnum.getCode(),
								  myEnum.getDescription(),
								  null);
		}
		
		String status = statusType.getDescription();
		
		if (status == null || "".equals(status.trim())) {
			log.error(methodName + "Missing Status");
			myEnum = WebServicesFaultTypesEnum.INVALID_UPDATE_STATUS_REPORT;
			throw createException("Invalid Status. Status is either empty or null", 
								  myEnum.getCode(),
								  myEnum.getDescription(),
								  null);
		}
				
		log.debug(methodName + "Ending Validation ");
		
	}
	
	/**
	 * Create Exception with appropriate Values and return it
	 */
	private UpdateStatusFailure createException(String exceptionMessage, Long faultCode, 
														  String faultDesc, String faultCause) {
		
		UpdateStatusFailure sfExp = new UpdateStatusFailure(exceptionMessage);
		FaultTypeElementDocument elementDoc = FaultTypeElementDocument.Factory.newInstance();
		FaultTypeElement faultElement = elementDoc.addNewFaultTypeElement();
		faultElement.setCause(faultCause);
		faultElement.setCode(faultCode);
		faultElement.setDescription(faultDesc);
		sfExp.setFaultMessage(elementDoc);
		log.error("Log the Exception: " , sfExp);
		return sfExp;
	}
}