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

public class InstitutionStaffDetail implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private String firstName;
    private String lastName;
    private String roleTitle;
    private String bodFirstName;
    private String bodTitle;
    private String bodLastName;
    private String status;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

 
    public String getBodTitle() {
        return bodTitle;
    }

    public void setBodTitle(String bodTitle) {
        this.bodTitle = bodTitle;
    }

    public String getBodFirstName() {
        return bodFirstName;
    }

    public void setBodFirstName(String bodFirstName) {
        this.bodFirstName = bodFirstName;
    }

    public String getBodLastName() {
        return bodLastName;
    }

    public void setBodLastName(String bodLastName) {
        this.bodLastName = bodLastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
