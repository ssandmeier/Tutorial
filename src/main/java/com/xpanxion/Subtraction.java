package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Subtraction extends BinaryOperation {

    public Subtraction() {
        super("-");
    }
    public Calculation performOperation(Scanner keyboard) {
        int minBeg= keyboard.nextInt();
        int subEnd = keyboard.nextInt();
        int difference = minBeg - subEnd;

        return successfulCalculation(minBeg, subEnd, difference);
    }
}
