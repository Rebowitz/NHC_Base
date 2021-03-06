package com.nhcsys.dataaccess.struts.actions; import com.nhcsys.dataaccess.nhc.struts.actions.NhcBaseAction;

import org.apache.struts.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.math.*;
import com.nhcsys.dataaccess.dao.*;
import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.factory.*;
import com.nhcsys.dataaccess.struts.forms.*;

public class SnmpqinfoFindByPrimaryKeyAction extends NhcBaseAction
{
	/**
	 * Method 'execute'
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 * @return ActionForward
	 */
	public ActionForward handle(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		try {
			// parse parameters
			long _snmpqinfoId = Long.parseLong( request.getParameter("snmpqinfoId") );
		
			// create the DAO class
			SnmpqinfoDao dao = SnmpqinfoDaoFactory.create();
		
			// execute the finder
			Snmpqinfo dto = dao.findByPrimaryKey(_snmpqinfoId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			SnmpqinfoForm snmpqinfoForm = new SnmpqinfoForm();
			snmpqinfoForm.setCrudMethod( request.getParameter("crudMethod") );
			snmpqinfoForm.setSnmpqinfoId(String.valueOf( dto.getSnmpqinfoId() ));
			snmpqinfoForm.setNetworkinfoId(String.valueOf( dto.getNetworkinfoId() ));
			snmpqinfoForm.setName(dto.getName());
			snmpqinfoForm.setTree(dto.getTree());
			// store the results
			request.getSession().setAttribute( "Snmpqinfo", snmpqinfoForm );
		
			return mapping.findForward( crudMethod );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
