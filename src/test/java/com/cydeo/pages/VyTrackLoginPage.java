package com.cydeo.pages;

import com.cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.*;

public class VyTrackLoginPage {


    public VyTrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userNameInput;


    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement submitBtn;


}
