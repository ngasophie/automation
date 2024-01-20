package Lesson_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise_1 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
    }
    @Test
    public void testCase1() throws InterruptedException {
        Select state = new Select(driver.findElement(By.xpath("//select[@name='state']")));
        state.selectByVisibleText("Georgia");

        WebElement radioBtn = driver.findElement(By.xpath("//input[@name='hosting' and @value='yes']"));
        radioBtn.click();
    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
