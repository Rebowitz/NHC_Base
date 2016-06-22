package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class ModifiedDataForm extends ActionForm
{
	private String modifiedDataId;

	private String customerId;

	private String modifiedTime;

	private String crudMethod;

	/** 
	 * Sets the value of modifiedDataId
	 */
	public void setModifiedDataId(String modifiedDataId)
	{
		this.modifiedDataId = modifiedDataId;
	}

	/** 
	 * Gets the value of modifiedDataId
	 */
	public String getModifiedDataId()
	{
		return modifiedDataId;
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
	 * Sets the value of modifiedTime
	 */
	public void setModifiedTime(String modifiedTime)
	{
		this.modifiedTime = modifiedTime;
	}

	/** 
	 * Gets the value of modifiedTime
	 */
	public String getModifiedTime()
	{
		return modifiedTime;
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
		// attempt to parse modifiedDataId
		try {
			long _parsed_modifiedDataId = Long.parseLong( modifiedDataId );
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
		
		// attempt to parse modifiedTime
		try {
			java.util.Date _parsed_modifiedTime = (modifiedTime == null || modifiedTime.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( modifiedTime);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
