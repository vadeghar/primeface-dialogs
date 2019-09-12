/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import java.io.Serializable;

/**
 *
 * @author SXGURIJALA
 */

public class AssociationsDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    private String associationName;
    private String entityID;
    private String assocTypeDesc;
    private String roleTypeDesc;
    private String bankName;
    private String address;
    private String city;
    
   
    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getAssocTypeDesc() {
        return assocTypeDesc;
    }

    public void setAssocTypeDesc(String assocTypeDesc) {
        this.assocTypeDesc = assocTypeDesc;
    }

    public String getRoleTypeDesc() {
        return roleTypeDesc;
    }

    public void setRoleTypeDesc(String roleTypeDesc) {
        this.roleTypeDesc = roleTypeDesc;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public int getRowKey() {
        return this.hashCode();
    }
    
    
    
    
 
}
