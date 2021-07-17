package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

EtsySearchPage object = new EtsySearchPage();
    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("EtsyUrl");
        Driver.getDriver().get(url);
    }
    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not as expected. Verification Failed",expectedTitle.equals(actualTitle));
    }

    @And("user clicks to search button")
    public void userClicksToSearchButton() {
        object.searchButton.click();
    }

    @When("user types wooden spoon in the search")
    public void userTypesWoodenSpoonInTheSearch() {
        object.searchBox.sendKeys("wooden spoon");
    }

    @Then("user sees title is Wooden spoon | Etsy")
    public void userSeesTitleIsWoodenSpoonEtsy() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Wooden spoon | Etsy";
        Assert.assertEquals("Title is not matching",expectedTitle, actualTitle); // in cucumber expected is first
    }
}
