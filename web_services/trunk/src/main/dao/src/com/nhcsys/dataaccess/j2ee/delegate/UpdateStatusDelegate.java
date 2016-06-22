/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.j2ee.delegate;

import com.nhcsys.dataaccess.dao.*;
import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.exceptions.*;
import com.nhcsys.dataaccess.j2ee.session.*;
import java.rmi.RemoteException;
import java.math.*;
import java.util.Date;
import javax.ejb.*;
import org.apache.log4j.Logger;

public class UpdateStatusDelegate implements UpdateStatusDao
{
	private UpdateStatusSession session;

	protected static final Logger logger = Logger.getLogger( UpdateStatusDelegate.class );

	private int maxRows;

	/**
	 * Method 'UpdateStatusDelegate'
	 * 
	 * @param session
	 */
	public UpdateStatusDelegate(final UpdateStatusSession session)
	{
		this.session = session;
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
	 * Inserts a new row in the UPDATE_STATUS table.
	 */
	public UpdateStatusPk insert(UpdateStatus dto) throws UpdateStatusDaoException
	{
		try {
			return session.insert(dto);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Updates a single row in the UPDATE_STATUS table.
	 */
	public void update(UpdateStatusPk pk, UpdateStatus dto) throws UpdateStatusDaoException
	{
		try {
			session.update(pk, dto);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Deletes a single row in the UPDATE_STATUS table.
	 */
	public void delete(UpdateStatusPk pk) throws UpdateStatusDaoException
	{
		try {
			session.delete(pk);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param pk
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus
	 */
	public UpdateStatus findByPrimaryKey(UpdateStatusPk pk) throws UpdateStatusDaoException
	{
		try {
			return session.findByPrimaryKey(pk);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param updateStatusId
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus
	 */
	public UpdateStatus findByPrimaryKey(long updateStatusId) throws UpdateStatusDaoException
	{
		try {
			return session.findByPrimaryKey(updateStatusId);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findAll() throws UpdateStatusDaoException
	{
		try {
			return session.findAll();
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereUpdateStatusIdEquals'
	 * 
	 * @param updateStatusId
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereUpdateStatusIdEquals(long updateStatusId) throws UpdateStatusDaoException
	{
		try {
			return session.findWhereUpdateStatusIdEquals(updateStatusId);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereSessionIdEquals'
	 * 
	 * @param sessionId
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereSessionIdEquals(String sessionId) throws UpdateStatusDaoException
	{
		try {
			return session.findWhereSessionIdEquals(sessionId);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereMachineIdEquals'
	 * 
	 * @param machineId
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereMachineIdEquals(long machineId) throws UpdateStatusDaoException
	{
		try {
			return session.findWhereMachineIdEquals(machineId);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereProductIdEquals'
	 * 
	 * @param productId
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereProductIdEquals(String productId) throws UpdateStatusDaoException
	{
		try {
			return session.findWhereProductIdEquals(productId);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereDescriptionEquals'
	 * 
	 * @param description
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereDescriptionEquals(String description) throws UpdateStatusDaoException
	{
		try {
			return session.findWhereDescriptionEquals(description);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereReportEquals'
	 * 
	 * @param report
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereReportEquals(String report) throws UpdateStatusDaoException
	{
		try {
			return session.findWhereReportEquals(report);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereStatusEquals'
	 * 
	 * @param status
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findWhereStatusEquals(String status) throws UpdateStatusDaoException
	{
		try {
			return session.findWhereStatusEquals(status);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param sqlParams
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findByDynamicSelect(String sql, Object[] sqlParams) throws UpdateStatusDaoException
	{
		try {
			return session.findByDynamicSelect(sql, sqlParams);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param sqlParams
	 * @throws UpdateStatusDaoException
	 * @return UpdateStatus[]
	 */
	public UpdateStatus[] findByDynamicWhere(String sql, Object[] sqlParams) throws UpdateStatusDaoException
	{
		try {
			return session.findByDynamicWhere(sql, sqlParams);
		}
		catch (UpdateStatusDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new UpdateStatusDaoException( ex.getMessage() );
		}
		
	}

}
