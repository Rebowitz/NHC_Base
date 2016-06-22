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

public class MachinesFindByPrimaryKeyAction extends NhcBaseAction
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
			long _machineId = Long.parseLong( request.getParameter("machineId") );
		
			// create the DAO class
			MachinesDao dao = MachinesDaoFactory.create();
		
			// execute the finder
			Machines dto = dao.findByPrimaryKey(_machineId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			MachinesForm machinesForm = new MachinesForm();
			machinesForm.setCrudMethod( request.getParameter("crudMethod") );
			machinesForm.setMachineId(String.valueOf( dto.getMachineId() ));
			machinesForm.setCustomerId(String.valueOf( dto.getCustomerId() ));
			machinesForm.setViveId(dto.getViveId());
			machinesForm.setCpuSerialNo(dto.getCpuSerialNo());
			machinesForm.setKeyData(dto.getKeyData());
			machinesForm.setKeyTimestamp(String.valueOf( dto.getKeyTimestamp() ));
			machinesForm.setStolenFlag(String.valueOf( dto.getStolenFlag() ));
			machinesForm.setTerminateFlag(String.valueOf( dto.getTerminateFlag() ));
			machinesForm.setRegisteredFlag(String.valueOf( dto.getRegisteredFlag() ));
			// store the results
			request.getSession().setAttribute( "Machines", machinesForm );
		
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
