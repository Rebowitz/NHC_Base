/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.dao;

import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.exceptions.*;

public interface WnqinfoDao
{
	/** 
	 * Inserts a new row in the WNQINFO table.
	 */
	public WnqinfoPk insert(Wnqinfo dto) throws WnqinfoDaoException;

	/** 
	 * Updates a single row in the WNQINFO table.
	 */
	public void update(WnqinfoPk pk, Wnqinfo dto) throws WnqinfoDaoException;

	/** 
	 * Deletes a single row in the WNQINFO table.
	 */
	public void delete(WnqinfoPk pk) throws WnqinfoDaoException;

	/** 
	 * Returns the rows from the WNQINFO table that matches the specified primary-key value.
	 */
	public Wnqinfo findByPrimaryKey(WnqinfoPk pk) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'WNQINFO_ID = :wnqinfoId'.
	 */
	public Wnqinfo findByPrimaryKey(long wnqinfoId) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria ''.
	 */
	public Wnqinfo[] findAll() throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'WNQINFO_ID = :wnqinfoId'.
	 */
	public Wnqinfo[] findWhereWnqinfoIdEquals(long wnqinfoId) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'NETWORKINFO_ID = :networkinfoId'.
	 */
	public Wnqinfo[] findWhereNetworkinfoIdEquals(long networkinfoId) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'PROVIDER = :provider'.
	 */
	public Wnqinfo[] findWhereProviderEquals(String provider) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'REMOTENAME = :remotename'.
	 */
	public Wnqinfo[] findWhereRemotenameEquals(String remotename) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'LOCALNAME = :localname'.
	 */
	public Wnqinfo[] findWhereLocalnameEquals(String localname) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'IPADDRESS = :ipaddress'.
	 */
	public Wnqinfo[] findWhereIpaddressEquals(String ipaddress) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'WNQCOMMENT = :wnqcomment'.
	 */
	public Wnqinfo[] findWhereWnqcommentEquals(String wnqcomment) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'DISPLAYTYPE = :displaytype'.
	 */
	public Wnqinfo[] findWhereDisplaytypeEquals(String displaytype) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'WNQSCOPE = :wnqscope'.
	 */
	public Wnqinfo[] findWhereWnqscopeEquals(String wnqscope) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'WNQTYPE = :wnqtype'.
	 */
	public Wnqinfo[] findWhereWnqtypeEquals(String wnqtype) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the criteria 'WNQUSAGE = :wnqusage'.
	 */
	public Wnqinfo[] findWhereWnqusageEquals(String wnqusage) throws WnqinfoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the WNQINFO table that match the specified arbitrary SQL statement
	 */
	public Wnqinfo[] findByDynamicSelect(String sql, Object[] sqlParams) throws WnqinfoDaoException;

	/** 
	 * Returns all rows from the WNQINFO table that match the specified arbitrary SQL statement
	 */
	public Wnqinfo[] findByDynamicWhere(String sql, Object[] sqlParams) throws WnqinfoDaoException;

}
