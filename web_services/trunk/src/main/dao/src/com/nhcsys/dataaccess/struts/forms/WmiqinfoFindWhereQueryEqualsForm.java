package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class WmiqinfoFindWhereQueryEqualsForm extends ActionForm
{
	private String query;

	private String crudMethod;

	/** 
	 * Sets the value of query
	 */
	public void setQuery(String query)
	{
		this.query = query;
	}

	/** 
	 * Gets the value of query
	 */
	public String getQuery()
	{
		return query;
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
