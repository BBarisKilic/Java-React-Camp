package com.example.day3_inheritance;

public class Main {

    public static void main(String[] args) {
        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "12345";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "45678";

        UnionCustomer abc = new UnionCustomer();
        abc.customerNumber = "15789";

        CustomerManager customerManager = new CustomerManager();
        //customerManager.add(engin);
        //customerManager.add(hepsiBurada);

        Customer[] customers = {engin,hepsiBurada,abc};

        customerManager.addMultiple(customers);
    }
}
