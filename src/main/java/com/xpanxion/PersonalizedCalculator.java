package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/24/2015.
 */
public class PersonalizedCalculator {
    public static void main(String[] args) {
        System.out.print("What is your name? ");

        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.next();
        System.out.print("Hello, " + name);

        System.out.println(". I can perform the following operations:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Select an option by numeric value? ");
        int operation = keyboard.nextInt();

        if(operation == 1) {
            System.out.println("");
            System.out.print("Please enter numbers separated by spaces: ");
            int addend = keyboard.nextInt();
            int augend = keyboard.nextInt();

            int sum = addend + augend;

            System.out.println("");
            System.out.print("Results: " + addend + " + " + augend + " = " + sum);

        } else if (operation == 2) {
            System.out.println("");
            System.out.print("Please enter numbers separated by spaces: ");
            int minend = keyboard.nextInt();
            int subend = keyboard.nextInt();

            int difference = minend - subend;

            System.out.println("");
            System.out.print("Results: " + minend + " - " + subend + " = " + difference);
        } else if (operation == 3) {
            System.out.println("");
            System.out.print("Please enter numbers separated by spaces: ");
            int multiplier = keyboard.nextInt();
            int mltiplicand = keyboard.nextInt();

            int product = multiplier * mltiplicand;

            System.out.println("");
            System.out.print("Results: " + multiplier + " * " + mltiplicand + " = " + product);
        } else if (operation == 4) {
            System.out.println("");
            System.out.print("Please enter numbers separated by spaces: ");
            int division = keyboard.nextInt();
            int divisionand = keyboard.nextInt();

            int quotient = division / divisionand;

            System.out.println("");
            System.out.print("Results: " + division + " / " + divisionand + " = " + quotient);
        } else {
            System.out.println(String.format("Invalid operation: %s", operation));
        }
    }
}
