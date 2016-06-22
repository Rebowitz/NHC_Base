/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.jdbc;

import com.nhcsys.dataaccess.dao.*;
import com.nhcsys.dataaccess.factory.*;
import java.util.Date;
import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class WsSessionsDaoImpl extends AbstractDAO implements WsSessionsDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( WsSessionsDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT WS_SESSION_ID, APP_NAME, SESSION_ID, MACHINE_ID, TIME_STAMP FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	private int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( WS_SESSION_ID, APP_NAME, SESSION_ID, MACHINE_ID, TIME_STAMP ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET WS_SESSION_ID = ?, APP_NAME = ?, SESSION_ID = ?, MACHINE_ID = ?, TIME_STAMP = ? WHERE WS_SESSION_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE WS_SESSION_ID = ?";

	/** 
	 * Index of column WS_SESSION_ID
	 */
	protected static final int COLUMN_WS_SESSION_ID = 1;

	/** 
	 * Index of column APP_NAME
	 */
	protected static final int COLUMN_APP_NAME = 2;

	/** 
	 * Index of column SESSION_ID
	 */
	protected static final int COLUMN_SESSION_ID = 3;

	/** 
	 * Index of column MACHINE_ID
	 */
	protected static final int COLUMN_MACHINE_ID = 4;

	/** 
	 * Index of column TIME_STAMP
	 */
	protected static final int COLUMN_TIME_STAMP = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column WS_SESSION_ID
	 */
	protected static final int PK_COLUMN_WS_SESSION_ID = 1;

	/** 
	 * Inserts a new row in the WS_SESSIONS table.
	 */
	public WsSessionsPk insert(WsSessions dto) throws WsSessionsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( "SELECT ws_session_id_seq.NEXTVAL FROM DUAL" );
			rs = stmt.executeQuery();
			if (rs.next()) {
				dto.setWsSessionId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			StringBuffer sql = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isWsSessionIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "WS_SESSION_ID" );
				modifiedCount++;
			}
		
			if (dto.isAppNameModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "APP_NAME" );
				modifiedCount++;
			}
		
			if (dto.isSessionIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "SESSION_ID" );
				modifiedCount++;
			}
		
			if (dto.isMachineIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "MACHINE_ID" );
				modifiedCount++;
			}
		
			if (dto.isTimeStampModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "TIME_STAMP" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			for (int i=0; i<modifiedCount; i++ ) {
				if (i>0) {
					sql.append( "," );
				}
		
				sql.append( "?" );
			}
		
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isWsSessionIdModified()) {
				stmt.setLong( index++, dto.getWsSessionId() );
			}
		
			if (dto.isAppNameModified()) {
				stmt.setString( index++, dto.getAppName() );
			}
		
			if (dto.isSessionIdModified()) {
				stmt.setString( index++, dto.getSessionId() );
			}
		
			if (dto.isMachineIdModified()) {
				stmt.setLong( index++, dto.getMachineId() );
			}
		
			if (dto.isTimeStampModified()) {
				stmt.setTimestamp(index++, dto.getTimeStamp()==null ? null : new java.sql.Timestamp( dto.getTimeStamp().getTime() ) );
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new WsSessionsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the WS_SESSIONS table.
	 */
	public void update(WsSessionsPk pk, WsSessions dto) throws WsSessionsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isWsSessionIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "WS_SESSION_ID=?" );
				modified=true;
			}
		
			if (dto.isAppNameModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APP_NAME=?" );
				modified=true;
			}
		
			if (dto.isSessionIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "SESSION_ID=?" );
				modified=true;
			}
		
			if (dto.isMachineIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MACHINE_ID=?" );
				modified=true;
			}
		
			if (dto.isTimeStampModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TIME_STAMP=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE WS_SESSION_ID=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isWsSessionIdModified()) {
				stmt.setLong( index++, dto.getWsSessionId() );
			}
		
			if (dto.isAppNameModified()) {
				stmt.setString( index++, dto.getAppName() );
			}
		
			if (dto.isSessionIdModified()) {
				stmt.setString( index++, dto.getSessionId() );
			}
		
			if (dto.isMachineIdModified()) {
				stmt.setLong( index++, dto.getMachineId() );
			}
		
			if (dto.isTimeStampModified()) {
				stmt.setTimestamp(index++, dto.getTimeStamp()==null ? null : new java.sql.Timestamp( dto.getTimeStamp().getTime() ) );
			}
		
			stmt.setLong( index++, pk.getWsSessionId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new WsSessionsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the WS_SESSIONS table.
	 */
	public void delete(WsSessionsPk pk) throws WsSessionsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setLong( 1, pk.getWsSessionId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new WsSessionsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the WS_SESSIONS table that matches the specified primary-key value.
	 */
	public WsSessions findByPrimaryKey(WsSessionsPk pk) throws WsSessionsDaoException
	{
		return findByPrimaryKey( pk.getWsSessionId() );
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'WS_SESSION_ID = :wsSessionId'.
	 */
	public WsSessions findByPrimaryKey(long wsSessionId) throws WsSessionsDaoException
	{
		WsSessions ret[] = findByDynamicSelect( SQL_SELECT + " WHERE WS_SESSION_ID = ?", new Object[] {  new Long(wsSessionId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria ''.
	 */
	public WsSessions[] findAll() throws WsSessionsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY WS_SESSION_ID", null );
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'WS_SESSION_ID = :wsSessionId'.
	 */
	public WsSessions[] findWhereWsSessionIdEquals(long wsSessionId) throws WsSessionsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE WS_SESSION_ID = ? ORDER BY WS_SESSION_ID", new Object[] {  new Long(wsSessionId) } );
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'APP_NAME = :appName'.
	 */
	public WsSessions[] findWhereAppNameEquals(String appName) throws WsSessionsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APP_NAME = ? ORDER BY APP_NAME", new Object[] { appName } );
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'SESSION_ID = :sessionId'.
	 */
	public WsSessions[] findWhereSessionIdEquals(String sessionId) throws WsSessionsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SESSION_ID = ? ORDER BY SESSION_ID", new Object[] { sessionId } );
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'MACHINE_ID = :machineId'.
	 */
	public WsSessions[] findWhereMachineIdEquals(long machineId) throws WsSessionsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MACHINE_ID = ? ORDER BY MACHINE_ID", new Object[] {  new Long(machineId) } );
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the criteria 'TIME_STAMP = :timeStamp'.
	 */
	public WsSessions[] findWhereTimeStampEquals(Date timeStamp) throws WsSessionsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIME_STAMP = ? ORDER BY TIME_STAMP", new Object[] { timeStamp==null ? null : new java.sql.Timestamp( timeStamp.getTime() ) } );
	}

	/**
	 * Method 'WsSessionsDaoImpl'
	 * 
	 */
	public WsSessionsDaoImpl()
	{
	}

	/**
	 * Method 'WsSessionsDaoImpl'
	 * 
	 * @param userConn
	 */
	public WsSessionsDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "WS_SESSIONS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected WsSessions fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			WsSessions dto = new WsSessions();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected WsSessions[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			WsSessions dto = new WsSessions();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		WsSessions ret[] = new WsSessions[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(WsSessions dto, ResultSet rs) throws SQLException
	{
		dto.setWsSessionId( rs.getLong( COLUMN_WS_SESSION_ID ) );
		dto.setAppName( rs.getString( COLUMN_APP_NAME ) );
		dto.setSessionId( rs.getString( COLUMN_SESSION_ID ) );
		dto.setMachineId( rs.getLong( COLUMN_MACHINE_ID ) );
		dto.setTimeStamp( rs.getTimestamp(COLUMN_TIME_STAMP ) );
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the specified arbitrary SQL statement
	 */
	public WsSessions[] findByDynamicSelect(String sql, Object[] sqlParams) throws WsSessionsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new WsSessionsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the WS_SESSIONS table that match the specified arbitrary SQL statement
	 */
	public WsSessions[] findByDynamicWhere(String sql, Object[] sqlParams) throws WsSessionsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new WsSessionsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}