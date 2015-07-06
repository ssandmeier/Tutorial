package com.xpanxion.automation;



import com.xpanxion.automation.pages.Application;
import com.xpanxion.automation.pages.CalculationPage;
import com.xpanxion.automation.pages.LoginPage;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by cdorsey on 7/1/2015.
 */
public class LoginLogoutScenarios {

    private LoginPage loginPage;
    private Application app;

    @Before
    public void setup() {
        app = new Application();
        loginPage = app.start();
        loginPage.navigateTo();
    }

    @After
    public void tearDown() {
        app = new Application();
        app.quit();
    }

    @Test
    public void successfulLoginLogout() {
        loginPage.verifyPageTitle("Web-based Personalized Calculator")
            .loginAs("Colt")
            .verifyDisplayGreeting("Hi, Colt")
            .logout()
            .verifyCurrentUrl();
    }

    @Test
    public void missingRequiredField() {
        loginPage.loginAs("");
        loginPage.verifyDisplayError();
    }
}
