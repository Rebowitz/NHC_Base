/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import com.nhcsys.dataaccess.dao.TelesalesCallSourceDao;
import com.nhcsys.dataaccess.dto.TelesalesCallSource;
import com.nhcsys.dataaccess.exceptions.TelesalesCallSourceDaoException;
import com.nhcsys.dataaccess.factory.TelesalesCallSourceDaoFactory;

public class TelesalesCallSourceDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereSourceIdEquals(0);
		// findWhereSourceDescEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			TelesalesCallSourceDao _dao = getTelesalesCallSourceDao();
			TelesalesCallSource _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSourceIdEquals'
	 * 
	 * @param sourceId
	 */
	public static void findWhereSourceIdEquals(long sourceId)
	{
		try {
			TelesalesCallSourceDao _dao = getTelesalesCallSourceDao();
			TelesalesCallSource _result[] = _dao.findWhereSourceIdEquals(sourceId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSourceDescEquals'
	 * 
	 * @param sourceDesc
	 */
	public static void findWhereSourceDescEquals(String sourceDesc)
	{
		try {
			TelesalesCallSourceDao _dao = getTelesalesCallSourceDao();
			TelesalesCallSource _result[] = _dao.findWhereSourceDescEquals(sourceDesc);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getTelesalesCallSourceDao'
	 * 
	 * @return TelesalesCallSourceDao
	 */
	public static TelesalesCallSourceDao getTelesalesCallSourceDao()
	{
		return TelesalesCallSourceDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(TelesalesCallSource dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSourceId() );
		buf.append( ", " );
		buf.append( dto.getSourceDesc() );
		System.out.println( buf.toString() );
	}

}
