package com.xpanxion.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by cdorsey on 7/1/2015.
 */
public class AutomatedTest {

    private WebDriver driver;

    public static void main(String[] arts) {

        AutomatedTest test = new AutomatedTest();

        test.setup();

        test.successfulLoginLogout();
        test.missingRequiredField();

        test.tearDown();
    }

    private void tearDown() {
        driver.quit();
    }

    private void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cdorsey\\Desktop\\SeaShark34-master\\SeaShark34\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    protected void successfulLoginLogout() {
        driver.get("http://localhost:8080");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

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

        WebElement greeting = driver.findElement(By.tagName("h1")); //By.xpath("/html/body/h1")
        System.out.println(greeting.getText());

        WebElement logout = driver.findElement(By.tagName("a")); //By.linkText("Logout"));
        logout.click();

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
    }

    protected void missingRequiredField() {
        driver.get("http://localhost:8080/index.html");
        driver.findElement(By.name("guest")).submit();
        WebElement errorMessage = driver.findElement(By.className("error-message"));

        System.out.println(errorMessage.isDisplayed());
    }
}
