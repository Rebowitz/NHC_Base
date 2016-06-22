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
import com.nhcsys.dataaccess.dao.WnqinfoDao;
import com.nhcsys.dataaccess.dto.Wnqinfo;
import com.nhcsys.dataaccess.exceptions.WnqinfoDaoException;
import com.nhcsys.dataaccess.factory.WnqinfoDaoFactory;

public class WnqinfoDaoSample
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
		// findWhereWnqinfoIdEquals(0);
		// findWhereNetworkinfoIdEquals(0);
		// findWhereProviderEquals("");
		// findWhereRemotenameEquals("");
		// findWhereLocalnameEquals("");
		// findWhereIpaddressEquals("");
		// findWhereWnqcommentEquals("");
		// findWhereDisplaytypeEquals("");
		// findWhereWnqscopeEquals("");
		// findWhereWnqtypeEquals("");
		// findWhereWnqusageEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereWnqinfoIdEquals'
	 * 
	 * @param wnqinfoId
	 */
	public static void findWhereWnqinfoIdEquals(long wnqinfoId)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereWnqinfoIdEquals(wnqinfoId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNetworkinfoIdEquals'
	 * 
	 * @param networkinfoId
	 */
	public static void findWhereNetworkinfoIdEquals(long networkinfoId)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereNetworkinfoIdEquals(networkinfoId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProviderEquals'
	 * 
	 * @param provider
	 */
	public static void findWhereProviderEquals(String provider)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereProviderEquals(provider);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRemotenameEquals'
	 * 
	 * @param remotename
	 */
	public static void findWhereRemotenameEquals(String remotename)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereRemotenameEquals(remotename);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereLocalnameEquals'
	 * 
	 * @param localname
	 */
	public static void findWhereLocalnameEquals(String localname)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereLocalnameEquals(localname);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIpaddressEquals'
	 * 
	 * @param ipaddress
	 */
	public static void findWhereIpaddressEquals(String ipaddress)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereIpaddressEquals(ipaddress);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereWnqcommentEquals'
	 * 
	 * @param wnqcomment
	 */
	public static void findWhereWnqcommentEquals(String wnqcomment)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereWnqcommentEquals(wnqcomment);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDisplaytypeEquals'
	 * 
	 * @param displaytype
	 */
	public static void findWhereDisplaytypeEquals(String displaytype)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereDisplaytypeEquals(displaytype);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereWnqscopeEquals'
	 * 
	 * @param wnqscope
	 */
	public static void findWhereWnqscopeEquals(String wnqscope)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereWnqscopeEquals(wnqscope);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereWnqtypeEquals'
	 * 
	 * @param wnqtype
	 */
	public static void findWhereWnqtypeEquals(String wnqtype)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereWnqtypeEquals(wnqtype);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereWnqusageEquals'
	 * 
	 * @param wnqusage
	 */
	public static void findWhereWnqusageEquals(String wnqusage)
	{
		try {
			WnqinfoDao _dao = getWnqinfoDao();
			Wnqinfo _result[] = _dao.findWhereWnqusageEquals(wnqusage);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getWnqinfoDao'
	 * 
	 * @return WnqinfoDao
	 */
	public static WnqinfoDao getWnqinfoDao()
	{
		return WnqinfoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Wnqinfo dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getWnqinfoId() );
		buf.append( ", " );
		buf.append( dto.getNetworkinfoId() );
		buf.append( ", " );
		buf.append( dto.getProvider() );
		buf.append( ", " );
		buf.append( dto.getRemotename() );
		buf.append( ", " );
		buf.append( dto.getLocalname() );
		buf.append( ", " );
		buf.append( dto.getIpaddress() );
		buf.append( ", " );
		buf.append( dto.getWnqcomment() );
		buf.append( ", " );
		buf.append( dto.getDisplaytype() );
		buf.append( ", " );
		buf.append( dto.getWnqscope() );
		buf.append( ", " );
		buf.append( dto.getWnqtype() );
		buf.append( ", " );
		buf.append( dto.getWnqusage() );
		System.out.println( buf.toString() );
	}

}
