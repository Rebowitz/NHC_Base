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
import org.apache.log4j.Logger;

public class ServerRuntimeConfigSessionBean implements SessionBean
{
	private ServerRuntimeConfigDao daoImpl = createDao();

	protected static final Logger logger = Logger.getLogger( ServerRuntimeConfigSessionBean.class );

	/** 
	 * Inserts a new row in the SERVER_RUNTIME_CONFIG table.
	 */
	public ServerRuntimeConfigPk insert(ServerRuntimeConfig dto) throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.insert(dto);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Updates a single row in the SERVER_RUNTIME_CONFIG table.
	 */
	public void update(ServerRuntimeConfigPk pk, ServerRuntimeConfig dto) throws ServerRuntimeConfigDaoException
	{
		try {
			daoImpl.update(pk, dto);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Deletes a single row in the SERVER_RUNTIME_CONFIG table.
	 */
	public void delete(ServerRuntimeConfigPk pk) throws ServerRuntimeConfigDaoException
	{
		try {
			daoImpl.delete(pk);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Returns the rows from the SERVER_RUNTIME_CONFIG table that matches the specified primary-key value.
	 */
	public ServerRuntimeConfig findByPrimaryKey(ServerRuntimeConfigPk pk) throws ServerRuntimeConfigDaoException
	{
		return findByPrimaryKey( pk.getConfigKey() );
	}

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param configKey
	 * @throws ServerRuntimeConfigDaoException
	 * @return ServerRuntimeConfig
	 */
	public ServerRuntimeConfig findByPrimaryKey(String configKey) throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.findByPrimaryKey(configKey);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws ServerRuntimeConfigDaoException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findAll() throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.findAll();
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereConfigIdEquals'
	 * 
	 * @param configId
	 * @throws ServerRuntimeConfigDaoException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findWhereConfigIdEquals(long configId) throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.findWhereConfigIdEquals(configId);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereConfigKeyEquals'
	 * 
	 * @param configKey
	 * @throws ServerRuntimeConfigDaoException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findWhereConfigKeyEquals(String configKey) throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.findWhereConfigKeyEquals(configKey);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereConfigValueEquals'
	 * 
	 * @param configValue
	 * @throws ServerRuntimeConfigDaoException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findWhereConfigValueEquals(String configValue) throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.findWhereConfigValueEquals(configValue);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ServerRuntimeConfigDaoException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findByDynamicSelect(String sql, Object[] arg) throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.findByDynamicSelect(sql, arg);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ServerRuntimeConfigDaoException
	 * @return ServerRuntimeConfig[]
	 */
	public ServerRuntimeConfig[] findByDynamicWhere(String sql, Object[] arg) throws ServerRuntimeConfigDaoException
	{
		try {
			return daoImpl.findByDynamicWhere(sql, arg);
		}
		catch (ServerRuntimeConfigDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ServerRuntimeConfigDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'ejbActivate'
	 * 
	 */
	public void ejbActivate()
	{
	}

	/**
	 * Method 'ejbPassivate'
	 * 
	 */
	public void ejbPassivate()
	{
	}

	/**
	 * Method 'ejbCreate'
	 * 
	 */
	public void ejbCreate()
	{
	}

	/**
	 * Method 'ejbRemove'
	 * 
	 */
	public void ejbRemove()
	{
	}

	/**
	 * Method 'setSessionContext'
	 * 
	 * @param ctx
	 */
	public void setSessionContext(SessionContext ctx)
	{
	}

	/**
	 * Method 'unsetSessionContext'
	 * 
	 */
	public void unsetSessionContext()
	{
	}

	/**
	 * Method 'createDao'
	 * 
	 * @return ServerRuntimeConfigDao
	 */
	private ServerRuntimeConfigDao createDao()
	{
		return ServerRuntimeConfigDaoFactory.create();
	}

}
