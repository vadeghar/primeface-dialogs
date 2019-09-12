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
public class ComplaintsDetail implements Serializable  {
    
     private static final long serialVersionUID = 1L;
     private String complaintName;
     private Date receivedDate;
     private Date replydueDate;
     private Date secondRqstSentDate;
     private Date secondReplyDueDate;
     private Date addlInfoRqstDate;
     private Date closedDate;

    public String getComplaintName() {
        return complaintName;
    }

    public void setComplaintName(String complaintName) {
        this.complaintName = complaintName;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getReplydueDate() {
        return replydueDate;
    }

    public void setReplydueDate(Date replydueDate) {
        this.replydueDate = replydueDate;
    }

    public Date getSecondRqstSentDate() {
        return secondRqstSentDate;
    }

    public void setSecondRqstSentDate(Date secondRqstSentDate) {
        this.secondRqstSentDate = secondRqstSentDate;
    }

    public Date getSecondReplyDueDate() {
        return secondReplyDueDate;
    }

    public void setSecondReplyDueDate(Date secondReplyDueDate) {
        this.secondReplyDueDate = secondReplyDueDate;
    }

    public Date getAddlInfoRqstDate() {
        return addlInfoRqstDate;
    }

    public void setAddlInfoRqstDate(Date addlInfoRqstDate) {
        this.addlInfoRqstDate = addlInfoRqstDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

  
     
}
