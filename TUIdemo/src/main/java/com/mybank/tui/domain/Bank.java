package com.mybank.tui.domain;

import java.util.ArrayList;

/**
 *
 * @author taurus
 */
public class Bank {

    private static Bank myBank;
    private ArrayList<Customer> customers = new ArrayList<>();    

    private Bank() {}

    static {
        myBank = new Bank();
    }

    public static Bank getBank() {
        return myBank;
    }

    public static void addCustomer(String f, String l) {
        myBank.customers.add(new Customer(f, l));        
    }

    public static int getNumberOfCustomers() {
        return myBank.customers.size();
    }

    public static Customer getCustomer(int index) {
        return myBank.customers.get(index);
    }
}
