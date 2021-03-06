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

public class TelesalesCallSourceSessionBean implements SessionBean
{
	private TelesalesCallSourceDao daoImpl = createDao();

	protected static final Logger logger = Logger.getLogger( TelesalesCallSourceSessionBean.class );

	/** 
	 * Inserts a new row in the TELESALES_CALL_SOURCE table.
	 */
	public TelesalesCallSourcePk insert(TelesalesCallSource dto) throws TelesalesCallSourceDaoException
	{
		try {
			return daoImpl.insert(dto);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Updates a single row in the TELESALES_CALL_SOURCE table.
	 */
	public void update(TelesalesCallSourcePk pk, TelesalesCallSource dto) throws TelesalesCallSourceDaoException
	{
		try {
			daoImpl.update(pk, dto);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Deletes a single row in the TELESALES_CALL_SOURCE table.
	 */
	public void delete(TelesalesCallSourcePk pk) throws TelesalesCallSourceDaoException
	{
		try {
			daoImpl.delete(pk);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Returns the rows from the TELESALES_CALL_SOURCE table that matches the specified primary-key value.
	 */
	public TelesalesCallSource findByPrimaryKey(TelesalesCallSourcePk pk) throws TelesalesCallSourceDaoException
	{
		return findByPrimaryKey( pk.getSourceId() );
	}

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param sourceId
	 * @throws TelesalesCallSourceDaoException
	 * @return TelesalesCallSource
	 */
	public TelesalesCallSource findByPrimaryKey(long sourceId) throws TelesalesCallSourceDaoException
	{
		try {
			return daoImpl.findByPrimaryKey(sourceId);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws TelesalesCallSourceDaoException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findAll() throws TelesalesCallSourceDaoException
	{
		try {
			return daoImpl.findAll();
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereSourceIdEquals'
	 * 
	 * @param sourceId
	 * @throws TelesalesCallSourceDaoException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findWhereSourceIdEquals(long sourceId) throws TelesalesCallSourceDaoException
	{
		try {
			return daoImpl.findWhereSourceIdEquals(sourceId);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereSourceDescEquals'
	 * 
	 * @param sourceDesc
	 * @throws TelesalesCallSourceDaoException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findWhereSourceDescEquals(String sourceDesc) throws TelesalesCallSourceDaoException
	{
		try {
			return daoImpl.findWhereSourceDescEquals(sourceDesc);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws TelesalesCallSourceDaoException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findByDynamicSelect(String sql, Object[] arg) throws TelesalesCallSourceDaoException
	{
		try {
			return daoImpl.findByDynamicSelect(sql, arg);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws TelesalesCallSourceDaoException
	 * @return TelesalesCallSource[]
	 */
	public TelesalesCallSource[] findByDynamicWhere(String sql, Object[] arg) throws TelesalesCallSourceDaoException
	{
		try {
			return daoImpl.findByDynamicWhere(sql, arg);
		}
		catch (TelesalesCallSourceDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new TelesalesCallSourceDaoException( ex.getMessage() );
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
	 * @return TelesalesCallSourceDao
	 */
	private TelesalesCallSourceDao createDao()
	{
		return TelesalesCallSourceDaoFactory.create();
	}

}
