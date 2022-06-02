package com.mybank.tui.domain;

/**
 *
 * @author taurus
 */
public abstract class Account {

    protected double balance;

    protected Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    }

    public abstract boolean withdraw(double amt) throws OverDraftAmountException;

}
