package Lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
        WebElement inputFormDropDown = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputFormDropDown.click();

        WebElement radioBtnDemo = driver.findElement(By.xpath("//ul[@id='treemenu']//a[@href='./basic-radiobutton-demo.html']"));
        radioBtnDemo.click();
        WebElement radioMale = driver.findElement(By.xpath("//input[@value='Male' and @name='gender']"));
        radioMale.click();
        WebElement radioFemale = driver.findElement(By.xpath("//input[@value='Female' and @name='gender']"));
        radioFemale.click();

        WebElement r1 = driver.findElement(By.xpath("//input[@value='0 - 5' and @name='ageGroup']"));
        r1.click();
        WebElement r2 = driver.findElement(By.xpath("//input[@value='5 - 15' and @name='ageGroup']"));
        r2.click();
        WebElement r3 = driver.findElement(By.xpath("//input[@value='15 - 50' and @name='ageGroup']"));
        r3.click();
    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
