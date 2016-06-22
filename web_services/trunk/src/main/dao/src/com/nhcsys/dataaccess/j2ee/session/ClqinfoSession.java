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

public interface ClqinfoSession extends EJBObject
{
	/** 
	 * Inserts a new row in the CLQINFO table.
	 */
	public ClqinfoPk insert(Clqinfo dto) throws ClqinfoDaoException, RemoteException;

	/** 
	 * Updates a single row in the CLQINFO table.
	 */
	public void update(ClqinfoPk pk, Clqinfo dto) throws ClqinfoDaoException, RemoteException;

	/** 
	 * Deletes a single row in the CLQINFO table.
	 */
	public void delete(ClqinfoPk pk) throws ClqinfoDaoException, RemoteException;

	/** 
	 * Returns the rows from the CLQINFO table that matches the specified primary-key value.
	 */
	public Clqinfo findByPrimaryKey(ClqinfoPk pk) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param clqinfoId
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo
	 */
	public Clqinfo findByPrimaryKey(long clqinfoId) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findAll'
	 * 
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findAll() throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findWhereClqinfoIdEquals'
	 * 
	 * @param clqinfoId
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereClqinfoIdEquals(long clqinfoId) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findWhereNetworkinfoIdEquals'
	 * 
	 * @param networkinfoId
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereNetworkinfoIdEquals(long networkinfoId) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findWhereNameEquals'
	 * 
	 * @param name
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereNameEquals(String name) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findWhereCmdlineEquals'
	 * 
	 * @param cmdline
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereCmdlineEquals(String cmdline) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findWhereResultEquals'
	 * 
	 * @param result
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereResultEquals(String result) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findByDynamicSelect(String sql, Object[] arg) throws ClqinfoDaoException, RemoteException;

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ClqinfoDaoException
	 * @throws RemoteException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findByDynamicWhere(String sql, Object[] arg) throws ClqinfoDaoException, RemoteException;

}