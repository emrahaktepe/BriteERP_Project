package com.briteERP.step_definitions;

import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage;

    @Given("user is on main page")
    public void user_is_on_main_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage = new LoginPage();
        loginPage.signInButton.click();
    }

    @Then("user enters valid username and password and login")
    public void user_enters_valid_and() {
        loginPage = new LoginPage();
        loginPage.logInMethod();

    }


    @Then("page title should be {string}")
    public void page_title_should_be(String string) {
        Assert.assertEquals(string, Driver.get().getTitle());
        System.out.println("Hi Group 1");

    }

}
