/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.dialogs;


import java.io.Serializable;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TabChangeEvent;

import com.primefaces.handler.SystemUtilityHandler;
import com.primefaces.manager.ConversionManager;
import com.primefaces.manager.DatabaseSessionManager;
import com.primefaces.manager.HistoryManager;
import com.primefaces.manager.InstitutionManager;
import com.primefaces.manager.UserInfoManager;
import com.primefaces.manager.UserRoleManager;
import com.primefaces.model.Address;
import com.primefaces.model.AgentsDetail;
import com.primefaces.model.ApplicationsDetail;
import com.primefaces.model.AssociationsDetail;
import com.primefaces.model.BanksServicedDetail;
import com.primefaces.model.ComplaintsDetail;
import com.primefaces.model.Conversion;
import com.primefaces.model.CorrespondenceDetail;
import com.primefaces.model.DBADetail;
import com.primefaces.model.EmailDetail;
import com.primefaces.model.Employee;
import com.primefaces.model.EnforcementsDetail;
import com.primefaces.model.ExamsDetail;
import com.primefaces.model.FacilitiesDetail;
import com.primefaces.model.HistoryDetail;
import com.primefaces.model.Institution;
import com.primefaces.model.InstitutionSearch;
import com.primefaces.model.InstitutionStaffDetail;
import com.primefaces.model.NotesDetail;
import com.primefaces.model.PhoneDetail;
import com.primefaces.model.ServicesDetail;
import com.primefaces.model.SupervisoryStaffDetail;
import com.primefaces.model.UserRole;
import com.primefaces.utils.BidsUtils;

/**
 *
 * @author SXGURIJALA
 */
@Named
@ViewScoped
public class InHouseInstitutionHandler implements Serializable {

    private InstitutionSearch institutionSearch;
    private Institution updatedInstitutionDetail; 
    private Institution institutionDetail;
    private Institution newInstitutionDetail;
    private InstitutionSearch selectedInstitution;
    private ExamsDetail selectedExam;
    private AssociationsDetail selectedAssociation;
    private HistoryDetail change;
    private Conversion conversion;
    private Employee employee;
    private UserRole role;
    private List<InstitutionSearch> institutions;
    private List<Address> address;
    private List<ApplicationsDetail> applications;
    private List<AssociationsDetail> associations;
    private List<AssociationsDetail> associationBanks;
    private List<ComplaintsDetail> complaints;
    private List<BanksServicedDetail> banks;
    private List<AgentsDetail> agents;
    private List<CorrespondenceDetail> correspondence;
    private List<DBADetail> dba;
    private List<EmailDetail> email;
    private List<ExamsDetail> exams;
    private List<EnforcementsDetail> enforcements;
    private List<FacilitiesDetail> facilities;
    private List<HistoryDetail> history;
    private List<InstitutionStaffDetail> institutionStaff;
    private List<InstitutionStaffDetail> bodStaff;
    private List<NotesDetail> notes;
    private List<PhoneDetail> phone;
    private List<ServicesDetail> services;
    private List<SupervisoryStaffDetail> supervisoryStaff;
 
    private Long institutionID;
    private String physicalAddress;
    private String primaryPhone;
    private String caseLoadManager;
    private int activeFacilities = 0;
    private int activeAgents = 0;
    private int update = 0;
    private String showTypePopup = "N";
    private String activeTypePopup = "N";
    private String showOtherPopup = "N";
    private String showDupPopup = "N";
    private boolean superUser = true;
    
    private String instStaffType = StringUtils.EMPTY;
    private String examType = StringUtils.EMPTY;
    
    private List<SelectItem> institutionTypeCodeList;
    private List<SelectItem> changeReasonCodeList;
    
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private Locale locale = Locale.US;
    private NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
    
    @Inject
    private transient InstitutionManager institutionManager;
    
    @Inject
    private SystemUtilityHandler systemUtilityHandler;
    
    @Inject
    private DatabaseSessionManager databaseSessionManager;
    
    @Inject
    private UserInfoManager userInfoManager;
    
    @Inject
    private UserRoleManager userRoleManager;
    
    @Inject
    private HistoryManager historyManager;
       
    @Inject
    private ConversionManager conversionManager;

   @PostConstruct
    public void init() {       
       initializeInstituionSearch();
    } 

    public void processClearCriteria() {
        // Reset the Institution object
        initializeInstituionSearch();
    }

    private void initializeInstituionSearch() {
           
        institutionSearch = new InstitutionSearch();
        institutionDetail = new Institution();
        newInstitutionDetail = new Institution();
        updatedInstitutionDetail = new Institution();
        conversion = new Conversion();
        change = new HistoryDetail();
        institutionSearch.setInstitutionName(StringUtils.EMPTY);
        institutionSearch.setDobRegulatedInstitution("Y");
        institutionSearch.setCharterLicenseNumber(StringUtils.EMPTY);
        institutionSearch.setFdicNumber(StringUtils.EMPTY);
        institutionSearch.setRssdNumber(StringUtils.EMPTY);
        institutionSearch.setStatusCode("ACT");
        institutionSearch.setInstitutionTypeCode(StringUtils.EMPTY);
        institutionSearch.setOldInstitutionName(StringUtils.EMPTY);
        institutionSearch.setStateCode(StringUtils.EMPTY);
        institutionSearch.setStaffName(StringUtils.EMPTY);
        institutionSearch.setCity(StringUtils.EMPTY);
        institutionSearch.setDbaName(StringUtils.EMPTY);
        setInstitutions(null);
        selectedInstitution = null;
        selectedAssociation = null;
        selectedExam = null;
        resetPopups();

    }
    
    public void resetPopups() {
         showTypePopup = "N";
         activeTypePopup = "N";
         showOtherPopup = "N";
         showDupPopup = "N"; 
    }

    public String processSearchCriteria() {
        System.out.println("***** Process Search Criteria ****");
       
        if (StringUtils.isNotBlank(institutionSearch.getInstitutionName())) {
            String institutionName = institutionSearch.getInstitutionName();
            institutionName = institutionName.replace("*", "%");
            institutionSearch.setInstitutionName(institutionName);
            System.out.println("***** Entered Value Inst Name****" + institutionName);
        } else {
            institutionSearch.setInstitutionName(null);
        }

        if (StringUtils.isNotBlank(institutionSearch.getOldInstitutionName())) {
            String oldName = institutionSearch.getOldInstitutionName();
            oldName = oldName.replace("*", "%");
            institutionSearch.setOldInstitutionName(oldName);
            System.out.println("***** Entered Value Old Inst Name****" + oldName);
        } else {
            institutionSearch.setOldInstitutionName(null);
        }

        if (StringUtils.isNotBlank(institutionSearch.getCharterLicenseNumber())) {
            String charter = institutionSearch.getCharterLicenseNumber();
            charter = charter.replace("*", "%");
            institutionSearch.setCharterLicenseNumber(charter);
            System.out.println("***** Entered Value charter****" + charter);
        } else {
            institutionSearch.setCharterLicenseNumber(null);
        }

        if (StringUtils.isNotBlank(institutionSearch.getInstitutionTypeCode())) {
            String institutionTypeCode = institutionSearch.getInstitutionTypeCode();
            institutionTypeCode = institutionTypeCode.replace("*", "%");
            institutionSearch.setInstitutionTypeCode(institutionTypeCode);
            System.out.println("***** Entered Value institutionTypeCode****" + institutionTypeCode);
        } else {
            institutionSearch.setInstitutionTypeCode(null);
        }

        if (StringUtils.isNotBlank(institutionSearch.getStatusCode())) {
            String statusCode = institutionSearch.getStatusCode();
            statusCode = statusCode.replace("*", "%");
            institutionSearch.setStatusCode(statusCode);
            System.out.println("***** Entered Value statusCode****" + statusCode);
        } else {
            institutionSearch.setStatusCode(null);
        }
        if (StringUtils.isNotBlank(institutionSearch.getCity())) {
            String city = institutionSearch.getCity();
            city = city.replace("*", "%");
            institutionSearch.setCity(city);
            System.out.println("***** Entered Value city****" + city);
        } else {
            institutionSearch.setCity(null);
        }

        if (StringUtils.isNotBlank(institutionSearch.getStateCode())) {
            String state = institutionSearch.getStateCode();
            state = state.replace("*", "%");
            institutionSearch.setStateCode(state);
            System.out.println("***** Entered Value state****" + state);
        } else {
            institutionSearch.setStateCode(null);
        }
        
        if (StringUtils.isNotBlank(institutionSearch.getDbaName())) {
            String dbaName = institutionSearch.getDbaName();
            dbaName = dbaName.replace("*", "%");
            institutionSearch.setDbaName(dbaName);
            System.out.println("***** Entered Value DBA Name****" + dbaName);
        } else {
             institutionSearch.setDbaName(null);
        }

        if (StringUtils.isNotBlank(institutionSearch.getDobRegulatedInstitution())) {
            String dobRegulated = institutionSearch.getDobRegulatedInstitution();
                institutionSearch.setDobRegulatedInstitution(dobRegulated);
            System.out.println("***** Entered Value dobRegulatedInstitution****" + dobRegulated);
        } else {
                institutionSearch.setDobRegulatedInstitution(null);
        }

        if (StringUtils.isNotBlank(institutionSearch.getRssdNumber())) {
            String rssdNumber = institutionSearch.getRssdNumber();
            rssdNumber = rssdNumber.replace("*", "%");
            institutionSearch.setRssdNumber(rssdNumber);
            System.out.println("***** Entered Value rssdNumber****" + rssdNumber);
        } else {
            institutionSearch.setRssdNumber(null);
        }

         if (StringUtils.isNotBlank(institutionSearch.getFdicNumber())) {
            String fdicNumber = institutionSearch.getFdicNumber();
            fdicNumber = fdicNumber.replace("*", "%");
            institutionSearch.setFdicNumber(fdicNumber);
            System.out.println("***** Entered Value fdicNumber****" + fdicNumber);
        } else {
            institutionSearch.setFdicNumber(null);
        }

         if (StringUtils.isNotBlank(institutionSearch.getStaffName())) {
            String caseLoadManager = institutionSearch.getStaffName();
            caseLoadManager = caseLoadManager.replace("*", "%");
            institutionSearch.setStaffName(caseLoadManager);
            System.out.println("***** Entered Value caseLoadManager****" + caseLoadManager);
        }  else {
            institutionSearch.setStaffName(null);
        }

        System.out.println("Search Criteria " + institutionSearch.toString());
        // If pass, execute search         
        institutions = institutionManager.getSearchResults(institutionSearch);

        return null;

    }

    public InstitutionSearch getInstitutionSearch() {
        return institutionSearch;
    }

    public void setInstitutionSearch(InstitutionSearch institutionSearch) {
        this.institutionSearch = institutionSearch;
    }

    public String processOpenInstitutionExport() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", Boolean.TRUE);
        options.put("draggable", Boolean.FALSE);
        options.put("resizable", Boolean.FALSE);
        options.put("closable", Boolean.FALSE);
        options.put("height", 600);
        options.put("width", 900);
        options.put("contentHeight", "100%");
        options.put("contentWidth", "100%");

        RequestContext.getCurrentInstance().openDialog("ihInstitutionExport", options, null);
        return null;
    }

    public String getUniqueExportname() {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        String fileName = "Institution" + "_" + timeStamp;
        System.out.println("Unique Export name: " + fileName);
        return fileName;
    }
    
    public String processBackCriteria() {
         return "ihInstitutionSearch?faces-redirect=true";      
    }

     public void navigateToDetailsPage(SelectEvent event) {
        ConfigurableNavigationHandler configurableNavigationHandler =
    			(ConfigurableNavigationHandler)FacesContext.
    			  getCurrentInstance().getApplication().getNavigationHandler();
    	System.out.println("Selected Institution : "+selectedInstitution.getInstitutionID());
        loadInstitution(selectedInstitution.getInstitutionID());
        employee = userInfoManager.getEmployeeInfo("");
        role = userRoleManager.getUserRoles(employee.getEmployeeSeq());
        if(role.getUserRole().equalsIgnoreCase("SYSADMIN") || role.getUserRole().equalsIgnoreCase("INSTITUTION UPDATE")) {
            superUser = true;
        } else
            superUser = false;
        resetPopups();
        configurableNavigationHandler.performNavigation("ihInstitutionDetails?faces-redirect=true");
    }
     
      public void navigateToExamsPage(SelectEvent event) {
        ConfigurableNavigationHandler configurableNavigationHandler =
    			(ConfigurableNavigationHandler)FacesContext.
    			  getCurrentInstance().getApplication().getNavigationHandler();
    	System.out.println("Selected Exam : "+selectedExam.getExamSeq() +"Selected Institution:"+selectedExam.getEntityID());
        configurableNavigationHandler.performNavigation("ihExamDetails?faces-redirect=true");
    }
      
     
     public void onTabChange(TabChangeEvent event) {
         System.out.println("************ "+event.getTab().getId()+ " *** "+event.getSource());
         if(event.getTab().getId().equalsIgnoreCase("Address")) {
            address = institutionManager.getAddressResults(selectedInstitution.getInstitutionID()); 
         } else if(event.getTab().getId().equalsIgnoreCase("Applications")) {
            applications = institutionManager.getApplicationsResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("Associations")) {
            associations = institutionManager.getAssociationsResults(selectedInstitution.getInstitutionID());
         }  else if(event.getTab().getId().equalsIgnoreCase("Agents")) {
            agents = institutionManager.getAgentsResults(selectedInstitution.getInstitutionID());
            activeAgents = getActiveAgentsCount(agents);
         }  else if(event.getTab().getId().equalsIgnoreCase("banksServiced")) {
            banks = institutionManager.getServicedBankResults(selectedInstitution.getInstitutionID());
         }  else if(event.getTab().getId().equalsIgnoreCase("Complaints")) {
            complaints = institutionManager.getComplaintsResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("Correspondence")) {
            correspondence = institutionManager.getCorrespondenceResults(selectedInstitution.getInstitutionID());
         }  else if(event.getTab().getId().equalsIgnoreCase("dba")) {
            dba =  institutionManager.getDBAResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("Email")) {
            email =  institutionManager.getEmailResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("Examinations")) {
            examType = "Y";
            exams =  institutionManager.getExamsLast9Results(selectedInstitution.getInstitutionID());
            System.out.println("On click of Accordian Exams Count :"+exams.size());
         } else if(event.getTab().getId().equalsIgnoreCase("Enforcements")) {
            enforcements =  institutionManager.getEnforcementsResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("Facilities")) {
             facilities =  institutionManager.getFacilitiesResults(selectedInstitution.getInstitutionID());
             activeFacilities = getActiveFacilitiesCount(facilities);
         } else if(event.getTab().getId().equalsIgnoreCase("History")) {
             history = institutionManager.getHistoryResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("institutionStaff")) {
             instStaffType = null;
             institutionStaff = institutionManager.getStaffResults(selectedInstitution.getInstitutionID(), null );
             bodStaff = institutionManager.getBodStaffResults(selectedInstitution.getInstitutionID(), null );
             System.out.println("On click of Accordian institutionStaff Count :"+institutionStaff.size()+ "\n bodStaff Count :"+bodStaff.size());
         } else if(event.getTab().getId().equalsIgnoreCase("Notes")) {
             notes =  institutionManager.getNotesResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("Phone")) {
             phone =  institutionManager.getPhoneResults(selectedInstitution.getInstitutionID());
         }  else if(event.getTab().getId().equalsIgnoreCase("Services")) {
             services =  institutionManager.getServicesResults(selectedInstitution.getInstitutionID());
         } else if(event.getTab().getId().equalsIgnoreCase("supervisoryStaff")) {
             supervisoryStaff =  institutionManager.getSuperStaffResults(selectedInstitution.getInstitutionID());
         }
     }
     
  public String processAddInstitution() {
        int newInstitutionId = 0;
        int duplicateCount = 0;

        FacesContext context = FacesContext.getCurrentInstance();
        if (StringUtils.isBlank(newInstitutionDetail.getInstitutionName()) || StringUtils.isBlank(newInstitutionDetail.getInstitutionTypeCode())) {
            context.addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Please enter values for Institution Name and Institution Type",
                            "Please enter Required Fields"));
            return null;
        } else {
            duplicateCount = institutionManager.checkDuplicateInstitution(0l, newInstitutionDetail.getInstitutionName());
            if (duplicateCount == 0) {
                newInstitutionId = institutionManager.getAddInstitution("", newInstitutionDetail.getInstitutionName(), newInstitutionDetail.getInstitutionTypeCode());
                if (newInstitutionId > 0) {

                    ConfigurableNavigationHandler configurableNavigationHandler
                            = (ConfigurableNavigationHandler) FacesContext.
                                    getCurrentInstance().getApplication().getNavigationHandler();
                    System.out.println("Added Institution id " + newInstitutionId + " ");
                    loadInstitution(Long.valueOf(newInstitutionId));
                    newInstitutionDetail = new Institution();
                    employee = userInfoManager.getEmployeeInfo("");
                    role = userRoleManager.getUserRoles(employee.getEmployeeSeq());
                    if(role.getUserRole().equalsIgnoreCase("SYSADMIN") || role.getUserRole().equalsIgnoreCase("INSTITUTION UPDATE")) {
                         superUser = true;
                    } else
                    superUser = false;
                    resetPopups();
                    configurableNavigationHandler.performNavigation("ihInstitutionDetails?faces-redirect=true");
                }
            } else {
                context.addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                "Duplicates Found! Please enter a different Institution Name/ Institution Type",
                                "Unable to create Institution"));
                return null;
            }
        }
        return null;
    }
     
     private void loadInstitution(Long institutionId) {
        updatedInstitutionDetail = institutionManager.getInstitutionResults(institutionId);
        institutionDetail = (Institution) updatedInstitutionDetail.deepClone();
        if(updatedInstitutionDetail.getInstitutionTypeCode() != null) {
          String instCode = updatedInstitutionDetail.getInstitutionTypeCode();
          updatedInstitutionDetail.setInstitutionTypeDesc(getInstitutionTypeValue(instCode));
        }
        if(updatedInstitutionDetail.getStatusChangeReasonCode() != null) {
          String statCode = updatedInstitutionDetail.getStatusChangeReasonCode();
          updatedInstitutionDetail.setStatusChangeReasonDesc(getStatusChangeReasonCodeValue(statCode));
        }
        if(selectedInstitution != null) {
            physicalAddress = institutionManager.getPhysicalAddress(selectedInstitution.getInstitutionID());
            primaryPhone = institutionManager.getPrimaryPhone(selectedInstitution.getInstitutionID());
            caseLoadManager = institutionManager.getCaseLoadManager(selectedInstitution.getInstitutionID());
        }
        if(updatedInstitutionDetail.getFiscalYearEnd() != null) {
            StringBuffer st = new StringBuffer(updatedInstitutionDetail.getFiscalYearEnd());
            st.insert(2, "/");
            updatedInstitutionDetail.setFiscalYearEnd(st.toString());
        }
        
        if(updatedInstitutionDetail.getAmtSuretyBondOrSecurity() != null) {
            Locale locale = Locale.US;
            NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
            updatedInstitutionDetail.setAmtSuretyBondOrSecurityText(formatter.format(updatedInstitutionDetail.getAmtSuretyBondOrSecurity()));
        }

        if(updatedInstitutionDetail.getTcndDepositAmount() != null)
            updatedInstitutionDetail.setTcndDepositAmountText(formatter.format(updatedInstitutionDetail.getTcndDepositAmount()));
        
     }
     
     private String validateInstitution() {
       //Validate
       int validRSSD = 0;
       int validFDIC = 0;
       int duplicateCount = 0;
       FacesContext context = FacesContext.getCurrentInstance();
       System.out.println("Old Values  " + institutionDetail.toString());
       System.out.println("Updated Values: " + updatedInstitutionDetail.toString());

       if (StringUtils.isBlank(updatedInstitutionDetail.getInstitutionName()) || StringUtils.isBlank(updatedInstitutionDetail.getInstitutionTypeCode()) || StringUtils.isBlank(updatedInstitutionDetail.getStatusCode()) || StringUtils.isBlank(updatedInstitutionDetail.getDobRegulatedInstitution())) {
           context.addMessage(null,
                   new FacesMessage(FacesMessage.SEVERITY_ERROR,
                           "Please enter Required Fields",
                           "Please enter Required Fields"));
           return null;
       }
       //Duplicate Name Check
       System.out.println("Checking Duplicate Name");
       if(updatedInstitutionDetail.getInstitutionName() != null) {
           duplicateCount = institutionManager.checkDuplicateInstitution(institutionDetail.getInstitutionID(), updatedInstitutionDetail.getInstitutionName());
           System.out.println("Duplicate name called ---" + duplicateCount);
           if(duplicateCount > 0) {
               showDupPopup = "Y";
           } else{
               showDupPopup = "N";
           }
       }
       if (updatedInstitutionDetail.getRssdNumber() != null) {
           validRSSD = institutionManager.validateRSSD(updatedInstitutionDetail.getInstitutionID(), updatedInstitutionDetail.getRssdNumber());
           if (validRSSD != 0) {
               context.addMessage(null,
                       new FacesMessage(FacesMessage.SEVERITY_ERROR,
                               "RSSD Duplicate Found. Please enter a unique number",
                               "RSSD Duplicate Found. Please enter a unique number"));
               return null;

           }
       }
       if (updatedInstitutionDetail.getFdicNumber() != null) {
           validFDIC = institutionManager.validateRSSD(updatedInstitutionDetail.getInstitutionID(), updatedInstitutionDetail.getFdicNumber());
           if (validFDIC != 0) {
               context.addMessage(null,
                       new FacesMessage(FacesMessage.SEVERITY_ERROR,
                               "FDIC Duplicate Found. Please enter a unique number",
                               "FDIC Duplicate Found. Please enter a unique number"));
                return null;
       
           }
       }

       //Status from in process or pending to Active, Physical address must have been entered
       if (updatedInstitutionDetail.getStatusCode() != null && ((institutionDetail.getStatusCode().equals("PROCESS") || institutionDetail.getStatusCode().equals("PEN"))
               && updatedInstitutionDetail.getStatusCode().equals("ACT"))) {
           physicalAddress = institutionManager.getPhysicalAddress(institutionDetail.getInstitutionID());
           if (physicalAddress == null) {
               System.out.println("Physical Address Reached");
               context.addMessage(null,
                       new FacesMessage(FacesMessage.SEVERITY_ERROR,
                               "Please enter Physical Address",
                               "No Physical Address found for this Institution"));
                return null;
           }
       }
       //Status to Inactive, change reason is required, change reason should be enabled after selecting status to inactive
       if (updatedInstitutionDetail.getStatusCode() != null && updatedInstitutionDetail.getStatusCode().equals("INA") && StringUtils.isBlank(updatedInstitutionDetail.getStatusChangeReasonCode())) {
           context.addMessage(null,
                   new FacesMessage(FacesMessage.SEVERITY_ERROR,
                           "Status cannot be Inactive without Change Reason. Please enter Change Reason",
                           "No Change Reason found for this Institution"));
           return null;
       }
       // Check for Instituion Type
       if(updatedInstitutionDetail.getInstitutionTypeCode() != null && !institutionDetail.getInstitutionTypeCode().equals(updatedInstitutionDetail.getInstitutionTypeCode()) &&
               !updatedInstitutionDetail.getStatusCode().equals("ACT") && !updatedInstitutionDetail.getStatusCode().equals("PROCESS")) {
            context.addMessage(null,
                   new FacesMessage(FacesMessage.SEVERITY_ERROR,
                           "The institution does not have an 'Active' or 'In Process' status and type conversions can only be performed on active/In Process institutions.  The type conversion will not be performed.",
                           "The institution does not have an 'Active' or 'In Process' status and type conversions can only be performed on active/In Process institutions.  The type conversion will not be performed."));
           return null;
       }
     return "SUCCESS";
     }
     
   public void showPopups() {  
       System.out.println("----------------------------------------------------Reached Show Popups");
    resetPopups();
    if(StringUtils.isNotBlank(validateInstitution())) {
       if (updatedInstitutionDetail.getInstitutionTypeCode() != null && !institutionDetail.getInstitutionTypeCode().equals(updatedInstitutionDetail.getInstitutionTypeCode()) 
               && !(institutionDetail.getStatusCode().equals("PROCESS"))) {
           if(institutionDetail.getStatusCode().equals("ACT")) {
               System.out.println("****************Active Type Topup");
              conversion.setOldInstitutionID(updatedInstitutionDetail.getInstitutionID());
              conversion.setNewInstitutionID(updatedInstitutionDetail.getInstitutionID());
              conversion.setOldType(institutionDetail.getInstitutionTypeCode());
              conversion.setNewType(updatedInstitutionDetail.getInstitutionTypeCode());
              conversion.setOldName(updatedInstitutionDetail.getInstitutionName());
              conversion.setNewName(updatedInstitutionDetail.getInstitutionName()); 
              activeTypePopup = "Y";
              showTypePopup = "N";
              System.out.println("activeTypePopup is Yes");
           } else {
              conversion.setOldInstitutionID(updatedInstitutionDetail.getInstitutionID());
              conversion.setNewInstitutionID(updatedInstitutionDetail.getInstitutionID());
              conversion.setOldType(institutionDetail.getInstitutionTypeCode());
              conversion.setNewType(updatedInstitutionDetail.getInstitutionTypeCode());
              conversion.setOldName(updatedInstitutionDetail.getInstitutionName());
              conversion.setNewName(updatedInstitutionDetail.getInstitutionName()); 
              showTypePopup = "Y"; 
              activeTypePopup = "N";
              System.out.println("showTypePopup is Yes");
           }
       } else {
           showTypePopup = "N";
           activeTypePopup = "N";
           System.out.println("activeTypePopup and showTypePopup are No");
       }
           System.out.println("***************End of Reached ShowTypepopup*********************"+showTypePopup);
           System.out.println("***************End of Reached activeTypePopup*********************"+activeTypePopup);
     
       if (updatedInstitutionDetail.getInstitutionName() != null && 
               !institutionDetail.getInstitutionName().equals(updatedInstitutionDetail.getInstitutionName())) {
           change.setOldValue(institutionDetail.getInstitutionName());
           change.setNewValue(updatedInstitutionDetail.getInstitutionName());
           change.setEffectiveDate(BidsUtils.getCurrentDateTime());
           change.setChangeType("NAME");
           showOtherPopup = "Y";
           System.out.println("showOtherPopupis Yes changeType is NAME");
       } else if (updatedInstitutionDetail.getStatusCode() != null && 
               !institutionDetail.getStatusCode().equals(updatedInstitutionDetail.getStatusCode())) {
               change.setOldValue(institutionDetail.getStatusCode());
               change.setNewValue(updatedInstitutionDetail.getStatusCode());
               change.setEffectiveDate(BidsUtils.getCurrentDateTime());
               change.setChangeType("STATUS");
               showOtherPopup = "Y";
               System.out.println("showOtherPopupis Yes changeType is STATUS");
        } else {
           showOtherPopup = "N";
       }
       System.out.println("***************End of Reached Changepopup*********************"+showOtherPopup);
       if(showOtherPopup != "Y" && showTypePopup != "Y" && activeTypePopup != "Y") {
         processUpdateInstituion();
       }
    }
   }
   public void processUpdateInstituion() {
       
       
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getOver10pctDeposit()) && updatedInstitutionDetail.getOver10pctDeposit().equals("true")) {
           updatedInstitutionDetail.setOver10pctDeposit("Y");
       } else updatedInstitutionDetail.setOver10pctDeposit("N");
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getOpenDateText()))
           updatedInstitutionDetail.setOpenDate(convertTextToDateTime(updatedInstitutionDetail.getOpenDateText()));  
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getOpenDateText()))
           updatedInstitutionDetail.setOpenDate(convertTextToDateTime(updatedInstitutionDetail.getOpenDateText()));   
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getCloseDateText()))
           updatedInstitutionDetail.setCloseDate(convertTextToDateTime(updatedInstitutionDetail.getCloseDateText()));     
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getDateLastAuditText())) 
            updatedInstitutionDetail.setDateLastAudit(convertTextToDateTime(updatedInstitutionDetail.getDateLastAuditText()));
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getCharterLicenseDateText())) 
            updatedInstitutionDetail.setCharterLicenseDate(convertTextToDateTime(updatedInstitutionDetail.getCharterLicenseDateText()));
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getFdicInsuranceDateText()))
          updatedInstitutionDetail.setFdicInsuranceDate(convertTextToDateTime(updatedInstitutionDetail.getFdicInsuranceDateText())); 
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getLastChangeControlDateText())) 
           updatedInstitutionDetail.setLastChangeControlDate(convertTextToDateTime(updatedInstitutionDetail.getLastChangeControlDateText()));
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getExpirationDateText())) 
          updatedInstitutionDetail.setExpirationDate(convertTextToDateTime(updatedInstitutionDetail.getExpirationDateText()));
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getMsbRegistrationDateText())) 
          updatedInstitutionDetail.setMsbRegistrationDate(convertTextToDateTime(updatedInstitutionDetail.getMsbRegistrationDateText()));
        if(StringUtils.isNotBlank(updatedInstitutionDetail.getTcndMaturityDateText())) 
           updatedInstitutionDetail.setTcndMaturityDate(convertTextToDateTime(updatedInstitutionDetail.getTcndMaturityDateText()));     
        if(StringUtils.isNotBlank(updatedInstitutionDetail.getFiscalYearEnd()) &&  updatedInstitutionDetail.getFiscalYearEnd().contains("/"))
            updatedInstitutionDetail.setFiscalYearEnd(updatedInstitutionDetail.getFiscalYearEnd().replace("/", ""));
       if(StringUtils.isNotBlank(updatedInstitutionDetail.getAmtSuretyBondOrSecurityText()) && updatedInstitutionDetail.getAmtSuretyBondOrSecurityText().contains("$")) {
            Number n = convertCurrenctTextToNumber(updatedInstitutionDetail.getAmtSuretyBondOrSecurityText());
            updatedInstitutionDetail.setAmtSuretyBondOrSecurity(n.longValue());
       }
          //Save the record
          update = institutionManager.updateInstitution(updatedInstitutionDetail);
          System.out.println("Update Institution"+update);
          if (update == 0) {
           ConfigurableNavigationHandler configurableNavigationHandler
                   = (ConfigurableNavigationHandler) FacesContext.
                           getCurrentInstance().getApplication().getNavigationHandler(); 
           loadInstitution(updatedInstitutionDetail.getInstitutionID());
            FacesContext.getCurrentInstance().addMessage(null,
                   new FacesMessage(FacesMessage.SEVERITY_INFO,
                           "Institution is updated Successfully",
                           "Updated Institution"));
           FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
           configurableNavigationHandler.performNavigation("ihInstitutionDetails?faces-redirect=true");
               
       } else {
           System.out.println("Unable to update");
           FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null,
                   new FacesMessage(FacesMessage.SEVERITY_ERROR,
                           "Unable to Update Institution. Please Retry!",
                           "Please Retry to update the Institution"));

       }
   }
      
    public String hideDialog() {
        RequestContext.getCurrentInstance().closeDialog(null);
        return null;
    }
    
    public String hideNoteDialog() {
        RequestContext.getCurrentInstance().closeDialog("ihInstitutionNote");
        return null;
    }
    
    public String hideTypeDialog() {
        RequestContext.getCurrentInstance().closeDialog("ihInstitutionType");
        return null;
    }
    
   public void saveToHistory() {
         int insert = 0;
         System.out.println(updatedInstitutionDetail+" Saving into History Table "+change);
         if(updatedInstitutionDetail!= null) {
             System.out.println(change.getNote()+"-"+updatedInstitutionDetail.getInstitutionID()+"-"+change.getChangeType()+"-"+updatedInstitutionDetail.getStatusCode()+"-"+institutionDetail.getStatusCode()+"-"+change.getOldValue()+"-"+change.getNewValue()+"-"+change.getEffectiveDate()+"-"+ change.getNote()+"-"+ "");
            insert = historyManager.insertIntoHistory(updatedInstitutionDetail.getInstitutionID(),change.getChangeType(),null,updatedInstitutionDetail.getStatusCode(),institutionDetail.getStatusCode(),change.getOldValue(), change.getNewValue(), null, null, null, change.getEffectiveDate(), change.getNote(), "");
            if(insert <= 0) {
              FacesContext context = FacesContext.getCurrentInstance();
                  context.addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                "Unable to Insert into History",
                                "Please Retry to update the Institution"));
           } else processUpdateInstituion();
         showOtherPopup="N";
         showDupPopup = "N";
         }
     } 
     
   public void saveToConversion() {
         int insert = 0;
         System.out.println("Saving into Conversion Table");
      if(updatedInstitutionDetail!= null) {
            insert = conversionManager.insertIntoConversion(institutionDetail.getInstitutionID(),conversion.getOldType(),conversion.getNewType(),conversion.getOldName(),conversion.getNewName(),BidsUtils.convertToDate(conversion.getConversionDateText()), conversion.getNote(), "");
          if(insert <= 0) {
              FacesContext context = FacesContext.getCurrentInstance();
                  context.addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                "Unable to Insert into Conversion",
                                "Please Retry to update the Institution"));
         }
          else processUpdateInstituion();
         showTypePopup = "N";
      }
     } 
      
   private String getInstitutionTypeValue(String institutionCode) {
         institutionTypeCodeList = systemUtilityHandler.getInstitutionTypeCodeItems();
         for(SelectItem item : institutionTypeCodeList) {
             if(item.getValue().equals(institutionCode))
                 return item.getLabel();
         }
         return StringUtils.EMPTY;
     }
   
    private String getStatusChangeReasonCodeValue(String changeReasonCode) {
         changeReasonCodeList = systemUtilityHandler.getChangeReasonCodeItems();
         for(SelectItem item : changeReasonCodeList) {
             if(item.getValue().equals(changeReasonCode))
                 return item.getLabel();
         }
         return StringUtils.EMPTY;
     }
   
   
   private int getActiveFacilitiesCount(List<FacilitiesDetail> facilities) {
       int count = 0;
       if(facilities != null) {
           for(FacilitiesDetail facilitiesDetail: facilities) {
               if(facilitiesDetail.getStatus().equalsIgnoreCase("Active")) {
                 count++;  
               }
           }
           return count;
       }
       return count;
   }
   
      
   private int getActiveAgentsCount(List<AgentsDetail> agents) {
       int count = 0;
       if(agents != null) {
           for(AgentsDetail agentsDetail: agents) {
               if(agentsDetail.getStatus().equalsIgnoreCase("Active") && agentsDetail.getState().equalsIgnoreCase("CO")) {
                 count++;  
               }
           }
           return count;
       }
       return count;
   }  
   
   
   public void updateInstitutionStaffDataTable() {
       System.out.println("Selected :"+instStaffType);
       if(StringUtils.isEmpty(instStaffType.trim())) {
           instStaffType = null;
       }
       institutionStaff = institutionManager.getStaffResults(selectedInstitution.getInstitutionID(), instStaffType );
       bodStaff = institutionManager.getBodStaffResults(selectedInstitution.getInstitutionID(), instStaffType );
       System.out.println("institutionStaff Count :"+institutionStaff.size()+ "\n bodStaff Count :"+bodStaff.size());
       if(instStaffType == null) {
           instStaffType = " ";
       }
       System.out.println("instStaffType :"+instStaffType);
    }
   
   public void updateExamTable() {
         System.out.println("Selected :"+examType);
       if(StringUtils.isEmpty(examType.trim())) {
           examType = null;
           exams = institutionManager.getExamsResults(selectedInstitution.getInstitutionID());
       } else if(examType.equals("Y")) {
           exams =  institutionManager.getExamsLast9Results(selectedInstitution.getInstitutionID());
       }
       
       if(examType == null) {
           examType = " ";
       }
       System.out.println("examtype :"+examType);   
   }
   
   public void updateHodlingCompanyData() {
        System.out.println("Selected :"+selectedAssociation);
        if(selectedAssociation != null ) {
             associationBanks = institutionManager.getAssociationBankResults(Long.parseLong(selectedAssociation.getEntityID()));
        }
   }
 
    public List<InstitutionSearch> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(List<InstitutionSearch> institutions) {
        this.institutions = institutions;
    }
    
     public InstitutionSearch getSelectedInstitution() {
        return selectedInstitution;
    }

    public void setSelectedInstitution(InstitutionSearch selectedInstitution) {
        this.selectedInstitution = selectedInstitution;
    }
    
    public Long getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(Long institutionID) {
        this.institutionID = institutionID;
    }
    
    
    public Institution getUpdatedInstitutionDetail() {
        return updatedInstitutionDetail;
    }

    public void setUpdatedInstitutionDetail(Institution updatedInstitutionDetail) {
        this.updatedInstitutionDetail = updatedInstitutionDetail;
    }
    
       
    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
    
    public List<ApplicationsDetail> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationsDetail> applications) {
        this.applications = applications;
    }
    
     public List<AssociationsDetail> getAssociations() {
        return associations;
    }

    public void setAssociations(List<AssociationsDetail> associations) {
        this.associations = associations;
    }

    public List<ComplaintsDetail> getComplaints() {
        return complaints;
    }

    public void setComplaints(List<ComplaintsDetail> complaints) {
        this.complaints = complaints;
    }

    public List<CorrespondenceDetail> getCorrespondence() {
        return correspondence;
    }

    public void setCorrespondence(List<CorrespondenceDetail> correspondence) {
        this.correspondence = correspondence;
    }

    public List<DBADetail> getDba() {
        return dba;
    }

    public void setDba(List<DBADetail> dba) {
        this.dba = dba;
    }

    public List<EmailDetail> getEmail() {
        return email;
    }

    public void setEmail(List<EmailDetail> email) {
        this.email = email;
    }

    public List<ExamsDetail> getExams() {
        return exams;
    }

    public void setExams(List<ExamsDetail> exams) {
        this.exams = exams;
    }

    public List<FacilitiesDetail> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<FacilitiesDetail> facilities) {
        this.facilities = facilities;
    }

    public List<HistoryDetail> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryDetail> history) {
        this.history = history;
    }

    public List<InstitutionStaffDetail> getInstitutionStaff() {
        return institutionStaff;
    }

    public void setInstitutionStaff(List<InstitutionStaffDetail> institutionStaff) {
        this.institutionStaff = institutionStaff;
    }

    public List<NotesDetail> getNotes() {
        return notes;
    }

    public void setNotes(List<NotesDetail> notes) {
        this.notes = notes;
    }

    public List<PhoneDetail> getPhone() {
        return phone;
    }

    public void setPhone(List<PhoneDetail> phone) {
        this.phone = phone;
    }

    public List<ServicesDetail> getServices() {
        return services;
    }

    public void setServices(List<ServicesDetail> services) {
        this.services = services;
    }

    public List<SupervisoryStaffDetail> getSupervisoryStaff() {
        return supervisoryStaff;
    }

    public void setSupervisoryStaff(List<SupervisoryStaffDetail> supervisoryStaff) {
        this.supervisoryStaff = supervisoryStaff;
    }

    public List<AssociationsDetail> getAssociationBanks() {
        if(associationBanks == null)
            return new ArrayList<>();
        return associationBanks;
    }

    public void setAssociationBanks(List<AssociationsDetail> associationBanks) {
        this.associationBanks = associationBanks;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getCaseLoadManager() {
        return caseLoadManager;
    }

    public void setCaseLoadManager(String caseLoadManager) {
        this.caseLoadManager = caseLoadManager;
    }

    public List<SelectItem> getInstitutionTypeCodeList() {
        return institutionTypeCodeList;
    }

    public void setInstitutionTypeCodeList(List<SelectItem> institutionTypeCodeList) {
        this.institutionTypeCodeList = institutionTypeCodeList;
    }

    public List<BanksServicedDetail> getBanks() {
        return banks;
    }

    public void setBanks(List<BanksServicedDetail> banks) {
        this.banks = banks;
    }

    public List<AgentsDetail> getAgents() {
        return agents;
    }

    public void setAgents(List<AgentsDetail> agents) {
        this.agents = agents;
    }

    public List<InstitutionStaffDetail> getBodStaff() {
        return bodStaff;
    }

    public void setBodStaff(List<InstitutionStaffDetail> bodStaff) {
        this.bodStaff = bodStaff;
    }

    public List<EnforcementsDetail> getEnforcements() {
        return enforcements;
    }

    public void setEnforcements(List<EnforcementsDetail> enforcements) {
        this.enforcements = enforcements;
    }

    public Institution getInstitutionDetail() {
        return institutionDetail;
    }

    public void setInstitutionDetail(Institution institutionDetail) {
        this.institutionDetail = institutionDetail;
    }

    public Institution getNewInstitutionDetail() {
        return newInstitutionDetail;
    }

    public void setNewInstitutionDetail(Institution newInstitutionDetail) {
        this.newInstitutionDetail = newInstitutionDetail;
    }
    

    public String getInstStaffType() {
        return instStaffType;
    }

    public void setInstStaffType(String instStaffType) {
        this.instStaffType = instStaffType;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public AssociationsDetail getSelectedAssociation() {
        return selectedAssociation;
    }

    public void setSelectedAssociation(AssociationsDetail selectedAssociation) {
        this.selectedAssociation = selectedAssociation;
    }

    public HistoryDetail getChange() {
        return change;
    }

    public void setChange(HistoryDetail change) {
        this.change = change;
    }

    public int getActiveFacilities() {
        return activeFacilities;
    }

    public void setActiveFacilities(int activeFacilities) {
        this.activeFacilities = activeFacilities;
    }

    public int getActiveAgents() {
        return activeAgents;
    }

    public void setActiveAgents(int activeAgents) {
        this.activeAgents = activeAgents;
    }

    private Number convertCurrenctTextToNumber(String amtSuretyBondOrSecurityText) {
        try{
            return formatter.parse(amtSuretyBondOrSecurityText); 
        } catch(ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private LocalDateTime convertTextToDateTime(String openDateText) {
        LocalDate ld = LocalDate.parse(openDateText, dateTimeFormatter);
        return ld.atStartOfDay();
    }

    public Conversion getConversion() {
        return conversion;
    }

    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
    }
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    public String getShowOtherPopup() {
        return showOtherPopup;
    }

    public void setShowOtherPopup(String showOtherPopup) {
        this.showOtherPopup = showOtherPopup;
    }
    
    public String getShowTypePopup() {
        return showTypePopup;
    }

    public void setShowTypePopup(String showTypePopup) {
        this.showTypePopup = showTypePopup;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }

    public ExamsDetail getSelectedExam() {
        return selectedExam;
    }

    public void setSelectedExam(ExamsDetail selectedExam) {
        this.selectedExam = selectedExam;
    }

    
    private List<InstitutionStaffDetail> sortByFirstAndLastName(List<InstitutionStaffDetail> institutionStaff) {
        return institutionStaff.stream().sorted(
                Comparator.comparing(InstitutionStaffDetail::getFirstName)
                        .thenComparing(InstitutionStaffDetail::getLastName)).collect(Collectors.toList());
    }

    public String getShowDupPopup() {
        return showDupPopup;
    }

    public void setShowDupPopup(String showDupPopup) {
        this.showDupPopup = showDupPopup;
    }

    public String getActiveTypePopup() {
        return activeTypePopup;
    }

    public void setActiveTypePopup(String activeTypePopup) {
        this.activeTypePopup = activeTypePopup;
    }
    
    
}
