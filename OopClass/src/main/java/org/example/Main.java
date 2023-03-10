package org.example;

public class Main {
    public static void main(String[] args) {

//        CreditManager creditManager = new CreditManager();
//        creditManager.Calculate();
//        creditManager.Calculate();
//        creditManager.Save();
//
//        Customer customer = new Customer();
//        customer.Id = 1;
//        customer.City = "Ankara";
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.Save();
//        customerManager.Delete();
//
//        Company company = new Company();
//        company.TaxNumber = "1012312";
//        company.CompanyName = "Arcelik";
//        company.Id = 100;
//
//        CustomerManager customerManager1 = new CustomerManager(company);
//
//        Person person = new Person();
//        person.FirstName = "Engin";
//        person.NationalIdentity = "123456";
//
//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();
    }
}