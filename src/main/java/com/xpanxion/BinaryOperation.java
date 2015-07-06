package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/26/2015.
 */
public abstract class BinaryOperation implements Operation {
    private String operation;

    public BinaryOperation(String op) {
        operation = op;
    }

    protected abstract long calculate(long leftHandSide, long rightHandSide);
    protected abstract boolean isValid(long leftHandSide, long rightHandSide);
    protected abstract String errorMessage();

    public Calculation successfulCalculation(long LeftHandSide, long RightHandSide, long result) {

        Calculation calculation = new Calculation();

        if(operation == "!") {
            calculation.setTextResult("\nResults: " + LeftHandSide + operation + " = " + result);
        } else {
            calculation.setTextResult("\nResults: " + LeftHandSide + " " + operation  + " " + RightHandSide + " = " + result);
        }

        return calculation;
    }
    public Calculation invalidCalculation(String errorMessage) {
        Calculation result = new Calculation();
        result.setTextResult(errorMessage);
        return result;
    }
    public Calculation performOperation(Scanner keyboard) {

        long leftHandSide = keyboard.nextLong();
        long rightHandSide = keyboard.nextLong();

        if(isValid(leftHandSide, rightHandSide)) {
            long result = calculate(leftHandSide,rightHandSide);
            return successfulCalculation(leftHandSide, rightHandSide, result);
        } else {
            return invalidCalculation(errorMessage());
        }
    }
}
