package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class WnqinfoFindWhereWnqcommentEqualsForm extends ActionForm
{
	private String wnqcomment;

	private String crudMethod;

	/** 
	 * Sets the value of wnqcomment
	 */
	public void setWnqcomment(String wnqcomment)
	{
		this.wnqcomment = wnqcomment;
	}

	/** 
	 * Gets the value of wnqcomment
	 */
	public String getWnqcomment()
	{
		return wnqcomment;
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
