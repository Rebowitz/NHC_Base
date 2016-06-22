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
 * This class represents the primary key of the UPDATE_STATUS table.
 */
public class UpdateStatusPk implements Serializable
{
	private long updateStatusId;

	/** 
	 * This attribute represents whether the primitive attribute updateStatusId is null.
	 */
	private boolean updateStatusIdNull;

	/** 
	 * Sets the value of updateStatusId
	 */
	public void setUpdateStatusId(long updateStatusId)
	{
		this.updateStatusId = updateStatusId;
	}

	/** 
	 * Gets the value of updateStatusId
	 */
	public long getUpdateStatusId()
	{
		return updateStatusId;
	}

	/**
	 * Method 'UpdateStatusPk'
	 * 
	 */
	public UpdateStatusPk()
	{
	}

	/**
	 * Method 'UpdateStatusPk'
	 * 
	 * @param updateStatusId
	 */
	public UpdateStatusPk(final long updateStatusId)
	{
		this.updateStatusId = updateStatusId;
	}

	/** 
	 * Sets the value of updateStatusIdNull
	 */
	public void setUpdateStatusIdNull(boolean updateStatusIdNull)
	{
		this.updateStatusIdNull = updateStatusIdNull;
	}

	/** 
	 * Gets the value of updateStatusIdNull
	 */
	public boolean isUpdateStatusIdNull()
	{
		return updateStatusIdNull;
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
		
		if (!(_other instanceof UpdateStatusPk)) {
			return false;
		}
		
		final UpdateStatusPk _cast = (UpdateStatusPk) _other;
		if (updateStatusId != _cast.updateStatusId) {
			return false;
		}
		
		if (updateStatusIdNull != _cast.updateStatusIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (updateStatusId ^ (updateStatusId >>> 32));
		_hashCode = 29 * _hashCode + (updateStatusIdNull ? 1 : 0);
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
		ret.append( "com.nhcsys.dataaccess.dto.UpdateStatusPk: " );
		ret.append( "updateStatusId=" + updateStatusId );
		return ret.toString();
	}

}