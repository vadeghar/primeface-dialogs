/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author SXGURIJALA
 */

public class HistoryDetail implements Serializable {

    private static final long serialVersionUID = 1L;
  
    private Date effectiveDate;
    private Date changedDate;
    private String effectiveDateText;
    private String changedDateText;
    private String changedBy;
    private String changeType;
    private String oldValue;
    private String newValue;
    private String note;

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(Date changedDate) {
        this.changedDate = changedDate;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEffectiveDateText() {
         if(getEffectiveDate() != null) {
            DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
            return formatter.format(getEffectiveDate());
        }
        return effectiveDateText;
    }

    public void setEffectiveDateText(String effectiveDateText) {
        this.effectiveDateText = effectiveDateText;
    }

    public String getChangedDateText() {
         if(getChangedDate() != null) {
            DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
            return formatter.format(getChangedDate());
        }
        return changedDateText;
    }

    public void setChangedDateText(String changedDateText) {
        this.changedDateText = changedDateText;
    }
    
    
}
