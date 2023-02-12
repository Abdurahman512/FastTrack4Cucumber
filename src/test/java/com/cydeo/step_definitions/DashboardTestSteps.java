package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import io.cucumber.java.en.*;
import org.apache.poi.xssf.usermodel.*;
import org.junit.*;
import org.openqa.selenium.*;

import java.io.*;
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

    @When("user choose {string}")
    public void user_choose(String roleName) throws IOException {
        String path = "new VyTrack credentials.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("vytrack");
        String username = "";
        String password = "";
        switch (roleName){
            case "Sales":
                username = sheet.getRow(10).getCell(0).toString();
                password = sheet.getRow(10).getCell(1).toString();
                break;

            case "Store":
                username = sheet.getRow(6).getCell(0).toString();
                password = sheet.getRow(6).getCell(1).toString();
                break;
        }
    }

    @Then("user should be able to see options printed")
    public void user_should_be_able_to_see_options_printed() {
        System.out.println("user is seeing the navigation options");
    }


}
