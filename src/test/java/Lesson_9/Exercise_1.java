package Lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise_1 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement advertise = driver.findElement(By.className("sgpb-popup-close-button-6"));
        advertise.click();
        WebElement email = driver.findElement(By.xpath("//input[@title='Email']"));
        email.sendKeys("ttntrinhnga@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("1234456");
        WebElement company = driver.findElement(By.xpath("//div[@class='element-companyId']//input[@name='company']"));
        company.sendKeys("GHTK");
        WebElement phone = driver.findElement(By.xpath("//div[@class='element-companyId']//input[@name='mobile number']"));
        phone.sendKeys("1234567");

        WebElement sumbit = driver.findElement(By.xpath("//input[@value='Submit']"));
        Thread.sleep(2000);
        sumbit.click();
    }
    @AfterTest
    public void afterTest() {

    }
}
