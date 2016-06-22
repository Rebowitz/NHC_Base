package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class UpdateStatusForm extends ActionForm
{
	private String updateStatusId;

	private String sessionId;

	private String machineId;

	private String productId;

	private String description;

	private String report;

	private String status;

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
	 * Sets the value of sessionId
	 */
	public void setSessionId(String sessionId)
	{
		this.sessionId = sessionId;
	}

	/** 
	 * Gets the value of sessionId
	 */
	public String getSessionId()
	{
		return sessionId;
	}

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
	 * Sets the value of productId
	 */
	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	/** 
	 * Gets the value of productId
	 */
	public String getProductId()
	{
		return productId;
	}

	/** 
	 * Sets the value of description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/** 
	 * Gets the value of description
	 */
	public String getDescription()
	{
		return description;
	}

	/** 
	 * Sets the value of report
	 */
	public void setReport(String report)
	{
		this.report = report;
	}

	/** 
	 * Gets the value of report
	 */
	public String getReport()
	{
		return report;
	}

	/** 
	 * Sets the value of status
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}

	/** 
	 * Gets the value of status
	 */
	public String getStatus()
	{
		return status;
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

	/**
	 * Method 'reset'
	 * 
	 */
	public void reset()
	{
		sessionId = "";
		productId = "";
		description = "";
		report = "";
		status = "";
	}

	/**
	 * Method 'validate'
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors _errors = new ActionErrors();
		// attempt to parse updateStatusId
		try {
			long _parsed_updateStatusId = Long.parseLong( updateStatusId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse machineId
		try {
			long _parsed_machineId = Long.parseLong( machineId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
