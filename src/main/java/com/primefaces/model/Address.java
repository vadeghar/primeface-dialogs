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
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long entityID;

    private String addressTypeCode;

    private String addressLine1;

    private String addressLine2;

    private String streetNumber;

    private String preDirectionTypeCode;

    private String streetName;

    private String streetTypeCode;

    private String postDirectionTypeCode;

    private String unit1TypeCode;

    private String unit1Number;

    private String unit2TypeCode;

    private String unit2Number;

    private String city;

    private String stateCode;

    private String zipcode;

    private String zipPlus4;

    private String countryCode;

    private String poBox;

    private String countyCode;

    private String createdByUserID;

    private String createDate;

    private String updatedByUserID;

    private String updateDate;

    private Long rowCurrencyNumber;

    public Long getEntityID() {
        return entityID;
    }

    public void setEntityID(Long entityID) {
        this.entityID = entityID;
    }

    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    public void setAddressTypeCode(String addressTypeCode) {
        this.addressTypeCode = addressTypeCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPreDirectionTypeCode() {
        return preDirectionTypeCode;
    }

    public void setPreDirectionTypeCode(String preDirectionTypeCode) {
        this.preDirectionTypeCode = preDirectionTypeCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetTypeCode() {
        return streetTypeCode;
    }

    public void setStreetTypeCode(String streetTypeCode) {
        this.streetTypeCode = streetTypeCode;
    }

    public String getPostDirectionTypeCode() {
        return postDirectionTypeCode;
    }

    public void setPostDirectionTypeCode(String postDirectionTypeCode) {
        this.postDirectionTypeCode = postDirectionTypeCode;
    }

    public String getUnit1TypeCode() {
        return unit1TypeCode;
    }

    public void setUnit1TypeCode(String unit1TypeCode) {
        this.unit1TypeCode = unit1TypeCode;
    }

    public String getUnit1Number() {
        return unit1Number;
    }

    public void setUnit1Number(String unit1Number) {
        this.unit1Number = unit1Number;
    }

    public String getUnit2TypeCode() {
        return unit2TypeCode;
    }

    public void setUnit2TypeCode(String unit2TypeCode) {
        this.unit2TypeCode = unit2TypeCode;
    }

    public String getUnit2Number() {
        return unit2Number;
    }

    public void setUnit2Number(String unit2Number) {
        this.unit2Number = unit2Number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipPlus4() {
        return zipPlus4;
    }

    public void setZipPlus4(String zipPlus4) {
        this.zipPlus4 = zipPlus4;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCreatedByUserID() {
        return createdByUserID;
    }

    public void setCreatedByUserID(String createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdatedByUserID() {
        return updatedByUserID;
    }

    public void setUpdatedByUserID(String updatedByUserID) {
        this.updatedByUserID = updatedByUserID;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Long getRowCurrencyNumber() {
        return rowCurrencyNumber;
    }

    public void setRowCurrencyNumber(Long rowCurrencyNumber) {
        this.rowCurrencyNumber = rowCurrencyNumber;
    }

}
