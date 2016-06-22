package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MessagesFindWhereClickDestinationUrlEqualsForm extends ActionForm
{
	private String clickDestinationUrl;

	private String crudMethod;

	/** 
	 * Sets the value of clickDestinationUrl
	 */
	public void setClickDestinationUrl(String clickDestinationUrl)
	{
		this.clickDestinationUrl = clickDestinationUrl;
	}

	/** 
	 * Gets the value of clickDestinationUrl
	 */
	public String getClickDestinationUrl()
	{
		return clickDestinationUrl;
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
