package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class NetworkinfoForm extends ActionForm
{
	private String networkinfoId;

	private String customerId;

	private String machineId;

	private String ssid;

	private String passphrase;

	private String wirelessinfotype;

	private String timestamp;

	private String crudMethod;

	/** 
	 * Sets the value of networkinfoId
	 */
	public void setNetworkinfoId(String networkinfoId)
	{
		this.networkinfoId = networkinfoId;
	}

	/** 
	 * Gets the value of networkinfoId
	 */
	public String getNetworkinfoId()
	{
		return networkinfoId;
	}

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
	 * Sets the value of ssid
	 */
	public void setSsid(String ssid)
	{
		this.ssid = ssid;
	}

	/** 
	 * Gets the value of ssid
	 */
	public String getSsid()
	{
		return ssid;
	}

	/** 
	 * Sets the value of passphrase
	 */
	public void setPassphrase(String passphrase)
	{
		this.passphrase = passphrase;
	}

	/** 
	 * Gets the value of passphrase
	 */
	public String getPassphrase()
	{
		return passphrase;
	}

	/** 
	 * Sets the value of wirelessinfotype
	 */
	public void setWirelessinfotype(String wirelessinfotype)
	{
		this.wirelessinfotype = wirelessinfotype;
	}

	/** 
	 * Gets the value of wirelessinfotype
	 */
	public String getWirelessinfotype()
	{
		return wirelessinfotype;
	}

	/** 
	 * Sets the value of timestamp
	 */
	public void setTimestamp(String timestamp)
	{
		this.timestamp = timestamp;
	}

	/** 
	 * Gets the value of timestamp
	 */
	public String getTimestamp()
	{
		return timestamp;
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
		ssid = "";
		passphrase = "";
		wirelessinfotype = "";
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
		// attempt to parse networkinfoId
		try {
			long _parsed_networkinfoId = Long.parseLong( networkinfoId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse customerId
		try {
			long _parsed_customerId = Long.parseLong( customerId );
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
		
		// attempt to parse timestamp
		try {
			java.util.Date _parsed_timestamp = (timestamp == null || timestamp.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( timestamp);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
