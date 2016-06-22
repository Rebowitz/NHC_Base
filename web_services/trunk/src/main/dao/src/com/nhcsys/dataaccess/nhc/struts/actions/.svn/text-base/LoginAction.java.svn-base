package com.nhcsys.dataaccess.nhc.struts.actions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.driver.OracleTypes;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nhcsys.dataaccess.jdbc.ResourceManager;
import com.nhcsys.dataaccess.nhc.beans.NhcUserBean;
import com.nhcsys.dataaccess.nhc.struts.forms.UserForm;
import com.nhcsys.dataaccess.nhc.utils.NhcUserManager;

public class LoginAction extends NhcBaseAction {

	private static final Logger logger = Logger.getLogger(LoginAction.class);

	private String CLASS = "LoginAction: ";
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
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		Connection conn = null;
		CallableStatement stmt = null;
		PreparedStatement preparedStmt = null;
		ResultSet rs = null;
		try {
			String method = CLASS+"::execute()";
			logger.debug(method+"Starting...");
			UserForm userForm = (UserForm) form;
			// parse parameters
			String userId = userForm.getUserId();
			String rendered = request.getParameter("rendered");
			NhcUserBean user = null;
			
			String password = userForm.getPassword();
			 stmt = null;
			
			if (userId == null || "".equals(userId.trim()) || 
				password == null || "".equals(password.trim())	){
				user = NhcUserManager.getUser(request);
				if (user == null && rendered == null) {
					return mapping.findForward( "loginpage" );
				}
				throw new Exception ("Invalid User Name/Password");
			}
			
			conn = ResourceManager.getConnection();
			String sqlStmt = "{? = call apps.fnd_web_sec.validate_login(?,?)}";
			stmt = conn.prepareCall( sqlStmt );
			int index = 0;
			stmt.registerOutParameter(++index,OracleTypes.VARCHAR);
			stmt.setString( ++index, userId );
			stmt.setString(++index, password);
			
			//Try to login
			stmt.executeQuery();
			
			String isValidStr = null;
			isValidStr = stmt.getString(1);
			
			//If it's invalid login then throw an exception
			if (	isValidStr == null ||
					isValidStr.equalsIgnoreCase("N")){
				throw new Exception ("Invalid Credentials");
			}

			//Build the Select Stmt.
			sqlStmt = "SELECT employee_id FROM apps.fnd_user WHERE upper(user_name)=? AND employee_id IN (SELECT person_id FROM apps.per_all_people_f)";
			preparedStmt = conn.prepareStatement(sqlStmt);
			preparedStmt.setString(1,userId.toUpperCase());
			//Run the sql stmt
			rs = preparedStmt.executeQuery();
			Integer employeeId = null;
			while (rs.next()) {
				employeeId = rs.getInt(1);
			}
			if (employeeId == null) {
				throw new Exception ("Invalid Credentials");
			}
			//Build the Select Stmt.
			sqlStmt = "select roles from apps.vive_usr_roles_maintains WHERE upper(user_name)=?";
			preparedStmt = conn.prepareStatement(sqlStmt);
			preparedStmt.setString(1,userId.toUpperCase());
			//Run the sql stmt
			rs = preparedStmt.executeQuery();
			String roles = null;
			while (rs.next()) {
				roles = rs.getString(1);
			}
			
			user = new NhcUserBean();
			user.setRoles(roles);
			user.setUserId(userId);
			user.setEmployeeId(employeeId);
			NhcUserManager.storeUserInSession(request,user);
		
			logger.debug(method+"Starting...");
			return mapping.findForward( "success" );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("invalid.login",  e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {
					logger.error(ex);
				}
			}
		}
	}
	public ActionForward handle(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//do nothing
		return null;
	}
}
