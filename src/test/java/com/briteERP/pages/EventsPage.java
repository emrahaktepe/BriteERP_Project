package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class EventsPage extends BasePage {

        @FindBy(xpath = "//*[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[10]/a/span']")
        public WebElement Events;

        @FindBy(xpath = "//button[@accesskey='c']")
        public WebElement Create;

        @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_input o_required_modifier']")
        public WebElement EventName;

        @FindBy(id = "//*[@id='o_field_input_34']")
        public WebElement OrganizerDropdown;

        @FindBy(id = "//*[@id='o_field_input_35']")
        public WebElement LocationDropdown;

        @FindBy(id = "//*[@id='o_field_input_37']")
        public WebElement ResponsibleDropdown;

        @FindBy(id = "//*[@id='o_field_input_38']")
        public WebElement CategoryDropdown;

        @FindBy(id = "//*[@id='o_field_input_41']")
        public WebElement StartDate;

        @FindBy(id = "//*[@id='o_field_input_42']")
        public WebElement EndDate;

        @FindBy(id = "//*[@id='o_field_input_43']")
        public WebElement TimeZone;

        @FindBy(id = "//*[@id='o_field_input_44']")
        public WebElement MinimumAttendees;

        @FindBy(xpath = "//*[@class='btn btn-sm btn-default oe_highlight']")
        public WebElement ConfirmEvent;

        @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_save']")
        public WebElement SaveEvent;

        @FindBy(xpath = "//*[@class='btn btn-sm btn-default oe_highlight']")
        public WebElement FinishEvent;


    }
