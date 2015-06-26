package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/26/2015.
 */
public abstract class BinaryOperation {
    private String operation;

    public BinaryOperation(String op) {
        operation = op;
    }

    protected abstract int calculate(int leftHandSide, int rightHandSide);
    protected abstract boolean isValid(int leftHandSide, int rightHandSide);
    protected abstract String errorMessage();

    public Calculation successfulCalculation(int LeftHandSide, int RightHandSide, int result) {

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

        int leftHandSide = keyboard.nextInt();
        int rightHandSide = keyboard.nextInt();

        if(isValid(leftHandSide, rightHandSide)) {
            int result = calculate(leftHandSide,rightHandSide);
            return successfulCalculation(leftHandSide, rightHandSide, result);
        } else {
            return invalidCalculation(errorMessage());
        }
    }
}
