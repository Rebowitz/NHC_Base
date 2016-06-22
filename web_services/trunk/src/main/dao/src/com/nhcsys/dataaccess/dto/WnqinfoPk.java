/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the WNQINFO table.
 */
public class WnqinfoPk implements Serializable
{
	private long wnqinfoId;

	/** 
	 * This attribute represents whether the primitive attribute wnqinfoId is null.
	 */
	private boolean wnqinfoIdNull;

	/** 
	 * Sets the value of wnqinfoId
	 */
	public void setWnqinfoId(long wnqinfoId)
	{
		this.wnqinfoId = wnqinfoId;
	}

	/** 
	 * Gets the value of wnqinfoId
	 */
	public long getWnqinfoId()
	{
		return wnqinfoId;
	}

	/**
	 * Method 'WnqinfoPk'
	 * 
	 */
	public WnqinfoPk()
	{
	}

	/**
	 * Method 'WnqinfoPk'
	 * 
	 * @param wnqinfoId
	 */
	public WnqinfoPk(final long wnqinfoId)
	{
		this.wnqinfoId = wnqinfoId;
	}

	/** 
	 * Sets the value of wnqinfoIdNull
	 */
	public void setWnqinfoIdNull(boolean wnqinfoIdNull)
	{
		this.wnqinfoIdNull = wnqinfoIdNull;
	}

	/** 
	 * Gets the value of wnqinfoIdNull
	 */
	public boolean isWnqinfoIdNull()
	{
		return wnqinfoIdNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof WnqinfoPk)) {
			return false;
		}
		
		final WnqinfoPk _cast = (WnqinfoPk) _other;
		if (wnqinfoId != _cast.wnqinfoId) {
			return false;
		}
		
		if (wnqinfoIdNull != _cast.wnqinfoIdNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (wnqinfoId ^ (wnqinfoId >>> 32));
		_hashCode = 29 * _hashCode + (wnqinfoIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.nhcsys.dataaccess.dto.WnqinfoPk: " );
		ret.append( "wnqinfoId=" + wnqinfoId );
		return ret.toString();
	}

}