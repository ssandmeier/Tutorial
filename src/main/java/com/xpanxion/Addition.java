package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Addition extends BinaryOperation {

    public Addition() {
        super("+");
    }

    public Calculation performOperation(Scanner keyboard) {

        int addBeg = keyboard.nextInt();
        int addEnd = keyboard.nextInt();
        int sum = addBeg + addEnd;

        return successfulCalculation(addBeg, addEnd, sum);
    }
}
