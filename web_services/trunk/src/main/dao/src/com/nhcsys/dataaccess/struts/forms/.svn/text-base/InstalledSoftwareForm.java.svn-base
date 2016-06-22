package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class InstalledSoftwareForm extends ActionForm
{
	private String softwareId;

	private String machineId;

	private String productKey;

	private String productName;

	private String companyName;

	private String productVersion;

	private String customerId;

	private String crudMethod;

	/** 
	 * Sets the value of softwareId
	 */
	public void setSoftwareId(String softwareId)
	{
		this.softwareId = softwareId;
	}

	/** 
	 * Gets the value of softwareId
	 */
	public String getSoftwareId()
	{
		return softwareId;
	}

	/** 
	 * Sets the value of machineId
	 */
	public void setMachineId(String machineId)
	{
		this.machineId = machineId;
	}

	/** 
	 * Gets the value of machineId
	 */
	public String getMachineId()
	{
		return machineId;
	}

	/** 
	 * Sets the value of productKey
	 */
	public void setProductKey(String productKey)
	{
		this.productKey = productKey;
	}

	/** 
	 * Gets the value of productKey
	 */
	public String getProductKey()
	{
		return productKey;
	}

	/** 
	 * Sets the value of productName
	 */
	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	/** 
	 * Gets the value of productName
	 */
	public String getProductName()
	{
		return productName;
	}

	/** 
	 * Sets the value of companyName
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	/** 
	 * Gets the value of companyName
	 */
	public String getCompanyName()
	{
		return companyName;
	}

	/** 
	 * Sets the value of productVersion
	 */
	public void setProductVersion(String productVersion)
	{
		this.productVersion = productVersion;
	}

	/** 
	 * Gets the value of productVersion
	 */
	public String getProductVersion()
	{
		return productVersion;
	}

	/** 
	 * Sets the value of customerId
	 */
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	/** 
	 * Gets the value of customerId
	 */
	public String getCustomerId()
	{
		return customerId;
	}

	/** 
	 * Sets the value of crudMethod
	 */
	public void setCrudMethod(String crudMethod)
	{
		this.crudMethod = crudMethod;
	}

	/** 
	 * Gets the value of crudMethod
	 */
	public String getCrudMethod()
	{
		return crudMethod;
	}

	/**
	 * Method 'reset'
	 * 
	 */
	public void reset()
	{
		productKey = "";
		productName = "";
		companyName = "";
		productVersion = "";
	}

	/**
	 * Method 'validate'
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors _errors = new ActionErrors();
		// attempt to parse softwareId
		try {
			long _parsed_softwareId = Long.parseLong( softwareId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse machineId
		try {
			long _parsed_machineId = Long.parseLong( machineId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse customerId
		try {
			long _parsed_customerId = Long.parseLong( customerId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
