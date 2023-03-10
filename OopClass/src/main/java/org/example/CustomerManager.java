package org.example;

public class CustomerManager {
    private Customer _customer;
    ICreditManager _creditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }
    public void save(){
        System.out.println("Customer Saved: " );
    }
    public void delete(){
        System.out.println("Customer deleted: " );
    }

    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Credit Approved");
    }
}
