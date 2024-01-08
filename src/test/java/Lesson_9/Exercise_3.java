package Lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise_3 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement tr1 = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[4]"));
        WebElement tr2 = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[5]"));
        WebElement tr3 = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[6]"));
    }
    @AfterTest
    public void afterTest() {

    }
}
