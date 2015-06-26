package com.xpanxion;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Calculator {
    public static final int QUIT = 0;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;
    public static final int FACTORIAL = 5;

    public Calculation Calculator(int operation, String name, Scanner keyboard) {

        Operation oper = null;
        Calculation result = new Calculation();

        switch(operation) {
            case QUIT:
                result.setTextResult("\nGoodbye, " + name);

                break;

            case ADDITION:
                oper = new Addition();

                break;

            case SUBTRACTION:
                oper = new Subtraction();

                break;

            case MULTIPLICATION:
                oper = new Multiplication();

                break;

            case DIVISION:
                oper = new Division();

                break;
            case FACTORIAL:
                oper = new Factorial();

                break;
            default:
                System.out.println(String.format("\nInvalid operation: %s", operation));
                break;
        }

        if(oper != null) {
            result = oper.performOperation(keyboard);
        }

        return result;
    }

    public boolean supports(int requestedOperation) {
        return requestedOperation >= Calculator.ADDITION && requestedOperation <= Calculator.FACTORIAL;
    }
}
