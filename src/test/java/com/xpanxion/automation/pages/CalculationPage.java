package com.xpanxion.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

/**
 * Created by cdorsey on 7/6/2015.
 */
public class CalculationPage {
    private WebDriver driver;

    public CalculationPage(WebDriver driver) {
        this.driver = driver;
    }

    public CalculationPage verifyDisplayGreeting(String greetingText) {
        WebElement greeting = driver.findElement(By.tagName("h1")); //By.xpath("/html/body/h1")
        assertEquals(greetingText, greeting.getText());
        return this;
    }

    public CalculationPage verifyDisplayResults(String expectedResults) {
        WebElement results = driver.findElement(By.id("result-text"));
        assertEquals(expectedResults, results.getText());
        return this;
    }

    public LoginPage logout() {
        WebElement logout = driver.findElement(By.tagName("a")); //By.linkText("Logout"));
        logout.click();
        return new LoginPage(driver);
    }

    public CalculationPage performCalculation(String operationText, String operandsText) {
        WebElement comboBox = driver.findElement(By.name("operation"));
        Select operation = new Select(comboBox);
        operation.selectByVisibleText(operationText);

        WebElement operands = driver.findElement(By.name("operands"));
        operands.sendKeys(operandsText);
        operands.submit();
        return this;
    }
}
