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

public class Networkinfo implements Serializable
{
	/** 
	 * This attribute maps to the column NETWORKINFO_ID in the NETWORKINFO table.
	 */
	private long networkinfoId;

	/** 
	 * This attribute represents whether the attribute networkinfoId has been modified since being read from the database.
	 */
	private boolean networkinfoIdModified = false;

	/** 
	 * This attribute maps to the column CUSTOMER_ID in the NETWORKINFO table.
	 */
	private long customerId;

	/** 
	 * This attribute represents whether the attribute customerId has been modified since being read from the database.
	 */
	private boolean customerIdModified = false;

	/** 
	 * This attribute maps to the column MACHINE_ID in the NETWORKINFO table.
	 */
	private long machineId;

	/** 
	 * This attribute represents whether the attribute machineId has been modified since being read from the database.
	 */
	private boolean machineIdModified = false;

	/** 
	 * This attribute maps to the column SSID in the NETWORKINFO table.
	 */
	private String ssid;

	/** 
	 * This attribute represents whether the attribute ssid has been modified since being read from the database.
	 */
	private boolean ssidModified = false;

	/** 
	 * This attribute maps to the column PASSPHRASE in the NETWORKINFO table.
	 */
	private String passphrase;

	/** 
	 * This attribute represents whether the attribute passphrase has been modified since being read from the database.
	 */
	private boolean passphraseModified = false;

	/** 
	 * This attribute maps to the column WIRELESSINFOTYPE in the NETWORKINFO table.
	 */
	private String wirelessinfotype;

	/** 
	 * This attribute represents whether the attribute wirelessinfotype has been modified since being read from the database.
	 */
	private boolean wirelessinfotypeModified = false;

	/** 
	 * This attribute maps to the column TIMESTAMP in the NETWORKINFO table.
	 */
	private Date timestamp;

	/** 
	 * This attribute represents whether the attribute timestamp has been modified since being read from the database.
	 */
	private boolean timestampModified = false;

	/**
	 * Method 'Networkinfo'
	 * 
	 */
	public Networkinfo()
	{
	}

	/**
	 * Method 'getNetworkinfoId'
	 * 
	 * @return long
	 */
	public long getNetworkinfoId()
	{
		return networkinfoId;
	}

	/**
	 * Method 'setNetworkinfoId'
	 * 
	 * @param networkinfoId
	 */
	public void setNetworkinfoId(long networkinfoId)
	{
		this.networkinfoId = networkinfoId;
		setNetworkinfoIdModified( true );
	}

	/** 
	 * Sets the value of networkinfoIdModified
	 */
	public void setNetworkinfoIdModified(boolean networkinfoIdModified)
	{
		this.networkinfoIdModified = networkinfoIdModified;
	}

	/** 
	 * Gets the value of networkinfoIdModified
	 */
	public boolean isNetworkinfoIdModified()
	{
		return networkinfoIdModified;
	}

	/**
	 * Method 'getCustomerId'
	 * 
	 * @return long
	 */
	public long getCustomerId()
	{
		return customerId;
	}

	/**
	 * Method 'setCustomerId'
	 * 
	 * @param customerId
	 */
	public void setCustomerId(long customerId)
	{
		this.customerId = customerId;
		setCustomerIdModified( true );
	}

	/** 
	 * Sets the value of customerIdModified
	 */
	public void setCustomerIdModified(boolean customerIdModified)
	{
		this.customerIdModified = customerIdModified;
	}

	/** 
	 * Gets the value of customerIdModified
	 */
	public boolean isCustomerIdModified()
	{
		return customerIdModified;
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
	 * Method 'getSsid'
	 * 
	 * @return String
	 */
	public String getSsid()
	{
		return ssid;
	}

	/**
	 * Method 'setSsid'
	 * 
	 * @param ssid
	 */
	public void setSsid(String ssid)
	{
		this.ssid = ssid;
		setSsidModified( true );
	}

	/** 
	 * Sets the value of ssidModified
	 */
	public void setSsidModified(boolean ssidModified)
	{
		this.ssidModified = ssidModified;
	}

	/** 
	 * Gets the value of ssidModified
	 */
	public boolean isSsidModified()
	{
		return ssidModified;
	}

	/**
	 * Method 'getPassphrase'
	 * 
	 * @return String
	 */
	public String getPassphrase()
	{
		return passphrase;
	}

	/**
	 * Method 'setPassphrase'
	 * 
	 * @param passphrase
	 */
	public void setPassphrase(String passphrase)
	{
		this.passphrase = passphrase;
		setPassphraseModified( true );
	}

	/** 
	 * Sets the value of passphraseModified
	 */
	public void setPassphraseModified(boolean passphraseModified)
	{
		this.passphraseModified = passphraseModified;
	}

	/** 
	 * Gets the value of passphraseModified
	 */
	public boolean isPassphraseModified()
	{
		return passphraseModified;
	}

	/**
	 * Method 'getWirelessinfotype'
	 * 
	 * @return String
	 */
	public String getWirelessinfotype()
	{
		return wirelessinfotype;
	}

	/**
	 * Method 'setWirelessinfotype'
	 * 
	 * @param wirelessinfotype
	 */
	public void setWirelessinfotype(String wirelessinfotype)
	{
		this.wirelessinfotype = wirelessinfotype;
		setWirelessinfotypeModified( true );
	}

	/** 
	 * Sets the value of wirelessinfotypeModified
	 */
	public void setWirelessinfotypeModified(boolean wirelessinfotypeModified)
	{
		this.wirelessinfotypeModified = wirelessinfotypeModified;
	}

	/** 
	 * Gets the value of wirelessinfotypeModified
	 */
	public boolean isWirelessinfotypeModified()
	{
		return wirelessinfotypeModified;
	}

	/**
	 * Method 'getTimestamp'
	 * 
	 * @return Date
	 */
	public Date getTimestamp()
	{
		return timestamp;
	}

	/**
	 * Method 'setTimestamp'
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
		setTimestampModified( true );
	}

	/** 
	 * Sets the value of timestampModified
	 */
	public void setTimestampModified(boolean timestampModified)
	{
		this.timestampModified = timestampModified;
	}

	/** 
	 * Gets the value of timestampModified
	 */
	public boolean isTimestampModified()
	{
		return timestampModified;
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
		
		if (!(_other instanceof Networkinfo)) {
			return false;
		}
		
		final Networkinfo _cast = (Networkinfo) _other;
		if (networkinfoId != _cast.networkinfoId) {
			return false;
		}
		
		if (networkinfoIdModified != _cast.networkinfoIdModified) {
			return false;
		}
		
		if (customerId != _cast.customerId) {
			return false;
		}
		
		if (customerIdModified != _cast.customerIdModified) {
			return false;
		}
		
		if (machineId != _cast.machineId) {
			return false;
		}
		
		if (machineIdModified != _cast.machineIdModified) {
			return false;
		}
		
		if (ssid == null ? _cast.ssid != ssid : !ssid.equals( _cast.ssid )) {
			return false;
		}
		
		if (ssidModified != _cast.ssidModified) {
			return false;
		}
		
		if (passphrase == null ? _cast.passphrase != passphrase : !passphrase.equals( _cast.passphrase )) {
			return false;
		}
		
		if (passphraseModified != _cast.passphraseModified) {
			return false;
		}
		
		if (wirelessinfotype == null ? _cast.wirelessinfotype != wirelessinfotype : !wirelessinfotype.equals( _cast.wirelessinfotype )) {
			return false;
		}
		
		if (wirelessinfotypeModified != _cast.wirelessinfotypeModified) {
			return false;
		}
		
		if (timestamp == null ? _cast.timestamp != timestamp : !timestamp.equals( _cast.timestamp )) {
			return false;
		}
		
		if (timestampModified != _cast.timestampModified) {
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
		_hashCode = 29 * _hashCode + (int) (networkinfoId ^ (networkinfoId >>> 32));
		_hashCode = 29 * _hashCode + (networkinfoIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (customerId ^ (customerId >>> 32));
		_hashCode = 29 * _hashCode + (customerIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (machineId ^ (machineId >>> 32));
		_hashCode = 29 * _hashCode + (machineIdModified ? 1 : 0);
		if (ssid != null) {
			_hashCode = 29 * _hashCode + ssid.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (ssidModified ? 1 : 0);
		if (passphrase != null) {
			_hashCode = 29 * _hashCode + passphrase.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (passphraseModified ? 1 : 0);
		if (wirelessinfotype != null) {
			_hashCode = 29 * _hashCode + wirelessinfotype.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (wirelessinfotypeModified ? 1 : 0);
		if (timestamp != null) {
			_hashCode = 29 * _hashCode + timestamp.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (timestampModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NetworkinfoPk
	 */
	public NetworkinfoPk createPk()
	{
		return new NetworkinfoPk(networkinfoId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.nhcsys.dataaccess.dto.Networkinfo: " );
		ret.append( "networkinfoId=" + networkinfoId );
		ret.append( ", customerId=" + customerId );
		ret.append( ", machineId=" + machineId );
		ret.append( ", ssid=" + ssid );
		ret.append( ", passphrase=" + passphrase );
		ret.append( ", wirelessinfotype=" + wirelessinfotype );
		ret.append( ", timestamp=" + timestamp );
		return ret.toString();
	}

}