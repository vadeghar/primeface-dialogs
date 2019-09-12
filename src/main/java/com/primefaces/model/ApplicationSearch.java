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
 * @author axshaik
 */
public class ApplicationSearch implements Serializable {
    
    private String institutionName;
    private String transactionType;
    private String applicationType;
    private String status;
    private Date receivedStartDate;
    private Date receivedEndDate;
    private Date dueStartDate;
    private Date dueEndDate;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReceivedStartDate() {
        return receivedStartDate;
    }

    public void setReceivedStartDate(Date receivedStartDate) {
        this.receivedStartDate = receivedStartDate;
    }

    public Date getReceivedEndDate() {
        return receivedEndDate;
    }

    public void setReceivedEndDate(Date receivedEndDate) {
        this.receivedEndDate = receivedEndDate;
    }

    public Date getDueStartDate() {
        return dueStartDate;
    }

    public void setDueStartDate(Date dueStartDate) {
        this.dueStartDate = dueStartDate;
    }

    public Date getDueEndDate() {
        return dueEndDate;
    }

    public void setDueEndDate(Date dueEndDate) {
        this.dueEndDate = dueEndDate;
    }
    
    
    
    
}
