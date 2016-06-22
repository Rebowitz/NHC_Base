package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class ModifiedDataFindByPrimaryKeyForm extends ActionForm
{
	private String modifiedDataId;

	private String crudMethod;

	/** 
	 * Sets the value of modifiedDataId
	 */
	public void setModifiedDataId(String modifiedDataId)
	{
		this.modifiedDataId = modifiedDataId;
	}

	/** 
	 * Gets the value of modifiedDataId
	 */
	public String getModifiedDataId()
	{
		return modifiedDataId;
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
