/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.dto;

import com.nhcsys.dataaccess.dao.*;
import com.nhcsys.dataaccess.factory.*;
import com.nhcsys.dataaccess.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class WsSessions implements Serializable
{
	/** 
	 * This attribute maps to the column WS_SESSION_ID in the WS_SESSIONS table.
	 */
	private long wsSessionId;

	/** 
	 * This attribute represents whether the attribute wsSessionId has been modified since being read from the database.
	 */
	private boolean wsSessionIdModified = false;

	/** 
	 * This attribute maps to the column APP_NAME in the WS_SESSIONS table.
	 */
	private String appName;

	/** 
	 * This attribute represents whether the attribute appName has been modified since being read from the database.
	 */
	private boolean appNameModified = false;

	/** 
	 * This attribute maps to the column SESSION_ID in the WS_SESSIONS table.
	 */
	private String sessionId;

	/** 
	 * This attribute represents whether the attribute sessionId has been modified since being read from the database.
	 */
	private boolean sessionIdModified = false;

	/** 
	 * This attribute maps to the column MACHINE_ID in the WS_SESSIONS table.
	 */
	private long machineId;

	/** 
	 * This attribute represents whether the attribute machineId has been modified since being read from the database.
	 */
	private boolean machineIdModified = false;

	/** 
	 * This attribute maps to the column TIME_STAMP in the WS_SESSIONS table.
	 */
	private Date timeStamp;

	/** 
	 * This attribute represents whether the attribute timeStamp has been modified since being read from the database.
	 */
	private boolean timeStampModified = false;

	/**
	 * Method 'WsSessions'
	 * 
	 */
	public WsSessions()
	{
	}

	/**
	 * Method 'getWsSessionId'
	 * 
	 * @return long
	 */
	public long getWsSessionId()
	{
		return wsSessionId;
	}

	/**
	 * Method 'setWsSessionId'
	 * 
	 * @param wsSessionId
	 */
	public void setWsSessionId(long wsSessionId)
	{
		this.wsSessionId = wsSessionId;
		setWsSessionIdModified( true );
	}

	/** 
	 * Sets the value of wsSessionIdModified
	 */
	public void setWsSessionIdModified(boolean wsSessionIdModified)
	{
		this.wsSessionIdModified = wsSessionIdModified;
	}

	/** 
	 * Gets the value of wsSessionIdModified
	 */
	public boolean isWsSessionIdModified()
	{
		return wsSessionIdModified;
	}

	/**
	 * Method 'getAppName'
	 * 
	 * @return String
	 */
	public String getAppName()
	{
		return appName;
	}

	/**
	 * Method 'setAppName'
	 * 
	 * @param appName
	 */
	public void setAppName(String appName)
	{
		this.appName = appName;
		setAppNameModified( true );
	}

	/** 
	 * Sets the value of appNameModified
	 */
	public void setAppNameModified(boolean appNameModified)
	{
		this.appNameModified = appNameModified;
	}

	/** 
	 * Gets the value of appNameModified
	 */
	public boolean isAppNameModified()
	{
		return appNameModified;
	}

	/**
	 * Method 'getSessionId'
	 * 
	 * @return String
	 */
	public String getSessionId()
	{
		return sessionId;
	}

	/**
	 * Method 'setSessionId'
	 * 
	 * @param sessionId
	 */
	public void setSessionId(String sessionId)
	{
		this.sessionId = sessionId;
		setSessionIdModified( true );
	}

	/** 
	 * Sets the value of sessionIdModified
	 */
	public void setSessionIdModified(boolean sessionIdModified)
	{
		this.sessionIdModified = sessionIdModified;
	}

	/** 
	 * Gets the value of sessionIdModified
	 */
	public boolean isSessionIdModified()
	{
		return sessionIdModified;
	}

	/**
	 * Method 'getMachineId'
	 * 
	 * @return long
	 */
	public long getMachineId()
	{
		return machineId;
	}

	/**
	 * Method 'setMachineId'
	 * 
	 * @param machineId
	 */
	public void setMachineId(long machineId)
	{
		this.machineId = machineId;
		setMachineIdModified( true );
	}

	/** 
	 * Sets the value of machineIdModified
	 */
	public void setMachineIdModified(boolean machineIdModified)
	{
		this.machineIdModified = machineIdModified;
	}

	/** 
	 * Gets the value of machineIdModified
	 */
	public boolean isMachineIdModified()
	{
		return machineIdModified;
	}

	/**
	 * Method 'getTimeStamp'
	 * 
	 * @return Date
	 */
	public Date getTimeStamp()
	{
		return timeStamp;
	}

	/**
	 * Method 'setTimeStamp'
	 * 
	 * @param timeStamp
	 */
	public void setTimeStamp(Date timeStamp)
	{
		this.timeStamp = timeStamp;
		setTimeStampModified( true );
	}

	/** 
	 * Sets the value of timeStampModified
	 */
	public void setTimeStampModified(boolean timeStampModified)
	{
		this.timeStampModified = timeStampModified;
	}

	/** 
	 * Gets the value of timeStampModified
	 */
	public boolean isTimeStampModified()
	{
		return timeStampModified;
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
		
		if (!(_other instanceof WsSessions)) {
			return false;
		}
		
		final WsSessions _cast = (WsSessions) _other;
		if (wsSessionId != _cast.wsSessionId) {
			return false;
		}
		
		if (wsSessionIdModified != _cast.wsSessionIdModified) {
			return false;
		}
		
		if (appName == null ? _cast.appName != appName : !appName.equals( _cast.appName )) {
			return false;
		}
		
		if (appNameModified != _cast.appNameModified) {
			return false;
		}
		
		if (sessionId == null ? _cast.sessionId != sessionId : !sessionId.equals( _cast.sessionId )) {
			return false;
		}
		
		if (sessionIdModified != _cast.sessionIdModified) {
			return false;
		}
		
		if (machineId != _cast.machineId) {
			return false;
		}
		
		if (machineIdModified != _cast.machineIdModified) {
			return false;
		}
		
		if (timeStamp == null ? _cast.timeStamp != timeStamp : !timeStamp.equals( _cast.timeStamp )) {
			return false;
		}
		
		if (timeStampModified != _cast.timeStampModified) {
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
		_hashCode = 29 * _hashCode + (wsSessionIdModified ? 1 : 0);
		if (appName != null) {
			_hashCode = 29 * _hashCode + appName.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (appNameModified ? 1 : 0);
		if (sessionId != null) {
			_hashCode = 29 * _hashCode + sessionId.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (sessionIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (machineId ^ (machineId >>> 32));
		_hashCode = 29 * _hashCode + (machineIdModified ? 1 : 0);
		if (timeStamp != null) {
			_hashCode = 29 * _hashCode + timeStamp.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (timeStampModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return WsSessionsPk
	 */
	public WsSessionsPk createPk()
	{
		return new WsSessionsPk(wsSessionId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.nhcsys.dataaccess.dto.WsSessions: " );
		ret.append( "wsSessionId=" + wsSessionId );
		ret.append( ", appName=" + appName );
		ret.append( ", sessionId=" + sessionId );
		ret.append( ", machineId=" + machineId );
		ret.append( ", timeStamp=" + timeStamp );
		return ret.toString();
	}

}
