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
 * This class represents the primary key of the CLQINFO table.
 */
public class ClqinfoPk implements Serializable
{
	private long clqinfoId;

	/** 
	 * This attribute represents whether the primitive attribute clqinfoId is null.
	 */
	private boolean clqinfoIdNull;

	/** 
	 * Sets the value of clqinfoId
	 */
	public void setClqinfoId(long clqinfoId)
	{
		this.clqinfoId = clqinfoId;
	}

	/** 
	 * Gets the value of clqinfoId
	 */
	public long getClqinfoId()
	{
		return clqinfoId;
	}

	/**
	 * Method 'ClqinfoPk'
	 * 
	 */
	public ClqinfoPk()
	{
	}

	/**
	 * Method 'ClqinfoPk'
	 * 
	 * @param clqinfoId
	 */
	public ClqinfoPk(final long clqinfoId)
	{
		this.clqinfoId = clqinfoId;
	}

	/** 
	 * Sets the value of clqinfoIdNull
	 */
	public void setClqinfoIdNull(boolean clqinfoIdNull)
	{
		this.clqinfoIdNull = clqinfoIdNull;
	}

	/** 
	 * Gets the value of clqinfoIdNull
	 */
	public boolean isClqinfoIdNull()
	{
		return clqinfoIdNull;
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
		
		if (!(_other instanceof ClqinfoPk)) {
			return false;
		}
		
		final ClqinfoPk _cast = (ClqinfoPk) _other;
		if (clqinfoId != _cast.clqinfoId) {
			return false;
		}
		
		if (clqinfoIdNull != _cast.clqinfoIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (clqinfoId ^ (clqinfoId >>> 32));
		_hashCode = 29 * _hashCode + (clqinfoIdNull ? 1 : 0);
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
		ret.append( "com.nhcsys.dataaccess.dto.ClqinfoPk: " );
		ret.append( "clqinfoId=" + clqinfoId );
		return ret.toString();
	}

}
