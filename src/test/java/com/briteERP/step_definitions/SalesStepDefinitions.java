package com.briteERP.step_definitions;

import com.briteERP.pages.BasePage;
import com.briteERP.pages.LoginPage;
import com.briteERP.pages.SalesPage;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

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
        salesPage.Customers.click();
        salesPage.waitUntilLoaderMaskDisappear();
        salesPage.Create.click();
        BrowserUtils.wait(5);

    }

    @Then("user select {string} and {string}")
    public void user_select_and(String string, String string2) {
        salesPage.name.click();




    }

    @Then("user adds new Customer information:")
    public void user_adds_new_Customer_information(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new cucumber.api.PendingException();
    }

}
