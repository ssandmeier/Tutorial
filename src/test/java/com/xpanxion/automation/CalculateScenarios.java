package com.xpanxion.automation;

import com.xpanxion.automation.pages.Application;
import org.junit.Test;


/**
 * Created by cdorsey on 7/6/2015.
 */
public class CalculateScenarios {
    Application app = new Application();

    @Test
    public void addingLargeNumbersCausesError() {
        app.start()
                .loginAs("Colt")
                .performCalculation("Add", "9999999999 1")
                .verifyDisplayResults("Results: 9999999999 + 1 = 10000000000");

        app.quit();
    }
    @Test
    public void addition() {
        app.start()
                .loginAs("Colt")
                .performCalculation("Add", "1 2")
                .verifyDisplayResults("Results: 1 + 2 = 3");

        app.quit();
    }

    @Test
    public void subtraction() {
        app.start()
                .loginAs("Colt")
                .performCalculation("Subtract", "4 3")
                .verifyDisplayResults("Results: 4 - 3 = 1");

        app.quit();
    }

    @Test
    public void multiplication() {
        app.start()
                .loginAs("Colt")
                .performCalculation("Multiply", "1 2")
                .verifyDisplayResults("Results: 1 * 2 = 2");

        app.quit();
    }

    @Test
    public void division() {
        app.start()
                .loginAs("Colt")
                .performCalculation("Divide", "4 2")
                .verifyDisplayResults("Results: 4 / 2 = 2");

        app.quit();
    }

    @Test
    public void factorial() {
        app.start()
                .loginAs("Colt")
                .performCalculation("Factorial", "5 ")
                .verifyDisplayResults("Results: 5! = 120");

        app.quit();
    }
}
