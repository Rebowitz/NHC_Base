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
 * This class represents the primary key of the INSTALLED_SOFTWARE table.
 */
public class InstalledSoftwarePk implements Serializable
{
	private long softwareId;

	/** 
	 * This attribute represents whether the primitive attribute softwareId is null.
	 */
	private boolean softwareIdNull;

	/** 
	 * Sets the value of softwareId
	 */
	public void setSoftwareId(long softwareId)
	{
		this.softwareId = softwareId;
	}

	/** 
	 * Gets the value of softwareId
	 */
	public long getSoftwareId()
	{
		return softwareId;
	}

	/**
	 * Method 'InstalledSoftwarePk'
	 * 
	 */
	public InstalledSoftwarePk()
	{
	}

	/**
	 * Method 'InstalledSoftwarePk'
	 * 
	 * @param softwareId
	 */
	public InstalledSoftwarePk(final long softwareId)
	{
		this.softwareId = softwareId;
	}

	/** 
	 * Sets the value of softwareIdNull
	 */
	public void setSoftwareIdNull(boolean softwareIdNull)
	{
		this.softwareIdNull = softwareIdNull;
	}

	/** 
	 * Gets the value of softwareIdNull
	 */
	public boolean isSoftwareIdNull()
	{
		return softwareIdNull;
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
		
		if (!(_other instanceof InstalledSoftwarePk)) {
			return false;
		}
		
		final InstalledSoftwarePk _cast = (InstalledSoftwarePk) _other;
		if (softwareId != _cast.softwareId) {
			return false;
		}
		
		if (softwareIdNull != _cast.softwareIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (softwareId ^ (softwareId >>> 32));
		_hashCode = 29 * _hashCode + (softwareIdNull ? 1 : 0);
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
		ret.append( "com.nhcsys.dataaccess.dto.InstalledSoftwarePk: " );
		ret.append( "softwareId=" + softwareId );
		return ret.toString();
	}

}
