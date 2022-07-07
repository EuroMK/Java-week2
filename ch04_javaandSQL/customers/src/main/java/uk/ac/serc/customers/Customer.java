package uk.ac.serc.customers;

import java.util.ArrayList;

public class Customer {
    String customerID;
    String companyName;
    String contactName;
    String contactTitle;
    String address;
    String city;
    String region;
    String postalCode;
    String country;
    String phone;
    String fax;
    public Customer(String customerID, String companyName, String contactName, String contactTitle, String address,
            String city, String region, String postalCode, String country, String phone, String fax) {
        this.customerID = customerID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactTitle() {
        return contactTitle;
    }
    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
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
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    @Override
    public String toString() {
        return "Customer [address=" + address + ", city=" + city + ", companyName=" + companyName + ", contactName="
                + contactName + ", contactTitle=" + contactTitle + ", country=" + country + ", customerID=" + customerID
                + ", fax=" + fax + ", phone=" + phone + ", postalCode=" + postalCode + ", region=" + region + "]";
    }

}
