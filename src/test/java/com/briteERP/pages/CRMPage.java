package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRMPage {

        @FindBy(css = "[accesskey='c']")
        WebElement Click;

        @FindBy(css = "[placeholder='e.g. Customer Deal']")
        WebElement OpportunityTitle;

        @FindBy(css = "[name='edit_dialog']")
        WebElement Click_Edit;


        @FindBy(css = "[class='o_input']")
        WebElement ExpectedRevenue;

        @FindBy(css = "[name='probability']")
        WebElement Probability;

        @FindBy(css = "[name='email_from']")
        WebElement Email;

        @FindBy(css = "[name='phone']")
        WebElement phone;


        @FindBy(partialLinkText = "Contact Information")
        WebElement ContactInformation;

        @FindBy(css = "[name='partner_name']")
        WebElement CompanyName;

        @FindBy(css = "[name='street']")
        WebElement Address;

        @FindBy (css = "[class='o_input ui-autocomplete-input']")
        WebElement State;

        @FindBy(css = "[name='contact_name']")
        WebElement ContactName;












}
