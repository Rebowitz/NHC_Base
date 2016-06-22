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

public class Machines implements Serializable
{
	/** 
	 * This attribute maps to the column MACHINE_ID in the MACHINES table.
	 */
	private long machineId;

	/** 
	 * This attribute represents whether the attribute machineId has been modified since being read from the database.
	 */
	private boolean machineIdModified = false;

	/** 
	 * This attribute maps to the column CUSTOMER_ID in the MACHINES table.
	 */
	private long customerId;

	/** 
	 * This attribute represents whether the attribute customerId has been modified since being read from the database.
	 */
	private boolean customerIdModified = false;

	/** 
	 * This attribute maps to the column VIVE_ID in the MACHINES table.
	 */
	private String viveId;

	/** 
	 * This attribute represents whether the attribute viveId has been modified since being read from the database.
	 */
	private boolean viveIdModified = false;

	/** 
	 * This attribute maps to the column CPU_SERIAL_NO in the MACHINES table.
	 */
	private String cpuSerialNo;

	/** 
	 * This attribute represents whether the attribute cpuSerialNo has been modified since being read from the database.
	 */
	private boolean cpuSerialNoModified = false;

	/** 
	 * This attribute maps to the column KEY_DATA in the MACHINES table.
	 */
	private String keyData;

	/** 
	 * This attribute represents whether the attribute keyData has been modified since being read from the database.
	 */
	private boolean keyDataModified = false;

	/** 
	 * This attribute maps to the column KEY_TIMESTAMP in the MACHINES table.
	 */
	private long keyTimestamp;

	/** 
	 * This attribute represents whether the attribute keyTimestamp has been modified since being read from the database.
	 */
	private boolean keyTimestampModified = false;

	/** 
	 * This attribute maps to the column STOLEN_FLAG in the MACHINES table.
	 */
	private int stolenFlag;

	/** 
	 * This attribute represents whether the primitive attribute stolenFlag is null.
	 */
	private boolean stolenFlagNull = true;

	/** 
	 * This attribute represents whether the attribute stolenFlag has been modified since being read from the database.
	 */
	private boolean stolenFlagModified = false;

	/** 
	 * This attribute maps to the column TERMINATE_FLAG in the MACHINES table.
	 */
	private int terminateFlag;

	/** 
	 * This attribute represents whether the primitive attribute terminateFlag is null.
	 */
	private boolean terminateFlagNull = true;

	/** 
	 * This attribute represents whether the attribute terminateFlag has been modified since being read from the database.
	 */
	private boolean terminateFlagModified = false;

	/** 
	 * This attribute maps to the column REGISTERED_FLAG in the MACHINES table.
	 */
	private int registeredFlag;

	/** 
	 * This attribute represents whether the primitive attribute registeredFlag is null.
	 */
	private boolean registeredFlagNull = true;

	/** 
	 * This attribute represents whether the attribute registeredFlag has been modified since being read from the database.
	 */
	private boolean registeredFlagModified = false;

	/**
	 * Method 'Machines'
	 * 
	 */
	public Machines()
	{
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
	 * Method 'getViveId'
	 * 
	 * @return String
	 */
	public String getViveId()
	{
		return viveId;
	}

	/**
	 * Method 'setViveId'
	 * 
	 * @param viveId
	 */
	public void setViveId(String viveId)
	{
		this.viveId = viveId;
		setViveIdModified( true );
	}

	/** 
	 * Sets the value of viveIdModified
	 */
	public void setViveIdModified(boolean viveIdModified)
	{
		this.viveIdModified = viveIdModified;
	}

	/** 
	 * Gets the value of viveIdModified
	 */
	public boolean isViveIdModified()
	{
		return viveIdModified;
	}

	/**
	 * Method 'getCpuSerialNo'
	 * 
	 * @return String
	 */
	public String getCpuSerialNo()
	{
		return cpuSerialNo;
	}

	/**
	 * Method 'setCpuSerialNo'
	 * 
	 * @param cpuSerialNo
	 */
	public void setCpuSerialNo(String cpuSerialNo)
	{
		this.cpuSerialNo = cpuSerialNo;
		setCpuSerialNoModified( true );
	}

	/** 
	 * Sets the value of cpuSerialNoModified
	 */
	public void setCpuSerialNoModified(boolean cpuSerialNoModified)
	{
		this.cpuSerialNoModified = cpuSerialNoModified;
	}

	/** 
	 * Gets the value of cpuSerialNoModified
	 */
	public boolean isCpuSerialNoModified()
	{
		return cpuSerialNoModified;
	}

	/**
	 * Method 'getKeyData'
	 * 
	 * @return String
	 */
	public String getKeyData()
	{
		return keyData;
	}

	/**
	 * Method 'setKeyData'
	 * 
	 * @param keyData
	 */
	public void setKeyData(String keyData)
	{
		this.keyData = keyData;
		setKeyDataModified( true );
	}

	/** 
	 * Sets the value of keyDataModified
	 */
	public void setKeyDataModified(boolean keyDataModified)
	{
		this.keyDataModified = keyDataModified;
	}

	/** 
	 * Gets the value of keyDataModified
	 */
	public boolean isKeyDataModified()
	{
		return keyDataModified;
	}

	/**
	 * Method 'getKeyTimestamp'
	 * 
	 * @return long
	 */
	public long getKeyTimestamp()
	{
		return keyTimestamp;
	}

	/**
	 * Method 'setKeyTimestamp'
	 * 
	 * @param keyTimestamp
	 */
	public void setKeyTimestamp(long keyTimestamp)
	{
		this.keyTimestamp = keyTimestamp;
		setKeyTimestampModified( true );
	}

	/** 
	 * Sets the value of keyTimestampModified
	 */
	public void setKeyTimestampModified(boolean keyTimestampModified)
	{
		this.keyTimestampModified = keyTimestampModified;
	}

	/** 
	 * Gets the value of keyTimestampModified
	 */
	public boolean isKeyTimestampModified()
	{
		return keyTimestampModified;
	}

	/**
	 * Method 'getStolenFlag'
	 * 
	 * @return int
	 */
	public int getStolenFlag()
	{
		return stolenFlag;
	}

	/**
	 * Method 'setStolenFlag'
	 * 
	 * @param stolenFlag
	 */
	public void setStolenFlag(int stolenFlag)
	{
		this.stolenFlag = stolenFlag;
		setStolenFlagNull( false );
		setStolenFlagModified( true );
	}

	/** 
	 * Sets the value of stolenFlagNull
	 */
	public void setStolenFlagNull(boolean stolenFlagNull)
	{
		this.stolenFlagNull = stolenFlagNull;
	}

	/** 
	 * Gets the value of stolenFlagNull
	 */
	public boolean isStolenFlagNull()
	{
		return stolenFlagNull;
	}

	/** 
	 * Sets the value of stolenFlagModified
	 */
	public void setStolenFlagModified(boolean stolenFlagModified)
	{
		this.stolenFlagModified = stolenFlagModified;
	}

	/** 
	 * Gets the value of stolenFlagModified
	 */
	public boolean isStolenFlagModified()
	{
		return stolenFlagModified;
	}

	/**
	 * Method 'getTerminateFlag'
	 * 
	 * @return int
	 */
	public int getTerminateFlag()
	{
		return terminateFlag;
	}

	/**
	 * Method 'setTerminateFlag'
	 * 
	 * @param terminateFlag
	 */
	public void setTerminateFlag(int terminateFlag)
	{
		this.terminateFlag = terminateFlag;
		setTerminateFlagNull( false );
		setTerminateFlagModified( true );
	}

	/** 
	 * Sets the value of terminateFlagNull
	 */
	public void setTerminateFlagNull(boolean terminateFlagNull)
	{
		this.terminateFlagNull = terminateFlagNull;
	}

	/** 
	 * Gets the value of terminateFlagNull
	 */
	public boolean isTerminateFlagNull()
	{
		return terminateFlagNull;
	}

	/** 
	 * Sets the value of terminateFlagModified
	 */
	public void setTerminateFlagModified(boolean terminateFlagModified)
	{
		this.terminateFlagModified = terminateFlagModified;
	}

	/** 
	 * Gets the value of terminateFlagModified
	 */
	public boolean isTerminateFlagModified()
	{
		return terminateFlagModified;
	}

	/**
	 * Method 'getRegisteredFlag'
	 * 
	 * @return int
	 */
	public int getRegisteredFlag()
	{
		return registeredFlag;
	}

	/**
	 * Method 'setRegisteredFlag'
	 * 
	 * @param registeredFlag
	 */
	public void setRegisteredFlag(int registeredFlag)
	{
		this.registeredFlag = registeredFlag;
		setRegisteredFlagNull( false );
		setRegisteredFlagModified( true );
	}

	/** 
	 * Sets the value of registeredFlagNull
	 */
	public void setRegisteredFlagNull(boolean registeredFlagNull)
	{
		this.registeredFlagNull = registeredFlagNull;
	}

	/** 
	 * Gets the value of registeredFlagNull
	 */
	public boolean isRegisteredFlagNull()
	{
		return registeredFlagNull;
	}

	/** 
	 * Sets the value of registeredFlagModified
	 */
	public void setRegisteredFlagModified(boolean registeredFlagModified)
	{
		this.registeredFlagModified = registeredFlagModified;
	}

	/** 
	 * Gets the value of registeredFlagModified
	 */
	public boolean isRegisteredFlagModified()
	{
		return registeredFlagModified;
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
		
		if (!(_other instanceof Machines)) {
			return false;
		}
		
		final Machines _cast = (Machines) _other;
		if (machineId != _cast.machineId) {
			return false;
		}
		
		if (machineIdModified != _cast.machineIdModified) {
			return false;
		}
		
		if (customerId != _cast.customerId) {
			return false;
		}
		
		if (customerIdModified != _cast.customerIdModified) {
			return false;
		}
		
		if (viveId == null ? _cast.viveId != viveId : !viveId.equals( _cast.viveId )) {
			return false;
		}
		
		if (viveIdModified != _cast.viveIdModified) {
			return false;
		}
		
		if (cpuSerialNo == null ? _cast.cpuSerialNo != cpuSerialNo : !cpuSerialNo.equals( _cast.cpuSerialNo )) {
			return false;
		}
		
		if (cpuSerialNoModified != _cast.cpuSerialNoModified) {
			return false;
		}
		
		if (keyData == null ? _cast.keyData != keyData : !keyData.equals( _cast.keyData )) {
			return false;
		}
		
		if (keyDataModified != _cast.keyDataModified) {
			return false;
		}
		
		if (keyTimestamp != _cast.keyTimestamp) {
			return false;
		}
		
		if (keyTimestampModified != _cast.keyTimestampModified) {
			return false;
		}
		
		if (stolenFlag != _cast.stolenFlag) {
			return false;
		}
		
		if (stolenFlagNull != _cast.stolenFlagNull) {
			return false;
		}
		
		if (stolenFlagModified != _cast.stolenFlagModified) {
			return false;
		}
		
		if (terminateFlag != _cast.terminateFlag) {
			return false;
		}
		
		if (terminateFlagNull != _cast.terminateFlagNull) {
			return false;
		}
		
		if (terminateFlagModified != _cast.terminateFlagModified) {
			return false;
		}
		
		if (registeredFlag != _cast.registeredFlag) {
			return false;
		}
		
		if (registeredFlagNull != _cast.registeredFlagNull) {
			return false;
		}
		
		if (registeredFlagModified != _cast.registeredFlagModified) {
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
		_hashCode = 29 * _hashCode + (int) (machineId ^ (machineId >>> 32));
		_hashCode = 29 * _hashCode + (machineIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (customerId ^ (customerId >>> 32));
		_hashCode = 29 * _hashCode + (customerIdModified ? 1 : 0);
		if (viveId != null) {
			_hashCode = 29 * _hashCode + viveId.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (viveIdModified ? 1 : 0);
		if (cpuSerialNo != null) {
			_hashCode = 29 * _hashCode + cpuSerialNo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (cpuSerialNoModified ? 1 : 0);
		if (keyData != null) {
			_hashCode = 29 * _hashCode + keyData.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (keyDataModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (keyTimestamp ^ (keyTimestamp >>> 32));
		_hashCode = 29 * _hashCode + (keyTimestampModified ? 1 : 0);
		_hashCode = 29 * _hashCode + stolenFlag;
		_hashCode = 29 * _hashCode + (stolenFlagNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (stolenFlagModified ? 1 : 0);
		_hashCode = 29 * _hashCode + terminateFlag;
		_hashCode = 29 * _hashCode + (terminateFlagNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (terminateFlagModified ? 1 : 0);
		_hashCode = 29 * _hashCode + registeredFlag;
		_hashCode = 29 * _hashCode + (registeredFlagNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (registeredFlagModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return MachinesPk
	 */
	public MachinesPk createPk()
	{
		return new MachinesPk(machineId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.nhcsys.dataaccess.dto.Machines: " );
		ret.append( "machineId=" + machineId );
		ret.append( ", customerId=" + customerId );
		ret.append( ", viveId=" + viveId );
		ret.append( ", cpuSerialNo=" + cpuSerialNo );
		ret.append( ", keyData=" + keyData );
		ret.append( ", keyTimestamp=" + keyTimestamp );
		ret.append( ", stolenFlag=" + (stolenFlagNull ? "NULL" : stolenFlag) );
		ret.append( ", terminateFlag=" + (terminateFlagNull ? "NULL" : terminateFlag) );
		ret.append( ", registeredFlag=" + (registeredFlagNull ? "NULL" : registeredFlag) );
		return ret.toString();
	}

}