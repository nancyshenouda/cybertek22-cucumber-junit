package com.cybertek.step_definitions;

import com.cybertek.pages.DropdownPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class DataTable_StepDefinitions {

LibraryLoginPage loginPage = new LibraryLoginPage();
DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {

        Select monthDropdown = new Select(dropdownPage.actualList);

        List<WebElement> actualMonthsAsWebElement = monthDropdown.getOptions();

        // using the utils method created in Browser.utils class to reuse it
        // anytime we need to convert list<WebElement> to List<String>
        Assert.assertEquals(expectedList, BrowserUtils.getElementsText(actualMonthsAsWebElement));
//        List<String> actualMonthsText = new ArrayList<>();
//
//        for(WebElement element : actualMonthsAsWebElement){
//           actualMonthsText.add(element.getText());
//
//        }
//        Assert.assertEquals(expectedList, actualMonthsText);

    }


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
