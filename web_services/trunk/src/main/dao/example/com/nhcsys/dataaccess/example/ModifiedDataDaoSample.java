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
import com.nhcsys.dataaccess.dao.ModifiedDataDao;
import com.nhcsys.dataaccess.dto.ModifiedData;
import com.nhcsys.dataaccess.exceptions.ModifiedDataDaoException;
import com.nhcsys.dataaccess.factory.ModifiedDataDaoFactory;

public class ModifiedDataDaoSample
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
		// findWhereModifiedDataIdEquals(0);
		// findWhereCustomerIdEquals(0);
		// findWhereModifiedTimeEquals(null);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ModifiedDataDao _dao = getModifiedDataDao();
			ModifiedData _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereModifiedDataIdEquals'
	 * 
	 * @param modifiedDataId
	 */
	public static void findWhereModifiedDataIdEquals(long modifiedDataId)
	{
		try {
			ModifiedDataDao _dao = getModifiedDataDao();
			ModifiedData _result[] = _dao.findWhereModifiedDataIdEquals(modifiedDataId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCustomerIdEquals'
	 * 
	 * @param customerId
	 */
	public static void findWhereCustomerIdEquals(long customerId)
	{
		try {
			ModifiedDataDao _dao = getModifiedDataDao();
			ModifiedData _result[] = _dao.findWhereCustomerIdEquals(customerId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereModifiedTimeEquals'
	 * 
	 * @param modifiedTime
	 */
	public static void findWhereModifiedTimeEquals(Date modifiedTime)
	{
		try {
			ModifiedDataDao _dao = getModifiedDataDao();
			ModifiedData _result[] = _dao.findWhereModifiedTimeEquals(modifiedTime);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getModifiedDataDao'
	 * 
	 * @return ModifiedDataDao
	 */
	public static ModifiedDataDao getModifiedDataDao()
	{
		return ModifiedDataDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ModifiedData dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getModifiedDataId() );
		buf.append( ", " );
		buf.append( dto.getCustomerId() );
		buf.append( ", " );
		buf.append( dto.getModifiedTime() );
		System.out.println( buf.toString() );
	}

}