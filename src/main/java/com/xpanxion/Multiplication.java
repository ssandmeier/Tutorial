package com.xpanxion;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Multiplication extends BinaryOperation {

    public Multiplication() {
        super("*");
    }

    protected long calculate(long multiplier, long multiplicand) {
        return multiplier * multiplicand;
    }


    protected boolean isValid(long multiplier, long multiplicand) {
        return true;
    }

    protected String errorMessage() {
        return null;
    }
}
