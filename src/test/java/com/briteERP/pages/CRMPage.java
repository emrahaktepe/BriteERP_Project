package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CRMPage extends BasePage{

        @FindBy(partialLinkText = "Customers")
        public WebElement Customers;

        @FindBy (css = "[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
        public WebElement Create;

        @FindBy(css = "[name='name']")
        public WebElement Name;

        @FindBy(css = "[name='street']")
        public  WebElement Street;

        @FindBy(css = "[name='city']")
        public WebElement City;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[8]")
        public WebElement State;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[9]")
        public WebElement ZIP;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[10]")
        public WebElement Country;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[11]")
        public  WebElement TIN;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[12]")
        public WebElement Tag;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[13]")
        public WebElement Job_Position;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[14]")
        public WebElement Phone;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[15]")
        public WebElement Mobile;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[16]")
        public WebElement Email;

        @FindBy(xpath = "(//input[starts-with(@id, 'o_field_input_')])[17]")
        public WebElement Website;

        @FindBy(css = "[class='btn btn-primary btn-sm o_form_button_save']")
        public  WebElement Save;

        @FindBy(css = "[class='oe_kanban_global_click o_res_partner_kanban o_kanban_record']")
        public List<WebElement>CompanyList;



/*
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


*/









}
