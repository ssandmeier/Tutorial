package com.xpanxion;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Multiplication extends BinaryOperation {

    public Multiplication() {
        super("*");
    }

    protected int calculate(int multiplier, int multiplicand) {
        return multiplier * multiplicand;
    }


    protected boolean isValid(int multiplier, int multiplicand) {
        return true;
    }

    protected String errorMessage() {
        return null;
    }
}
