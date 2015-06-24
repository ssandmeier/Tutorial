package com.xpanxion;

import org.junit.Assert;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/24/2015.
 */
public class PersonalizedCalculator {
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;

    private static void promptForNumbers() {
        System.out.println("");
        System.out.print("Please enter numbers separated by spaces: ");
    }

    public static void main(String[] args) {
        System.out.println("** Welcome to the personalized calculator **\n");
        System.out.print("What is your name? ");

        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.next();
        System.out.print("Hello, " + name);

        System.out.println(". I can perform the following operations:");
        System.out.println(ADDITION + ") Addition");
        System.out.println(SUBTRACTION + ") Subtraction");
        System.out.println(MULTIPLICATION + ") Multiplication");
        System.out.println(DIVISION + ") Division");
        System.out.print("Select an option by numeric value? ");

        int operation = keyboard.nextInt();

        switch(operation) {
            case ADDITION:
                promptForNumbers();

                int addBeg = keyboard.nextInt();
                int addEnd = keyboard.nextInt();
                int sum = addBeg + addEnd;

                System.out.print("\nResults: " + addBeg + " + " + addEnd + " = " + sum);
                break;

            case SUBTRACTION:
                promptForNumbers();

                int minBeg= keyboard.nextInt();
                int subEnd = keyboard.nextInt();
                int difference = minBeg - subEnd;

                System.out.print("\nResults: " + minBeg + " - " + subEnd + " = " + difference);
                break;

            case MULTIPLICATION:
                promptForNumbers();

                int multiplier = keyboard.nextInt();
                int multiplicand = keyboard.nextInt();
                int product = multiplier * multiplicand;

                System.out.print("\nResults: " + multiplier + " * " + multiplicand + " = " + product);
                break;

            case DIVISION:
                promptForNumbers();

                int dividend = keyboard.nextInt();
                int divisor = keyboard.nextInt();

                if (divisor == 0) {
                    System.out.println("You cannot divide by zero!");
                } else {
                    int quotient = dividend / divisor;

                    System.out.print("\nResults: " + dividend + " / " + divisor + " = " + quotient);
                }
                break;

            default:
                System.out.println(String.format("Invalid operation: %s", operation));
                break;
        }
    }
}
