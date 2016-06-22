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

public class TelesalesOrgsFindByPrimaryKeyAction extends NhcBaseAction
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
			long _orgId = Long.parseLong( request.getParameter("orgId") );
		
			// create the DAO class
			TelesalesOrgsDao dao = TelesalesOrgsDaoFactory.create();
		
			// execute the finder
			TelesalesOrgs dto = dao.findByPrimaryKey(_orgId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			TelesalesOrgsForm telesalesOrgsForm = new TelesalesOrgsForm();
			telesalesOrgsForm.setCrudMethod( request.getParameter("crudMethod") );
			telesalesOrgsForm.setOrgId(String.valueOf( dto.getOrgId() ));
			telesalesOrgsForm.setOrgName(dto.getOrgName());
			telesalesOrgsForm.setConfigValue(dto.getConfigValue());
			// store the results
			request.getSession().setAttribute( "TelesalesOrgs", telesalesOrgsForm );
		
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
