package uk.ac.serc.customers;

import java.util.ArrayList;

public class Customer {
    String CustomerID;
    String CompanyName;
    String ContactName;
    String ContactTitle;
    String Address;
    String City;
    String Region;
    String PostalCode;
    String Country;
    String Phone;
    String Fax;
    
    public Customer(String customerID, String companyName, String contactName, String contactTitle, String address,
            String city, String region, String postalCode, String country, String phone, String fax) {
        CustomerID = customerID;
        CompanyName = companyName;
        ContactName = contactName;
        ContactTitle = contactTitle;
        Address = address;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
        Fax = fax;
    }
    public String getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }
    public String getCompanyName() {
        return CompanyName;
    }
    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
    public String getContactName() {
        return ContactName;
    }
    public void setContactName(String contactName) {
        ContactName = contactName;
    }
    public String getContactTitle() {
        return ContactTitle;
    }
    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getRegion() {
        return Region;
    }
    public void setRegion(String region) {
        Region = region;
    }
    public String getPostalCode() {
        return PostalCode;
    }
    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    public String getFax() {
        return Fax;
    }
    public void setFax(String fax) {
        Fax = fax;
    }
    @Override
    public String toString() {
        return "Customer [Address=" + Address + ", City=" + City + ", CompanyName=" + CompanyName + ", ContactName="
                + ContactName + ", ContactTitle=" + ContactTitle + ", Country=" + Country + ", CustomerID=" + CustomerID
                + ", Fax=" + Fax + ", Phone=" + Phone + ", PostalCode=" + PostalCode + ", Region=" + Region + "]";
    }

    
}
