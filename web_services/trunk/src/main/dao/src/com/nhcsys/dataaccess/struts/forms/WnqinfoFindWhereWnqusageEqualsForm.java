package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class WnqinfoFindWhereWnqusageEqualsForm extends ActionForm
{
	private String wnqusage;

	private String crudMethod;

	/** 
	 * Sets the value of wnqusage
	 */
	public void setWnqusage(String wnqusage)
	{
		this.wnqusage = wnqusage;
	}

	/** 
	 * Gets the value of wnqusage
	 */
	public String getWnqusage()
	{
		return wnqusage;
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

}
