package Lesson_14;

import common.CommonBrowser;
import factory.HomePageFactory;
import factory.PersonalPageFactory;
import factory.SignInPageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class BTVN {
    WebDriver driver;
    CommonBrowser browser;

    @Test
    public void SignIn() {
        SignInPageFactory register = new SignInPageFactory(driver);
        Random random = new Random();
        int temp = random.nextInt(10000);
        String email = "testemail" + temp + "@gmail.com";

        register.inputInformation("AAA A1", email, "12345678", "0956646509");
        HomePageFactory homepage = new HomePageFactory(driver);
        //homepage.linkInformation();
        homepage.moveChangeInfo();
        PersonalPageFactory personal  =  new PersonalPageFactory(driver);
        personal.changePassword("12345678", "123456789");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        personal.signOut();

        register.signInWithNewPass(email, "123456789");

        homepage.checkIsHomePage();
    }

    @BeforeTest
    public void beforeTest() {
        browser = new CommonBrowser();
        driver = browser.initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html");

    }
}
