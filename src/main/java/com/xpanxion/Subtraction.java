package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Subtraction {
    public Calculation performOperation(Scanner keyboard) {
        int minBeg= keyboard.nextInt();
        int subEnd = keyboard.nextInt();
        int difference = minBeg - subEnd;

        Calculation result = new Calculation();

        result.setTextResult("\nResults: " + minBeg + " - " + subEnd + " = " + difference);
        return result;
    }
}
