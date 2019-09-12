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
 * @author SXGURIJALA
 */

public class Institution extends BaseEntity {

    private static final long serialVersionUID = 1L;
 

    private Long institutionID;

    private String dobRegulatedInstitution;

    private String institutionName;

    private Long charterLicenseNumber;

    private String frbMember;

    private Long fdicNumber;

    private Long rssdNumber;

    private String ein;

    private String statusCode;

    private String statusChangeReasonCode;
    
    private String statusChangeReasonDesc;

    private String institutionTypeCode;
    
    private String institutionTypeDesc;

    private String charterStateCode;

    private LocalDateTime openDate;
    
    private String openDateText;

    private LocalDateTime closeDate;
    
    private String closeDateText;

    private LocalDateTime dateLastAudit;
    
    private String dateLastAuditText;
    
    private LocalDateTime charterLicenseDate;
    
    private String charterLicenseDateText;

    private LocalDateTime fdicInsuranceDate;
    
    private String fdicInsuranceDateText;

    private String fiscalYearEnd;

    private LocalDateTime lastChangeControlDate;
    
    private String lastChangeControlDateText;

    private String webAddress;

    private String moneyOrderAgent;

    private Long nbrOfficesCO;

    private Long nbrAgentsCO;

    private String bondIssuer;

    private LocalDateTime expirationDate;
    
    private String expirationDateText;

    private LocalDateTime msbRegistrationDate;
    
    private String msbRegistrationDateText;

    private Long amtSuretyBondOrSecurity;
    
    private String amtSuretyBondOrSecurityText;

    private String stockExchangeName;

    private String stockMarketType;

    private Long commonSharesOutstand;

    private Long preferSharesOutstand;

    private Long itServicerID;

    private String corporationTypeCode;

    private String highRiskTypeCode;

    private String enforcementAction;

    private String bsaRisk;

    private String nonTraditionalMo;

    private String over10pctDeposit;

    private String tcndCustodianName;

    private String tcndCustodianType;

    private Long tcndDepositAmount;
    
    private String tcndDepositAmountText;

    private LocalDateTime tcndMaturityDate;
    
    private String tcndMaturityDateText;

    private String createdByUserID;

    private LocalDateTime createDate;

    private String updatedByUserID;

    private LocalDateTime updateDate;

    private Long rowConcurrencyNumber;

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

    public Long getCharterLicenseNumber() {
        return charterLicenseNumber;
    }

    public void setCharterLicenseNumber(Long charterLicenseNumber) {
        this.charterLicenseNumber = charterLicenseNumber;
    }

    public String getFrbMember() {
        return frbMember;
    }

    public void setFrbMember(String frbMember) {
        this.frbMember = frbMember;
    }

    public Long getFdicNumber() {
        return fdicNumber;
    }

    public void setFdicNumber(Long fdicNumber) {
        this.fdicNumber = fdicNumber;
    }

    public Long getRssdNumber() {
        return rssdNumber;
    }

    public void setRssdNumber(Long rssdNumber) {
        this.rssdNumber = rssdNumber;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusChangeReasonCode() {
        return statusChangeReasonCode;
    }

    public void setStatusChangeReasonCode(String statusChangeReasonCode) {
        this.statusChangeReasonCode = statusChangeReasonCode;
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

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDateTime openDate) {
        this.openDate = openDate;
    }

    public LocalDateTime getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDateTime closeDate) {
        this.closeDate = closeDate;
    }

    public LocalDateTime getDateLastAudit() {
        return dateLastAudit;
    }

    public void setDateLastAudit(LocalDateTime dateLastAudit) {
        this.dateLastAudit = dateLastAudit;
    }

    public LocalDateTime getCharterLicenseDate() {
        return charterLicenseDate;
    }

    public void setCharterLicenseDate(LocalDateTime charterLicenseDate) {
        this.charterLicenseDate = charterLicenseDate;
    }

    public LocalDateTime getFdicInsuranceDate() {
        return fdicInsuranceDate;
    }

    public void setFdicInsuranceDate(LocalDateTime fdicInsuranceDate) {
        this.fdicInsuranceDate = fdicInsuranceDate;
    }

    public String getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    public void setFiscalYearEnd(String fiscalYearEnd) {
        this.fiscalYearEnd = fiscalYearEnd;
    }

    public LocalDateTime getLastChangeControlDate() {
        return lastChangeControlDate;
    }

    public void setLastChangeControlDate(LocalDateTime lastChangeControlDate) {
        this.lastChangeControlDate = lastChangeControlDate;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getMoneyOrderAgent() {
        return moneyOrderAgent;
    }

    public void setMoneyOrderAgent(String moneyOrderAgent) {
        this.moneyOrderAgent = moneyOrderAgent;
    }

    public Long getNbrOfficesCO() {
        return nbrOfficesCO;
    }

    public void setNbrOfficesCO(Long nbrOfficesCO) {
        this.nbrOfficesCO = nbrOfficesCO;
    }

    public Long getNbrAgentsCO() {
        return nbrAgentsCO;
    }

    public void setNbrAgentsCO(Long nbrAgentsCO) {
        this.nbrAgentsCO = nbrAgentsCO;
    }

    public String getBondIssuer() {
        return bondIssuer;
    }

    public void setBondIssuer(String bondIssuer) {
        this.bondIssuer = bondIssuer;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDateTime getMsbRegistrationDate() {
        return msbRegistrationDate;
    }

    public void setMsbRegistrationDate(LocalDateTime msbRegistrationDate) {
        this.msbRegistrationDate = msbRegistrationDate;
    }

    public Long getAmtSuretyBondOrSecurity() {
        return amtSuretyBondOrSecurity;
    }

    public void setAmtSuretyBondOrSecurity(Long amtSuretyBondOrSecurity) {
        this.amtSuretyBondOrSecurity = amtSuretyBondOrSecurity;
    }

    public String getStockExchangeName() {
        return stockExchangeName;
    }

    public void setStockExchangeName(String stockExchangeName) {
        this.stockExchangeName = stockExchangeName;
    }

    public String getStockMarketType() {
        return stockMarketType;
    }

    public void setStockMarketType(String stockMarketType) {
        this.stockMarketType = stockMarketType;
    }

    public Long getCommonSharesOutstand() {
        return commonSharesOutstand;
    }

    public void setCommonSharesOutstand(Long commonSharesOutstand) {
        this.commonSharesOutstand = commonSharesOutstand;
    }

    public Long getPreferSharesOutstand() {
        return preferSharesOutstand;
    }

    public void setPreferSharesOutstand(Long preferSharesOutstand) {
        this.preferSharesOutstand = preferSharesOutstand;
    }

    public Long getItServicerID() {
        return itServicerID;
    }

    public void setItServicerID(Long itServicerID) {
        this.itServicerID = itServicerID;
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

    public String getNonTraditionalMo() {
        return nonTraditionalMo;
    }

    public void setNonTraditionalMo(String nonTraditionalMo) {
        this.nonTraditionalMo = nonTraditionalMo;
    }

    public String getOver10pctDeposit() {
        return over10pctDeposit;
    }

    public void setOver10pctDeposit(String over10pctDeposit) {
        this.over10pctDeposit = over10pctDeposit;
    }

    public String getTcndCustodianName() {
        return tcndCustodianName;
    }

    public void setTcndCustodianName(String tcndCustodianName) {
        this.tcndCustodianName = tcndCustodianName;
    }

    public String getTcndCustodianType() {
        return tcndCustodianType;
    }

    public void setTcndCustodianType(String tcndCustodianType) {
        this.tcndCustodianType = tcndCustodianType;
    }

    public Long getTcndDepositAmount() {
        return tcndDepositAmount;
    }

    public void setTcndDepositAmount(Long tcndDepositAmount) {
        this.tcndDepositAmount = tcndDepositAmount;
    }

    public LocalDateTime getTcndMaturityDate() {
        return tcndMaturityDate;
    }

    public void setTcndMaturityDate(LocalDateTime tcndMaturityDate) {
        this.tcndMaturityDate = tcndMaturityDate;
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

    public Long getRowConcurrencyNumber() {
        return rowConcurrencyNumber;
    }

    public void setRowConcurrencyNumber(Long rowConcurrencyNumber) {
        this.rowConcurrencyNumber = rowConcurrencyNumber;
    }

    public String getFdicInsuranceDateText() {
        if(getFdicInsuranceDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getFdicInsuranceDate().format(formatter);
        }
        return fdicInsuranceDateText;
    }

    public void setFdicInsuranceDateText(String fdicInsuranceDateText) {
        this.fdicInsuranceDateText = fdicInsuranceDateText;
    }

    public String getCloseDateText() {
         if(getCloseDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getCloseDate().format(formatter);
        }
        return closeDateText;
    }

    public void setCloseDateText(String closeDateText) {
        this.closeDateText = closeDateText;
    }

    public String getDateLastAuditText() {
         if(getDateLastAudit() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getDateLastAudit().format(formatter);
        }
        return dateLastAuditText;
    }

    public void setDateLastAuditText(String dateLastAuditText) {
        this.dateLastAuditText = dateLastAuditText;
    }

    public String getCharterLicenseDateText() {
         if(getCharterLicenseDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getCharterLicenseDate().format(formatter);
        }
        return charterLicenseDateText;
    }

    public void setCharterLicenseDateText(String charterLicenseDateText) {
        this.charterLicenseDateText = charterLicenseDateText;
    }

    public String getLastChangeControlDateText() {
         if(getLastChangeControlDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getLastChangeControlDate().format(formatter);
        }
        return lastChangeControlDateText;
    }

    public void setLastChangeControlDateText(String lastChangeControlDateText) {
        this.lastChangeControlDateText = lastChangeControlDateText;
    }

    public String getExpirationDateText() {
        if(getExpirationDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getExpirationDate().format(formatter);
        }
        return expirationDateText;
    }

    public void setExpirationDateText(String expirationDateText) {
        this.expirationDateText = expirationDateText;
    }

    public String getMsbRegistrationDateText() {
        if(getMsbRegistrationDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getMsbRegistrationDate().format(formatter);
        }
       
        return msbRegistrationDateText;
    }

    public void setMsbRegistrationDateText(String msbRegistrationDateText) {
        this.msbRegistrationDateText = msbRegistrationDateText;
    }

    public String getTcndMaturityDateText() {
        if(getTcndMaturityDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getTcndMaturityDate().format(formatter);
        }
        return tcndMaturityDateText;
    }

    public void setTcndMaturityDateText(String tcndMaturityDateText) {
        this.tcndMaturityDateText = tcndMaturityDateText;
    }

    public String getInstitutionTypeDesc() {
        return institutionTypeDesc;
    }

    public void setInstitutionTypeDesc(String institutionTypeDesc) {
        this.institutionTypeDesc = institutionTypeDesc;
    }

    public String getOpenDateText() {
         if(getOpenDate() != null) {
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/yyyy");
            return getOpenDate().format(formatter);
        }
        return openDateText;
    }

    public void setOpenDateText(String openDateText) {
        this.openDateText = openDateText;
    }

    public String getAmtSuretyBondOrSecurityText() {
        return amtSuretyBondOrSecurityText;
    }

    public void setAmtSuretyBondOrSecurityText(String amtSuretyBondOrSecurityText) {
        this.amtSuretyBondOrSecurityText = amtSuretyBondOrSecurityText;
    }

    public String getTcndDepositAmountText() {
        return tcndDepositAmountText;
    }

    public void setTcndDepositAmountText(String tcndDepositAmountText) {
        this.tcndDepositAmountText = tcndDepositAmountText;
    }

    public String getStatusChangeReasonDesc() {
        return statusChangeReasonDesc;
    }

    public void setStatusChangeReasonDesc(String statusChangeReasonDesc) {
        this.statusChangeReasonDesc = statusChangeReasonDesc;
    }

     
    @Override
    public String toString() {
        return "Institution{" + "institutionID=" + institutionID + ", dobRegulatedInstitution=" + dobRegulatedInstitution + ", institutionName=" + institutionName + ", charterLicenseNumber=" + charterLicenseNumber + ", frbMember=" + frbMember + ", fdicNumber=" + fdicNumber + ", rssdNumber=" + rssdNumber + ", ein=" + ein + ", statusCode=" + statusCode + ", statusChangeReasonCode=" + statusChangeReasonCode + ", institutionTypeCode=" + institutionTypeCode + ", institutionTypeDesc=" + institutionTypeDesc + ", charterStateCode=" + charterStateCode + ", openDate=" + openDate + ", closeDate=" + closeDate + ", closeDateText=" + closeDateText + ", dateLastAudit=" + dateLastAudit + ", dateLastAuditText=" + dateLastAuditText + ", charterLicenseDate=" + charterLicenseDate + ", charterLicenseDateText=" + charterLicenseDateText + ", fdicInsuranceDate=" + fdicInsuranceDate + ", fdicInsuranceDateText=" + fdicInsuranceDateText + ", fiscalYearEnd=" + fiscalYearEnd + ", lastChangeControlDate=" + lastChangeControlDate + ", lastChangeControlDateText=" + lastChangeControlDateText + ", webAddress=" + webAddress + ", moneyOrderAgent=" + moneyOrderAgent + ", nbrOfficesCO=" + nbrOfficesCO + ", nbrAgentsCO=" + nbrAgentsCO + ", bondIssuer=" + bondIssuer + ", expirationDate=" + expirationDate + ", expirationDateText=" + expirationDateText + ", msbRegistrationDate=" + msbRegistrationDate + ", msbRegistrationDateText=" + msbRegistrationDateText + ", amtSuretyBondOrSecurity=" + amtSuretyBondOrSecurity + ", stockExchangeName=" + stockExchangeName + ", stockMarketType=" + stockMarketType + ", commonSharesOutstand=" + commonSharesOutstand + ", preferSharesOutstand=" + preferSharesOutstand + ", itServicerID=" + itServicerID + ", corporationTypeCode=" + corporationTypeCode + ", highRiskTypeCode=" + highRiskTypeCode + ", enforcementAction=" + enforcementAction + ", bsaRisk=" + bsaRisk + ", nonTraditionalMo=" + nonTraditionalMo + ", over10pctDeposit=" + over10pctDeposit + ", tcndCustodianName=" + tcndCustodianName + ", tcndCustodianType=" + tcndCustodianType + ", tcndDepositAmount=" + tcndDepositAmount + ", tcndMaturityDate=" + tcndMaturityDate + ", tcndMaturityDateText=" + tcndMaturityDateText + ", createdByUserID=" + createdByUserID + ", createDate=" + createDate + ", updatedByUserID=" + updatedByUserID + ", updateDate=" + updateDate + ", rowConcurrencyNumber=" + rowConcurrencyNumber + '}';
    }
}
