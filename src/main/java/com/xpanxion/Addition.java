package com.xpanxion;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Addition extends BinaryOperation {

    public Addition() {
        super("+");
    }

    protected long calculate(long addEnd, long augEnd) {
        return addEnd + augEnd;
    }

    protected boolean isValid(long addEnd, long aguEnd) {
        return true;
    }

    protected String errorMessage() {
        return null;
    }
}
