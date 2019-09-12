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

public class ApplicationsDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    
     private String transactionTypeCode;
     private String applicationType;
     private Date recDate;
     private Date dueDate;
     private Date pmFollowupDate;
     private Date boardApproveDate;
     private Date completeDate;
     private String applicationID;
     private String processedBy;

    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPmFollowupDate() {
        return pmFollowupDate;
    }

    public void setPmFollowupDate(Date pmFollowupDate) {
        this.pmFollowupDate = pmFollowupDate;
    }

    public Date getBoardApproveDate() {
        return boardApproveDate;
    }

    public void setBoardApproveDate(Date boardApproveDate) {
        this.boardApproveDate = boardApproveDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }

   
     
   
    
}
