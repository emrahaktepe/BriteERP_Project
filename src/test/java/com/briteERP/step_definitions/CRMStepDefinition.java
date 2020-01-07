package com.briteERP.step_definitions;


import com.briteERP.pages.CRMPage;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CRMStepDefinition {

    WebDriverWait wait= new WebDriverWait(Driver.get(),5);

    CRMPage CRM = new CRMPage();

    @When("user is able to navigate to {string} page")
    public void user_is_able_to_navigate_to_page(String page) {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CRM")));
        CRM.navigateBetweenTabs(page).click();
    }

    @Then("click Customer button")
    public void click_Customer_button() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.partialLinkText("Customer")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Customer")));
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Customer")));
        CRM.Customers.click();


    }

    @Then("click Create button to add new Company information as follow")
    public void click_Create_button_to_add_new_Company_information_as_follow(List<Map<String, String>>table) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(("[class='btn btn-primary btn-sm o-kanban-button-new btn-default']"))));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")));
        CRM.Create.click();
        CRM.Name.sendKeys(table.get(0).get("Name"));
        CRM.Street.sendKeys(table.get(0).get("Street"));
        CRM.City.sendKeys(table.get(0).get("City"));
        CRM.State.sendKeys(table.get(0).get("State"), Keys.ENTER);
        CRM.ZIP.sendKeys(table.get(0).get("ZIP"));
        CRM.Country.sendKeys(table.get(0).get("Country"), Keys.ENTER);
        CRM.TIN.sendKeys(table.get(0).get("TIN"));
        CRM.Tag.sendKeys(table.get(0).get("Tag"),Keys.ENTER);
        CRM.Job_Position.sendKeys(table.get(0).get("Job_Position"));
        CRM.Phone.sendKeys(table.get(0).get("Phone"));
        CRM.Mobile.sendKeys(table.get(0).get("Mobile"));
        CRM.Email.sendKeys(table.get(0).get("Email"));
        CRM.Website.sendKeys(table.get(0).get("Website"));

        CRM.Save.click();
    }

    @Then("click save button")
    public void click_save_button() {

        CRM.Save.click();

    }


    @Then("verify the added company {string} is displayed at Customer page")
    public void verifyTheAddedCompanyIsDisplayedAtCustomerPage(String expectedCompanyName) throws InterruptedException {
        CRM.Customers.click();
        Thread.sleep(1000);

        String actualCompanyName= CRM.CompanyList.stream().filter(webElement -> webElement.getText().contains(expectedCompanyName))
                                         .map(webElement -> webElement.getText()).collect(Collectors.joining());

        Assert.assertTrue(actualCompanyName.contains(expectedCompanyName));
    }
}
