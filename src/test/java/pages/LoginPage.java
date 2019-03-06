package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    WebDriver driver;
    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
        @FindBy(id="MainContent_txtUserName")
        public WebElement enterEmail;
    @FindBy(id="MainContent_txtPassword")
    public WebElement enterPassword;
    @FindBy(id="MainContent_btnLogin")
    public WebElement loginButton;
    @FindBy(css= "#conf_message")
    public WebElement welcomMessage;
    @FindBy(xpath="//*[@id='MainContent_lblTransactionResult']")
    public WebElement invalidLogin;
    }

