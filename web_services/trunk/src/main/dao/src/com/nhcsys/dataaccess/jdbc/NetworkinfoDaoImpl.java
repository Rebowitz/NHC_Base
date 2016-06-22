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

public class NetworkinfoDaoImpl extends AbstractDAO implements NetworkinfoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( NetworkinfoDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT NETWORKINFO_ID, CUSTOMER_ID, MACHINE_ID, SSID, PASSPHRASE, WIRELESSINFOTYPE, TIMESTAMP FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	private int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( NETWORKINFO_ID, CUSTOMER_ID, MACHINE_ID, SSID, PASSPHRASE, WIRELESSINFOTYPE, TIMESTAMP ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET NETWORKINFO_ID = ?, CUSTOMER_ID = ?, MACHINE_ID = ?, SSID = ?, PASSPHRASE = ?, WIRELESSINFOTYPE = ?, TIMESTAMP = ? WHERE NETWORKINFO_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE NETWORKINFO_ID = ?";

	/** 
	 * Index of column NETWORKINFO_ID
	 */
	protected static final int COLUMN_NETWORKINFO_ID = 1;

	/** 
	 * Index of column CUSTOMER_ID
	 */
	protected static final int COLUMN_CUSTOMER_ID = 2;

	/** 
	 * Index of column MACHINE_ID
	 */
	protected static final int COLUMN_MACHINE_ID = 3;

	/** 
	 * Index of column SSID
	 */
	protected static final int COLUMN_SSID = 4;

	/** 
	 * Index of column PASSPHRASE
	 */
	protected static final int COLUMN_PASSPHRASE = 5;

	/** 
	 * Index of column WIRELESSINFOTYPE
	 */
	protected static final int COLUMN_WIRELESSINFOTYPE = 6;

	/** 
	 * Index of column TIMESTAMP
	 */
	protected static final int COLUMN_TIMESTAMP = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column NETWORKINFO_ID
	 */
	protected static final int PK_COLUMN_NETWORKINFO_ID = 1;

	/** 
	 * Inserts a new row in the NETWORKINFO table.
	 */
	public NetworkinfoPk insert(Networkinfo dto) throws NetworkinfoDaoException
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
		
			stmt = conn.prepareStatement( "SELECT networkinfo_id_seq.NEXTVAL FROM DUAL" );
			rs = stmt.executeQuery();
			if (rs.next()) {
				dto.setNetworkinfoId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			StringBuffer sql = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isNetworkinfoIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "NETWORKINFO_ID" );
				modifiedCount++;
			}
		
			if (dto.isCustomerIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "CUSTOMER_ID" );
				modifiedCount++;
			}
		
			if (dto.isMachineIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "MACHINE_ID" );
				modifiedCount++;
			}
		
			if (dto.isSsidModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "SSID" );
				modifiedCount++;
			}
		
			if (dto.isPassphraseModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "PASSPHRASE" );
				modifiedCount++;
			}
		
			if (dto.isWirelessinfotypeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "WIRELESSINFOTYPE" );
				modifiedCount++;
			}
		
			if (dto.isTimestampModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "TIMESTAMP" );
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
			if (dto.isNetworkinfoIdModified()) {
				stmt.setLong( index++, dto.getNetworkinfoId() );
			}
		
			if (dto.isCustomerIdModified()) {
				stmt.setLong( index++, dto.getCustomerId() );
			}
		
			if (dto.isMachineIdModified()) {
				stmt.setLong( index++, dto.getMachineId() );
			}
		
			if (dto.isSsidModified()) {
				stmt.setString( index++, dto.getSsid() );
			}
		
			if (dto.isPassphraseModified()) {
				stmt.setString( index++, dto.getPassphrase() );
			}
		
			if (dto.isWirelessinfotypeModified()) {
				stmt.setString( index++, dto.getWirelessinfotype() );
			}
		
			if (dto.isTimestampModified()) {
				stmt.setTimestamp(index++, dto.getTimestamp()==null ? null : new java.sql.Timestamp( dto.getTimestamp().getTime() ) );
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
			throw new NetworkinfoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the NETWORKINFO table.
	 */
	public void update(NetworkinfoPk pk, Networkinfo dto) throws NetworkinfoDaoException
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
			if (dto.isNetworkinfoIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NETWORKINFO_ID=?" );
				modified=true;
			}
		
			if (dto.isCustomerIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CUSTOMER_ID=?" );
				modified=true;
			}
		
			if (dto.isMachineIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MACHINE_ID=?" );
				modified=true;
			}
		
			if (dto.isSsidModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "SSID=?" );
				modified=true;
			}
		
			if (dto.isPassphraseModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PASSPHRASE=?" );
				modified=true;
			}
		
			if (dto.isWirelessinfotypeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "WIRELESSINFOTYPE=?" );
				modified=true;
			}
		
			if (dto.isTimestampModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TIMESTAMP=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE NETWORKINFO_ID=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isNetworkinfoIdModified()) {
				stmt.setLong( index++, dto.getNetworkinfoId() );
			}
		
			if (dto.isCustomerIdModified()) {
				stmt.setLong( index++, dto.getCustomerId() );
			}
		
			if (dto.isMachineIdModified()) {
				stmt.setLong( index++, dto.getMachineId() );
			}
		
			if (dto.isSsidModified()) {
				stmt.setString( index++, dto.getSsid() );
			}
		
			if (dto.isPassphraseModified()) {
				stmt.setString( index++, dto.getPassphrase() );
			}
		
			if (dto.isWirelessinfotypeModified()) {
				stmt.setString( index++, dto.getWirelessinfotype() );
			}
		
			if (dto.isTimestampModified()) {
				stmt.setTimestamp(index++, dto.getTimestamp()==null ? null : new java.sql.Timestamp( dto.getTimestamp().getTime() ) );
			}
		
			stmt.setLong( index++, pk.getNetworkinfoId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new NetworkinfoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the NETWORKINFO table.
	 */
	public void delete(NetworkinfoPk pk) throws NetworkinfoDaoException
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
			stmt.setLong( 1, pk.getNetworkinfoId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new NetworkinfoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the NETWORKINFO table that matches the specified primary-key value.
	 */
	public Networkinfo findByPrimaryKey(NetworkinfoPk pk) throws NetworkinfoDaoException
	{
		return findByPrimaryKey( pk.getNetworkinfoId() );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'NETWORKINFO_ID = :networkinfoId'.
	 */
	public Networkinfo findByPrimaryKey(long networkinfoId) throws NetworkinfoDaoException
	{
		Networkinfo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE NETWORKINFO_ID = ?", new Object[] {  new Long(networkinfoId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria ''.
	 */
	public Networkinfo[] findAll() throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY NETWORKINFO_ID", null );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'NETWORKINFO_ID = :networkinfoId'.
	 */
	public Networkinfo[] findWhereNetworkinfoIdEquals(long networkinfoId) throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NETWORKINFO_ID = ? ORDER BY NETWORKINFO_ID", new Object[] {  new Long(networkinfoId) } );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'CUSTOMER_ID = :customerId'.
	 */
	public Networkinfo[] findWhereCustomerIdEquals(long customerId) throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CUSTOMER_ID = ? ORDER BY CUSTOMER_ID", new Object[] {  new Long(customerId) } );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'MACHINE_ID = :machineId'.
	 */
	public Networkinfo[] findWhereMachineIdEquals(long machineId) throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MACHINE_ID = ? ORDER BY MACHINE_ID", new Object[] {  new Long(machineId) } );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'SSID = :ssid'.
	 */
	public Networkinfo[] findWhereSsidEquals(String ssid) throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SSID = ? ORDER BY SSID", new Object[] { ssid } );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'PASSPHRASE = :passphrase'.
	 */
	public Networkinfo[] findWherePassphraseEquals(String passphrase) throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PASSPHRASE = ? ORDER BY PASSPHRASE", new Object[] { passphrase } );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'WIRELESSINFOTYPE = :wirelessinfotype'.
	 */
	public Networkinfo[] findWhereWirelessinfotypeEquals(String wirelessinfotype) throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE WIRELESSINFOTYPE = ? ORDER BY WIRELESSINFOTYPE", new Object[] { wirelessinfotype } );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the criteria 'TIMESTAMP = :timestamp'.
	 */
	public Networkinfo[] findWhereTimestampEquals(Date timestamp) throws NetworkinfoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIMESTAMP = ? ORDER BY TIMESTAMP", new Object[] { timestamp==null ? null : new java.sql.Timestamp( timestamp.getTime() ) } );
	}

	/**
	 * Method 'NetworkinfoDaoImpl'
	 * 
	 */
	public NetworkinfoDaoImpl()
	{
	}

	/**
	 * Method 'NetworkinfoDaoImpl'
	 * 
	 * @param userConn
	 */
	public NetworkinfoDaoImpl(final java.sql.Connection userConn)
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
		return "NETWORKINFO";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Networkinfo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Networkinfo dto = new Networkinfo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Networkinfo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Networkinfo dto = new Networkinfo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Networkinfo ret[] = new Networkinfo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Networkinfo dto, ResultSet rs) throws SQLException
	{
		dto.setNetworkinfoId( rs.getLong( COLUMN_NETWORKINFO_ID ) );
		dto.setCustomerId( rs.getLong( COLUMN_CUSTOMER_ID ) );
		dto.setMachineId( rs.getLong( COLUMN_MACHINE_ID ) );
		dto.setSsid( rs.getString( COLUMN_SSID ) );
		dto.setPassphrase( rs.getString( COLUMN_PASSPHRASE ) );
		dto.setWirelessinfotype( rs.getString( COLUMN_WIRELESSINFOTYPE ) );
		dto.setTimestamp( rs.getTimestamp(COLUMN_TIMESTAMP ) );
	}

	/** 
	 * Returns all rows from the NETWORKINFO table that match the specified arbitrary SQL statement
	 */
	public Networkinfo[] findByDynamicSelect(String sql, Object[] sqlParams) throws NetworkinfoDaoException
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
			throw new NetworkinfoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the NETWORKINFO table that match the specified arbitrary SQL statement
	 */
	public Networkinfo[] findByDynamicWhere(String sql, Object[] sqlParams) throws NetworkinfoDaoException
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
			throw new NetworkinfoDaoException( "Exception: " + _e.getMessage(), _e );
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