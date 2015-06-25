package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/25/2015.
 */
public class Addition {
    public Calculation performOperation(Scanner keyboard) {

        int addBeg = keyboard.nextInt();
        int addEnd = keyboard.nextInt();
        int sum = addBeg + addEnd;

        Calculation result = new Calculation();
        result.setTextResult("\nResults: " + addBeg + " + " + addEnd + " = " + sum);

        return result;
    }
}
