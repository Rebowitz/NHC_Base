package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MessagesFindWhereTypeEqualsForm extends ActionForm
{
	private String type;

	private String crudMethod;

	/** 
	 * Sets the value of type
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/** 
	 * Gets the value of type
	 */
	public String getType()
	{
		return type;
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
