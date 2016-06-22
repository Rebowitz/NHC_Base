package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class SnmpqinfoFindWhereTreeEqualsForm extends ActionForm
{
	private String tree;

	private String crudMethod;

	/** 
	 * Sets the value of tree
	 */
	public void setTree(String tree)
	{
		this.tree = tree;
	}

	/** 
	 * Gets the value of tree
	 */
	public String getTree()
	{
		return tree;
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
