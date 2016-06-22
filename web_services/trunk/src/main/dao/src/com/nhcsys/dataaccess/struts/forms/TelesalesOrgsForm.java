package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class TelesalesOrgsForm extends ActionForm
{
	private String orgId;

	private String orgName;

	private String configValue;

	private String crudMethod;

	/** 
	 * Sets the value of orgId
	 */
	public void setOrgId(String orgId)
	{
		this.orgId = orgId;
	}

	/** 
	 * Gets the value of orgId
	 */
	public String getOrgId()
	{
		return orgId;
	}

	/** 
	 * Sets the value of orgName
	 */
	public void setOrgName(String orgName)
	{
		this.orgName = orgName;
	}

	/** 
	 * Gets the value of orgName
	 */
	public String getOrgName()
	{
		return orgName;
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
		orgName = "";
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
		// attempt to parse orgId
		try {
			long _parsed_orgId = Long.parseLong( orgId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
