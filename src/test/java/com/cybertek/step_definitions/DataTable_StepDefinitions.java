package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTable_StepDefinitions {

LibraryLoginPage loginPage = new LibraryLoginPage();


    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInfo) {
        String username = loginInfo.get("username");
        loginPage.emailInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(loginInfo.get("password"));
        loginPage.signIn.click();

    }


    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        System.out.println("listOfFruits size" + listOfFruits.size());
        System.out.println(listOfFruits);
    }

    @Given("user is on the login page of library app")
    public void userIsOnTheLoginPageOfLibraryApp() {
        Driver.getDriver().get("http://library2.cybertekschool.com/");
    }

    @Then("user should see title is Library")
    public void userShouldSeeTitleIsLibrary() {
    }
}
