package com.nhcsys.dataaccess.nhc.beans;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 * This is the user bean object
 * We use this object to authorize transactions
 * @author mouad.zouitni
 *
 */
public class NhcUserBean implements Serializable {

	private String[] roles = null;
	private String userId = null;
	private Integer employeeId = null;
	
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String roleStr) {
		if (roleStr != null) {
			StringTokenizer rolesTokens = new StringTokenizer(roleStr,",");
			 roles = new String[rolesTokens.countTokens()];
			 int index = 0;
			 while (rolesTokens.hasMoreElements()) {
				 roles[index] = rolesTokens.nextToken();
				 index++;
			 }
		}
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
}
