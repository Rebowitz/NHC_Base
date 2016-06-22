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

public interface TelesalesCallSourceSession extends EJBObject
{
	/** 
	 * Inserts a new row in the TELESALES_CALL_SOURCE table.
	 */
	public TelesalesCallSourcePk insert(TelesalesCallSource dto) throws TelesalesCallSourceDaoException, RemoteException;

	/** 
	 * Updates a single row in the TELESALES_CALL_SOURCE table.
	 */
	public void update(TelesalesCallSourcePk pk, TelesalesCallSource dto) throws TelesalesCallSourceDaoException, RemoteException;

	/** 
	 * Deletes a single row in the TELESALES_CALL_SOURCE table.
	 */
	public void delete(TelesalesCallSourcePk pk) throws TelesalesCallSourceDaoException, RemoteException;

	/** 
	 * Returns the rows from the TELESALES_CALL_SOURCE table that matches the specified primary-key value.
	 */
	public TelesalesCallSource findByPrimaryKey(TelesalesCallSourcePk pk) throws TelesalesCallSourceDaoException, RemoteException;

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param sourceId
	 * @throws TelesalesCallSourceDaoException
	 * @throws RemoteException
	 * @return TelesalesCallSource
	 */
	public TelesalesCallSource findByPrimaryKey(long sourceId) throws TelesalesCallSourceDaoException, RemoteException;

	/**
	 * Method 'findAll'
	 * 
	 * @throws TelesalesCallSourceDaoException
	 * @throws RemoteException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findAll() throws TelesalesCallSourceDaoException, RemoteException;

	/**
	 * Method 'findWhereSourceIdEquals'
	 * 
	 * @param sourceId
	 * @throws TelesalesCallSourceDaoException
	 * @throws RemoteException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findWhereSourceIdEquals(long sourceId) throws TelesalesCallSourceDaoException, RemoteException;

	/**
	 * Method 'findWhereSourceDescEquals'
	 * 
	 * @param sourceDesc
	 * @throws TelesalesCallSourceDaoException
	 * @throws RemoteException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findWhereSourceDescEquals(String sourceDesc) throws TelesalesCallSourceDaoException, RemoteException;

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws TelesalesCallSourceDaoException
	 * @throws RemoteException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findByDynamicSelect(String sql, Object[] arg) throws TelesalesCallSourceDaoException, RemoteException;

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws TelesalesCallSourceDaoException
	 * @throws RemoteException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findByDynamicWhere(String sql, Object[] arg) throws TelesalesCallSourceDaoException, RemoteException;

}