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
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long employeeSeq;

    private String employeeID;

    private String firstName;

    private String middleInitial;

    private String lastName;

    private String functionalTitleCode;

    private String jobClassCode;

    private String emailAddress;

    private String aqmQualified;

    private String eicQualified;

    private String omQualified;

    private String activeIndicator;

    private String createdByUserID;

    private String createDate;

    private String updatedByUserID;

    private String updateDate;

    private Long rowConcurrencyNumber;

    public Long getEmployeeSeq() {
        return employeeSeq;
    }

    public void setEmployeeSeq(Long employeeSeq) {
        this.employeeSeq = employeeSeq;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFunctionalTitleCode() {
        return functionalTitleCode;
    }

    public void setFunctionalTitleCode(String functionalTitleCode) {
        this.functionalTitleCode = functionalTitleCode;
    }

    public String getJobClassCode() {
        return jobClassCode;
    }

    public void setJobClassCode(String jobClassCode) {
        this.jobClassCode = jobClassCode;
    }

    public String getAqmQualified() {
        return aqmQualified;
    }

    public void setAqmQualified(String aqmQualified) {
        this.aqmQualified = aqmQualified;
    }

    public String getEicQualified() {
        return eicQualified;
    }

    public void setEicQualified(String eicQualified) {
        this.eicQualified = eicQualified;
    }

    public String getOmQualified() {
        return omQualified;
    }

    public void setOmQualified(String omQualified) {
        this.omQualified = omQualified;
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
