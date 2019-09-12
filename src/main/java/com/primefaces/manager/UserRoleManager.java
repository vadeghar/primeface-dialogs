/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.manager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.primefaces.model.UserRole;

/**
 *
 * @author SXGURIJALA
 */
@Named
public class UserRoleManager   {
   
      @SuppressWarnings("unchecked")
    public UserRole getUserRoles(Long personID) {
         List<UserRole> results = new ArrayList<>();
                return results.get(0);
}
}
