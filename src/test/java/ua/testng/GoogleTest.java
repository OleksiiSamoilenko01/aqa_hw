package ua.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleTest {
    @Test
    public void SearchTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Assert.assertEquals(driver.getTitle(), "Google", "String not match");

        driver.quit();
    }
}
