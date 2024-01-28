package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageFactory extends BasePageFactory{
    public SignInPageFactory(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "txtFirstname")
    WebElement txtFirstname;
    @FindBy(id = "txtEmail")
    WebElement txtEmail;
    @FindBy(id = "txtCEmail")
    WebElement txtCEmail;
    @FindBy(id = "txtPassword")
    WebElement txtPassword;
    @FindBy(id = "txtCPassword")
    WebElement txtCPassword;
    @FindBy(id = "txtPhone")
    WebElement txtPhone;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;

    @FindBy(xpath = "//a[@href='https://alada.vn/tai-khoan/dang-nhap.html']")
    WebElement btnLogin;

    @FindBy(id="txtLoginUsername")
    WebElement txtLoginUsername;
    @FindBy(id="txtLoginPassword")
    WebElement txtLoginPassword;

    public void inputInformation(String firstname, String email, String password, String phone) {
        actions.sendKeys(txtFirstname, firstname);
        actions.sendKeys(txtEmail, email);
        actions.sendKeys(txtCEmail, email);
        actions.sendKeys(txtPassword, password);
        actions.sendKeys(txtCPassword, password);
        actions.sendKeys(txtPhone, phone);
        actions.click(btnSubmit);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void signInWithNewPass(String username, String newPass) {
        btnLogin.click();

        actions.sendKeys(txtLoginUsername, username);
        actions.sendKeys(txtLoginPassword, newPass);

        actions.click(btnSubmit);
    }
}
