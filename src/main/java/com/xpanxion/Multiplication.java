package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Multiplication {
    public Calculation performOperation(Scanner keyboard) {
        int multiplier = keyboard.nextInt();
        int multiplicand = keyboard.nextInt();
        int product = multiplier * multiplicand;

        Calculation result = new Calculation();

        result.setTextResult("\nResults: " + multiplier + " * " + multiplicand + " = " + product);
        return result;
    }
}
