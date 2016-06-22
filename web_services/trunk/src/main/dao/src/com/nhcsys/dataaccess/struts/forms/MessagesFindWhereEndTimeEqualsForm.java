package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MessagesFindWhereEndTimeEqualsForm extends ActionForm
{
	private String endTime;

	private String crudMethod;

	/** 
	 * Sets the value of endTime
	 */
	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}

	/** 
	 * Gets the value of endTime
	 */
	public String getEndTime()
	{
		return endTime;
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
