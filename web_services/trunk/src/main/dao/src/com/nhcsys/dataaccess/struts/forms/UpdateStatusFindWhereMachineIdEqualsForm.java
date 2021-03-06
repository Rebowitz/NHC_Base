package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class UpdateStatusFindWhereMachineIdEqualsForm extends ActionForm
{
	private String machineId;

	private String crudMethod;

	/** 
	 * Sets the value of machineId
	 */
	public void setMachineId(String machineId)
	{
		this.machineId = machineId;
	}

	/** 
	 * Gets the value of machineId
	 */
	public String getMachineId()
	{
		return machineId;
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
