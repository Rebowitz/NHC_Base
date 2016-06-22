package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class InstalledSoftwareFindByPrimaryKeyForm extends ActionForm
{
	private String softwareId;

	private String crudMethod;

	/** 
	 * Sets the value of softwareId
	 */
	public void setSoftwareId(String softwareId)
	{
		this.softwareId = softwareId;
	}

	/** 
	 * Gets the value of softwareId
	 */
	public String getSoftwareId()
	{
		return softwareId;
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
