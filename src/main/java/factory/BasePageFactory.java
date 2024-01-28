package factory;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageFactory {
    WebDriver driver;
    CommonActions actions = new CommonActions();

    public BasePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions.driver = driver;
    }
}