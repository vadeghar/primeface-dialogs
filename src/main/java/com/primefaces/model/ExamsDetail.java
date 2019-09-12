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
public class ExamsDetail implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public String examSeq;
    public String entityID;
    public Date actualStartDate;
    public Date asOfDate;
    public Date startDate;
    public Date stopDate;
    public Date cancelDate;
    public Date assetQualityDate;
    public String reason;
    public String totalAssets;
    public String totalCapital;
    public String netIncome;
    public String totalTrustAssets;
    public String totalClassTrustAssets;
    public String violations;
    public String enforcements;
    public String totalCosts;
    public String totalHrs;
    public Date baseDate;
    public Date reportDueDate;
    public Date mailDate;
    public Date completedDate;
    public String status;
    public String type;
    public String scope;
    public String purpose;
    public String compositeRating;
    public String componentRatingC;
    public String componentRatingA;
    public String componentRatingM;
    public String componentRatingE;
    public String componentRatingL;
    public String componentRatingS;
    public String agencyCode;
    public String agencyLead;

    public String getExamSeq() {
        return examSeq;
    }

    public void setExamSeq(String examSeq) {
        this.examSeq = examSeq;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }
   
    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getAsOfDate() {
        return asOfDate;
    }

    public void setAsOfDate(Date asOfDate) {
        this.asOfDate = asOfDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getCompositeRating() {
        return compositeRating;
    }

    public void setCompositeRating(String compositeRating) {
        this.compositeRating = compositeRating;
    }

    public String getComponentRatingC() {
        return componentRatingC;
    }

    public void setComponentRatingC(String componentRatingC) {
        this.componentRatingC = componentRatingC;
    }

    public String getComponentRatingA() {
        return componentRatingA;
    }

    public void setComponentRatingA(String componentRatingA) {
        this.componentRatingA = componentRatingA;
    }

    public String getComponentRatingM() {
        return componentRatingM;
    }

    public void setComponentRatingM(String componentRatingM) {
        this.componentRatingM = componentRatingM;
    }

    public String getComponentRatingE() {
        return componentRatingE;
    }

    public void setComponentRatingE(String componentRatingE) {
        this.componentRatingE = componentRatingE;
    }

    public String getComponentRatingL() {
        return componentRatingL;
    }

    public void setComponentRatingL(String componentRatingL) {
        this.componentRatingL = componentRatingL;
    }

    public String getComponentRatingS() {
        return componentRatingS;
    }

    public void setComponentRatingS(String componentRatingS) {
        this.componentRatingS = componentRatingS;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getAgencyLead() {
        return agencyLead;
    }

    public void setAgencyLead(String agencyLead) {
        this.agencyLead = agencyLead;
    }   

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Date getAssetQualityDate() {
        return assetQualityDate;
    }

    public void setAssetQualityDate(Date assetQualityDate) {
        this.assetQualityDate = assetQualityDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets;
    }

    public String getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(String totalCapital) {
        this.totalCapital = totalCapital;
    }

    public String getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }

    public String getTotalTrustAssets() {
        return totalTrustAssets;
    }

    public void setTotalTrustAssets(String totalTrustAssets) {
        this.totalTrustAssets = totalTrustAssets;
    }

    public String getTotalClassTrustAssets() {
        return totalClassTrustAssets;
    }

    public void setTotalClassTrustAssets(String totalClassTrustAssets) {
        this.totalClassTrustAssets = totalClassTrustAssets;
    }

    public String getViolations() {
        return violations;
    }

    public void setViolations(String violations) {
        this.violations = violations;
    }

    public String getEnforcements() {
        return enforcements;
    }

    public void setEnforcements(String enforcements) {
        this.enforcements = enforcements;
    }

    public String getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(String totalCosts) {
        this.totalCosts = totalCosts;
    }

    public String getTotalHrs() {
        return totalHrs;
    }

    public void setTotalHrs(String totalHrs) {
        this.totalHrs = totalHrs;
    }

    public Date getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(Date baseDate) {
        this.baseDate = baseDate;
    }

    public Date getReportDueDate() {
        return reportDueDate;
    }

    public void setReportDueDate(Date reportDueDate) {
        this.reportDueDate = reportDueDate;
    }

    public Date getMailDate() {
        return mailDate;
    }

    public void setMailDate(Date mailDate) {
        this.mailDate = mailDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }
    
    
    public int getRowKey() {
        return this.hashCode();
    }
    
    
}
