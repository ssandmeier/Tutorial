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

    private static Calculation Calculator(int operation, String name, Scanner keyboard) {
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

    public static void main(String[] args) {
        System.out.println("** Welcome to the personalized calculator **\n");
        System.out.print("What is your name? ");

        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.next();
        System.out.print("Hello, " + name);

        System.out.println(". I can perform the following operations:");
        System.out.println(QUIT + ") Quit");
        System.out.println(ADDITION + ") Addition");
        System.out.println(SUBTRACTION + ") Subtraction");
        System.out.println(MULTIPLICATION + ") Multiplication");
        System.out.println(DIVISION + ") Division");
        System.out.println(FACTORIAL + ") Factorial");

        int operation = -1;

        while(operation != QUIT) {
            System.out.print("\nSelect an option by numeric value? ");
            operation = keyboard.nextInt();

            if(operation >= ADDITION && operation <= FACTORIAL) {
                promptForNumbers();
            }

            Calculation answer = Calculator(operation, name, keyboard);
            System.out.println(answer.getTextResult());
        }

    }
}
