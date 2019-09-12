/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import java.io.Serializable;

/**
 *
 * @author SXGURIJALA
 */
public class UserRole implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String userRole;
    private Long employeeSeq;
    private String createdBy;

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Long getEmployeeSeq() {
        return employeeSeq;
    }

    public void setEmployeeSeq(Long employeeSeq) {
        this.employeeSeq = employeeSeq;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    
    
}
