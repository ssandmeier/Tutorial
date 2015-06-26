package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Multiplication extends BinaryOperation {

    public Multiplication() {
        super("*");
    }
    public Calculation performOperation(Scanner keyboard) {
        int multiplier = keyboard.nextInt();
        int multiplicand = keyboard.nextInt();
        int product = multiplier * multiplicand;

        return successfulCalculation(multiplier, multiplicand, product);
    }
}
