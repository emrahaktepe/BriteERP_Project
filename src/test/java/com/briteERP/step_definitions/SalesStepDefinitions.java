package com.briteERP.step_definitions;

import com.briteERP.pages.LoginPage;
import com.briteERP.pages.SalesPage;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.Map;

public class SalesStepDefinitions {
    LoginPage loginpage;
    SalesPage salesPage;



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user logs in as posmanager")
    public void user_logs_in_as_posmanager() {
        loginpage = new LoginPage();
        loginpage.logInMethod();
    }

    @Then("user navigates to Sales page")
    public void user_navigates_to_Sales_page() {
        salesPage = new SalesPage();
       salesPage.waitUntilLoaderMaskDisappear();
       salesPage.SalesPage.click();
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
       salesPage.waitUntilLoaderMaskDisappear();
       String actual = salesPage.Quotations.getText();
       Assert.assertEquals(string,actual);
    }

    @Then("user click on {string} button")
    public void user_click_on_button(String string) {
        salesPage.waitUntilLoaderMaskDisappear();
        salesPage.Customers.click();

    }


    @Then("user click on Create button to add new information as follow")
    public void user_click_on_Create_button_to_add_new_information_as_follow(List<Map<String, String>> table) {
        salesPage.waitUntilLoaderMaskDisappear();
        salesPage.Create.click();
        salesPage.waitUntilLoaderMaskDisappear();
        salesPage.Name.sendKeys(table.get(0).get("Name"));
        salesPage.State.sendKeys(table.get(0).get("State"),Keys.ENTER);
        salesPage.Street.sendKeys(table.get(0).get("Street"));
        salesPage.City.sendKeys(table.get(0).get("City"));
        salesPage.Company.sendKeys(table.get(0).get("Company"),Keys.ENTER);
        salesPage.ZIP.sendKeys(table.get(0).get("ZIP"));
        salesPage.Country.sendKeys(table.get(0).get("Country"),Keys.ENTER);
        salesPage.TIN.sendKeys(table.get(0).get("TIN"));
        salesPage.Tags.sendKeys(table.get(0).get("Tags"),Keys.ENTER);
        salesPage.Job_Position.sendKeys(table.get(0).get("Job_Position"));
        salesPage.Phone.sendKeys(table.get(0).get("Phone"));
        salesPage.Mobile.sendKeys(table.get(0).get("Mobile"));
        salesPage.Email.sendKeys(table.get(0).get("Email"));
        salesPage.Website.sendKeys(table.get(0).get("Website"),Keys.ENTER);
        salesPage.Title.sendKeys(table.get(0).get("Title"),Keys.ENTER);
        salesPage.Language.sendKeys(table.get(0).get("Language"),Keys.ENTER);


    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        salesPage.Save.click();

    }

    @Then("verify the added customer {string} is displayed at Customer page")
    public void verify_the_added_customer_is_displayed_at_Customer_page(String string) {
        salesPage.waitUntilLoaderMaskDisappear();
        String actualCustomerName = salesPage.CustomerPage.getText();
        String expectedCUstomerName = "JASMIN";

        Assert.assertEquals(expectedCUstomerName,actualCustomerName);
    }

}
