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

public interface ServerRuntimeConfigSession extends EJBObject
{
	/** 
	 * Inserts a new row in the SERVER_RUNTIME_CONFIG table.
	 */
	public ServerRuntimeConfigPk insert(ServerRuntimeConfig dto) throws ServerRuntimeConfigDaoException, RemoteException;

	/** 
	 * Updates a single row in the SERVER_RUNTIME_CONFIG table.
	 */
	public void update(ServerRuntimeConfigPk pk, ServerRuntimeConfig dto) throws ServerRuntimeConfigDaoException, RemoteException;

	/** 
	 * Deletes a single row in the SERVER_RUNTIME_CONFIG table.
	 */
	public void delete(ServerRuntimeConfigPk pk) throws ServerRuntimeConfigDaoException, RemoteException;

	/** 
	 * Returns the rows from the SERVER_RUNTIME_CONFIG table that matches the specified primary-key value.
	 */
	public ServerRuntimeConfig findByPrimaryKey(ServerRuntimeConfigPk pk) throws ServerRuntimeConfigDaoException, RemoteException;

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param configKey
	 * @throws ServerRuntimeConfigDaoException
	 * @throws RemoteException
	 * @return ServerRuntimeConfig
	 */
	public ServerRuntimeConfig findByPrimaryKey(String configKey) throws ServerRuntimeConfigDaoException, RemoteException;

	/**
	 * Method 'findAll'
	 * 
	 * @throws ServerRuntimeConfigDaoException
	 * @throws RemoteException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findAll() throws ServerRuntimeConfigDaoException, RemoteException;

	/**
	 * Method 'findWhereConfigIdEquals'
	 * 
	 * @param configId
	 * @throws ServerRuntimeConfigDaoException
	 * @throws RemoteException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findWhereConfigIdEquals(long configId) throws ServerRuntimeConfigDaoException, RemoteException;

	/**
	 * Method 'findWhereConfigKeyEquals'
	 * 
	 * @param configKey
	 * @throws ServerRuntimeConfigDaoException
	 * @throws RemoteException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findWhereConfigKeyEquals(String configKey) throws ServerRuntimeConfigDaoException, RemoteException;

	/**
	 * Method 'findWhereConfigValueEquals'
	 * 
	 * @param configValue
	 * @throws ServerRuntimeConfigDaoException
	 * @throws RemoteException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findWhereConfigValueEquals(String configValue) throws ServerRuntimeConfigDaoException, RemoteException;

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ServerRuntimeConfigDaoException
	 * @throws RemoteException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findByDynamicSelect(String sql, Object[] arg) throws ServerRuntimeConfigDaoException, RemoteException;

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ServerRuntimeConfigDaoException
	 * @throws RemoteException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findByDynamicWhere(String sql, Object[] arg) throws ServerRuntimeConfigDaoException, RemoteException;

}
