package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class WnqinfoForm extends ActionForm
{
	private String wnqinfoId;

	private String networkinfoId;

	private String provider;

	private String remotename;

	private String localname;

	private String ipaddress;

	private String wnqcomment;

	private String displaytype;

	private String wnqscope;

	private String wnqtype;

	private String wnqusage;

	private String crudMethod;

	/** 
	 * Sets the value of wnqinfoId
	 */
	public void setWnqinfoId(String wnqinfoId)
	{
		this.wnqinfoId = wnqinfoId;
	}

	/** 
	 * Gets the value of wnqinfoId
	 */
	public String getWnqinfoId()
	{
		return wnqinfoId;
	}

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
	 * Sets the value of provider
	 */
	public void setProvider(String provider)
	{
		this.provider = provider;
	}

	/** 
	 * Gets the value of provider
	 */
	public String getProvider()
	{
		return provider;
	}

	/** 
	 * Sets the value of remotename
	 */
	public void setRemotename(String remotename)
	{
		this.remotename = remotename;
	}

	/** 
	 * Gets the value of remotename
	 */
	public String getRemotename()
	{
		return remotename;
	}

	/** 
	 * Sets the value of localname
	 */
	public void setLocalname(String localname)
	{
		this.localname = localname;
	}

	/** 
	 * Gets the value of localname
	 */
	public String getLocalname()
	{
		return localname;
	}

	/** 
	 * Sets the value of ipaddress
	 */
	public void setIpaddress(String ipaddress)
	{
		this.ipaddress = ipaddress;
	}

	/** 
	 * Gets the value of ipaddress
	 */
	public String getIpaddress()
	{
		return ipaddress;
	}

	/** 
	 * Sets the value of wnqcomment
	 */
	public void setWnqcomment(String wnqcomment)
	{
		this.wnqcomment = wnqcomment;
	}

	/** 
	 * Gets the value of wnqcomment
	 */
	public String getWnqcomment()
	{
		return wnqcomment;
	}

	/** 
	 * Sets the value of displaytype
	 */
	public void setDisplaytype(String displaytype)
	{
		this.displaytype = displaytype;
	}

	/** 
	 * Gets the value of displaytype
	 */
	public String getDisplaytype()
	{
		return displaytype;
	}

	/** 
	 * Sets the value of wnqscope
	 */
	public void setWnqscope(String wnqscope)
	{
		this.wnqscope = wnqscope;
	}

	/** 
	 * Gets the value of wnqscope
	 */
	public String getWnqscope()
	{
		return wnqscope;
	}

	/** 
	 * Sets the value of wnqtype
	 */
	public void setWnqtype(String wnqtype)
	{
		this.wnqtype = wnqtype;
	}

	/** 
	 * Gets the value of wnqtype
	 */
	public String getWnqtype()
	{
		return wnqtype;
	}

	/** 
	 * Sets the value of wnqusage
	 */
	public void setWnqusage(String wnqusage)
	{
		this.wnqusage = wnqusage;
	}

	/** 
	 * Gets the value of wnqusage
	 */
	public String getWnqusage()
	{
		return wnqusage;
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
		provider = "";
		remotename = "";
		localname = "";
		ipaddress = "";
		wnqcomment = "";
		displaytype = "";
		wnqscope = "";
		wnqtype = "";
		wnqusage = "";
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
		// attempt to parse wnqinfoId
		try {
			long _parsed_wnqinfoId = Long.parseLong( wnqinfoId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse networkinfoId
		try {
			long _parsed_networkinfoId = Long.parseLong( networkinfoId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
