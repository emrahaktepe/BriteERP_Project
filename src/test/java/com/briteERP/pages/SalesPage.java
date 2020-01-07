package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage {

    @FindBy(linkText = "Sales")
    WebElement SalesPage;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=447&action=48\"]")
    WebElement Customers;

    @FindBy(css = "[class=\"btn btn-primary btn-sm o-kanban-button-new btn-default\"]")
    WebElement Create;

    @FindBy(css = "[class=\"o_form_sheet\"]")
    WebElement Sheet;

    @FindBy(css = "[class=\"btn btn-primary btn-sm o_form_button_save\"]")
    WebElement Save;

    @FindBy(partialLinkText = "Contact created")
    WebElement message;
}


