package org.example;

public class Person extends Customer{
    private String NationalIdentity;
    private String FirstName;
    private String LastName;

    public String getFirstName() {return FirstName;}
    public void setFirstName(String name) {this.FirstName = name;}
    public String getLastName() {return LastName;}
    public void setLastName(String name) {this.LastName = name;}
    public String getNationalIdentity() {return NationalIdentity;}
    public void setNationalIdentity(String identity) {this.NationalIdentity = identity;}
}
