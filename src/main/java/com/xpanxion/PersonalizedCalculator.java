package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/24/2015.
 */
public class PersonalizedCalculator {
    public static final int QUIT = 0;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;
    public static final int FACTORIAL = 5;

    private static void promptForNumbers() {
        System.out.println("");
        System.out.print("Please enter numbers separated by spaces: ");
    }

    private static void Calculator(int operation, String name, Scanner keyboard) {
        switch(operation) {
            case QUIT:
                System.out.println("Goodbye, " + name);
                break;

            case ADDITION:
                promptForNumbers();

                int addBeg = keyboard.nextInt();
                int addEnd = keyboard.nextInt();
                int sum = addBeg + addEnd;

                System.out.print("\nResults: " + addBeg + " + " + addEnd + " = " + sum + "\n");
                break;

            case SUBTRACTION:
                promptForNumbers();

                int minBeg= keyboard.nextInt();
                int subEnd = keyboard.nextInt();
                int difference = minBeg - subEnd;

                System.out.print("\nResults: " + minBeg + " - " + subEnd + " = " + difference + "\n");
                break;

            case MULTIPLICATION:
                promptForNumbers();

                int multiplier = keyboard.nextInt();
                int multiplicand = keyboard.nextInt();
                int product = multiplier * multiplicand;

                System.out.print("\nResults: " + multiplier + " * " + multiplicand + " = " + product + "\n");
                break;

            case DIVISION:
                promptForNumbers();

                int dividend = keyboard.nextInt();
                int divisor = keyboard.nextInt();

                if (divisor == 0) {
                    System.out.println("You cannot divide by zero!");
                } else {
                    int quotient = dividend / divisor;

                    System.out.print("\nResults: " + dividend + " / " + divisor + " = " + quotient + "\n");
                }
                break;
            case FACTORIAL:
                promptForNumbers();
                int factorial = keyboard.nextInt();
                int total = 1;

                for(int i = factorial; i > 0; i--) {
                    total *= i;
                }

                System.out.print("\nResults: " + factorial + "! = " + total + "\n");

                break;
            default:
                System.out.println(String.format("Invalid operation: %s", operation));
                break;
        }

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
        System.out.println(FACTORIAL + ") Factorial");
        System.out.println(QUIT + ") Quit");

        int operation = -1;

        while(operation != QUIT) {
            System.out.print("\nSelect an option by numeric value? ");
            operation = keyboard.nextInt();
            Calculator(operation, name, keyboard);
        }

    }
}
