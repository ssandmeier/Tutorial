package com.xpanxion.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by cdorsey on 7/6/2015.
 */
public class Application {
    private WebDriver driver;
    private static String webDriverKey = "webdriver.chrome.driver";
    private static String webDriverLocation = "C:\\Users\\cdorsey\\Desktop\\SeaShark34-master\\SeaShark34\\chromedriver.exe";

    public WebDriver getDriver() {
        return driver;
    }

    public LoginPage start() {
        System.setProperty(webDriverKey, webDriverLocation);
        driver = new ChromeDriver();
        return new LoginPage(driver);
    }

    public void quit() {
        driver.quit();
    }
}
