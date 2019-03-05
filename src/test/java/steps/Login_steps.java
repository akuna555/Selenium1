package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_steps {
    //Use Cucumber to bind the Feature Files steps to Java code
    //Glue code - step definitions - step implementation
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User is on the Login Page");

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("User enters valid credentials");
    }

    @Then("the user should be able to view account balance")
    public void the_user_should_be_able_to_view_account_balance() {
        System.out.println("User sees account balance");
    }

}
