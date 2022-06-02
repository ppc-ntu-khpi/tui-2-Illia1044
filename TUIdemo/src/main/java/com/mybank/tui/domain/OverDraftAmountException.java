package com.mybank.tui.domain;

/**
 *
 * @author taurus
 */
public class OverDraftAmountException extends Exception {

    private double deficit;

    public OverDraftAmountException(double deficit, String message) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

}
