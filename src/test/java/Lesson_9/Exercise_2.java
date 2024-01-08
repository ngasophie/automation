package Lesson_9;

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
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/dynamic-table");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement btn1 = driver.findElement(By.xpath("//button[@id='blue']"));
        btn1.click();
        Thread.sleep(1000);
        WebElement btn2 = driver.findElement(By.xpath("//div[@id='pancakes'][2]/button[2]"));
        btn2.click();
        Thread.sleep(1000);
        WebElement btn3 = driver.findElement(By.xpath("//div[@id='unique'][1]/button[3]"));
        btn3.click();
        Thread.sleep(1000);
        WebElement btn4 = driver.findElement(By.xpath("//div[@id='unique'][2]/button[1]"));
        btn4.click();
        Thread.sleep(1000);
        WebElement btn5 = driver.findElement(By.xpath("//div[@id='unique'][2]/button[3]"));
        btn5.click();
        Thread.sleep(1000);
        WebElement btn6 = driver.findElement(By.xpath("//div[@id='unique'][2]/input[1]"));
        btn6.click();
        WebElement output = driver.findElement(By.xpath("//h1[@id='output']"));
    }
    @AfterTest
    public void afterTest() {

    }
}
