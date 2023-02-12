package com.cydeo.pages;

import com.cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class Dashboard {

    public Dashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class=\"title title-level-1\"]")
    public List<WebElement> menus;
}
