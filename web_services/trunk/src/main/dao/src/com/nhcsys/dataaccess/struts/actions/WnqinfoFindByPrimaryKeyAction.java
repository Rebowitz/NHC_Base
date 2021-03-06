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

public class WnqinfoFindByPrimaryKeyAction extends NhcBaseAction
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
			long _wnqinfoId = Long.parseLong( request.getParameter("wnqinfoId") );
		
			// create the DAO class
			WnqinfoDao dao = WnqinfoDaoFactory.create();
		
			// execute the finder
			Wnqinfo dto = dao.findByPrimaryKey(_wnqinfoId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			WnqinfoForm wnqinfoForm = new WnqinfoForm();
			wnqinfoForm.setCrudMethod( request.getParameter("crudMethod") );
			wnqinfoForm.setWnqinfoId(String.valueOf( dto.getWnqinfoId() ));
			wnqinfoForm.setNetworkinfoId(String.valueOf( dto.getNetworkinfoId() ));
			wnqinfoForm.setProvider(dto.getProvider());
			wnqinfoForm.setRemotename(dto.getRemotename());
			wnqinfoForm.setLocalname(dto.getLocalname());
			wnqinfoForm.setIpaddress(dto.getIpaddress());
			wnqinfoForm.setWnqcomment(dto.getWnqcomment());
			wnqinfoForm.setDisplaytype(dto.getDisplaytype());
			wnqinfoForm.setWnqscope(dto.getWnqscope());
			wnqinfoForm.setWnqtype(dto.getWnqtype());
			wnqinfoForm.setWnqusage(dto.getWnqusage());
			// store the results
			request.getSession().setAttribute( "Wnqinfo", wnqinfoForm );
		
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
