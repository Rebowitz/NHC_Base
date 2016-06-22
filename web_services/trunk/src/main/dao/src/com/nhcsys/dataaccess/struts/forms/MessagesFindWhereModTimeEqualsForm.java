package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MessagesFindWhereModTimeEqualsForm extends ActionForm
{
	private String modTime;

	private String crudMethod;

	/** 
	 * Sets the value of modTime
	 */
	public void setModTime(String modTime)
	{
		this.modTime = modTime;
	}

	/** 
	 * Gets the value of modTime
	 */
	public String getModTime()
	{
		return modTime;
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
