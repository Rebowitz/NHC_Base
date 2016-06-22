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

public class TelesalesRepsFindByPrimaryKeyAction extends NhcBaseAction
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
			long _repId = Long.parseLong( request.getParameter("repId") );
		
			// create the DAO class
			TelesalesRepsDao dao = TelesalesRepsDaoFactory.create();
		
			// execute the finder
			TelesalesReps dto = dao.findByPrimaryKey(_repId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			TelesalesRepsForm telesalesRepsForm = new TelesalesRepsForm();
			telesalesRepsForm.setCrudMethod( request.getParameter("crudMethod") );
			telesalesRepsForm.setRepId(String.valueOf( dto.getRepId() ));
			telesalesRepsForm.setOrgId(String.valueOf( dto.getOrgId() ));
			telesalesRepsForm.setUserId(dto.getUserId());
			telesalesRepsForm.setPasswordText(dto.getPasswordText());
			// store the results
			request.getSession().setAttribute( "TelesalesReps", telesalesRepsForm );
		
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
