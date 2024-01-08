package Lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise_4 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement ggSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']"));
        WebElement lucky = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='RNmpXc']"));
        WebElement gg = driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']//img[@class='lnXdpd']"));
    }
    @AfterTest
    public void afterTest() {

    }
}
