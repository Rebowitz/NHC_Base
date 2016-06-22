/**
 * GetOrderInfoServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getorderinfo;

/**
 *  GetOrderInfoServiceSkeleton java skeleton for the axisService
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

import org.apache.log4j.Logger;

import com.nhcsys.common.SessionHelper;
import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.common.WebServicesHelper;
import com.nhcsys.common.exception.SessionException;
import com.nhcsys.dataaccess.dto.WsSessions;  
import com.nhcsys.dataaccess.jdbc.ResourceManager;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.FaultTypeElementDocument.FaultTypeElement;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement;

public class OracleGetOrderInfoHandler
    implements GetOrderInfoServiceSkeletonInterface {
    /**
     * Auto generated method signature
     * @param getOrderInfoRequestElement0
     */
	
	protected static final Logger log = Logger
	.getLogger(OracleGetOrderInfoHandler.class);
	
	WebServicesFaultTypesEnum DatabaseConnectionCreationErrorENum = WebServicesFaultTypesEnum.DATABASE_CONNECTION_CREATION_ERROR;
	WebServicesFaultTypesEnum DatabaseSQLExecutionErrorNum = WebServicesFaultTypesEnum.DATABASE_SQL_EXECUTION_ERROR;
	WebServicesFaultTypesEnum UnknowErrorENum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
	
	private String sqlToGetOrderInfo ="select segment1, description from apps.mtl_system_items where segment1 in ( select ordered_item from apps.oe_order_lines_all where created_by = ( select user_id from apps.fnd_user where customer_id=";
	
	public static String CLASS ="OracleGetOrderInfoHandler: ";
    public GetOrderInfoResponseElementDocument GetOrderInfo(
        GetOrderInfoRequestElementDocument getOrderInfoRequestElement0)
        throws GetOrderInfoFailure {
    String method ="GetOrderInfo: ";
    
    GetOrderInfoRequestElement reqElement = getOrderInfoRequestElement0.getGetOrderInfoRequestElement();
    String sessionID = reqElement.getSessionID();

		try { 
			SessionHelper.validateSession(sessionID);
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
		long customerID =WebServicesHelper.getCustomerIDFromSession(sessionID);
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs = null;
		sqlToGetOrderInfo = sqlToGetOrderInfo+customerID+" ))";
		GetOrderInfoResponseElementDocument responseDoc = GetOrderInfoResponseElementDocument.Factory.newInstance();
		GetOrderInfoResponseElement responseElement = responseDoc.addNewGetOrderInfoResponseElement();
		ProductListType productList = null;
		
		try {
			conn = ResourceManager.getConnection();
			stmt = conn.createStatement();
			log.debug("The GetOrderInfo SQL: "+sqlToGetOrderInfo);
			rs = stmt.executeQuery(sqlToGetOrderInfo);
			log.debug(("The GetOrderInfo SQL Executed successfully"));
			while (rs.next()) {
				productList = responseElement.addNewProductList();
				productList.setProductID(rs.getString(1));
				productList.setDescription(rs.getString(2));
				productList.setLicenseKey("");
			}
		} catch (NamingException e) {
			log.error(CLASS+method + "Problems while creating connection. Verify Database Connection or Database Server if it is running");
			e.printStackTrace();
			throw createException(e.getMessage(),
					DatabaseConnectionCreationErrorENum.getCode(),
					DatabaseConnectionCreationErrorENum.getDescription(),
					  e.getMessage());
		} catch (SQLException e) {
			log.error(CLASS+method + "Problems while Executing SQL for GetOrderInfo for customerID:"+customerID+", Verify Database Connection or Database Server if it is running");
			e.printStackTrace();
			throw createException(e.getMessage(),
					DatabaseSQLExecutionErrorNum.getCode(),
					DatabaseSQLExecutionErrorNum.getDescription(),
					  e.getMessage());
		} finally  {
		    ResourceManager.close(conn);
		}
		 
		return responseDoc;
    }
    
    private GetOrderInfoFailure createException(String exceptionMessage,
			Long faultCode, String faultDesc, String faultCause) {
		
    	GetOrderInfoFailure lfExp = new GetOrderInfoFailure(exceptionMessage);
		FaultTypeElementDocument elementDoc = FaultTypeElementDocument.Factory
				.newInstance(); 
		FaultTypeElement faultElement = elementDoc.addNewFaultTypeElement();
		faultElement.setCause(faultCause);
		faultElement.setCode(faultCode);
		faultElement.setDescription(faultDesc);
		lfExp.setFaultMessage(elementDoc);
		log.error("Loggin the Exception: ", lfExp);
		return lfExp;
	}
    
    
    
    
    
}
