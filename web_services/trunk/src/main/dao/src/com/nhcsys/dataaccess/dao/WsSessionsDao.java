/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.dao;

import java.util.Date;
import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.exceptions.*;

public interface WsSessionsDao
{
	/** 
	 * Inserts a new row in the WS_SESSIONS table.
	 */
	public WsSessionsPk insert(WsSessions dto) throws WsSessionsDaoException;

	/** 
	 * Updates a single row in the WS_SESSIONS table.
	 */
	public void update(WsSessionsPk pk, WsSessions dto) throws WsSessionsDaoException;

	/** 
	 * Deletes a single row in the WS_SESSIONS table.
	 */
	public void delete(WsSessionsPk pk) throws WsSessionsDaoException;

	/** 
	 * Returns the rows from the WS_SESSIONS table that matches the specified primary-key value.
	 */
	public WsSessions findByPrimaryKey(WsSessionsPk pk) throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'WS_SESSION_ID = :wsSessionId'.
	 */
	public WsSessions findByPrimaryKey(long wsSessionId) throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria ''.
	 */
	public WsSessions[] findAll() throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'WS_SESSION_ID = :wsSessionId'.
	 */
	public WsSessions[] findWhereWsSessionIdEquals(long wsSessionId) throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'APP_NAME = :appName'.
	 */
	public WsSessions[] findWhereAppNameEquals(String appName) throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'SESSION_ID = :sessionId'.
	 */
	public WsSessions[] findWhereSessionIdEquals(String sessionId) throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'MACHINE_ID = :machineId'.
	 */
	public WsSessions[] findWhereMachineIdEquals(long machineId) throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'TIME_STAMP = :timeStamp'.
	 */
	public WsSessions[] findWhereTimeStampEquals(Date timeStamp) throws WsSessionsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the specified arbitrary SQL statement
	 */
	public WsSessions[] findByDynamicSelect(String sql, Object[] sqlParams) throws WsSessionsDaoException;

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the specified arbitrary SQL statement
	 */
	public WsSessions[] findByDynamicWhere(String sql, Object[] sqlParams) throws WsSessionsDaoException;

}