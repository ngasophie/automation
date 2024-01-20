package Lesson_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class Exercise_1 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement thisCheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        WebElement defaultChecked = driver.findElement(By.xpath("//input[@id='isAgeSelected']/parent::label/following-sibling::label[1]/input"));
        WebElement defaultDisabled = driver.findElement(By.xpath("//input[@id='isAgeSelected']/parent::label/following-sibling::label[2]/input"));
        WebElement option1 = driver.findElement(By.xpath("//input[@id='check1']/preceding-sibling::div[4]/label/input"));
        WebElement option2 = driver.findElement(By.xpath("//input[@id='check1']/preceding-sibling::div[3]/label/input"));
        WebElement option3 = driver.findElement(By.xpath("//input[@id='check1']/preceding-sibling::div[2]/label/input"));
        WebElement option4 = driver.findElement(By.xpath("//input[@id='check1']/preceding-sibling::div[1]/label/input"));

    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
