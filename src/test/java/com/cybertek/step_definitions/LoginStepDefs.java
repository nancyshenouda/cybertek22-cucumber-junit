package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User entered librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User entered librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters the student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters the student password");
    }


    @When("user enters the admin username")
    public void userEntersTheAdminUsername() {
        System.out.println("User enters the admin username");
    }

    @And("user enters the admin password")
    public void userEntersTheAdminPassword() {
        System.out.println("User enters the admin password");
    }
}
