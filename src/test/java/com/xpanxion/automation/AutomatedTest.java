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
    public static void main(String[] arts) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cdorsey\\Desktop\\SeaShark34-master\\SeaShark34\\chromedriver.exe");
        final WebDriver driver = new ChromeDriver();

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

        WebElement greeting = driver.findElement(By.tagName("h1"));
        System.out.println(greeting.getText());

        driver.quit();
    }
}
