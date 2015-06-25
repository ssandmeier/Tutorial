package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Factorial {
    public Calculation performOperation(Scanner keyboard) {
        int factorial = keyboard.nextInt();
        int total = 1;

        Calculation result = new Calculation();

        for(int i = factorial; i > 0; i--) {
            total *= i;
        }

        result.setTextResult("\nResults: " + factorial + "! = " + total);

        return result;
    }
}
