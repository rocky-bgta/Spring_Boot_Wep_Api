package com.nybsys.tillboxweb.models.user.registration;

import java.util.Objects;

public class CountryModel {
    private Integer countryID;
    private String countryCode;
    private String name;

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryModel)) return false;
        CountryModel that = (CountryModel) o;
        return Objects.equals(countryID, that.countryID) &&
                Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryID, countryCode, name);
    }

    @Override
    public String toString() {
        return "CountryModel{" +
                "countryID=" + countryID +
                ", countryCode='" + countryCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }



}
