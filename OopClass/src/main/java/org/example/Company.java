package org.example;

public class Company extends Customer{
    private String TaxNumber;
    private String CompanyName;

    public String getTaxNumber() {return TaxNumber;}
    public void setTaxNumber(String taxNumber) {this.TaxNumber = taxNumber;}
    public String getCompanyName() {return CompanyName;}
    public void setCompanyName(String companyName) {this.CompanyName = companyName;}
}
