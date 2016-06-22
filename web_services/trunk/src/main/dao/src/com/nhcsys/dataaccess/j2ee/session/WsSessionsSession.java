/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.j2ee.session;

import com.nhcsys.dataaccess.factory.*;
import com.nhcsys.dataaccess.dao.*;
import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.exceptions.*;
import java.rmi.RemoteException;
import java.math.*;
import java.util.Date;
import javax.ejb.*;

public interface WsSessionsSession extends EJBObject
{
	/** 
	 * Inserts a new row in the WS_SESSIONS table.
	 */
	public WsSessionsPk insert(WsSessions dto) throws WsSessionsDaoException, RemoteException;

	/** 
	 * Updates a single row in the WS_SESSIONS table.
	 */
	public void update(WsSessionsPk pk, WsSessions dto) throws WsSessionsDaoException, RemoteException;

	/** 
	 * Deletes a single row in the WS_SESSIONS table.
	 */
	public void delete(WsSessionsPk pk) throws WsSessionsDaoException, RemoteException;

	/** 
	 * Returns the rows from the WS_SESSIONS table that matches the specified primary-key value.
	 */
	public WsSessions findByPrimaryKey(WsSessionsPk pk) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param wsSessionId
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions
	 */
	public WsSessions findByPrimaryKey(long wsSessionId) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findAll'
	 * 
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findAll() throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findWhereWsSessionIdEquals'
	 * 
	 * @param wsSessionId
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findWhereWsSessionIdEquals(long wsSessionId) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findWhereAppNameEquals'
	 * 
	 * @param appName
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findWhereAppNameEquals(String appName) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findWhereSessionIdEquals'
	 * 
	 * @param sessionId
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findWhereSessionIdEquals(String sessionId) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findWhereMachineIdEquals'
	 * 
	 * @param machineId
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findWhereMachineIdEquals(long machineId) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findWhereTimeStampEquals'
	 * 
	 * @param timeStamp
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findWhereTimeStampEquals(Date timeStamp) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findByDynamicSelect(String sql, Object[] arg) throws WsSessionsDaoException, RemoteException;

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws WsSessionsDaoException
	 * @throws RemoteException
	 * @return WsSessions[]
	 */
	public WsSessions[] findByDynamicWhere(String sql, Object[] arg) throws WsSessionsDaoException, RemoteException;

}