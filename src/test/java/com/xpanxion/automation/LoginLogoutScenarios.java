package com.xpanxion.automation;



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
    public void successfulLoginLogout() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cdorsey\\Desktop\\SeaShark34-master\\SeaShark34\\chromedriver.exe");

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

        WebElement greeting = driver.findElement(By.tagName("h1")); //By.xpath("/html/body/h1")
        assertEquals("Hi, Colt", greeting.getText());


        WebElement logout = driver.findElement(By.tagName("a")); //By.linkText("Logout"));
        logout.click();

        String currentURL = driver.getCurrentUrl();
        assertEquals("http://localhost:8080/index.html", currentURL);
    }

    @Test
    public void missingRequiredField() {
        driver.get("http://localhost:8080/index.html");
        driver.findElement(By.name("guest")).submit();
        WebElement errorMessage = driver.findElement(By.className("error-message"));

        assertEquals(true, errorMessage.isDisplayed());
    }
}
