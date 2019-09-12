/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.manager;

import java.util.Date;

import javax.inject.Named;

/**
 *
 * @author SXGURIJALA
 */
@Named
public class HistoryManager  {
       public Integer insertIntoHistory(Long institutionFacilityID, String changeType, String changeReason, String oldStatusCode, String newStatusCode,String oldInstFacilityName, String newInstFacilityName, String oldInstFacTypeCode, String newInstFacTypeCode, String oldCity, Date effectiveDate, String note, String createdByUserID) {
           
           System.out.println("%%%%%%%%%%%%%%%%%%" +institutionFacilityID+" "+changeType+ " "+changeReason+" "+oldStatusCode+" "+newStatusCode+" "+oldInstFacilityName+" "+newInstFacilityName+" "+oldInstFacTypeCode+" "+newInstFacTypeCode+" "+oldCity+" "+effectiveDate+" "+note+" "+createdByUserID);
        Integer result = 0;

      
        return result;    
    }
}
