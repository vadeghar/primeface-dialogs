/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author axshaik
 */
public class Application extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    private Long applicationID;
    
    private String transactionTypeCode;

    private String applicationTypeCode;

    private Long institutionID;

    private Long targetInstitutionID;

    private Long employeeSeq;

    private Long facilityID;

    private Long targetFacilityID;

    private String applicationName;

    private String targetApplication;

    private LocalDateTime receivedDate;
    
    private String receivedDateText;
    
    private LocalDateTime requestCompleteDate;
    
    private String requestCompleteDateText;

    private LocalDateTime dueDate;
    
    private String dueDateText;

    private LocalDateTime cmFollowupDate;
    
    private String cmFollowupDateText;

    private LocalDateTime boardApproveDate;
    
    private String boardApproveDateText;

    private LocalDateTime completeDate;
    
    private String completeDateText;
    
    private LocalDateTime termWithdrawDate;
    
    private String termWithdrawDateText;
        
    private String comments;
            
    private String createdByUserID;
    
    private LocalDateTime createDate;
    
    private String createDateText;
                
    private String updatedByUserID;
    
    private LocalDateTime updateDate;
    
    private String updateDateText;
                    
    private Long rowConcurrencyNumber;

    public Long getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(Long applicationID) {
        this.applicationID = applicationID;
    }

    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public String getApplicationTypeCode() {
        return applicationTypeCode;
    }

    public void setApplicationTypeCode(String applicationTypeCode) {
        this.applicationTypeCode = applicationTypeCode;
    }

    public Long getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(Long institutionID) {
        this.institutionID = institutionID;
    }

    public Long getTargetInstitutionID() {
        return targetInstitutionID;
    }

    public void setTargetInstitutionID(Long targetInstitutionID) {
        this.targetInstitutionID = targetInstitutionID;
    }

    public Long getEmployeeSeq() {
        return employeeSeq;
    }

    public void setEmployeeSeq(Long employeeSeq) {
        this.employeeSeq = employeeSeq;
    }

    public Long getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(Long facilityID) {
        this.facilityID = facilityID;
    }

    public Long getTargetFacilityID() {
        return targetFacilityID;
    }

    public void setTargetFacilityID(Long targetFacilityID) {
        this.targetFacilityID = targetFacilityID;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getTargetApplication() {
        return targetApplication;
    }

    public void setTargetApplication(String targetApplication) {
        this.targetApplication = targetApplication;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getReceivedDateText() {
        if(getReceivedDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getReceivedDate().format(formatter);
        }
        return receivedDateText;
    }

    public void setReceivedDateText(String receivedDateText) {
        this.receivedDateText = receivedDateText;
    }

    public LocalDateTime getRequestCompleteDate() {
        return requestCompleteDate;
    }

    public void setRequestCompleteDate(LocalDateTime requestCompleteDate) {
        this.requestCompleteDate = requestCompleteDate;
    }

    public String getRequestCompleteDateText() {
        if(getRequestCompleteDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getRequestCompleteDate().format(formatter);
        }
        return requestCompleteDateText;
    }

    public void setRequestCompleteDateText(String requestCompleteDateText) {
        this.requestCompleteDateText = requestCompleteDateText;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDateText() {
        if(getDueDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getDueDate().format(formatter);
        }
        return dueDateText;
    }

    public void setDueDateText(String dueDateText) {
        this.dueDateText = dueDateText;
    }

    public LocalDateTime getCmFollowupDate() {
        return cmFollowupDate;
    }

    public void setCmFollowupDate(LocalDateTime cmFollowupDate) {
        this.cmFollowupDate = cmFollowupDate;
    }

    public String getCmFollowupDateText() {
        if(getCmFollowupDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getCmFollowupDate().format(formatter);
        }
        return cmFollowupDateText;
    }

    public void setCmFollowupDateText(String cmFollowupDateText) {
        this.cmFollowupDateText = cmFollowupDateText;
    }

    public LocalDateTime getBoardApproveDate() {
        return boardApproveDate;
    }

    public void setBoardApproveDate(LocalDateTime boardApproveDate) {
        this.boardApproveDate = boardApproveDate;
    }

    public String getBoardApproveDateText() {
    if(getBoardApproveDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getBoardApproveDate().format(formatter);
        }
        return boardApproveDateText;
    }

    public void setBoardApproveDateText(String boardApproveDateText) {
        this.boardApproveDateText = boardApproveDateText;
    }

    public LocalDateTime getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(LocalDateTime completeDate) {
        this.completeDate = completeDate;
    }

    public String getCompleteDateText() {
        if(getCompleteDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getCompleteDate().format(formatter);
        }
        return completeDateText;
    }

    public void setCompleteDateText(String completeDateText) {
        this.completeDateText = completeDateText;
    }

    public LocalDateTime getTermWithdrawDate() {
        return termWithdrawDate;
    }

    public void setTermWithdrawDate(LocalDateTime termWithdrawDate) {
        this.termWithdrawDate = termWithdrawDate;
    }

    public String getTermWithdrawDateText() {
        if(getTermWithdrawDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getTermWithdrawDate().format(formatter);
        }
        return termWithdrawDateText;
    }

    public void setTermWithdrawDateText(String termWithdrawDateText) {
        this.termWithdrawDateText = termWithdrawDateText;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public String getCreateDateText() {
        if(getCreateDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getCreateDate().format(formatter);
        }
        return createDateText;
    }

    public void setCreateDateText(String createDateText) {
        this.createDateText = createDateText;
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

    public String getUpdateDateText() {
        if(getUpdateDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getUpdateDate().format(formatter);
        }
        return updateDateText;
    }

    public void setUpdateDateText(String updateDateText) {
        this.updateDateText = updateDateText;
    }

    public Long getRowConcurrencyNumber() {
        return rowConcurrencyNumber;
    }

    public void setRowConcurrencyNumber(Long rowConcurrencyNumber) {
        this.rowConcurrencyNumber = rowConcurrencyNumber;
    }
    
    @Override
    public String toString() {
        return "Application{" + "applicationID=" + applicationID + ", transactionTypeCode=" + transactionTypeCode + ", applicationTypeCode=" + applicationTypeCode + 
                ", institutionID=" + institutionID + ", targetInstitutionID=" + targetInstitutionID + ", employeeSeq=" + employeeSeq + ", facilityID=" + facilityID +
                ", targetFacilityID=" + targetFacilityID + ", applicationName=" + applicationName + ", targetApplication=" + targetApplication + 
                ", receivedDate=" + receivedDate + ", receivedDateText=" + receivedDateText + ", requestCompleteDate=" + requestCompleteDate +
                ", requestCompleteDateText=" + requestCompleteDateText + ", dueDate=" + dueDate + ", dueDateText=" + dueDateText +
                ", cmFollowupDate=" + cmFollowupDate + ", cmFollowupDateText=" + cmFollowupDateText + ", boardApproveDate=" + boardApproveDate +
                ", boardApproveDateText=" + boardApproveDateText + ", completeDate=" + completeDate + ", completeDateText=" + completeDateText +
                ", termWithdrawDate=" + termWithdrawDate + ", termWithdrawDateText=" + termWithdrawDateText + ", comments=" + comments + ", createdByUserID=" + createdByUserID +
                ", createDate=" + createDate + ", createDateText=" + createDateText + ", updatedByUserID=" + updatedByUserID +
                ", updateDate=" + updateDate + ", updateDateText=" + updateDateText + ", rowConcurrencyNumber=" + rowConcurrencyNumber + '}';
    }
    
}