/**
 * UpdateNetworkEnvironmentServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.updatenetworkenvironment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nhcsys.common.SessionHelper;
import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.common.WebServicesHelper;
import com.nhcsys.common.exception.SessionException;
import com.nhcsys.dataaccess.dao.ClqinfoDao;
import com.nhcsys.dataaccess.dao.NetworkinfoDao;
import com.nhcsys.dataaccess.dao.SnmpqinfoDao;
import com.nhcsys.dataaccess.dao.WmiqinfoDao;
import com.nhcsys.dataaccess.dao.WnqinfoDao;
import com.nhcsys.dataaccess.dto.Clqinfo;
import com.nhcsys.dataaccess.dto.Networkinfo;
import com.nhcsys.dataaccess.dto.NetworkinfoPk;
import com.nhcsys.dataaccess.dto.Snmpqinfo;
import com.nhcsys.dataaccess.dto.Wmiqinfo;
import com.nhcsys.dataaccess.dto.Wnqinfo;
import com.nhcsys.dataaccess.dto.WsSessions;
import com.nhcsys.dataaccess.exceptions.ClqinfoDaoException;
import com.nhcsys.dataaccess.exceptions.NetworkinfoDaoException;
import com.nhcsys.dataaccess.exceptions.SnmpqinfoDaoException;
import com.nhcsys.dataaccess.exceptions.WmiqinfoDaoException;
import com.nhcsys.dataaccess.exceptions.WnqinfoDaoException;
import com.nhcsys.dataaccess.factory.ClqinfoDaoFactory;
import com.nhcsys.dataaccess.factory.NetworkinfoDaoFactory;
import com.nhcsys.dataaccess.factory.SnmpqinfoDaoFactory;
import com.nhcsys.dataaccess.factory.WmiqinfoDaoFactory;
import com.nhcsys.dataaccess.factory.WnqinfoDaoFactory;
import com.nhcsys.dataaccess.jdbc.ResourceManager;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.CLQType;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentMessageType;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentRequestElementDocument;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentResponseElementDocument;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WMIQType;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WNQType;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.FaultTypeElementDocument.FaultTypeElement;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentRequestElementDocument.UpdateNetworkEnvironmentRequestElement;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentResponseElementDocument.UpdateNetworkEnvironmentResponseElement;


/**
 *  UpdateNetworkEnvironmentServiceSkeleton java skeleton for the axisService
 */
public class OracleHandlerUpdateNetworkEnvironment
    implements UpdateNetworkEnvironmentServiceSkeletonInterface {
	private static final Logger log = Logger
	.getLogger(OracleHandlerUpdateNetworkEnvironment.class);
	public static String CLASS = "OracleHandlerUpdateNetworkEnvironment: ";
	
	/* Possible Errors in UpdateNetworkEnvironment Service
	 */
	WebServicesFaultTypesEnum DatabaseConnectionCreationErrorENum = WebServicesFaultTypesEnum.DATABASE_CONNECTION_CREATION_ERROR;
	WebServicesFaultTypesEnum UpdateNetworkInfoServiceDatabaseErrrorNum = WebServicesFaultTypesEnum.UPDATE_NETWORK_INFO_SERVICE_DATABASE_ERROR;
	WebServicesFaultTypesEnum DatabaseConnectionCommitErrorENum = WebServicesFaultTypesEnum.DATABASE_CONNECTION_COMMIT_ERROR;
	WebServicesFaultTypesEnum UnknowErrorENum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
	
	public UpdateNetworkEnvironmentResponseElementDocument 
UpdateNetworkEnvironment(UpdateNetworkEnvironmentRequestElementDocument updateNetworkEnvironmentRequestElement)
 throws UpdateNetworkEnvironmentFailure {
	String method="UpdateNetworkEnvironment: ";
		
		UpdateNetworkEnvironmentRequestElement requestElement = updateNetworkEnvironmentRequestElement.getUpdateNetworkEnvironmentRequestElement();
	    
	    long userID=0L;
	    long machineID=0L;
	    long time = System.currentTimeMillis();
	    Connection conn = null;
	    
	    try {
	    	
	    String sessionID=requestElement.getSessionID();
	    WsSessions session=null;
	    
		try { 
			session = SessionHelper.validateSession(sessionID);
			log.debug(method + "successfully retreived data for sessionId: " + sessionID);
		} catch (SessionException ex) {
			log.error(CLASS+method + "Problems retreiving session information given Session id"+ sessionID, ex);
			
			throw createException(ex.getMessage(),
								  ex.getFaultCode(),
								  ex.getFaultDescription(),
								  ex.getFaultCause());
		} catch (Throwable t) {
			log.error(CLASS+method + "Problems retreiving session information given Session id"+ sessionID, t);
			t.printStackTrace();
			throw createException(t.getMessage(),
					UnknowErrorENum.getCode(),
					UnknowErrorENum.getDescription(),
					t.getMessage());
		}
	    
	    UpdateNetworkEnvironmentMessageType updatenetworkMessage = requestElement.getUpdateNetworkEnvironmentMessage();
	    
	    userID =WebServicesHelper.getCustomerIDFromSession(sessionID);
	    log.debug("The customerID:"+ userID);
		machineID =session.getMachineId();
	    
		/* Step 0) Inputs are retrieved from request element
		 */
	    String ssID = updatenetworkMessage.getSSID();
	    String phassPhrase = updatenetworkMessage.getPassphrase();
	    String wirelessType = updatenetworkMessage.getWirelessNetworkInfo().toString();
	    CLQType[] CLQListArray = updatenetworkMessage.getCLQTypeListArray();
	    SNMPQType[] SNMPQListArray = updatenetworkMessage.getSNMPQTypeListArray();
	    WMIQType[] WMIQTypeListArray = updatenetworkMessage.getWMIQTypeListArray();
	    WNQType[] WNQListArray = updatenetworkMessage.getWNQTypeListArray();
	    
	    /* Step 2 - Persisting the Client inputs in the database
	     */
	   
		try {
			conn = ResourceManager.getConnection();
			conn.setAutoCommit(false);
		} catch (Exception e1) {
			log.error(CLASS+method + "Problems while creating connection. Verify Database Connection or Database Server if it is running");
			e1.printStackTrace();
			throw createException(e1.getMessage(),
					DatabaseConnectionCreationErrorENum.getCode(),
					DatabaseConnectionCreationErrorENum.getDescription(),
					  e1.getMessage());
		}
		
	    /* Step 2a) Table: NETWORINFO
	     */
	    NetworkinfoDao networkInfoDAO = NetworkinfoDaoFactory.create(conn);
	    SnmpqinfoDao snmpqinfoDAO = SnmpqinfoDaoFactory.create(conn);
	    WmiqinfoDao wmiqinfoDAO = WmiqinfoDaoFactory.create(conn);
	    WnqinfoDao wnqinfoDAO = WnqinfoDaoFactory.create(conn);
	    ClqinfoDao clqDAO = ClqinfoDaoFactory.create(conn);
	    
	    NetworkinfoPk networkInfoPK=null;
	    long networkInfoID=0L;
	    
	    Networkinfo networkDto = new Networkinfo();
	    
	    networkDto.setCustomerId(userID);
	    networkDto.setMachineId(machineID); 
	    networkDto.setSsid(WebServicesHelper.validateInput(ssID));
	    networkDto.setPassphrase(WebServicesHelper.validateInput(phassPhrase));
	    networkDto.setWirelessinfotype(WebServicesHelper.validateInput(wirelessType));
	    networkDto.setTimestamp(new Date(time));
	    
	    /* Old Records for the given machineID for non-Nast clients CPU is deleted */
	    log.debug("The MachineID:"+ machineID +" The Nast MachineID:"+WebServicesHelper.getMachineIDForNastClient());
	    
	    if (machineID != WebServicesHelper.getMachineIDForNastClient()) {
	    log.debug("Deleting old records for regular CPU");
	    Networkinfo[] existingNetworkInfos = networkInfoDAO.findWhereMachineIdEquals(machineID);
	    if (existingNetworkInfos!=null && existingNetworkInfos.length>0) {
	    	
	    	for (int i=0; i<existingNetworkInfos.length; i++) {
	    	long existingNetworkInfoID = existingNetworkInfos[i].getNetworkinfoId();
	    	
	    	Snmpqinfo[] existingSnmpqinfos = snmpqinfoDAO.findWhereNetworkinfoIdEquals(existingNetworkInfoID);
	    	
	        if (existingSnmpqinfos!=null && existingSnmpqinfos.length>0) {
	        	for (int j=0; j<existingSnmpqinfos.length; j++) {
	        		snmpqinfoDAO.delete( existingSnmpqinfos[j].createPk());
	        	}
	        } 
	        log.debug("SNMPQ Records deleted");
	        
	        Wmiqinfo[] existingWmiqinfo = wmiqinfoDAO.findWhereNetworkinfoIdEquals(existingNetworkInfoID);
	    	
	        if (existingWmiqinfo!=null && existingWmiqinfo.length>0) {
	        	for (int k=0;k<existingWmiqinfo.length; k++) {
	        		wmiqinfoDAO.delete( existingWmiqinfo[k].createPk());
	        	}
	        }
	        log.debug("WMIQ Records deleted");
	    	
	        
	        Wnqinfo[] existingWnqinfos = wnqinfoDAO.findWhereNetworkinfoIdEquals(existingNetworkInfoID);
	    	
	        if (existingWnqinfos!=null && existingWnqinfos.length>0) {
	        	for (int l=0; l<existingWnqinfos.length; l++) {
	        		wnqinfoDAO.delete( existingWnqinfos[l].createPk());
	        	}
	        }
	        log.debug("WNQ Records deleted");
	    	
	        Clqinfo[] existingClqinfos = clqDAO.findWhereNetworkinfoIdEquals(existingNetworkInfoID);
	    	
	        if (existingClqinfos!=null && existingClqinfos.length>0) {
	        	for (int m=0; m<existingClqinfos.length;m++) {
	        		clqDAO.delete( existingClqinfos[m].createPk());
	        	}
	        }
	        log.debug("CLQ Records deleted");
	    	
			networkInfoDAO.delete(existingNetworkInfos[i].createPk());
	    	}
	    	log.debug("NetworkInfo Records deleted");
			
	    }
	    }
	    
		try {
		networkInfoPK = networkInfoDAO.insert(networkDto);
		networkInfoID = networkInfoDAO.findWhereMachineIdEquals(networkDto.getMachineId())[0].getNetworkinfoId();
		log.debug("The networkID inserted was : "+ networkInfoID);
		} catch (NetworkinfoDaoException e) {
			e.printStackTrace();
			log
			.error(CLASS
					+ method
					+ " time:"
					+ time
					+ "Database Error while inserting NetworkInfo for the customerID:"
					+ userID + ", " + e.getMessage());
	e.printStackTrace();
	throw createException(
			"Database Error while inserting NetworkInfo for the customerID:"
					+ userID, UpdateNetworkInfoServiceDatabaseErrrorNum
					.getCode(),
			UpdateNetworkInfoServiceDatabaseErrrorNum.getDescription(), e.getMessage());
		}
		
		//= networkInfoPK.getNetworkinfoId();
		log.debug("Network Info is inserted for customer: "+userID + "and machineID: "+machineID+ " and the returned networkID is:"+networkInfoID);
		
	    /* Step 2b) Table: CLQINFO
	     */
		if (CLQListArray!=null && CLQListArray.length>0) {
			Clqinfo clqInfo=null;
			for (int i=0; i<CLQListArray.length; i++) {
				clqInfo = new Clqinfo();
				clqInfo.setNetworkinfoId(networkInfoID);
				clqInfo.setName(WebServicesHelper.validateInput(CLQListArray[i].getName()));
				clqInfo.setCmdline(WebServicesHelper.validateInput(CLQListArray[i].getCmdLine()));
				clqInfo.setResult(WebServicesHelper.validateInput(CLQListArray[i].getResult()));
				try {
					clqDAO.insert(clqInfo);
				} catch (ClqinfoDaoException e) {
					e.printStackTrace();
					log
					.error(CLASS
							+ method
							+ " time:"
							+ time
							+ "Database Error while inserting CLQINFO for the customerID:"
							+ userID + ", " + e.getMessage());
			e.printStackTrace();
			throw createException(
					"Database Error while inserting NetworkInfo for the customerID:"
							+ userID, UpdateNetworkInfoServiceDatabaseErrrorNum
							.getCode(),
					UpdateNetworkInfoServiceDatabaseErrrorNum.getDescription(), e.getMessage());
				} 
			}
		}
		
		log.debug("CLQLIST have been inserted");
		
	    /* Step 2c) Table: SNMPQINFO
	     */
		if (SNMPQListArray!=null && SNMPQListArray.length>0) {
	    Snmpqinfo snmpqInfo =null;
	    for (int i=0; i<SNMPQListArray.length; i++) {
	    	snmpqInfo = new Snmpqinfo();
	    	snmpqInfo.setNetworkinfoId(networkInfoID);
	    	snmpqInfo.setName(WebServicesHelper.validateInput(SNMPQListArray[i].getName()));
	    	snmpqInfo.setTree(WebServicesHelper.validateInput(SNMPQListArray[i].getTree()));
	    	try {
				snmpqinfoDAO.insert(snmpqInfo);
			} catch (SnmpqinfoDaoException e) {
				e.printStackTrace();
				log
				.error(CLASS
						+ method
						+ " time:"
						+ time
						+ "Database Error while inserting SNMPQINFO for the customerID:"
						+ userID + ", " + e.getMessage());
		e.printStackTrace();
		throw createException(
				"Database Error while inserting SNMPQINFO for the customerID:"
						+ userID, UpdateNetworkInfoServiceDatabaseErrrorNum
						.getCode(),
				UpdateNetworkInfoServiceDatabaseErrrorNum.getDescription(), e.getMessage());
			}
		}
		}
		
		log.debug("SNMPQ LIST have been insterted");
	    
	    /* Step 2d)Table: WMIQINFO
	     */
		if (WMIQTypeListArray!=null && WMIQTypeListArray.length>0) {
	    Wmiqinfo wmiqInfo = null;
	    for (int i=0; i<WMIQTypeListArray.length; i++) {
	    	wmiqInfo = new Wmiqinfo();
	    	wmiqInfo.setNetworkinfoId(networkInfoID);
	    	wmiqInfo.setName(WebServicesHelper.validateInput(WMIQTypeListArray[i].getName()));
	    	wmiqInfo.setQuery(WebServicesHelper.validateInput(WMIQTypeListArray[i].getQuery()));
	    	wmiqInfo.setResult(WebServicesHelper.validateInput(WMIQTypeListArray[i].getResult()));
	    	try {
				wmiqinfoDAO.insert(wmiqInfo);
			} catch (WmiqinfoDaoException e) {
				e.printStackTrace();
				log
				.error(CLASS
						+ method
						+ " time:"
						+ time
						+ "Database Error while inserting WMIQINFO for the customerID:"
						+ userID + ", " + e.getMessage());
		e.printStackTrace();
		throw createException(
				"Database Error while inserting WMIQINFO for the customerID:"
						+ userID, UpdateNetworkInfoServiceDatabaseErrrorNum
						.getCode(),
				UpdateNetworkInfoServiceDatabaseErrrorNum.getDescription(), e.getMessage());

			}
		}
		}
		
		log.debug("WMIQ LIST have been inserted");
	    
	    
	    /* Step 2e)Table: WNQINFO
	     */
		if (WNQListArray!=null && WNQListArray.length>0) {
	   Wnqinfo wnqInfo = null;
	   for (int i=0; i<WNQListArray.length; i++) {
		   wnqInfo = new Wnqinfo();
		   wnqInfo.setNetworkinfoId(networkInfoID);
		   wnqInfo.setProvider(WebServicesHelper.validateInput(WNQListArray[i].getProvider()));
		   wnqInfo.setRemotename(WebServicesHelper.validateInput(WNQListArray[i].getRemoteName()));
		   wnqInfo.setLocalname(WebServicesHelper.validateInput(WNQListArray[i].getLocalName()));
		   wnqInfo.setIpaddress(WebServicesHelper.validateInput(WNQListArray[i].getIPAddress()));
		   wnqInfo.setWnqcomment(WebServicesHelper.validateInput(WNQListArray[i].getComment()));
		   wnqInfo.setDisplaytype(WebServicesHelper.validateInput(WNQListArray[i].getDisplayType()));
		   wnqInfo.setWnqscope(WebServicesHelper.validateInput(WNQListArray[i].getScope()));
		   wnqInfo.setWnqtype(WebServicesHelper.validateInput(WNQListArray[i].getType()));
		   wnqInfo.setWnqusage(WebServicesHelper.validateInput(WNQListArray[i].getUsage()));
		   try {
			wnqinfoDAO.insert(wnqInfo);
		} catch (WnqinfoDaoException e) {
			e.printStackTrace();
			log
			.error(CLASS
					+ method
					+ " time:"
					+ time
					+ "Database Error while inserting WNQINFO for the customerID:"
					+ userID + ", " + e.getMessage());
	e.printStackTrace();
	throw createException(
			"Database Error while inserting WNQINFO for the customerID:"
					+ userID, UpdateNetworkInfoServiceDatabaseErrrorNum
					.getCode(),
			UpdateNetworkInfoServiceDatabaseErrrorNum.getDescription(), e.getMessage());
		}
		
		log.debug("WNQ LIST have been inserted");
		
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			log
			.error(CLASS
					+ method
					+ " time:"
					+ time
					+ "Database Error while committing for the UpdateNetworkInfo Service for customerID:"
					+ userID + ", " + e.getMessage());
	e.printStackTrace();
	throw createException(
			"Database Error while inserting WNQINFO for the customerID:"
					+ userID, DatabaseConnectionCommitErrorENum
					.getCode(),
					DatabaseConnectionCommitErrorENum.getDescription(), e.getMessage());
		}
		}
		}
		
	    } catch (UpdateNetworkEnvironmentFailure e){
	    	throw e;
	    } catch (Throwable t) {
	    	log.error(CLASS+method+" Update Network Info Service Unknown Error happend:"+t.getMessage());
	    	t.printStackTrace();
	    	throw createException("Update Network Info Service Unknown Error happend:"+t.getMessage()
	    					+ userID, UnknowErrorENum
	    					.getCode(),
	    					UnknowErrorENum.getDescription(), t.getMessage());
	    } finally {
	    	if (conn!=null) {
	    		ResourceManager.close(conn);
	    	}
	    }
	    
		/* Step Final: UpdateNetworkEnvironmentResponse status is returned "updated"
		 */
		return getResponseDocument();
	}
	
	public UpdateNetworkEnvironmentResponseElementDocument getResponseDocument() {
		UpdateNetworkEnvironmentResponseElementDocument responseObject = UpdateNetworkEnvironmentResponseElementDocument.Factory
				.newInstance();
		UpdateNetworkEnvironmentResponseElement responseElement = 
			UpdateNetworkEnvironmentResponseElement.Factory.newInstance();
		responseElement.setAcknowledge("updated");
		responseObject.setUpdateNetworkEnvironmentResponseElement(responseElement);
		return responseObject;
	}
	
	private UpdateNetworkEnvironmentFailure createException(String message, Long faultCode, String faultDesc, String faultCause) {
		UpdateNetworkEnvironmentFailure lfExp = new UpdateNetworkEnvironmentFailure(message);
		FaultTypeElementDocument elementDoc = FaultTypeElementDocument.Factory
				.newInstance();
		FaultTypeElement faultElement = elementDoc.addNewFaultTypeElement();
		faultElement.setCause(faultCause);
		faultElement.setCode(faultCode);
		faultElement.setDescription(faultDesc);
		lfExp.setFaultMessage(elementDoc);
		return lfExp;
	}

}    
