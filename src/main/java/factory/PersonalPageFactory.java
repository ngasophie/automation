package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalPageFactory extends BasePageFactory {
    public PersonalPageFactory(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="txtpassword")
    WebElement txtPassword;
    @FindBy(id="txtnewpass")
    WebElement txtnewpass;
    @FindBy(id="txtrenewpass")
    WebElement txtrenewpass;

    @FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
    WebElement btnSave;

    @FindBy(xpath = "//a[@href='https://alada.vn/tai-khoan/dang-xuat.html']")
    WebElement btnSignOut;

    @FindBy(xpath="//div[@class='avatar2']")
    WebElement avatar;

    public void changePassword(String oldPass, String newPass)
    {
        actions.sendKeys(txtPassword, oldPass);
        actions.sendKeys(txtnewpass, newPass);
        actions.sendKeys(txtrenewpass, newPass);
        actions.click(btnSave);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void signOut()
    {
        actions.move(avatar);
        actions.click(btnSignOut);
    }
}
