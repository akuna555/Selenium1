package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utilities.Driver;

import java.util.Map;

public class Login_steps {

  LoginPage lp = new LoginPage();
    //Use Cucumber to bind the Feature Files steps to Java code
    //Glue code - step definitions - step implementation
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User is on the Login Page");
        //Initiate the WebDriver
        Driver.getDriver().get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
        }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Step 2 : User enters valid credentials");
   lp.enterEmail.sendKeys("tim@testmail.com");
   lp.enterPassword.sendKeys("trpass");
   lp.loginButton.click();
    }

    @Then("the user should be able to view account balance")
    public void the_user_should_be_able_to_view_account_balance()
    {
        System.out.println("User sees account balance");
        System.out.println("Step 3: User see account balance");
        String welcomeMessage ="Logged in successfully";
        Assert.assertEquals(lp.welcomMessage.getText(),welcomeMessage);

    }
    @When("the user enters bad credentials")
    public void the_user_enters_bad_credentials() {
    lp.enterEmail.sendKeys("bad login");
    lp.enterPassword.sendKeys("bad password");
    lp.loginButton.click();
    }

    @Then("the use should not be able to login")
    public void the_use_should_not_be_able_to_login()  {
        String welcome= "Logged in successfully";

        Assert.assertTrue(!lp.welcomMessage.getText().contains(welcome));

    }
    @Then("user should get an invalid login message")
    public void user_should_get_an_invalid_login_message() {
        String bodyText = lp.invalidLogin.getText();
        String message = "Invalid user name";
        System.out.println(bodyText);
        System.out.println(message);
        Assert.assertTrue(bodyText.contains(message));

    }
    @When("user enters username as {string}")
    public void user_enters_username_as(String username1) {

    }

    @When("user enters password as {string}")
    public void user_enters_password_as(String password1) {

    }

    @When("user clicks on login")
    public void user_clicks_on_login() {

    }
    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        lp.enterEmail.sendKeys(username);
        lp.enterPassword.sendKeys(password);
        lp.loginButton.click();
    }
    @When("the user enters set of \"(.*)\" and \"(.*)\"$")
    public void the_user_enters_set_of_and(DataTable credentials) {



    }

    @Then("the user should be able to iew account balance")
    public void the_user_should_be_able_to_iew_account_balance() {
        // Write code here that turns the phrase above into concrete actions


    }

}
