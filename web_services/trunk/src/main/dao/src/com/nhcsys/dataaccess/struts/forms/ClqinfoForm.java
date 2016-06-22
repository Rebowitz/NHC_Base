package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class ClqinfoForm extends ActionForm
{
	private String clqinfoId;

	private String networkinfoId;

	private String name;

	private String cmdline;

	private String result;

	private String crudMethod;

	/** 
	 * Sets the value of clqinfoId
	 */
	public void setClqinfoId(String clqinfoId)
	{
		this.clqinfoId = clqinfoId;
	}

	/** 
	 * Gets the value of clqinfoId
	 */
	public String getClqinfoId()
	{
		return clqinfoId;
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
	 * Sets the value of cmdline
	 */
	public void setCmdline(String cmdline)
	{
		this.cmdline = cmdline;
	}

	/** 
	 * Gets the value of cmdline
	 */
	public String getCmdline()
	{
		return cmdline;
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
		cmdline = "";
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
		// attempt to parse clqinfoId
		try {
			long _parsed_clqinfoId = Long.parseLong( clqinfoId );
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
