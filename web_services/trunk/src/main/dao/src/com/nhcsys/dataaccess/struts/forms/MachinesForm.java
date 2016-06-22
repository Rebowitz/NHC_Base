package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MachinesForm extends ActionForm
{
	private String machineId;

	private String customerId;

	private String viveId;

	private String cpuSerialNo;

	private String keyData;

	private String keyTimestamp;

	private String stolenFlag;

	private String terminateFlag;

	private String registeredFlag;

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
	 * Sets the value of viveId
	 */
	public void setViveId(String viveId)
	{
		this.viveId = viveId;
	}

	/** 
	 * Gets the value of viveId
	 */
	public String getViveId()
	{
		return viveId;
	}

	/** 
	 * Sets the value of cpuSerialNo
	 */
	public void setCpuSerialNo(String cpuSerialNo)
	{
		this.cpuSerialNo = cpuSerialNo;
	}

	/** 
	 * Gets the value of cpuSerialNo
	 */
	public String getCpuSerialNo()
	{
		return cpuSerialNo;
	}

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
	 * Sets the value of keyTimestamp
	 */
	public void setKeyTimestamp(String keyTimestamp)
	{
		this.keyTimestamp = keyTimestamp;
	}

	/** 
	 * Gets the value of keyTimestamp
	 */
	public String getKeyTimestamp()
	{
		return keyTimestamp;
	}

	/** 
	 * Sets the value of stolenFlag
	 */
	public void setStolenFlag(String stolenFlag)
	{
		this.stolenFlag = stolenFlag;
	}

	/** 
	 * Gets the value of stolenFlag
	 */
	public String getStolenFlag()
	{
		return stolenFlag;
	}

	/** 
	 * Sets the value of terminateFlag
	 */
	public void setTerminateFlag(String terminateFlag)
	{
		this.terminateFlag = terminateFlag;
	}

	/** 
	 * Gets the value of terminateFlag
	 */
	public String getTerminateFlag()
	{
		return terminateFlag;
	}

	/** 
	 * Sets the value of registeredFlag
	 */
	public void setRegisteredFlag(String registeredFlag)
	{
		this.registeredFlag = registeredFlag;
	}

	/** 
	 * Gets the value of registeredFlag
	 */
	public String getRegisteredFlag()
	{
		return registeredFlag;
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
		viveId = "";
		cpuSerialNo = "";
		keyData = "";
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
		// attempt to parse machineId
		try {
			long _parsed_machineId = Long.parseLong( machineId );
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
		
		// attempt to parse keyTimestamp
		try {
			long _parsed_keyTimestamp = Long.parseLong( keyTimestamp );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse stolenFlag
		try {
			int _parsed_stolenFlag = Integer.parseInt( stolenFlag );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse terminateFlag
		try {
			int _parsed_terminateFlag = Integer.parseInt( terminateFlag );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse registeredFlag
		try {
			int _parsed_registeredFlag = Integer.parseInt( registeredFlag );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
