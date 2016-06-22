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

public class ClqinfoSessionBean implements SessionBean
{
	private ClqinfoDao daoImpl = createDao();

	protected static final Logger logger = Logger.getLogger( ClqinfoSessionBean.class );

	/** 
	 * Inserts a new row in the CLQINFO table.
	 */
	public ClqinfoPk insert(Clqinfo dto) throws ClqinfoDaoException
	{
		try {
			return daoImpl.insert(dto);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Updates a single row in the CLQINFO table.
	 */
	public void update(ClqinfoPk pk, Clqinfo dto) throws ClqinfoDaoException
	{
		try {
			daoImpl.update(pk, dto);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Deletes a single row in the CLQINFO table.
	 */
	public void delete(ClqinfoPk pk) throws ClqinfoDaoException
	{
		try {
			daoImpl.delete(pk);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/** 
	 * Returns the rows from the CLQINFO table that matches the specified primary-key value.
	 */
	public Clqinfo findByPrimaryKey(ClqinfoPk pk) throws ClqinfoDaoException
	{
		return findByPrimaryKey( pk.getClqinfoId() );
	}

	/**
	 * Method 'findByPrimaryKey'
	 * 
	 * @param clqinfoId
	 * @throws ClqinfoDaoException
	 * @return Clqinfo
	 */
	public Clqinfo findByPrimaryKey(long clqinfoId) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findByPrimaryKey(clqinfoId);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findAll'
	 * 
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findAll() throws ClqinfoDaoException
	{
		try {
			return daoImpl.findAll();
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereClqinfoIdEquals'
	 * 
	 * @param clqinfoId
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereClqinfoIdEquals(long clqinfoId) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findWhereClqinfoIdEquals(clqinfoId);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereNetworkinfoIdEquals'
	 * 
	 * @param networkinfoId
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereNetworkinfoIdEquals(long networkinfoId) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findWhereNetworkinfoIdEquals(networkinfoId);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereNameEquals'
	 * 
	 * @param name
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereNameEquals(String name) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findWhereNameEquals(name);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereCmdlineEquals'
	 * 
	 * @param cmdline
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereCmdlineEquals(String cmdline) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findWhereCmdlineEquals(cmdline);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findWhereResultEquals'
	 * 
	 * @param result
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findWhereResultEquals(String result) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findWhereResultEquals(result);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicSelect'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findByDynamicSelect(String sql, Object[] arg) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findByDynamicSelect(sql, arg);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
		}
		
	}

	/**
	 * Method 'findByDynamicWhere'
	 * 
	 * @param sql
	 * @param arg
	 * @throws ClqinfoDaoException
	 * @return Clqinfo[]
	 */
	public Clqinfo[] findByDynamicWhere(String sql, Object[] arg) throws ClqinfoDaoException
	{
		try {
			return daoImpl.findByDynamicWhere(sql, arg);
		}
		catch (ClqinfoDaoException daoException) {
			throw daoException;
		}
		catch (Exception ex) {
			logger.error( ex);
			throw new ClqinfoDaoException( ex.getMessage() );
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
	 * @return ClqinfoDao
	 */
	private ClqinfoDao createDao()
	{
		return ClqinfoDaoFactory.create();
	}

}
