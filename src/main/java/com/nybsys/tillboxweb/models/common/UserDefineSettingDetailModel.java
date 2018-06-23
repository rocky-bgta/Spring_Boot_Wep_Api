/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/16/2018
 * Time: 12:33 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.common;


import java.util.Objects;

public class UserDefineSettingDetailModel{

    private Integer userDefinedSettingDetailsID;
    private Integer businessID;
    private Integer userDefinedSettingsID;
    private Integer referenceID;
    private Integer referenceType;
    private String value;

    public Integer getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(Integer referenceType) {
        this.referenceType = referenceType;
    }

    public Integer getUserDefinedSettingDetailsID() {
        return userDefinedSettingDetailsID;
    }

    public void setUserDefinedSettingDetailsID(Integer userDefinedSettingDetailsID) {
        this.userDefinedSettingDetailsID = userDefinedSettingDetailsID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getUserDefinedSettingsID() {
        return userDefinedSettingsID;
    }

    public void setUserDefinedSettingsID(Integer userDefinedSettingsID) {
        this.userDefinedSettingsID = userDefinedSettingsID;
    }

    public Integer getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(Integer referenceID) {
        this.referenceID = referenceID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
