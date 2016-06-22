/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import com.nhcsys.dataaccess.dao.WsSessionsDao;
import com.nhcsys.dataaccess.dto.WsSessions;
import com.nhcsys.dataaccess.exceptions.WsSessionsDaoException;
import com.nhcsys.dataaccess.factory.WsSessionsDaoFactory;

public class WsSessionsDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereWsSessionIdEquals(0);
		// findWhereAppNameEquals("");
		// findWhereSessionIdEquals("");
		// findWhereMachineIdEquals(0);
		// findWhereTimeStampEquals(null);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			WsSessionsDao _dao = getWsSessionsDao();
			WsSessions _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereWsSessionIdEquals'
	 * 
	 * @param wsSessionId
	 */
	public static void findWhereWsSessionIdEquals(long wsSessionId)
	{
		try {
			WsSessionsDao _dao = getWsSessionsDao();
			WsSessions _result[] = _dao.findWhereWsSessionIdEquals(wsSessionId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereAppNameEquals'
	 * 
	 * @param appName
	 */
	public static void findWhereAppNameEquals(String appName)
	{
		try {
			WsSessionsDao _dao = getWsSessionsDao();
			WsSessions _result[] = _dao.findWhereAppNameEquals(appName);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSessionIdEquals'
	 * 
	 * @param sessionId
	 */
	public static void findWhereSessionIdEquals(String sessionId)
	{
		try {
			WsSessionsDao _dao = getWsSessionsDao();
			WsSessions _result[] = _dao.findWhereSessionIdEquals(sessionId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMachineIdEquals'
	 * 
	 * @param machineId
	 */
	public static void findWhereMachineIdEquals(long machineId)
	{
		try {
			WsSessionsDao _dao = getWsSessionsDao();
			WsSessions _result[] = _dao.findWhereMachineIdEquals(machineId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTimeStampEquals'
	 * 
	 * @param timeStamp
	 */
	public static void findWhereTimeStampEquals(Date timeStamp)
	{
		try {
			WsSessionsDao _dao = getWsSessionsDao();
			WsSessions _result[] = _dao.findWhereTimeStampEquals(timeStamp);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getWsSessionsDao'
	 * 
	 * @return WsSessionsDao
	 */
	public static WsSessionsDao getWsSessionsDao()
	{
		return WsSessionsDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(WsSessions dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getWsSessionId() );
		buf.append( ", " );
		buf.append( dto.getAppName() );
		buf.append( ", " );
		buf.append( dto.getSessionId() );
		buf.append( ", " );
		buf.append( dto.getMachineId() );
		buf.append( ", " );
		buf.append( dto.getTimeStamp() );
		System.out.println( buf.toString() );
	}

}
