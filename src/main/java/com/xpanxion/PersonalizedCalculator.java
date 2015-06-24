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
        System.out.print("What would you like to do? ");
        int operation = keyboard.nextInt();

        if(operation == 1) {
            System.out.println("");
            System.out.print("Please enter numbers separated by spaces: ");
            int addend = keyboard.nextInt();
            int augend = keyboard.nextInt();

            int sum = addend + augend;

            System.out.println("");
            System.out.print("Results: " + addend + " + " + augend + " = " + sum);
        } else {
            System.out.println(String.format("Invalid operation: %s", operation));
        }
    }
}
