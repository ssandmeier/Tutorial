package com.xpanxion.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by cdorsey on 7/6/2015.
 */
public class LoginPage {
    private WebDriver driver;
    private static final String LOGIN_PAGE = "http://localhost:8080/index.html";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage verifyPageTitle(String title) {
        String pageTitle = driver.getTitle();
        assertEquals(title, pageTitle);
        return this;
    }

    public LoginPage verifyCurrentUrl() {
        String currentURL = driver.getCurrentUrl();
        assertEquals(LOGIN_PAGE, currentURL);
        return this;
    }

    public LoginPage verifyDisplayError() {
        WebElement errorMessage = driver.findElement(By.className("error-message"));
        assertEquals(true, errorMessage.isDisplayed());
        return this;
    }
    public LoginPage navigateTo() {
        driver.get("http://localhost:8080");
        return this;
    }

    public CalculationPage loginAs(String user) {
        navigateTo();
        String pageTitle = driver.getTitle();

        assertEquals("Web-based Personalized Calculator", pageTitle);

        WebElement guestField = driver.findElement(By.name("guest"));
        guestField.sendKeys(user);
        guestField.submit();

        ExpectedCondition<Boolean> pageIsLoaded = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(pageIsLoaded);

        return new CalculationPage(driver);
    }
}
