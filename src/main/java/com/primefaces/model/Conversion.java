/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author SXGURIJALA
 */
public class Conversion  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long conversionID;
    private Long oldInstitutionID;
    private Long newInstitutionID;
    private String oldType;
    private String newType;
    private String oldName;
    private String newName;
    private LocalDateTime conversionDate;
    private String conversionDateText;
    private String note;
    private String createdBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updateDate;
    private String rowCurrencyNumber;

    public Long getConversionID() {
        return conversionID;
    }

    public void setConversionID(Long conversionID) {
        this.conversionID = conversionID;
    }

    public Long getOldInstitutionID() {
        return oldInstitutionID;
    }

    public void setOldInstitutionID(Long oldInstitutionID) {
        this.oldInstitutionID = oldInstitutionID;
    }

    public Long getNewInstitutionID() {
        return newInstitutionID;
    }

    public void setNewInstitutionID(Long newInstitutionID) {
        this.newInstitutionID = newInstitutionID;
    }

    public String getOldType() {
        return oldType;
    }

    public void setOldType(String oldType) {
        this.oldType = oldType;
    }

    public String getNewType() {
        return newType;
    }

    public void setNewType(String newType) {
        this.newType = newType;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public LocalDateTime getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(LocalDateTime conversionDate) {
        this.conversionDate = conversionDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getRowCurrencyNumber() {
        return rowCurrencyNumber;
    }

    public void setRowCurrencyNumber(String rowCurrencyNumber) {
        this.rowCurrencyNumber = rowCurrencyNumber;
    }

    public String getConversionDateText() {
        if(getConversionDate() != null) {
           DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
           return getConversionDate().format(formatter);
        }
        return conversionDateText;
    }

    public void setConversionDateText(String conversionDateText) {
        this.conversionDateText = conversionDateText;
    }
    
    
}
