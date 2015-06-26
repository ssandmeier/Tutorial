package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Division extends BinaryOperation {

    public Division() {
        super("/");
    }
    
    protected int calculate(int dividend, int divisor) {
        return dividend / divisor;
    }


    protected boolean isValid(int dividend, int divisor) {
        return divisor != 0;
    }

    protected String errorMessage() {
         return "\nYou cannot divide by zero!";
    }
}
