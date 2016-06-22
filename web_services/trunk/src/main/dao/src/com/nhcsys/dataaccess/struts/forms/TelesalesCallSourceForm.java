package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class TelesalesCallSourceForm extends ActionForm
{
	private String sourceId;

	private String sourceDesc;

	private String crudMethod;

	/** 
	 * Sets the value of sourceId
	 */
	public void setSourceId(String sourceId)
	{
		this.sourceId = sourceId;
	}

	/** 
	 * Gets the value of sourceId
	 */
	public String getSourceId()
	{
		return sourceId;
	}

	/** 
	 * Sets the value of sourceDesc
	 */
	public void setSourceDesc(String sourceDesc)
	{
		this.sourceDesc = sourceDesc;
	}

	/** 
	 * Gets the value of sourceDesc
	 */
	public String getSourceDesc()
	{
		return sourceDesc;
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
		sourceDesc = "";
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
		// attempt to parse sourceId
		try {
			long _parsed_sourceId = Long.parseLong( sourceId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
