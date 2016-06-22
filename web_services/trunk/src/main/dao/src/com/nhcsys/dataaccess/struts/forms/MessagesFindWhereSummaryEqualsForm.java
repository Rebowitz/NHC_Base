package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MessagesFindWhereSummaryEqualsForm extends ActionForm
{
	private String summary;

	private String crudMethod;

	/** 
	 * Sets the value of summary
	 */
	public void setSummary(String summary)
	{
		this.summary = summary;
	}

	/** 
	 * Gets the value of summary
	 */
	public String getSummary()
	{
		return summary;
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
