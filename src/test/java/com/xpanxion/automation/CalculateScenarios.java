package com.xpanxion.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by cdorsey on 7/6/2015.
 */
public class CalculateScenarios {
    private WebDriver driver;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cdorsey\\Desktop\\SeaShark34-master\\SeaShark34\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void addition() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        String pageTitle = driver.getTitle();

        assertEquals("Web-based Personalized Calculator", pageTitle);


        WebElement guestField = driver.findElement(By.name("guest"));
        guestField.sendKeys("Colt");
        guestField.submit();

        ExpectedCondition<Boolean> pageIsLoaded = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(pageIsLoaded);

        WebElement comboBox = driver.findElement(By.name("operation"));
        Select operation = new Select(comboBox);

        operation.selectByVisibleText("Add");

        WebElement operands = driver.findElement(By.name("operands"));
        operands.sendKeys("1 2");
        operands.submit();

        WebElement results = driver.findElement(By.id("result-text"));
        assertEquals("Results: " + "1 + 2 = 3", results.getText());

    }
}
