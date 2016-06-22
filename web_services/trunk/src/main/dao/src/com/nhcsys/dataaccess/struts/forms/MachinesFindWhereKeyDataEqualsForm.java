package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MachinesFindWhereKeyDataEqualsForm extends ActionForm
{
	private String keyData;

	private String crudMethod;

	/** 
	 * Sets the value of keyData
	 */
	public void setKeyData(String keyData)
	{
		this.keyData = keyData;
	}

	/** 
	 * Gets the value of keyData
	 */
	public String getKeyData()
	{
		return keyData;
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
