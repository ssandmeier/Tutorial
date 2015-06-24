package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/24/2015.
 */
public class PersonalizedCalculator {
    public static void main(String[] args) {
        System.out.println("What is your name?");

        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.next();
        System.out.println("Hello, " + name);

        System.out.println("");
        System.out.print("Please enter numbers separated by spaces: ");
        int addend = keyboard.nextInt();
        int augend = keyboard.nextInt();

        int sum = addend + augend;

        System.out.println("");
        System.out.print("Results: ");
        System.out.println("    " + addend + " + " + augend + " = " + sum);
    }
}
