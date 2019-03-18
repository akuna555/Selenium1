package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.FaceBookPage;
import utilities.Driver;

public class FaceBook {
    FaceBookPage fb= new FaceBookPage();
    @Given("User need to be on the Facebook Page")
    public void user_need_to_be_on_the_Facebook_Page() {
        Driver.getDriver().get("https://www.facebook.com/");

    }

    @When("User enters user first name")
    public void user_enters_user_first_name() {
     fb.firstName.sendKeys("Oksana");
     fb.lastName.sendKeys("Kulba");
    }

    @Then("User checks user first name is present")
    public void user_checks_user_first_name_is_present() {
      String userNameActual =   fb.firstName.getAttribute("value");
        Assert.assertEquals("Oksana",userNameActual);

    }

    @Given("User need to be on FaceBOOK Logi Page")
    public void user_need_to_be_on_FaceBOOK_Logi_Page() {

    }

    @When("user enters username")
    public void user_enters_username() {

    }

    @Then("User checks user first anme is present")
    public void user_checks_user_first_anme_is_present() {


    }

    @Then("User Mobile field should be blank")
    public void user_Mobile_field_should_be_blank() {

    }


}
