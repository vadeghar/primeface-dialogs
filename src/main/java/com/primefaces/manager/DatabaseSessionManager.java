/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.manager;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.primefaces.model.Employee;

/**
 * This class is used to store database authentication values for a single user
 * session.
 *
 * @author arollins
 */
@Named
@SessionScoped
public class DatabaseSessionManager implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String ROLE_ABSTRACT_ADMIN = "ABSTRACT_ADMIN";
    public static final String ROLE_ABSTRACT_REPORT = "ABSTRACT_REPORT";
    public static final String ROLE_LEVY_ADMIN = "LEVY_ADMIN";
    public static final String ROLE_LEVY_REPORT = "LEVY_REPORT";
    public static final String ROLE_SVE_ADMIN = "SHE_ENTRY";
    public static final String ROLE_SVE_REPORT = "SHE_REPORT";
    public static final String ROLE_DPT_EMPLOYEE = "DPT_EMPLOYEE";
    public static final String ROLE_DMVA_EMPLOYEE = "SHE_VET_ENTRY";
    public static final String ROLE_DEV = "DEV";
    private Employee employee;

    @Inject
    private transient UserInfoManager empManager;
    
    private String username;

    public Employee getEmployeeInfo(String userId) {

        employee = empManager.getResult(userId);

        return employee;
    }

    public Integer verifyUserId(String userId) {
        return empManager.verifyUserId(userId);
    }

    public List<String> getSystemRoles() {
        return Arrays.asList(
                ROLE_ABSTRACT_ADMIN,
                ROLE_ABSTRACT_REPORT,
                ROLE_LEVY_ADMIN,
                ROLE_LEVY_REPORT,
                ROLE_SVE_ADMIN,
                ROLE_SVE_REPORT,
                ROLE_DPT_EMPLOYEE,
                ROLE_DMVA_EMPLOYEE,
                ROLE_DEV);
    }

	public String getUsername() {
		return "Always Test";
	}

	public void setUsername(String username) {
		this.username = username;
	}
    
    
}
