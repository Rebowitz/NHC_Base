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

public class WmiqinfoSessionBean implements SessionBean
{
	private WmiqinfoDao daoImpl = createDao();

	protected static final Logger logger = Logger.getLogger( WmiqinfoSessionBean.class );

	/** 
	 * Inserts a new row in the WMIQINFO table.
	 */
	public WmiqinfoPk insert(Wmiqinfo dto) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.insert(dto);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Updates a single row in the WMIQINFO table.
	 */
	public void update(WmiqinfoPk pk, Wmiqinfo dto) throws WmiqinfoDaoException
	{
		try {
			daoImpl.update(pk, dto);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Deletes a single row in the WMIQINFO table.
	 */
	public void delete(WmiqinfoPk pk) throws WmiqinfoDaoException
	{
		try {
			daoImpl.delete(pk);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Returns the rows from the WMIQINFO table that matches the specified primary-key value.
	 */
	public Wmiqinfo findByPrimaryKey(WmiqinfoPk pk) throws WmiqinfoDaoException
	{
		return findByPrimaryKey( pk.getWmiqinfoId() );
	}

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param wmiqinfoId
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo
	 */
	public Wmiqinfo findByPrimaryKey(long wmiqinfoId) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findByPrimaryKey(wmiqinfoId);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findAll() throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findAll();
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereWmiqinfoIdEquals'
	 * 
	 * @param wmiqinfoId
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findWhereWmiqinfoIdEquals(long wmiqinfoId) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findWhereWmiqinfoIdEquals(wmiqinfoId);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereNetworkinfoIdEquals'
	 * 
	 * @param networkinfoId
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findWhereNetworkinfoIdEquals(long networkinfoId) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findWhereNetworkinfoIdEquals(networkinfoId);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereNameEquals'
	 * 
	 * @param name
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findWhereNameEquals(String name) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findWhereNameEquals(name);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereQueryEquals'
	 * 
	 * @param query
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findWhereQueryEquals(String query) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findWhereQueryEquals(query);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereResultEquals'
	 * 
	 * @param result
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findWhereResultEquals(String result) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findWhereResultEquals(result);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findByDynamicSelect(String sql, Object[] arg) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findByDynamicSelect(sql, arg);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws WmiqinfoDaoException
	 * @return Wmiqinfo[]
	 */
	public Wmiqinfo[] findByDynamicWhere(String sql, Object[] arg) throws WmiqinfoDaoException
	{
		try {
			return daoImpl.findByDynamicWhere(sql, arg);
		}
		catch (WmiqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new WmiqinfoDaoException( ex.getMessage() );
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
	 * @return WmiqinfoDao
	 */
	private WmiqinfoDao createDao()
	{
		return WmiqinfoDaoFactory.create();
	}

}
