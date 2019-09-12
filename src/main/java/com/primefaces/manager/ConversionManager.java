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
public class ConversionManager extends InHouseSystemBaseEJB {
    
    public Integer insertIntoConversion(Long institutionID, String oldType, String newType, String oldName, String newName, Date conversionDate, String note, String userId) {
          System.out.println("%%%%%%%%%%%%%%%%%%" +institutionID+" "+oldType+ " "+newType+" "+oldName+" "+newName+" "+conversionDate+" "+note+" "+userId);
    
        Integer result = 0;

       
        return result;    
    }

}
