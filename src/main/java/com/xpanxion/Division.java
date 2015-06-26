package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Division extends BinaryOperation {

    public Division() {
        super("/");
    }

    public Calculation performOperation(Scanner keyboard) {
        int dividend = keyboard.nextInt();
        int divisor = keyboard.nextInt();

        Calculation result = new Calculation();

        if (divisor == 0) {
            System.out.println("You cannot divide by zero!");
        } else {
            int quotient = dividend / divisor;

            result = successfulCalculation(dividend, divisor, quotient);
        }

        return result;
    }
}
