package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Factorial extends BinaryOperation {

    public Factorial() {
        super("!");
    }

    public Calculation performOperation(Scanner keyboard) {
        int factorial = keyboard.nextInt();
        int total = 1;

        for(int i = factorial; i > 0; i--) {
            total *= i;
        }

        return successfulCalculation(factorial,0,total);
    }
}
