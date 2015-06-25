package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/24/2015.
 */
public class PersonalizedCalculator {
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
        System.out.println(Calculator.QUIT + ") Quit");
        System.out.println(Calculator.ADDITION + ") Addition");
        System.out.println(Calculator.SUBTRACTION + ") Subtraction");
        System.out.println(Calculator.MULTIPLICATION + ") Multiplication");
        System.out.println(Calculator.DIVISION + ") Division");
        System.out.println(Calculator.FACTORIAL + ") Factorial");

        int operation = -1;
        Calculator calc = new Calculator();
        while(operation != Calculator.QUIT) {
            System.out.print("\nSelect an option by numeric value? ");
            operation = keyboard.nextInt();

            if(calc.supports(operation)) {
                promptForNumbers();
            }

            Calculation answer = calc.Calculator(operation, name, keyboard);
            System.out.println(answer.getTextResult());
        }

    }
}
