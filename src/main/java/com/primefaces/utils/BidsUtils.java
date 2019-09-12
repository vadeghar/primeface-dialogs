/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sxgurijala
 */
public class BidsUtils {
    
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
    public static SimpleDateFormat dateFormatMMDDYYYY = new SimpleDateFormat("MM/dd/yyyy");

    public static  Date convertToDate(String dateStr) {
       if(StringUtils.isNotBlank(dateStr)) {
            try{
                return dateFormatMMDDYYYY.parse(dateStr); 
            }catch(Exception e) {
                e.printStackTrace();
                try{
                    System.out.println("Trying for another format conversion : "+dateStr);
                    return dateFormat.parse(dateStr);
                }catch(Exception pe) {
                    System.out.println("Unable to convert date : "+dateStr);
                    pe.printStackTrace();
                    return null;
                }
            }
        }
       return null;
   }
    
   public static Date getCurrentDateTime() {
     Date date = new Date();
     System.out.println("Current date"+date);
        return date;
    }
}
