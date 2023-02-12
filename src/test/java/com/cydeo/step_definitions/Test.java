package com.cydeo.step_definitions;

import io.cucumber.java.en.*;

public class Test {

    @Given("user go to login page")
    public void user_go_to_login_page() {
        System.out.println("User is on the login page");
    }
    @When("user enters credentials and click login button")
    public void user_enters_credentials_and_click_login_button() {
        System.out.println("user enterusername and password, then click login button");
    }
    @Then("user should be on dashboard")
    public void user_should_be_on_dashboard() {
        System.out.println("user is on the user dashboard");
    }
}
