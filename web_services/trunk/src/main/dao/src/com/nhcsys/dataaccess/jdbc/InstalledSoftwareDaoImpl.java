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

public class InstalledSoftwareDaoImpl extends AbstractDAO implements InstalledSoftwareDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( InstalledSoftwareDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT SOFTWARE_ID, MACHINE_ID, PRODUCT_KEY, PRODUCT_NAME, COMPANY_NAME, PRODUCT_VERSION, CUSTOMER_ID FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	private int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( SOFTWARE_ID, MACHINE_ID, PRODUCT_KEY, PRODUCT_NAME, COMPANY_NAME, PRODUCT_VERSION, CUSTOMER_ID ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET SOFTWARE_ID = ?, MACHINE_ID = ?, PRODUCT_KEY = ?, PRODUCT_NAME = ?, COMPANY_NAME = ?, PRODUCT_VERSION = ?, CUSTOMER_ID = ? WHERE SOFTWARE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE SOFTWARE_ID = ?";

	/** 
	 * Index of column SOFTWARE_ID
	 */
	protected static final int COLUMN_SOFTWARE_ID = 1;

	/** 
	 * Index of column MACHINE_ID
	 */
	protected static final int COLUMN_MACHINE_ID = 2;

	/** 
	 * Index of column PRODUCT_KEY
	 */
	protected static final int COLUMN_PRODUCT_KEY = 3;

	/** 
	 * Index of column PRODUCT_NAME
	 */
	protected static final int COLUMN_PRODUCT_NAME = 4;

	/** 
	 * Index of column COMPANY_NAME
	 */
	protected static final int COLUMN_COMPANY_NAME = 5;

	/** 
	 * Index of column PRODUCT_VERSION
	 */
	protected static final int COLUMN_PRODUCT_VERSION = 6;

	/** 
	 * Index of column CUSTOMER_ID
	 */
	protected static final int COLUMN_CUSTOMER_ID = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column SOFTWARE_ID
	 */
	protected static final int PK_COLUMN_SOFTWARE_ID = 1;

	/** 
	 * Inserts a new row in the INSTALLED_SOFTWARE table.
	 */
	public InstalledSoftwarePk insert(InstalledSoftware dto) throws InstalledSoftwareDaoException
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
		
			stmt = conn.prepareStatement( "SELECT software_id_seq.NEXTVAL FROM DUAL" );
			rs = stmt.executeQuery();
			if (rs.next()) {
				dto.setSoftwareId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			StringBuffer sql = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isSoftwareIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "SOFTWARE_ID" );
				modifiedCount++;
			}
		
			if (dto.isMachineIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "MACHINE_ID" );
				modifiedCount++;
			}
		
			if (dto.isProductKeyModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "PRODUCT_KEY" );
				modifiedCount++;
			}
		
			if (dto.isProductNameModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "PRODUCT_NAME" );
				modifiedCount++;
			}
		
			if (dto.isCompanyNameModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "COMPANY_NAME" );
				modifiedCount++;
			}
		
			if (dto.isProductVersionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "PRODUCT_VERSION" );
				modifiedCount++;
			}
		
			if (dto.isCustomerIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
				}
		
				sql.append( "CUSTOMER_ID" );
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
			if (dto.isSoftwareIdModified()) {
				stmt.setLong( index++, dto.getSoftwareId() );
			}
		
			if (dto.isMachineIdModified()) {
				stmt.setLong( index++, dto.getMachineId() );
			}
		
			if (dto.isProductKeyModified()) {
				stmt.setString( index++, dto.getProductKey() );
			}
		
			if (dto.isProductNameModified()) {
				stmt.setString( index++, dto.getProductName() );
			}
		
			if (dto.isCompanyNameModified()) {
				stmt.setString( index++, dto.getCompanyName() );
			}
		
			if (dto.isProductVersionModified()) {
				stmt.setString( index++, dto.getProductVersion() );
			}
		
			if (dto.isCustomerIdModified()) {
				stmt.setLong( index++, dto.getCustomerId() );
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
			throw new InstalledSoftwareDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the INSTALLED_SOFTWARE table.
	 */
	public void update(InstalledSoftwarePk pk, InstalledSoftware dto) throws InstalledSoftwareDaoException
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
			if (dto.isSoftwareIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "SOFTWARE_ID=?" );
				modified=true;
			}
		
			if (dto.isMachineIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MACHINE_ID=?" );
				modified=true;
			}
		
			if (dto.isProductKeyModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRODUCT_KEY=?" );
				modified=true;
			}
		
			if (dto.isProductNameModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRODUCT_NAME=?" );
				modified=true;
			}
		
			if (dto.isCompanyNameModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COMPANY_NAME=?" );
				modified=true;
			}
		
			if (dto.isProductVersionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRODUCT_VERSION=?" );
				modified=true;
			}
		
			if (dto.isCustomerIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CUSTOMER_ID=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE SOFTWARE_ID=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isSoftwareIdModified()) {
				stmt.setLong( index++, dto.getSoftwareId() );
			}
		
			if (dto.isMachineIdModified()) {
				stmt.setLong( index++, dto.getMachineId() );
			}
		
			if (dto.isProductKeyModified()) {
				stmt.setString( index++, dto.getProductKey() );
			}
		
			if (dto.isProductNameModified()) {
				stmt.setString( index++, dto.getProductName() );
			}
		
			if (dto.isCompanyNameModified()) {
				stmt.setString( index++, dto.getCompanyName() );
			}
		
			if (dto.isProductVersionModified()) {
				stmt.setString( index++, dto.getProductVersion() );
			}
		
			if (dto.isCustomerIdModified()) {
				stmt.setLong( index++, dto.getCustomerId() );
			}
		
			stmt.setLong( index++, pk.getSoftwareId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new InstalledSoftwareDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the INSTALLED_SOFTWARE table.
	 */
	public void delete(InstalledSoftwarePk pk) throws InstalledSoftwareDaoException
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
			stmt.setLong( 1, pk.getSoftwareId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new InstalledSoftwareDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the INSTALLED_SOFTWARE table that matches the specified primary-key value.
	 */
	public InstalledSoftware findByPrimaryKey(InstalledSoftwarePk pk) throws InstalledSoftwareDaoException
	{
		return findByPrimaryKey( pk.getSoftwareId() );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'SOFTWARE_ID = :softwareId'.
	 */
	public InstalledSoftware findByPrimaryKey(long softwareId) throws InstalledSoftwareDaoException
	{
		InstalledSoftware ret[] = findByDynamicSelect( SQL_SELECT + " WHERE SOFTWARE_ID = ?", new Object[] {  new Long(softwareId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'SESSION_ID = :sessionId'.
	 */
	public InstalledSoftware[] findWhereSessionIdEquals(String sessionId) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SESSION_ID = ? ORDER BY SESSION_ID", new Object[] { sessionId } );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria ''.
	 */
	public InstalledSoftware[] findAll() throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY SOFTWARE_ID", null );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'SOFTWARE_ID = :softwareId'.
	 */
	public InstalledSoftware[] findWhereSoftwareIdEquals(long softwareId) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SOFTWARE_ID = ? ORDER BY SOFTWARE_ID", new Object[] {  new Long(softwareId) } );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'CUSTOMER_ID = :customerId'.
	 */
	public InstalledSoftware[] findWhereCustomerIdEquals(long customerId) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CUSTOMER_ID = ? ORDER BY CUSTOMER_ID", new Object[] {  new Long(customerId) } );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'MACHINE_ID = :machineId'.
	 */
	public InstalledSoftware[] findWhereMachineIdEquals(long machineId) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MACHINE_ID = ? ORDER BY MACHINE_ID", new Object[] {  new Long(machineId) } );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'PRODUCT_KEY = :productKey'.
	 */
	public InstalledSoftware[] findWhereProductKeyEquals(String productKey) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRODUCT_KEY = ? ORDER BY PRODUCT_KEY", new Object[] { productKey } );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'PRODUCT_NAME = :productName'.
	 */
	public InstalledSoftware[] findWhereProductNameEquals(String productName) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRODUCT_NAME = ? ORDER BY PRODUCT_NAME", new Object[] { productName } );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'COMPANY_NAME = :companyName'.
	 */
	public InstalledSoftware[] findWhereCompanyNameEquals(String companyName) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMPANY_NAME = ? ORDER BY COMPANY_NAME", new Object[] { companyName } );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the criteria 'PRODUCT_VERSION = :productVersion'.
	 */
	public InstalledSoftware[] findWhereProductVersionEquals(String productVersion) throws InstalledSoftwareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRODUCT_VERSION = ? ORDER BY PRODUCT_VERSION", new Object[] { productVersion } );
	}

	/**
	 * Method 'InstalledSoftwareDaoImpl'
	 * 
	 */
	public InstalledSoftwareDaoImpl()
	{
	}

	/**
	 * Method 'InstalledSoftwareDaoImpl'
	 * 
	 * @param userConn
	 */
	public InstalledSoftwareDaoImpl(final java.sql.Connection userConn)
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
		return "INSTALLED_SOFTWARE";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected InstalledSoftware fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			InstalledSoftware dto = new InstalledSoftware();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected InstalledSoftware[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			InstalledSoftware dto = new InstalledSoftware();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		InstalledSoftware ret[] = new InstalledSoftware[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(InstalledSoftware dto, ResultSet rs) throws SQLException
	{
		dto.setSoftwareId( rs.getLong( COLUMN_SOFTWARE_ID ) );
		dto.setMachineId( rs.getLong( COLUMN_MACHINE_ID ) );
		dto.setProductKey( rs.getString( COLUMN_PRODUCT_KEY ) );
		dto.setProductName( rs.getString( COLUMN_PRODUCT_NAME ) );
		dto.setCompanyName( rs.getString( COLUMN_COMPANY_NAME ) );
		dto.setProductVersion( rs.getString( COLUMN_PRODUCT_VERSION ) );
		dto.setCustomerId( rs.getLong( COLUMN_CUSTOMER_ID ) );
	}

	/** 
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the specified arbitrary SQL statement
	 */
	public InstalledSoftware[] findByDynamicSelect(String sql, Object[] sqlParams) throws InstalledSoftwareDaoException
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
			throw new InstalledSoftwareDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the INSTALLED_SOFTWARE table that match the specified arbitrary SQL statement
	 */
	public InstalledSoftware[] findByDynamicWhere(String sql, Object[] sqlParams) throws InstalledSoftwareDaoException
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
			throw new InstalledSoftwareDaoException( "Exception: " + _e.getMessage(), _e );
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