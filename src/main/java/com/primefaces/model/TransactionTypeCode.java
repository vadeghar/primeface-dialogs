/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import java.io.Serializable;

/**
 *
 * @author axshaik
 */

public class TransactionTypeCode implements Serializable{
    
    private static final long serialVersionUID = 1L;
        
    private String transactionTypeCode;
    
    private String description;
    
    private String activeIndiactor;
    
    private String createdByUserID;
    
    private String createDate;
    
    private String updatedByUserID;
    
    private String updateDate;
    
    private Long rowConcurrencyNumber;

    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActiveIndiactor() {
        return activeIndiactor;
    }

    public void setActiveIndiactor(String activeIndiactor) {
        this.activeIndiactor = activeIndiactor;
    }

    public String getCreatedByUserID() {
        return createdByUserID;
    }

    public void setCreatedByUserID(String createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdatedByUserID() {
        return updatedByUserID;
    }

    public void setUpdatedByUserID(String updatedByUserID) {
        this.updatedByUserID = updatedByUserID;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Long getRowConcurrencyNumber() {
        return rowConcurrencyNumber;
    }

    public void setRowConcurrencyNumber(Long rowConcurrencyNumber) {
        this.rowConcurrencyNumber = rowConcurrencyNumber;
    }

}
