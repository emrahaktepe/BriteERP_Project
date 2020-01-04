package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(linkText = "/web/login")
    public WebElement signInPage;

    @FindBy(id = "id=\"login\"")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;


    @FindBy(css = "[type='submit']")
    public WebElement logInButton;

    @FindBy(css = "[class='alert alert-danger']")
    public WebElement alertMessage;


}
