package com.briteERP.step_definitions;

import com.briteERP.pages.ContactsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefinitions {

    ContactsPage contactsPage = new ContactsPage();

    @When("user navigates to {string} module")
    public void user_navigates_to_module(String string) {
        contactsPage.waitUntilLoaderMaskDisappear();
        contactsPage.Contacts.click();

    }

    @Then("user clicks {string} button")
    public void user_clicks_button(String string) {
        contactsPage.waitUntilLoaderMaskDisappear();
        contactsPage.Create.click();
    }

    @Then("user fill the form")
    public void user_fill_the_form(List<Map<String, String>> table) {
        contactsPage.waitUntilLoaderMaskDisappear();

        contactsPage.Name.sendKeys(table.get(0).get("Name"));
        contactsPage.Street.sendKeys(table.get(0).get("Street"));
        contactsPage.City.sendKeys(table.get(0).get("City"));
        contactsPage.ZIP.sendKeys(table.get(0).get("ZIP"));
        contactsPage.Country.sendKeys(table.get(0).get("Country"));
        contactsPage.TIN.sendKeys(table.get(0).get("TIN"));
        contactsPage.JobPosition.sendKeys(table.get(0).get("Job_Position"));
        contactsPage.Phone.sendKeys(table.get(0).get("Phone"));
        contactsPage.Mobile.sendKeys(table.get(0).get("Mobile"));
        contactsPage.Email.sendKeys(table.get(0).get("Email"));
        contactsPage.Website.sendKeys(table.get(0).get("Website"));
    }

    @Then("user click on save button")
    public void user_click_on_save_button() {
        contactsPage.Save.click();
    }

    @Then("verify the added contact {string} is displayed at Contacts page")
    public void verify_the_added_contact_is_displayed_at_Contacts_page(String string) {
        contactsPage.waitUntilLoaderMaskDisappear();
        String actualContactName = contactsPage.CustomerPage.getText();
        String expectedContactName = "Esra";

        Assert.assertEquals(expectedContactName,actualContactName);
    }

}
