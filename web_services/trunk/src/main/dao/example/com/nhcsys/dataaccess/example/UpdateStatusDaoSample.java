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
import com.nhcsys.dataaccess.dao.UpdateStatusDao;
import com.nhcsys.dataaccess.dto.UpdateStatus;
import com.nhcsys.dataaccess.exceptions.UpdateStatusDaoException;
import com.nhcsys.dataaccess.factory.UpdateStatusDaoFactory;

public class UpdateStatusDaoSample
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
		// findWhereUpdateStatusIdEquals(0);
		// findWhereSessionIdEquals("");
		// findWhereMachineIdEquals(0);
		// findWhereProductIdEquals("");
		// findWhereDescriptionEquals("");
		// findWhereReportEquals("");
		// findWhereStatusEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUpdateStatusIdEquals'
	 * 
	 * @param updateStatusId
	 */
	public static void findWhereUpdateStatusIdEquals(long updateStatusId)
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findWhereUpdateStatusIdEquals(updateStatusId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSessionIdEquals'
	 * 
	 * @param sessionId
	 */
	public static void findWhereSessionIdEquals(String sessionId)
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findWhereSessionIdEquals(sessionId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMachineIdEquals'
	 * 
	 * @param machineId
	 */
	public static void findWhereMachineIdEquals(long machineId)
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findWhereMachineIdEquals(machineId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProductIdEquals'
	 * 
	 * @param productId
	 */
	public static void findWhereProductIdEquals(String productId)
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findWhereProductIdEquals(productId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDescriptionEquals'
	 * 
	 * @param description
	 */
	public static void findWhereDescriptionEquals(String description)
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findWhereDescriptionEquals(description);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereReportEquals'
	 * 
	 * @param report
	 */
	public static void findWhereReportEquals(String report)
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findWhereReportEquals(report);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereStatusEquals'
	 * 
	 * @param status
	 */
	public static void findWhereStatusEquals(String status)
	{
		try {
			UpdateStatusDao _dao = getUpdateStatusDao();
			UpdateStatus _result[] = _dao.findWhereStatusEquals(status);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getUpdateStatusDao'
	 * 
	 * @return UpdateStatusDao
	 */
	public static UpdateStatusDao getUpdateStatusDao()
	{
		return UpdateStatusDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(UpdateStatus dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getUpdateStatusId() );
		buf.append( ", " );
		buf.append( dto.getSessionId() );
		buf.append( ", " );
		buf.append( dto.getMachineId() );
		buf.append( ", " );
		buf.append( dto.getProductId() );
		buf.append( ", " );
		buf.append( dto.getDescription() );
		buf.append( ", " );
		buf.append( dto.getReport() );
		buf.append( ", " );
		buf.append( dto.getStatus() );
		System.out.println( buf.toString() );
	}

}
