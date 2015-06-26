package com.xpanxion;

/**
 * Created by cdorsey on 6/26/2015.
 */
public class BinaryOperation {
    private String operation;

    public BinaryOperation(String op) {
        operation = op;
    }

    public Calculation successfulCalculation(int LeftHandSide, int RightHandSide, int result) {

        Calculation calculation = new Calculation();

        if(operation == "!") {
            calculation.setTextResult("\nResults: " + LeftHandSide + operation + " = " + result);
        } else {
            calculation.setTextResult("\nResults: " + LeftHandSide + " " + operation  + " " + RightHandSide + " = " + result);
        }
        
        return calculation;
    }
}
