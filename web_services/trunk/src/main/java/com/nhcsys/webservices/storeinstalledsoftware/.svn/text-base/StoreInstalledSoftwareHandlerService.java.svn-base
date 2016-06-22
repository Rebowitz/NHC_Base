
package com.nhcsys.webservices.storeinstalledsoftware;


import java.sql.Connection;

import org.apache.log4j.Logger;

import com.nhcsys.common.SessionHelper;
import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.common.WebServicesHelper;
import com.nhcsys.common.exception.SessionException;
import com.nhcsys.dataaccess.dao.InstalledSoftwareDao;
import com.nhcsys.dataaccess.dto.InstalledSoftware;
import com.nhcsys.dataaccess.dto.WsSessions;
import com.nhcsys.dataaccess.factory.InstalledSoftwareDaoFactory;
import com.nhcsys.dataaccess.jdbc.ResourceManager;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareRequestElementDocument;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareResponseElementDocument;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.FaultTypeElementDocument.FaultTypeElement;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareRequestElementDocument.StoreInstalledSoftwareRequestElement;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareResponseElementDocument.StoreInstalledSoftwareResponseElement;


/**
 *  StoreInstalledSoftwareServiceSkeleton java skeleton for the axisService
 */
public class StoreInstalledSoftwareHandlerService
    implements StoreInstalledSoftwareServiceSkeletonInterface {
	
	private static final Logger log = Logger
    		.getLogger(StoreInstalledSoftwareHandlerService.class);
	private static final String CLASS = StoreInstalledSoftwareHandlerService.class.getName();
	
	public StoreInstalledSoftwareHandlerService() {
		super();
		// Auto-generated constructor stub
	}

	public StoreInstalledSoftwareResponseElementDocument StoreInstalledSoftware(
					StoreInstalledSoftwareRequestElementDocument storeInstalledSoftwareRequestElement) 
		throws StoreInstalledSoftwareFailure {
		
		String methodName = CLASS+"::StoreInstalledSoftware() -- ";
		log.debug(methodName + " Starting...");
		Connection conn = null;
		

		try {
			
			StoreInstalledSoftwareResponseElementDocument resp = StoreInstalledSoftwareResponseElementDocument.Factory.newInstance();
			//Let's make sure nothing is null
			if (storeInstalledSoftwareRequestElement != null && 
					storeInstalledSoftwareRequestElement.getStoreInstalledSoftwareRequestElement() != null) {
				
				//Get the Connection
				conn = ResourceManager.getConnection(); 
				conn.setAutoCommit(false);
				StoreInstalledSoftwareRequestElement storeInstallElement = storeInstalledSoftwareRequestElement.
											getStoreInstalledSoftwareRequestElement();
				String sessionId = storeInstallElement.getSessionID();
				WsSessions wsSession = null;
				try {
					wsSession = SessionHelper.validateSession(sessionId);
					// Update session timestamp
					SessionHelper.updateSessionTimeStamp(wsSession,conn);
					log.debug(methodName + "successfully retreived data for sessionId: " + sessionId);
				} catch (SessionException ex) {
					log.error(methodName + "Problems retreiving session information given Session id"+ sessionId, ex);
					
					throw createException(ex.getMessage(),
										  ex.getFaultCode(),
										  ex.getFaultDescription(),
										  ex.getFaultCause());
				} catch (Throwable t) {
					log.error(methodName + "Problems retrieving session information given Session id"+ sessionId, t);
					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
					throw createException(t.getMessage(),
							  myEnum.getCode(),
							  myEnum.getDescription(),
							  t.getMessage());
				}
				
				//The method call above guarrantees that the object is not null if we don't get an exception
				Long machineId = wsSession.getMachineId();
				log.debug(methodName + "Found machine Id: "+ machineId +" for sessionId: " + sessionId);
				//Time to store the information now
				InstalledSoftwareDao installedSoftwareDao = InstalledSoftwareDaoFactory.create(conn);
				InstalledSoftware installedSftw = null;
				Long customerId = WebServicesHelper.getCustomerIDFromSession(sessionId);
				
				StoreInstalledSoftwareListType listElement = storeInstallElement.getStoreInstalledSoftwareListElement();
				if (listElement != null && listElement.getStoreInstalledSoftwareElementArray() != null ) {
					
					// go through the array and start adding to the DB
					for (StoreInstalledSoftwareType storeType : listElement.getStoreInstalledSoftwareElementArray()) {
					
						//If everything is valid we will continue. otherwise, an exception is thrown 
						validateStoreInstalledSoftwareType(storeType);
						installedSftw = new InstalledSoftware();
						installedSftw.setProductKey(storeType.getProductKey().trim());
						String compName = storeType.getCompanyName();
						if (compName != null) {
							compName = storeType.getCompanyName().trim();
						}
						String prodVersion = storeType.getProductVersion();
						if (prodVersion != null) {
							prodVersion = storeType.getProductVersion().trim();
						}
						String prodName = storeType.getProductName();
						if (prodName != null) {
							prodName = storeType.getProductName().trim();
						}
						//TODO: set cust Id
						installedSftw.setCustomerId(customerId);
						installedSftw.setCompanyName(compName);
						installedSftw.setProductVersion(prodVersion);
						installedSftw.setProductName(prodName);
						installedSftw.setMachineId(machineId);
						installedSoftwareDao.insert(installedSftw);
						log.debug(methodName + "Inserting record into the database");
 
					}	//end for loop
					// Everything went well now commit
					conn.commit();
				} //end if statment 
				else {
					log.error(methodName + "Empty Element List");
					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_STOREINSTALLEDSOFTWARE_LIST;
					
					throw createException("Invalid List of Store Installed Software. List is either empty or null", 
										  myEnum.getCode(),
										  myEnum.getDescription(),
										  null);
				}
			}//end if statement 
			else {
				log.error(methodName+" the response document or element is null");
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_STOREINSTALLEDSOFTWARE_ELEMENT;
				throw createException("Invalid Store Installed Software Request. Request is either empty or null", 
									  myEnum.getCode(),
									  myEnum.getDescription(),
									  null);
			} //end if
			
			StoreInstalledSoftwareResponseElement elment = resp.addNewStoreInstalledSoftwareResponseElement();
			elment.setAcknowledge(true);
			log.debug(resp.toString());
			return resp;
			
		} catch (StoreInstalledSoftwareFailure sf) {
			if (conn != null){
				// Rollback
				try {
					conn.rollback();
				} catch (Exception ex){
					log.error(methodName + "Error rollingback" + ex.getMessage(), ex);
				}
			}
			throw sf;
		} catch (Exception ex) {

			if (conn != null){
				// Rollback
				try {
					conn.rollback();
				} catch (Exception exCon){
					log.error(methodName + "Error rollingback" + exCon.getMessage(), exCon);
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
	private void validateStoreInstalledSoftwareType (StoreInstalledSoftwareType storeType) 
		throws StoreInstalledSoftwareFailure{
		
		WebServicesFaultTypesEnum myEnum = null;
		
		String methodName = CLASS+"validateStoreInstalledSoftwareType: --";
		log.debug(methodName + "Starting Validation ");
		
		String productKey = storeType.getProductKey();
				
		if (productKey == null || "".equals(productKey.trim())) {
			log.error(methodName + "Missing Product Key");
			myEnum = WebServicesFaultTypesEnum.INVALID_PRODUCT_KEY;
			throw createException("Invalid Product Key. Product Key is either empty or null", 
								  myEnum.getCode(),
								  myEnum.getDescription(),
								  null);
		}
				
		log.debug(methodName + "Ending Validation ");
		
	}
	
	/**
	 * Create Exception with appropriate Values and return it
	 */
	private StoreInstalledSoftwareFailure createException(String exceptionMessage, Long faultCode, 
														  String faultDesc, String faultCause) {
		
		StoreInstalledSoftwareFailure sfExp = new StoreInstalledSoftwareFailure(exceptionMessage);
		FaultTypeElementDocument elementDoc = FaultTypeElementDocument.Factory.newInstance();
		FaultTypeElement faultElement = elementDoc.addNewFaultTypeElement();
		faultElement.setCause(faultCause);
		faultElement.setCode(faultCode);
		faultElement.setDescription(faultDesc);
		sfExp.setFaultMessage(elementDoc);
		log.error("Loggin the Exception: " , sfExp);
		return sfExp;
	}
}