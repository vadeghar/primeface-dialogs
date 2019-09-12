package com.primefaces.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * This class is the parent data structure class used to define all list tables
 * to be used in drop down selections for the Wilma application
 *
 * @author SXGURIJALA
 */
public class BaseLists implements Serializable {

    private static final long serialVersionUID = 1L;

    private String domainCode;
    private String sectionCode;
    private String listItem;
    private Integer itemSortOrder;
    private String defaultIndicator;
    private String activeIndicator;
    private String createdByUserID;
    private LocalDateTime createDate;
    private String updatedByUserID;
    private LocalDateTime updateDate;
    private Integer rowConcurrencyNumber;
    private String deletedByUserID;

    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getListItem() {
        return listItem;
    }

    public void setListItem(String listItem) {
        this.listItem = listItem;
    }

    public Integer getItemSortOrder() {
        return itemSortOrder;
    }

    public void setItemSortOrder(Integer itemSortOrder) {
        this.itemSortOrder = itemSortOrder;
    }

    public String getDefaultIndicator() {
        return defaultIndicator;
    }

    public void setDefaultIndicator(String defaultIndicator) {
        this.defaultIndicator = defaultIndicator;
    }

    public String getActiveIndicator() {
        return activeIndicator;
    }

    public void setActiveIndicator(String activeIndicator) {
        this.activeIndicator = activeIndicator;
    }

    public String getCreatedByUserID() {
        return createdByUserID;
    }

    public void setCreatedByUserID(String createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdatedByUserID() {
        return updatedByUserID;
    }

    public void setUpdatedByUserID(String updatedByUserID) {
        this.updatedByUserID = updatedByUserID;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getRowConcurrencyNumber() {
        return rowConcurrencyNumber;
    }

    public void setRowConcurrencyNumber(Integer rowConcurrencyNumber) {
        this.rowConcurrencyNumber = rowConcurrencyNumber;
    }

    public String getDeletedByUserID() {
        return deletedByUserID;
    }

    public void setDeletedByUserID(String deletedByUserID) {
        this.deletedByUserID = deletedByUserID;
    }

}
