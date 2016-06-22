package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class ServerRuntimeConfigForm extends ActionForm
{
	private String configId;

	private String configKey;

	private String configValue;

	private String crudMethod;

	/** 
	 * Sets the value of configId
	 */
	public void setConfigId(String configId)
	{
		this.configId = configId;
	}

	/** 
	 * Gets the value of configId
	 */
	public String getConfigId()
	{
		return configId;
	}

	/** 
	 * Sets the value of configKey
	 */
	public void setConfigKey(String configKey)
	{
		this.configKey = configKey;
	}

	/** 
	 * Gets the value of configKey
	 */
	public String getConfigKey()
	{
		return configKey;
	}

	/** 
	 * Sets the value of configValue
	 */
	public void setConfigValue(String configValue)
	{
		this.configValue = configValue;
	}

	/** 
	 * Gets the value of configValue
	 */
	public String getConfigValue()
	{
		return configValue;
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
		configKey = "";
		configValue = "";
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
		// attempt to parse configId
		try {
			long _parsed_configId = Long.parseLong( configId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
