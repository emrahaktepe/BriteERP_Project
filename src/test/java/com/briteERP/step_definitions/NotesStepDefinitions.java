package com.briteERP.step_definitions;

import com.briteERP.pages.NotesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static com.briteERP.utilities.BrowserUtils.*;
import java.util.List;


public class NotesStepDefinitions {

    NotesPage notes= new NotesPage();

    @Then("user navigates to {string}")
    public void verify_account_types(String tabName) {
        waitForPageTitle("#Inbox - Odoo");
        System.out.println("Navigating to "+ tabName + " Page");
        notes.navigateBetweenTabs(tabName).click();
    }

    @And("user clicks create button")
    public void userClicksButton() {
        notes.createButton.click();
    }

    @Then("user enters {string} to the text box then click save button")
    public void userEntersToTheTextBoxThenClickButton(String text) {
        waitForClickablility(notes.saveButton ,3);
        notes.textBox.sendKeys(text);
        notes.saveButton.click();
    }

    @And("user verifies that new note is created")
    public void userVerifiesThatMessageIsDisplayed() {
        waitForVisibility(notes.noteSavedMessage, 3);
        Assert.assertEquals(notes.noteSavedMessage.getText(), "Note created" );
    }

    @Then("user clicks notes drop down clicks then to delete")
    public void userNavigatesToThenTo() {
        waitForPageToLoad(3);
        notes.actions.moveToElement(notes.noteItem).perform();
        notes.noteDropDown.click();
        notes.deleteButton.click();
    }

    @And("user clicks ok button to confirm")
    public void userClicksButtonToConfirm() {
        waitForClickablility(notes.okButton ,3);
        notes.okButton.click();
    }

    @And("user verifies that the note is not displayed")
    public void userVerifiesThatTheIsNotDisplayed() {
        Assert.assertTrue(notes.noNotes.isDisplayed());
    }

    @And("page title should be displayed as {string}")
    public void pageTitleShouldBeDisplayedAs(String pageTitle) {
        waitForPageTitle(pageTitle);
        Assert.assertEquals(notes.getPageTitle(), pageTitle);

    }
}

