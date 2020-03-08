package com.briteERP.step_definitions;

import com.briteERP.pages.InventoryPage;
import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class InventoryStepDefinitions{

    InventoryPage product= new InventoryPage();



    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on login page!");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().window().maximize();
    }
    @Given("user logs as a product {string}")
    public void user_logs_as_a_product(String string) {
        LoginPage.login(string);
        LoginPage.waitUntilLoadingCompleted();
        System.out.println("Login as " + string);
    }
    @Then("user navigates to {string} module")
    public void userNavigatesToModule() {
    }

    @Then("user verifies that {string} butoon is clicable")
    public void user_verifies_that_butoon_is_clicable(String string) {
        System.out.println("Verifying that " + string + " button is clickable");
    }




      public void  (String string) {
        System.out.println("Verifying that " + string + " button is clickable");

}
    @Then("user should be able to create a new product")
    public void user_should_be_able_to_create_a_new_product() {
    }
}







