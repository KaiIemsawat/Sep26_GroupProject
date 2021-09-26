package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class SauceDemoPage {
    public SauceDemoPage (){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement uName;

    @FindBy(id = "password")
    public WebElement pWord;

    @FindBy(id = "login-button")
    public WebElement loginBtn;

    @FindBy(xpath = "//h3")
    public WebElement errorMsg;
}