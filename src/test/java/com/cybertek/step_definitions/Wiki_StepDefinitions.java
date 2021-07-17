package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {
    WikiSearchPage object = new WikiSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        object.searchButton.click();

    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String name) {
        object.searchBox.sendKeys(name);

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String name) {
        String actualHeader = object.headerText.getText();
        String expectedHeader = name;
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String name) {
String actualImageHeader = object.imageHeader.getText();
String expectedImageHeader = name;
Assert.assertEquals(expectedImageHeader,actualImageHeader);
    }


    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String name) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = name + " - Wikipedia";
        Assert.assertTrue("Title verification failed!", actualTitle.equals(expectedTitle));
    }
}

