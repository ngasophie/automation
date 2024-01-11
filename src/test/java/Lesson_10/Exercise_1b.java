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


import java.util.Random;

public class Exercise_1b {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://alada.vn/tai-khoan/dang-nhap.html");
    }
    @Test
    public void testCase1() throws InterruptedException {
        WebElement name = driver.findElement(By.xpath("//input[@id='txtLoginUsername']"));
        name.sendKeys("ttntrinhnga@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtLoginPassword']"));
        password.sendKeys("123456");
        WebElement btnSubmit = driver.findElement(By.xpath("//button[contains(@class, 'btn_submit')]"));
        btnSubmit.click();

        Actions a = new Actions(driver);

        WebElement avt = driver.findElement(By.xpath("//div[@class='avatar2']"));
        a.moveToElement(avt).perform();
        WebElement editProfile = driver.findElement(By.xpath("//a[@href='https://alada.vn/thong-tin-ca-nhan']"));
        editProfile.click();
        WebElement lastName = driver.findElement(By.xpath("//input[@id='member_lastname']"));
        lastName.clear();
        lastName.sendKeys("Trinh");
        WebElement firstName = driver.findElement(By.xpath("//input[@id='member_firstname']"));
        firstName.clear();
        firstName.sendKeys("Nga");
        WebElement gender = driver.findElement(By.xpath("//input[@name='member_gender[]' and @value='0']"));
        gender.click();
        Select city = new Select(driver.findElement(By.xpath("//select[@id='txtCity']")));
        city.selectByValue("321");

        WebElement birthday = driver.findElement(By.xpath("//input[@id='member_birthday']"));
        birthday.clear();
        birthday.sendKeys("16-04-2000");

        WebElement btnSave = driver.findElement(By.xpath("//button[text()='Lưu thông tin']"));
        Thread.sleep(3000);
        btnSave.click();
    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
