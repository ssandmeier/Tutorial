package com.xpanxion;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Addition extends BinaryOperation {

    public Addition() {
        super("+");
    }

    protected int calculate(int addEnd, int augEnd) {
        return addEnd + augEnd;
    }

    protected boolean isValid(int addEnd, int aguEnd) {
        return true;
    }

    protected String errorMessage() {
        return null;
    }
}
