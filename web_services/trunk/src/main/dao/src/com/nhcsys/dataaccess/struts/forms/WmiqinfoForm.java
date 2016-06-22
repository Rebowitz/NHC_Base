package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class WmiqinfoForm extends ActionForm
{
	private String wmiqinfoId;

	private String networkinfoId;

	private String name;

	private String query;

	private String result;

	private String crudMethod;

	/** 
	 * Sets the value of wmiqinfoId
	 */
	public void setWmiqinfoId(String wmiqinfoId)
	{
		this.wmiqinfoId = wmiqinfoId;
	}

	/** 
	 * Gets the value of wmiqinfoId
	 */
	public String getWmiqinfoId()
	{
		return wmiqinfoId;
	}

	/** 
	 * Sets the value of networkinfoId
	 */
	public void setNetworkinfoId(String networkinfoId)
	{
		this.networkinfoId = networkinfoId;
	}

	/** 
	 * Gets the value of networkinfoId
	 */
	public String getNetworkinfoId()
	{
		return networkinfoId;
	}

	/** 
	 * Sets the value of name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/** 
	 * Gets the value of name
	 */
	public String getName()
	{
		return name;
	}

	/** 
	 * Sets the value of query
	 */
	public void setQuery(String query)
	{
		this.query = query;
	}

	/** 
	 * Gets the value of query
	 */
	public String getQuery()
	{
		return query;
	}

	/** 
	 * Sets the value of result
	 */
	public void setResult(String result)
	{
		this.result = result;
	}

	/** 
	 * Gets the value of result
	 */
	public String getResult()
	{
		return result;
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
		name = "";
		query = "";
		result = "";
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
		// attempt to parse wmiqinfoId
		try {
			long _parsed_wmiqinfoId = Long.parseLong( wmiqinfoId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse networkinfoId
		try {
			long _parsed_networkinfoId = Long.parseLong( networkinfoId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
