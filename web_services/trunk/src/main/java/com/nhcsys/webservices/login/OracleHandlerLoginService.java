package com.nhcsys.webservices.login;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import oracle.jdbc.driver.OracleTypes;

import org.apache.log4j.Logger;

import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.common.exception.NHCException;
import com.nhcsys.dataaccess.jdbc.ResourceManager;


/**
 *  LoginServiceSkeleton java skeleton for the axisService
 */
public class OracleHandlerLoginService extends LoginServiceBase {
	
	protected static final Logger logger = Logger.getLogger(OracleHandlerLoginService.class);

	public String CLASS = "OracleHandlerLoginService: ";

	@Override
	public int handleAuthenticate(String userID, String userPassword) throws NHCException {
		String method = CLASS+"::handleAuthenticate-->";
		logger.debug(method);
		Connection conn = null;
		CallableStatement stmt = null;
		PreparedStatement preparedStmt = null;
		ResultSet rs = null;
		long t1 = System.currentTimeMillis();
		
		try {
			// get DB Connection
			conn = ResourceManager.getConnection();
		
			String sqlStmt = "{? = call apps.fnd_web_sec.validate_login(?,?)}";
			stmt = conn.prepareCall( sqlStmt );
			int index = 0;
			stmt.registerOutParameter(++index,OracleTypes.VARCHAR);
			stmt.setString( ++index, userID );
			stmt.setString(++index, userPassword);
			
			
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( method + " Before Validating Login (" + (t2-t1) + " ms)");
			}
			//Try to login
			stmt.executeQuery();
			t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( method + " After Validating Login (" + (t2-t1) + " ms)");
			}
			
			String isValidStr = null;
			isValidStr = stmt.getString(1);
			
			//If it's invalid login then throw an exception
			if (	isValidStr == null ||
					isValidStr.equalsIgnoreCase("N")){
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.LOGIN_SERVICE_INVALID_LOGIN;
				NHCException nhcEx = new NHCException("Invalid Login");
				nhcEx.setFaultCause(null);
				nhcEx.setFaultCode(myEnum.getCode());
				nhcEx.setFaultDescription(myEnum.getDescription(userID));
				throw nhcEx;
			}
			logger.debug(method + "Valid Login, continue processig...");
			logger.debug(method + "Retreiving Customer Id...");
			
			//Build the Select Stmt.
			sqlStmt = "SELECT customer_id FROM apps.fnd_user WHERE upper(user_name)=?";
			preparedStmt = conn.prepareStatement(sqlStmt);
			preparedStmt.setString(1,userID.toUpperCase());
			//Run the sql stmt
			rs = preparedStmt.executeQuery();
			Integer customerId = null;
			while (rs.next()) {
				customerId = rs.getInt(1);
			}
			
			if (customerId == null) {
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.LOGIN_SERVICE_NO_CUSTOMER_FOR_USERID;
				NHCException nhcEx = new NHCException("Invalid User Id");
				nhcEx.setFaultCause(null);
				nhcEx.setFaultCode(myEnum.getCode());
				nhcEx.setFaultDescription(myEnum.getDescription(userID));
				throw nhcEx;
			}
			//Found customer
			logger.debug(method+"Found Customer ID"+userID);
			return customerId;
		} catch (NamingException nEx){
			logger.error( "Exception: " + nEx.getMessage(), nEx );
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			NHCException nhcEx = new NHCException(nEx.getMessage());
			nhcEx.setFaultCause(null);
			nhcEx.setFaultCode(myEnum.getCode());
			nhcEx.setFaultDescription(myEnum.getDescription(userID));
			throw nhcEx;
		} catch (SQLException sqlEx) {
			logger.error( "Exception: " + sqlEx.getMessage(), sqlEx );
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			NHCException nhcEx = new NHCException(sqlEx.getMessage());
			nhcEx.setFaultCause(null);
			nhcEx.setFaultCode(myEnum.getCode());
			nhcEx.setFaultDescription(myEnum.getDescription(userID));
			throw nhcEx;
		} catch (NHCException nhcEx) {
			throw nhcEx;
		} catch(Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			NHCException nhcEx = new NHCException(_e.getMessage());
			nhcEx.setFaultCause(null);
			nhcEx.setFaultCode(myEnum.getCode());
			nhcEx.setFaultDescription(myEnum.getDescription(userID));
			throw nhcEx;
		}
		finally {
			ResourceManager.close(stmt);
			if (conn != null) {
				ResourceManager.close(conn);
			}
		
		}
	}
	
}
