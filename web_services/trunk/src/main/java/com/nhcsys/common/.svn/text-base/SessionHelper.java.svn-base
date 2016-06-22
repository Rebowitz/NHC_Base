package com.nhcsys.common;
/**
 * This is a SessionHelper class that deals with validating
 * and retrieving the session informaton given a session Id
 * @author maha.ravi
 * @since Oct 30th, 2007
 * @version 1.0
 */
import java.sql.Connection;
import java.util.Date;

import org.apache.log4j.Logger;

import com.nhcsys.common.exception.SessionException;
import com.nhcsys.dataaccess.dao.WsSessionsDao;
import com.nhcsys.dataaccess.dto.WsSessions;
import com.nhcsys.dataaccess.dto.WsSessionsPk;
import com.nhcsys.dataaccess.exceptions.WsSessionsDaoException;
import com.nhcsys.dataaccess.factory.WsSessionsDaoFactory;
import com.nhcsys.dataaccess.jdbc.ResourceManager;

public class SessionHelper {
	protected static final Logger logger = Logger.getLogger( SessionHelper.class );
	public static final String CLASS= SessionHelper.class.getName();
	
	/**
	 * retrieves session given sesion Id
	 * @param sessionId
	 * @return WsSessions object
	 */
	public static WsSessions[] getSession(String aSession) throws SessionException{
		WsSessions[] sessions = null;
		try {
			sessions = WsSessionsDaoFactory.create().findWhereSessionIdEquals(aSession.trim());
		} catch (WsSessionsDaoException e) {
			logger.error(CLASS+"Error while retrieving session from Database:"+e.getMessage());
			e.printStackTrace();
			SessionException exception = new SessionException("Error while retrieving session:"+e.getMessage());
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(aSession));
			throw exception;
		}
		return sessions;
	}
	/**
	 * This method will return a WsSessions if the sessionId returns
	 * one and only one record from the Db, otherwise an exception occurs
	 * @param aSession
	 * @return WsSessions
	 * @throws SessionException
	 */
	public static WsSessions validateSession(String aSession) throws SessionException {
		
		logger.debug("SessionValidate:"+aSession);
		WsSessions[] sessions=null;
		String methodName = CLASS+"::validateSession:: ";
		
		if (aSession == null || "".equals(aSession.trim())){
			logger.error(methodName+"Null/Empty Session Id");
			SessionException exception = new SessionException("Null/Empty Session Id");
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_SESSION_ID;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(aSession));
			throw exception;
		}
		
		sessions = getSession(aSession);
		
		if (sessions==null || sessions.length!=1) {
			System.out.println("Session is not valid");
			SessionException exception = new SessionException("SessionID "+ aSession +" either has no records or more than one record in the database");
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_SESSION_ID;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(aSession));
			throw exception;
			
		} else {
			return sessions[0];
		}
	}
	
	/**
	 * Use this method when:
	 *	1- You have the Session id. 
	 *	2- You want the session update to rollback when something goes wrong.
	 * @param aSession
	 * @return WsSessions
	 * @throws SessionException
	 */
	public static void updateSessionTimeStamp(String aSession, Connection conn) throws SessionException {
			
		String methodName = CLASS+"::updateSessionTimeStamp:: ";
		
		if (aSession == null || "".equals(aSession.trim())){
			logger.error(methodName+"Null/Empty Session Id");
			SessionException exception = new SessionException("Null/Empty Session Id");
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_SESSION_ID;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(aSession));
			throw exception;
		}
		WsSessions [] sessions = getSession(aSession);
		
		if (sessions==null || sessions.length!=1) {
			System.out.println("Session is not valid");
			SessionException exception = new SessionException("SessionID "+ aSession +" either has no records or more than one record in the database");
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_SESSION_ID;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(aSession));
			throw exception;
			
		}
		WsSessions session = sessions[0];
		updateSessionTimeStamp(session, conn);
	}
	/**
	 * Use this method when:
	 *	1- You have the Session id. 
	 *	2- You want the session update not to rollback when something goes wrong.
	 * @param aSession
	 * @throws SessionException
	 */	
	public static void updateSessionTimeStamp(String aSession) throws SessionException {
		Connection conn = null;
		String methodName = CLASS+"::updateSessionTimeStamp";
		try {
			conn = ResourceManager.getConnection();
		} catch (Exception ex) {
			logger.error(methodName+"Error while updating session in the Database:"+ex.getMessage());
			SessionException exception = new SessionException("Error while updating session time stamp:"+ex.getMessage());
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(aSession));
			throw exception;
		}
		
		updateSessionTimeStamp(aSession, conn);
	}
	/**
	 * 	Use this method when:
	 *	1- You have the WsSessions. 
	 *	2- When you call validateSession, a WsSessions object is returned you can pass that object to avoid calling the DB again to retrieve the Session object.
	 *	3- You want the session update to rollback when something goes wrong. 
	 * @param wsSession
	 * @return
	 * @throws SessionException
	 */
	public static void updateSessionTimeStamp(WsSessions wsSession, Connection conn) throws SessionException{
		String methodName = CLASS+"::updateSessionTimeStamp";
		//		Start updating the Time Stamp
		WsSessionsPk sessionPk = wsSession.createPk();
		WsSessionsDao wsSessionDao = WsSessionsDaoFactory.create(conn);
		wsSession.setTimeStamp(new Date());
		try { 
			wsSessionDao.update(sessionPk, wsSession);
		} catch (WsSessionsDaoException ex) {
			logger.error(methodName+"Error while updating session in the Database:"+ex.getMessage());
			SessionException exception = new SessionException("Error while updating session time stamp:"+ex.getMessage());
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(wsSession.getSessionId()));
			throw exception;
		}
	}
	/**
	 * Use this method when:
	 *	1- You have the WsSessions. 
	 *	2- When you call validateSession, a WsSessions object is returned you can pass that object to avoid calling the DB again to retrieve the Session object.
	 *	3- You want the session update not to rollback when something goes wrong.
	 * @param aSession
	 * @throws SessionException
	 */
	public static void updateSessionTimeStamp(WsSessions wsSession) throws SessionException {
		Connection conn = null;
		String methodName = CLASS+"::updateSessionTimeStamp";
		try {
			conn = ResourceManager.getConnection();
		} catch (Exception ex) {
			logger.error(methodName+"Error while updating session in the Database:"+ex.getMessage());
			SessionException exception = new SessionException("Error while updating session time stamp:"+ex.getMessage());
			WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(wsSession.getSessionId()));
			throw exception;
		}
		
		updateSessionTimeStamp(wsSession, conn);
	}
	
}
