package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {
    WebDriver driver;
    public FaceBookPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath="//input[@type='text']")
        public WebElement firstName;
    @FindBy(id="u_0_e")
    public WebElement lastName;

}
