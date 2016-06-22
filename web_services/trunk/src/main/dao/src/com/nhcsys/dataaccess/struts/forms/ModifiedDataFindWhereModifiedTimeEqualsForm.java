package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class ModifiedDataFindWhereModifiedTimeEqualsForm extends ActionForm
{
	private String modifiedTime;

	private String crudMethod;

	/** 
	 * Sets the value of modifiedTime
	 */
	public void setModifiedTime(String modifiedTime)
	{
		this.modifiedTime = modifiedTime;
	}

	/** 
	 * Gets the value of modifiedTime
	 */
	public String getModifiedTime()
	{
		return modifiedTime;
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
