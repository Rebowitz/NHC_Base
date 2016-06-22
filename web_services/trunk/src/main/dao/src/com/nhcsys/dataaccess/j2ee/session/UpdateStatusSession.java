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

public interface UpdateStatusSession extends EJBObject
{
	/** 
	 * Inserts a new row in the UPDATE_STATUS table.
	 */
	public UpdateStatusPk insert(UpdateStatus dto) throws UpdateStatusDaoException, RemoteException;

	/** 
	 * Updates a single row in the UPDATE_STATUS table.
	 */
	public void update(UpdateStatusPk pk, UpdateStatus dto) throws UpdateStatusDaoException, RemoteException;

	/** 
	 * Deletes a single row in the UPDATE_STATUS table.
	 */
	public void delete(UpdateStatusPk pk) throws UpdateStatusDaoException, RemoteException;

	/** 
	 * Returns the rows from the UPDATE_STATUS table that matches the specified primary-key value.
	 */
	public UpdateStatus findByPrimaryKey(UpdateStatusPk pk) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param updateStatusId
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus
	 */
	public UpdateStatus findByPrimaryKey(long updateStatusId) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findAll'
	 * 
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findAll() throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findWhereUpdateStatusIdEquals'
	 * 
	 * @param updateStatusId
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereUpdateStatusIdEquals(long updateStatusId) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findWhereSessionIdEquals'
	 * 
	 * @param sessionId
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereSessionIdEquals(String sessionId) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findWhereMachineIdEquals'
	 * 
	 * @param machineId
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereMachineIdEquals(long machineId) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findWhereProductIdEquals'
	 * 
	 * @param productId
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereProductIdEquals(String productId) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findWhereDescriptionEquals'
	 * 
	 * @param description
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereDescriptionEquals(String description) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findWhereReportEquals'
	 * 
	 * @param report
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereReportEquals(String report) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findWhereStatusEquals'
	 * 
	 * @param status
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereStatusEquals(String status) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findByDynamicSelect(String sql, Object[] arg) throws UpdateStatusDaoException, RemoteException;

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws UpdateStatusDaoException
	 * @throws RemoteException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findByDynamicWhere(String sql, Object[] arg) throws UpdateStatusDaoException, RemoteException;

}