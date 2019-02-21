package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YoutubePage;
import utilities.Driver;

public class Youtube_steps {
    YoutubePage yobl = new YoutubePage();
    @Given("user is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://youtube.com");

    }

    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
       Assert.assertTrue(yobl.youtubeSearchBox.isDisplayed());

    }

    @Given("User is able to see the search button")
    public void user_is_able_to_see_the_search_button() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(yobl.youtubeSearchButton.isDisplayed());
        Thread.sleep(2000);

    }

    @When("User search for Funny CatVideos")
    public void user_search_for_Funny_CatVideos() throws InterruptedException {
        Thread.sleep(2000);
        yobl.youtubeSearchBox.sendKeys("FUNNy CAT VIDEOS" + Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User should see results related to funny cact videos")
    public void user_should_see_results_related_to_funny_cact_videos() {
        String actual = Driver.getDriver().getTitle();
        System.out.println(actual);
        String expected ="CAT";
        Assert.assertTrue("Does not contain",actual.contains(expected));

    }
    @When("User searches for FUNNY GOG Videos")
    public void user_searches_for_FUNNY_GOG_Videos() {
        yobl.youtubeSearchBox.sendKeys("FUNNY DOG VIDEOS"+Keys.ENTER);

    }

    @Then("User should see results related to funny to funny cat videos")
    public void user_should_see_results_related_to_funny_to_funny_cat_videos() {
        String actual = Driver.getDriver().getTitle();
        System.out.println(actual);
        String expected ="DOG";
        Assert.assertTrue("Does not contain",actual.contains(expected));

    }

    @When("User searches for Funny Pet Videos")
    public void user_searches_for_Funny_Pet_Videos() throws InterruptedException {
        Thread.sleep(2000);
        yobl.youtubeSearchBox.sendKeys("FUNNY PET VIDEOS"+Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User should see results related to funny cat videos")
    public void user_should_see_results_related_to_funny_cat_videos() {
        String actual = Driver.getDriver().getTitle();
        System.out.println(actual);
        String expected ="PET";
        Assert.assertTrue("Does not contain",actual.contains(expected));

    }



}
