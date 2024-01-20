package Lesson_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise_2 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement oneWayTab = driver.findElement(By.xpath("//input[@a='one-way-tab']"));
        WebElement roundTripTab = driver.findElement(By.xpath("//input[@a='round-trip-tab']"));
        WebElement multiCityTab = driver.findElement(By.xpath("//input[@a='multi-city-tab']"));
        WebElement flyingFrom = driver.findElement(By.xpath("//div[@id='one-way']//label[text()='Flying from']/parent::div//input"));
        WebElement flyingTo = driver.findElement(By.xpath("//div[@id='one-way']//label[text()='Flying to']/parent::div//input"));

    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
