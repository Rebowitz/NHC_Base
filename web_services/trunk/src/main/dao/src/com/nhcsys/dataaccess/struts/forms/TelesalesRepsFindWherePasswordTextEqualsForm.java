package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class TelesalesRepsFindWherePasswordTextEqualsForm extends ActionForm
{
	private String passwordText;

	private String crudMethod;

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

}
