package com.briteERP.pages;

import com.briteERP.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(linkText = "Sign in")
    public WebElement signInButton;
    @FindBy(id = "login")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(css = "[type='submit']")
    public WebElement logInButton;
    @FindBy(css = "[class='alert alert-danger']")
    public WebElement errorMessageWrongcredential;

    public void logInMethod() {
        signInButton.click();
        usernameInput.sendKeys(ConfigurationReader.getProperty("user_name"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        logInButton.click();
    }


}
