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

public class InstalledSoftware implements Serializable
{
	/** 
	 * This attribute maps to the column SOFTWARE_ID in the INSTALLED_SOFTWARE table.
	 */
	private long softwareId;

	/** 
	 * This attribute represents whether the attribute softwareId has been modified since being read from the database.
	 */
	private boolean softwareIdModified = false;

	/** 
	 * This attribute maps to the column MACHINE_ID in the INSTALLED_SOFTWARE table.
	 */
	private long machineId;

	/** 
	 * This attribute represents whether the attribute machineId has been modified since being read from the database.
	 */
	private boolean machineIdModified = false;

	/** 
	 * This attribute maps to the column PRODUCT_KEY in the INSTALLED_SOFTWARE table.
	 */
	private String productKey;

	/** 
	 * This attribute represents whether the attribute productKey has been modified since being read from the database.
	 */
	private boolean productKeyModified = false;

	/** 
	 * This attribute maps to the column PRODUCT_NAME in the INSTALLED_SOFTWARE table.
	 */
	private String productName;

	/** 
	 * This attribute represents whether the attribute productName has been modified since being read from the database.
	 */
	private boolean productNameModified = false;

	/** 
	 * This attribute maps to the column COMPANY_NAME in the INSTALLED_SOFTWARE table.
	 */
	private String companyName;

	/** 
	 * This attribute represents whether the attribute companyName has been modified since being read from the database.
	 */
	private boolean companyNameModified = false;

	/** 
	 * This attribute maps to the column PRODUCT_VERSION in the INSTALLED_SOFTWARE table.
	 */
	private String productVersion;

	/** 
	 * This attribute represents whether the attribute productVersion has been modified since being read from the database.
	 */
	private boolean productVersionModified = false;

	/** 
	 * This attribute maps to the column CUSTOMER_ID in the INSTALLED_SOFTWARE table.
	 */
	private long customerId;

	/** 
	 * This attribute represents whether the attribute customerId has been modified since being read from the database.
	 */
	private boolean customerIdModified = false;

	/**
	 * Method 'InstalledSoftware'
	 * 
	 */
	public InstalledSoftware()
	{
	}

	/**
	 * Method 'getSoftwareId'
	 * 
	 * @return long
	 */
	public long getSoftwareId()
	{
		return softwareId;
	}

	/**
	 * Method 'setSoftwareId'
	 * 
	 * @param softwareId
	 */
	public void setSoftwareId(long softwareId)
	{
		this.softwareId = softwareId;
		setSoftwareIdModified( true );
	}

	/** 
	 * Sets the value of softwareIdModified
	 */
	public void setSoftwareIdModified(boolean softwareIdModified)
	{
		this.softwareIdModified = softwareIdModified;
	}

	/** 
	 * Gets the value of softwareIdModified
	 */
	public boolean isSoftwareIdModified()
	{
		return softwareIdModified;
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
	 * Method 'getProductKey'
	 * 
	 * @return String
	 */
	public String getProductKey()
	{
		return productKey;
	}

	/**
	 * Method 'setProductKey'
	 * 
	 * @param productKey
	 */
	public void setProductKey(String productKey)
	{
		this.productKey = productKey;
		setProductKeyModified( true );
	}

	/** 
	 * Sets the value of productKeyModified
	 */
	public void setProductKeyModified(boolean productKeyModified)
	{
		this.productKeyModified = productKeyModified;
	}

	/** 
	 * Gets the value of productKeyModified
	 */
	public boolean isProductKeyModified()
	{
		return productKeyModified;
	}

	/**
	 * Method 'getProductName'
	 * 
	 * @return String
	 */
	public String getProductName()
	{
		return productName;
	}

	/**
	 * Method 'setProductName'
	 * 
	 * @param productName
	 */
	public void setProductName(String productName)
	{
		this.productName = productName;
		setProductNameModified( true );
	}

	/** 
	 * Sets the value of productNameModified
	 */
	public void setProductNameModified(boolean productNameModified)
	{
		this.productNameModified = productNameModified;
	}

	/** 
	 * Gets the value of productNameModified
	 */
	public boolean isProductNameModified()
	{
		return productNameModified;
	}

	/**
	 * Method 'getCompanyName'
	 * 
	 * @return String
	 */
	public String getCompanyName()
	{
		return companyName;
	}

	/**
	 * Method 'setCompanyName'
	 * 
	 * @param companyName
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
		setCompanyNameModified( true );
	}

	/** 
	 * Sets the value of companyNameModified
	 */
	public void setCompanyNameModified(boolean companyNameModified)
	{
		this.companyNameModified = companyNameModified;
	}

	/** 
	 * Gets the value of companyNameModified
	 */
	public boolean isCompanyNameModified()
	{
		return companyNameModified;
	}

	/**
	 * Method 'getProductVersion'
	 * 
	 * @return String
	 */
	public String getProductVersion()
	{
		return productVersion;
	}

	/**
	 * Method 'setProductVersion'
	 * 
	 * @param productVersion
	 */
	public void setProductVersion(String productVersion)
	{
		this.productVersion = productVersion;
		setProductVersionModified( true );
	}

	/** 
	 * Sets the value of productVersionModified
	 */
	public void setProductVersionModified(boolean productVersionModified)
	{
		this.productVersionModified = productVersionModified;
	}

	/** 
	 * Gets the value of productVersionModified
	 */
	public boolean isProductVersionModified()
	{
		return productVersionModified;
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
		
		if (!(_other instanceof InstalledSoftware)) {
			return false;
		}
		
		final InstalledSoftware _cast = (InstalledSoftware) _other;
		if (softwareId != _cast.softwareId) {
			return false;
		}
		
		if (softwareIdModified != _cast.softwareIdModified) {
			return false;
		}
		
		if (machineId != _cast.machineId) {
			return false;
		}
		
		if (machineIdModified != _cast.machineIdModified) {
			return false;
		}
		
		if (productKey == null ? _cast.productKey != productKey : !productKey.equals( _cast.productKey )) {
			return false;
		}
		
		if (productKeyModified != _cast.productKeyModified) {
			return false;
		}
		
		if (productName == null ? _cast.productName != productName : !productName.equals( _cast.productName )) {
			return false;
		}
		
		if (productNameModified != _cast.productNameModified) {
			return false;
		}
		
		if (companyName == null ? _cast.companyName != companyName : !companyName.equals( _cast.companyName )) {
			return false;
		}
		
		if (companyNameModified != _cast.companyNameModified) {
			return false;
		}
		
		if (productVersion == null ? _cast.productVersion != productVersion : !productVersion.equals( _cast.productVersion )) {
			return false;
		}
		
		if (productVersionModified != _cast.productVersionModified) {
			return false;
		}
		
		if (customerId != _cast.customerId) {
			return false;
		}
		
		if (customerIdModified != _cast.customerIdModified) {
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
		_hashCode = 29 * _hashCode + (softwareIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (machineId ^ (machineId >>> 32));
		_hashCode = 29 * _hashCode + (machineIdModified ? 1 : 0);
		if (productKey != null) {
			_hashCode = 29 * _hashCode + productKey.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (productKeyModified ? 1 : 0);
		if (productName != null) {
			_hashCode = 29 * _hashCode + productName.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (productNameModified ? 1 : 0);
		if (companyName != null) {
			_hashCode = 29 * _hashCode + companyName.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (companyNameModified ? 1 : 0);
		if (productVersion != null) {
			_hashCode = 29 * _hashCode + productVersion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (productVersionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (customerId ^ (customerId >>> 32));
		_hashCode = 29 * _hashCode + (customerIdModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InstalledSoftwarePk
	 */
	public InstalledSoftwarePk createPk()
	{
		return new InstalledSoftwarePk(softwareId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.nhcsys.dataaccess.dto.InstalledSoftware: " );
		ret.append( "softwareId=" + softwareId );
		ret.append( ", machineId=" + machineId );
		ret.append( ", productKey=" + productKey );
		ret.append( ", productName=" + productName );
		ret.append( ", companyName=" + companyName );
		ret.append( ", productVersion=" + productVersion );
		ret.append( ", customerId=" + customerId );
		return ret.toString();
	}

}
