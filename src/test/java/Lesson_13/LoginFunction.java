package Lesson_13;

import common.CommonBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pom.ProjectPage;
import pom.SignInPage;

public class LoginFunction {
    WebDriver driver;
    CommonBrowser browser;

    @BeforeMethod
    public void beforeMethod() {
        driver = browser.initChromeDriver(
                "https://rise.fairsketch.com/signin?redirect=https://rise.fairsketch.com/projects/all_projects");

    }

    @AfterMethod
    public void afterMethod() {
        browser.closeDriver(driver);

    }

    @Test
    public void Testcase1_CorrectUser() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLogin("admin@demo.com", "riseDemo");
        ProjectPage project = new ProjectPage(driver);
        project.checkLoggedUser("John Doe");

    }

    @Test
    public void Testcase1_InCorrectUser() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLogin("admin@demo.com", "riseDemo1");
        signInPage.checkDisplayAlert();
    }

    @Test
    public void Testcase1_IncorrectEmail() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLogin("admin@demo.com1", "riseDemo");
        signInPage.checkDisplayAlert();
    }
    @Test
    public void Testcase1_IncorrectEmailAndPass() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLogin("admin@demo.com1", "riseDemo1");
        signInPage.checkDisplayAlert();
    }

    @Test
    public void Testcase2_Logout() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLogin("admin@demo.com", "riseDemo");

        WebElement avt = driver.findElement(By.xpath("//a[@id='user-dropdown']"));
        avt.click();
        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='https://rise.fairsketch.com/signin/sign_out']"));
        logoutBtn.click();
    }

    @BeforeTest
    public void beforeTest() {
        browser = new CommonBrowser();
        //driver = browser.initChromeDriver(
        //	"https://rise.fairsketch.com/signin?redirect=https://rise.fairsketch.com/projects/all_projects");

    }

    @AfterTest
    public void afterTest() {
        //browser.quitDriver(driver);
    }
}
