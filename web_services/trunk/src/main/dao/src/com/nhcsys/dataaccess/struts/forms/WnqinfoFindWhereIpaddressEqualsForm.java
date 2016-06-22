package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class WnqinfoFindWhereIpaddressEqualsForm extends ActionForm
{
	private String ipaddress;

	private String crudMethod;

	/** 
	 * Sets the value of ipaddress
	 */
	public void setIpaddress(String ipaddress)
	{
		this.ipaddress = ipaddress;
	}

	/** 
	 * Gets the value of ipaddress
	 */
	public String getIpaddress()
	{
		return ipaddress;
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
