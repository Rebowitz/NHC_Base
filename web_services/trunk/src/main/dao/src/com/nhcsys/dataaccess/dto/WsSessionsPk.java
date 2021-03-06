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
 * This class represents the primary key of the WS_SESSIONS table.
 */
public class WsSessionsPk implements Serializable
{
	private long wsSessionId;

	/** 
	 * This attribute represents whether the primitive attribute wsSessionId is null.
	 */
	private boolean wsSessionIdNull;

	/** 
	 * Sets the value of wsSessionId
	 */
	public void setWsSessionId(long wsSessionId)
	{
		this.wsSessionId = wsSessionId;
	}

	/** 
	 * Gets the value of wsSessionId
	 */
	public long getWsSessionId()
	{
		return wsSessionId;
	}

	/**
	 * Method 'WsSessionsPk'
	 * 
	 */
	public WsSessionsPk()
	{
	}

	/**
	 * Method 'WsSessionsPk'
	 * 
	 * @param wsSessionId
	 */
	public WsSessionsPk(final long wsSessionId)
	{
		this.wsSessionId = wsSessionId;
	}

	/** 
	 * Sets the value of wsSessionIdNull
	 */
	public void setWsSessionIdNull(boolean wsSessionIdNull)
	{
		this.wsSessionIdNull = wsSessionIdNull;
	}

	/** 
	 * Gets the value of wsSessionIdNull
	 */
	public boolean isWsSessionIdNull()
	{
		return wsSessionIdNull;
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
		
		if (!(_other instanceof WsSessionsPk)) {
			return false;
		}
		
		final WsSessionsPk _cast = (WsSessionsPk) _other;
		if (wsSessionId != _cast.wsSessionId) {
			return false;
		}
		
		if (wsSessionIdNull != _cast.wsSessionIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (wsSessionId ^ (wsSessionId >>> 32));
		_hashCode = 29 * _hashCode + (wsSessionIdNull ? 1 : 0);
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
		ret.append( "com.nhcsys.dataaccess.dto.WsSessionsPk: " );
		ret.append( "wsSessionId=" + wsSessionId );
		return ret.toString();
	}

}
