package ua.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;

public class testsHomework {
    String URL = "https://www.google.com/?hl=en-US";
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void chromedriverURL(){
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void CloseBrowser(){
        driver.close();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("ithillel", Keys.ENTER);

        // driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//a/h3"));
        int i = 0;
        for (WebElement element : elements) {
            if (!element.getText().toLowerCase().contains("ithillel")) {
                System.out.println("Element with number " + i + " " + element.getText() + " doesn't containe \"hillel it school\"");
            }
            i++;
        }

    }

    @Test
    public void Test2() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Linkedin test", Keys.ENTER);
        //   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//a/h3"));
        int i = 0;
        for (WebElement element : elements) {
            if (!element.getText().toLowerCase().contains("linkedin test")) {
                System.out.println("Element with number " + i + " " + element.getText() + " doesn't containe \"hillel it school\"");
            }
            i++;
        }

    }
}
