package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;

public class VyTrackLoginSteps {


    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();

    @Given("user go to vytrack login page")
    public void user_go_to_vytrack_login_page() {
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
    }
    @When("user enter username and password, then click login button")
    public void user_enter_username_and_password_then_click_login_button() {
        vyTrackLoginPage.userNameInput.sendKeys("user1");
        vyTrackLoginPage.passwordInput.sendKeys("UserUser123");
        vyTrackLoginPage.submitBtn.click();
    }
    @Then("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
