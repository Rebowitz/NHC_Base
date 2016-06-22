package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MessagesFindWherePopupDurationEqualsForm extends ActionForm
{
	private String popupDuration;

	private String crudMethod;

	/** 
	 * Sets the value of popupDuration
	 */
	public void setPopupDuration(String popupDuration)
	{
		this.popupDuration = popupDuration;
	}

	/** 
	 * Gets the value of popupDuration
	 */
	public String getPopupDuration()
	{
		return popupDuration;
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
