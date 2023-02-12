package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;

import java.util.*;

public class DashboardTestSteps {


    Dashboard dashboard = new Dashboard();
    @Then("user should be able to see options")
    public void user_should_be_able_to_see_options(List<String> menuOps) {
        List<String> actualMenu = new ArrayList<>();
        for(WebElement menu : dashboard.menus){
            actualMenu.add(menu.getText());
        }
        Assert.assertEquals(menuOps,actualMenu);
    }


}
