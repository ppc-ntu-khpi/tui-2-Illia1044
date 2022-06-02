package com.mybank.tui.domain;

/**
 *
 * @author taurus
 */
public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    
    public void accumulateInterest(){
        balance=balance+balance*interestRate;
    }

    @Override
    public boolean withdraw(double amt) throws OverDraftAmountException {
        if (balance>=amt)
        {
            balance=balance-amt;
            return true;
        }
        else
            throw new OverDraftAmountException(amt-balance, "ERROR! Not Sufficient funds!");
    }

  
}
