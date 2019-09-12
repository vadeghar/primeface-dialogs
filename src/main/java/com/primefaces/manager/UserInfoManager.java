/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.manager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.primefaces.model.Employee;

/**
 *
 * @author SXGURIJALA
 */
@Named
public class UserInfoManager  {

    public Integer verifyUserId(String userId) {

        Integer result = 0;

       
        return result;
    }

    public Employee getResult(String username) {


        Employee result = null;

       

        return result;
    }
    
     public Employee getEmployeeInfo(String userID) {
                

         List<Employee> results = new ArrayList<>();
         
                return results.get(0);
}
}
