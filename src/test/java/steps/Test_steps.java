package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {
    @When("user goes to google application")
    public void user_goes_to_google_application() {
        System.out.println("selenium is going to google.com");

    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {
        System.out.println("user searching for a word apple");

    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("User checking the results of search");
        Assert.fail("failing for a reason");

    }
    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {

    }


}
