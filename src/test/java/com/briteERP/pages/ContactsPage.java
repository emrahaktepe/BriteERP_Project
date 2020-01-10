package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    @FindBy(linkText = "Contacts")
    public WebElement Contacts;

    @FindBy(css = "button[accesskey='c']")
    public WebElement Create;

    @FindBy(name = "name")
    public WebElement Name;

    @FindBy(name = "street")
    public WebElement Street;

    @FindBy(name = "city")
    public WebElement City;

    @FindBy(name = "zip")
    public WebElement ZIP;

    @FindBy(xpath = "//div[@name='country_id']//input")
    public WebElement Country;

    @FindBy(name = "vat")
    public WebElement TIN;

    @FindBy(name = "function")
    public WebElement JobPosition;

    @FindBy(name = "phone")
    public WebElement Phone;

    @FindBy(name = "mobile")
    public WebElement Mobile;

    @FindBy(name = "email")
    public WebElement Email;

    @FindBy(name = "website")
    public WebElement Website;


    @FindBy(css = "[accesskey='s']")
    public WebElement Save;

    @FindBy(css = "[name='name']")
    public WebElement CustomerPage;


}
