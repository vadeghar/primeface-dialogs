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

public class SupervisoryStaffDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    private String staffName;
    private String staffTypeDesc;
    private String email;
    private String phone;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTypeDesc() {
        return staffTypeDesc;
    }

    public void setStaffTypeDesc(String staffTypeDesc) {
        this.staffTypeDesc = staffTypeDesc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
    
    
}
