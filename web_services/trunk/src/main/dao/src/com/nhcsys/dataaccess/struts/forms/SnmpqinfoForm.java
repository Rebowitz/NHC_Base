package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class SnmpqinfoForm extends ActionForm
{
	private String snmpqinfoId;

	private String networkinfoId;

	private String name;

	private String tree;

	private String crudMethod;

	/** 
	 * Sets the value of snmpqinfoId
	 */
	public void setSnmpqinfoId(String snmpqinfoId)
	{
		this.snmpqinfoId = snmpqinfoId;
	}

	/** 
	 * Gets the value of snmpqinfoId
	 */
	public String getSnmpqinfoId()
	{
		return snmpqinfoId;
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
	 * Sets the value of tree
	 */
	public void setTree(String tree)
	{
		this.tree = tree;
	}

	/** 
	 * Gets the value of tree
	 */
	public String getTree()
	{
		return tree;
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
		tree = "";
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
		// attempt to parse snmpqinfoId
		try {
			long _parsed_snmpqinfoId = Long.parseLong( snmpqinfoId );
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
