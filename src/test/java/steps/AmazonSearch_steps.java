package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonSearch_steps {
    AmazonPage apObj = new AmazonPage();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("https://amazon.com");

    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
        apObj.amazonSearch.sendKeys("headphones");

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        apObj.amazonSearchButton.click();

    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {
        String actualText=apObj.amazonSearchResult.getText();
        Assert.assertTrue("The keyword headphones was not located",actualText.contains("headphones"));

    }

}
