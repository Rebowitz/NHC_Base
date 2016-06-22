package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class WnqinfoFindWhereProviderEqualsForm extends ActionForm
{
	private String provider;

	private String crudMethod;

	/** 
	 * Sets the value of provider
	 */
	public void setProvider(String provider)
	{
		this.provider = provider;
	}

	/** 
	 * Gets the value of provider
	 */
	public String getProvider()
	{
		return provider;
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
