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

public class EmailDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    private String emailTypeDesc;
    private String emailAddress;

    public String getEmailTypeDesc() {
        return emailTypeDesc;
    }

    public void setEmailTypeDesc(String emailTypeDesc) {
        this.emailTypeDesc = emailTypeDesc;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
}
