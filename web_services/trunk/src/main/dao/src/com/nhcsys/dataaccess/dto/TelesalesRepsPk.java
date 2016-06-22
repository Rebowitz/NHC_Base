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
 * This class represents the primary key of the TELESALES_REPS table.
 */
public class TelesalesRepsPk implements Serializable
{
	private long repId;

	/** 
	 * This attribute represents whether the primitive attribute repId is null.
	 */
	private boolean repIdNull;

	/** 
	 * Sets the value of repId
	 */
	public void setRepId(long repId)
	{
		this.repId = repId;
	}

	/** 
	 * Gets the value of repId
	 */
	public long getRepId()
	{
		return repId;
	}

	/**
	 * Method 'TelesalesRepsPk'
	 * 
	 */
	public TelesalesRepsPk()
	{
	}

	/**
	 * Method 'TelesalesRepsPk'
	 * 
	 * @param repId
	 */
	public TelesalesRepsPk(final long repId)
	{
		this.repId = repId;
	}

	/** 
	 * Sets the value of repIdNull
	 */
	public void setRepIdNull(boolean repIdNull)
	{
		this.repIdNull = repIdNull;
	}

	/** 
	 * Gets the value of repIdNull
	 */
	public boolean isRepIdNull()
	{
		return repIdNull;
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
		
		if (!(_other instanceof TelesalesRepsPk)) {
			return false;
		}
		
		final TelesalesRepsPk _cast = (TelesalesRepsPk) _other;
		if (repId != _cast.repId) {
			return false;
		}
		
		if (repIdNull != _cast.repIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (repId ^ (repId >>> 32));
		_hashCode = 29 * _hashCode + (repIdNull ? 1 : 0);
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
		ret.append( "com.nhcsys.dataaccess.dto.TelesalesRepsPk: " );
		ret.append( "repId=" + repId );
		return ret.toString();
	}

}