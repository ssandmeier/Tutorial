package com.xpanxion;

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

        Calculation result = new Calculation();

        switch(operation) {
            case QUIT:
                result.setTextResult("Goodbye, " + name);
                break;

            case ADDITION:
                int addBeg = keyboard.nextInt();
                int addEnd = keyboard.nextInt();
                int sum = addBeg + addEnd;

                result.setTextResult("\nResults: " + addBeg + " + " + addEnd + " = " + sum);
                break;

            case SUBTRACTION:
                int minBeg= keyboard.nextInt();
                int subEnd = keyboard.nextInt();
                int difference = minBeg - subEnd;

                result.setTextResult("\nResults: " + minBeg + " - " + subEnd + " = " + difference);
                break;

            case MULTIPLICATION:
                int multiplier = keyboard.nextInt();
                int multiplicand = keyboard.nextInt();
                int product = multiplier * multiplicand;


                result.setTextResult("\nResults: " + multiplier + " * " + multiplicand + " = " + product);
                break;

            case DIVISION:
                int dividend = keyboard.nextInt();
                int divisor = keyboard.nextInt();

                if (divisor == 0) {
                    System.out.println("You cannot divide by zero!");
                } else {
                    int quotient = dividend / divisor;

                    result.setTextResult("\nResults: " + dividend + " / " + divisor + " = " + quotient);
                }
                break;
            case FACTORIAL:
                int factorial = keyboard.nextInt();
                int total = 1;

                for(int i = factorial; i > 0; i--) {
                    total *= i;
                }

                result.setTextResult("\nResults: " + factorial + "! = " + total);

                break;
            default:
                System.out.println(String.format("Invalid operation: %s", operation));
                break;
        }
        return result;
    }

    public boolean supports(int requestedOperation) {
        return requestedOperation >= Calculator.ADDITION && requestedOperation <= Calculator.FACTORIAL;
    }
}
