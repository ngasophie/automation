package Lesson_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://automationfc.github.io/basic-form/index.html");
    }
    @Test
    public void testcase1() {
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Nga");

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("Nam Tu Liem, Ha Noi");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ttntrinhnga@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("1234567");

        WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        btnSubmit.click();
    }
    @AfterTest
    public void afterTest() {

    }
}
