package com.xpanxion.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by cdorsey on 7/1/2015.
 */
public class AutomatedTest {
    public static void main(String[] arts) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cdorsey\\Desktop\\SeaShark34-master\\SeaShark34\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.xpanxion.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        driver.quit();
    }
}
