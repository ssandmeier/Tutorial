package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Division extends BinaryOperation {

    public Division() {
        super("/");
    }
    
    protected long calculate(long dividend, long divisor) {
        return dividend / divisor;
    }


    protected boolean isValid(long dividend, long divisor) {
        return divisor != 0;
    }

    protected String errorMessage() {
         return "\nYou cannot divide by zero!";
    }
}
