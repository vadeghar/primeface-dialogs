/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author SXGURIJALA
*/
public class CorrespondenceDetail implements Serializable {

    private static final long serialVersionUID = 1L;
     private String correspondentName;
     private String correspondentEmail;
     private String methodReceived;
     private Date received;
     private Date responseSent;
     private String staffMember;

    public String getCorrespondentName() {
        return correspondentName;
    }

    public void setCorrespondentName(String correspondentName) {
        this.correspondentName = correspondentName;
    }

    public String getCorrespondentEmail() {
        return correspondentEmail;
    }

    public void setCorrespondentEmail(String correspondentEmail) {
        this.correspondentEmail = correspondentEmail;
    }

    public String getMethodReceived() {
        return methodReceived;
    }

    public void setMethodReceived(String methodReceived) {
        this.methodReceived = methodReceived;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    public Date getResponseSent() {
        return responseSent;
    }

    public void setResponseSent(Date responseSent) {
        this.responseSent = responseSent;
    }

    public String getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(String staffMember) {
        this.staffMember = staffMember;
    }
       
}
