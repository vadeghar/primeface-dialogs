/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.manager;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.primefaces.model.Address;
import com.primefaces.model.AgentsDetail;
import com.primefaces.model.ApplicationsDetail;
import com.primefaces.model.AssociationsDetail;
import com.primefaces.model.BanksServicedDetail;
import com.primefaces.model.ComplaintsDetail;
import com.primefaces.model.CorrespondenceDetail;
import com.primefaces.model.DBADetail;
import com.primefaces.model.EmailDetail;
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


/**
 *
 * @author SXGURIJALA
 */
@Named
public class InstitutionManager  {
    
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
      SimpleDateFormat dateFormatMMDDYYYY = new SimpleDateFormat("MM/dd/yyyy");

    public List<InstitutionSearch> getSearchResults(InstitutionSearch institutionSearch) {

        List<InstitutionSearch> results = new ArrayList<>();

      
        return results;
    }
    
     public String getPhysicalAddress(Long institutionID) {
                
        String result = null;
       
                return result;
    } 
     
      public String getPrimaryPhone(Long institutionID) {
                
        String result = null;
       
                return result;
    } 

       public String getCaseLoadManager(Long institutionID) {
                
        String result = null;
       
                return result;
    } 

     public Institution getInstitutionResults(Long institutionID) {
                

         Institution results = new Institution();
        
                return results;
    }
     
        public List<Address> getAddressResults(Long institutionID) {
                

         List<Address> results = new ArrayList<>();
         
                return results;
    }
        
   
        public List<ApplicationsDetail> getApplicationsResults(Long institutionID) {
                

         List<ApplicationsDetail> results = new ArrayList<>();
                return results;
    }
        
   
        
   public List<AssociationsDetail> getAssociationsResults(Long institutionID) {
                

         List<AssociationsDetail> results = new ArrayList<>();
                return results;
    }
   
      public List<AssociationsDetail> getAssociationBankResults(Long entityID) {
                

         List<AssociationsDetail> results = new ArrayList<>();
                return results;
    }
      
   public List<AgentsDetail> getAgentsResults(Long institutionID) {
                

         List<AgentsDetail> results = new ArrayList<>();
                return results;
    }
       
    public List<BanksServicedDetail> getServicedBankResults(Long institutionID) {
                

         List<BanksServicedDetail> results = new ArrayList<>();
                return results;
    }
   
  
    public List<ComplaintsDetail> getComplaintsResults(Long institutionID) {
                

         List<ComplaintsDetail> results = new ArrayList<>();
            return results;
    }
        
    
      public List<CorrespondenceDetail> getCorrespondenceResults(Long institutionID) {
                

         List<CorrespondenceDetail> results = new ArrayList<>();
                return results;
    }
        
    
      public List<DBADetail> getDBAResults(Long institutionID) {
                

         List<DBADetail> results = new ArrayList<>();
                return results;
    }  
      
        public List<EmailDetail> getEmailResults(Long institutionID) {
                

         List<EmailDetail> results = new ArrayList<>();
           return results;
    }  
        
        
    public List<EnforcementsDetail> getEnforcementsResults(Long institutionID) {
                

         List<EnforcementsDetail> results = new ArrayList<>();
           return results;
    }  
    
        public List<ExamsDetail> getExamsResults(Long institutionID) {
                

         List<ExamsDetail> results = new ArrayList<>();
           return results;
    }  
    
        public List<ExamsDetail> getExamsLast9Results(Long institutionID) {
                

         List<ExamsDetail> results = new ArrayList<>();
           return results;
    }  
    
    public List<FacilitiesDetail> getFacilitiesResults(Long institutionID) {
                    

         List<FacilitiesDetail> results = new ArrayList<>();
            return results;
   }  
        
   
     public List<HistoryDetail> getHistoryResults(Long institutionID) {
                    

         List<HistoryDetail> results = new ArrayList<>();
                return results;
    }  
     
     
           
       
     public List<InstitutionStaffDetail> getStaffResults(Long institutionID, String status) {
                    

         List<InstitutionStaffDetail> results = new ArrayList<>();
         System.out.println("+++++Status for Institution Staff++++++"+status);
                return results;
    }  
  
      public List<InstitutionStaffDetail> getBodStaffResults(Long institutionID, String status) {
               

         List<InstitutionStaffDetail> results = new ArrayList<>();
                return results;
    }  
      
     public List<NotesDetail> getNotesResults(Long institutionID) {
                    

         List<NotesDetail> results = new ArrayList<>();
           return results;
    }  
         
             
     public List<PhoneDetail> getPhoneResults(Long institutionID) {
                    

         List<PhoneDetail> results = new ArrayList<>();
                return results;
    }  
     
       public List<ServicesDetail> getServicesResults(Long institutionID) {
                    

         List<ServicesDetail> results = new ArrayList<>();
                return results;
    }  
                      
    public List<SupervisoryStaffDetail> getSuperStaffResults(Long institutionID) {
                    

         List<SupervisoryStaffDetail> results = new ArrayList<>();
                return results;
    }  

    public Integer getAddInstitution(String userID, String institutionName, String typeCode) {
               
        Integer result = 0;

        return result;

    }
    
       public Integer checkDuplicateInstitution(Long institutionID, String institutionName) {
               
        Integer result = 0;

        return result;

    }
       
    public Integer validateRSSD(Long institutionID, Long rssdNumber) {
        Integer result = 0;

        return result;    
    }
    
       public Integer validateFDIC(Long institutionID, Long fdicNumber) {
        Integer result = 0;

        return result;    
    }
          
      public Integer updateInstitution(Institution institution) { 
        Integer result = 0;
        return result;

    }
}
