package com.xpanxion;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Subtraction extends BinaryOperation {

    public Subtraction() {
        super("-");
    }

    protected long calculate(long minBeg, long minEnd) {
        return minBeg - minEnd;
    }

    protected boolean isValid(long minBeg, long minEnd) {
        return true;
    }

    protected String errorMessage() {
        return null;
    }
}
