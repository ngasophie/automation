package Lesson_8;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

    }
    @Test
    public void testcase1() {
        WebElement advertise = driver.findElement(By.className("sgpb-popup-close-button-6"));
        advertise.click();
        WebElement txtEmail = driver.findElement(By.name("email"));
        txtEmail.sendKeys("ttntrinhnga@gmail.com");
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("123456789");
        WebElement company = driver.findElement(By.name("company"));
        company.sendKeys("GHTK");
        WebElement phone = driver.findElement(By.name("mobile number"));
        phone.sendKeys("0975109203");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();
    }
    @AfterTest
    public void afterTest() {

    }
}
