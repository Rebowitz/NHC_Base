package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class UpdateStatusFindWhereUpdateStatusIdEqualsForm extends ActionForm
{
	private String updateStatusId;

	private String crudMethod;

	/** 
	 * Sets the value of updateStatusId
	 */
	public void setUpdateStatusId(String updateStatusId)
	{
		this.updateStatusId = updateStatusId;
	}

	/** 
	 * Gets the value of updateStatusId
	 */
	public String getUpdateStatusId()
	{
		return updateStatusId;
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
