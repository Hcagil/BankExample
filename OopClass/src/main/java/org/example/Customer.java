package org.example;

public class Customer {
    public Customer(){
        System.out.println("Customer Initiated");
    }
    private int Id;
    private String City;

    public int getId() {return Id;}
    public void setId(int id) {this.Id = id;}
    public String getCity() {return City;}
    public void setCity(String cityname) {this.City = cityname;}
}
