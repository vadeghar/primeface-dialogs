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
public class InstitutionSearch implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Long institutionID;

   
    private String dobRegulatedInstitution;

    
    private String institutionName;

    
    private String charterLicenseNumber;

  
    private String oldInstitutionName;

   
    private String stateCode;

   
    private String city;

    
    private String statusCode;

  
    private String staffName;

   
    private String frbMember;

    
    private String fdicNumber;

    
    private String rssdNumber;

    
    private String institutionTypeCode;

   
    private String charterStateCode;

    
    private String charterLicenseDate;

   
    private String webAddress;

  
    private String corporationTypeCode;

   
    private String highRiskTypeCode;

 
    private String enforcementAction;


    private String bsaRisk;

 
    private String dbaName;

    public Long getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(Long institutionID) {
        this.institutionID = institutionID;
    }

    public String getDobRegulatedInstitution() {
        return dobRegulatedInstitution;
    }

    public void setDobRegulatedInstitution(String dobRegulatedInstitution) {
        this.dobRegulatedInstitution = dobRegulatedInstitution;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getCharterLicenseNumber() {
        return charterLicenseNumber;
    }

    public void setCharterLicenseNumber(String charterLicenseNumber) {
        this.charterLicenseNumber = charterLicenseNumber;
    }

    public String getFrbMember() {
        return frbMember;
    }

    public void setFrbMember(String frbMember) {
        this.frbMember = frbMember;
    }

    public String getFdicNumber() {
        return fdicNumber;
    }

    public void setFdicNumber(String fdicNumber) {
        this.fdicNumber = fdicNumber;
    }

    public String getRssdNumber() {
        return rssdNumber;
    }

    public void setRssdNumber(String rssdNumber) {
        this.rssdNumber = rssdNumber;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getInstitutionTypeCode() {
        return institutionTypeCode;
    }

    public void setInstitutionTypeCode(String institutionTypeCode) {
        this.institutionTypeCode = institutionTypeCode;
    }

    public String getCharterStateCode() {
        return charterStateCode;
    }

    public void setCharterStateCode(String charterStateCode) {
        this.charterStateCode = charterStateCode;
    }

    public String getCharterLicenseDate() {
        return charterLicenseDate;
    }

    public void setCharterLicenseDate(String charterLicenseDate) {
        this.charterLicenseDate = charterLicenseDate;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getCorporationTypeCode() {
        return corporationTypeCode;
    }

    public void setCorporationTypeCode(String corporationTypeCode) {
        this.corporationTypeCode = corporationTypeCode;
    }

    public String getHighRiskTypeCode() {
        return highRiskTypeCode;
    }

    public void setHighRiskTypeCode(String highRiskTypeCode) {
        this.highRiskTypeCode = highRiskTypeCode;
    }

    public String getEnforcementAction() {
        return enforcementAction;
    }

    public void setEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
    }

    public String getBsaRisk() {
        return bsaRisk;
    }

    public void setBsaRisk(String bsaRisk) {
        this.bsaRisk = bsaRisk;
    }

    public String getOldInstitutionName() {
        return oldInstitutionName;
    }

    public void setOldInstitutionName(String oldInstitutionName) {
        this.oldInstitutionName = oldInstitutionName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDbaName() {
        return dbaName;
    }

    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }

}
