package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class InstalledSoftwareFindWhereCustomerIdEqualsForm extends ActionForm
{
	private String customerId;

	private String crudMethod;

	/** 
	 * Sets the value of customerId
	 */
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	/** 
	 * Gets the value of customerId
	 */
	public String getCustomerId()
	{
		return customerId;
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
