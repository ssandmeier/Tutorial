package com.xpanxion;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Subtraction extends BinaryOperation {

    public Subtraction() {
        super("-");
    }

    protected int calculate(int minBeg, int minEnd) {
        return minBeg - minEnd;
    }

    protected boolean isValid(int minBeg, int minEnd) {
        return true;
    }

    protected String errorMessage() {
        return null;
    }
}
