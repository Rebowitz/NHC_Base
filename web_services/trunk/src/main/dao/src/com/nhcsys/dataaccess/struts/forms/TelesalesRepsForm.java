package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class TelesalesRepsForm extends ActionForm
{
	private String repId;

	private String orgId;

	private String userId;

	private String passwordText;

	private String crudMethod;

	/** 
	 * Sets the value of repId
	 */
	public void setRepId(String repId)
	{
		this.repId = repId;
	}

	/** 
	 * Gets the value of repId
	 */
	public String getRepId()
	{
		return repId;
	}

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
	 * Sets the value of userId
	 */
	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	/** 
	 * Gets the value of userId
	 */
	public String getUserId()
	{
		return userId;
	}

	/** 
	 * Sets the value of passwordText
	 */
	public void setPasswordText(String passwordText)
	{
		this.passwordText = passwordText;
	}

	/** 
	 * Gets the value of passwordText
	 */
	public String getPasswordText()
	{
		return passwordText;
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
		userId = "";
		passwordText = "";
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
		// attempt to parse repId
		try {
			long _parsed_repId = Long.parseLong( repId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
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
