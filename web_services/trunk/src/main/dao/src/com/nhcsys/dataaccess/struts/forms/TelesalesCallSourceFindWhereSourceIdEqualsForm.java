package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class TelesalesCallSourceFindWhereSourceIdEqualsForm extends ActionForm
{
	private String sourceId;

	private String crudMethod;

	/** 
	 * Sets the value of sourceId
	 */
	public void setSourceId(String sourceId)
	{
		this.sourceId = sourceId;
	}

	/** 
	 * Gets the value of sourceId
	 */
	public String getSourceId()
	{
		return sourceId;
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
