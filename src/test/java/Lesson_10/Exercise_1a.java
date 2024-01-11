package Lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class Exercise_1a {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement name = driver.findElement(By.xpath("//input[@id='txtFirstname']"));
        name.sendKeys("nga");
        WebElement mail = driver.findElement(By.xpath("//input[@id='txtEmail']"));
        Random rand = new Random();
        mail.sendKeys("ttntrinhnga@gmail.com" + rand.nextInt( 10000));
        WebElement cMail = driver.findElement(By.xpath("//input[@id='txtCEmail']"));
        cMail.sendKeys("ttntrinhnga@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("123456");
        WebElement cPassword = driver.findElement(By.xpath("//input[@id='txtCPassword']"));
        cPassword.sendKeys("123456");
        WebElement phone = driver.findElement(By.xpath("//input[@id='txtPhone']"));
        phone.sendKeys("0975108204");
        WebElement btnSubmit = driver.findElement(By.xpath("//div[@class='field_btn']//button[@type='submit']"));
        btnSubmit.click();

        Thread.sleep(3000);
    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
