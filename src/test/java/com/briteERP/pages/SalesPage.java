package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SalesPage extends BasePage{

    @FindBy(linkText = "Sales")
    public WebElement SalesPage;

    @FindBy(xpath = "//li[.='Quotations']")
    public  WebElement Quotations;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=447&action=48\"]")
    public WebElement Customers;

    @FindBy(css = "[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
   public WebElement Create;

    @FindBy(name = "name")
    public WebElement Name;


    @FindBy(css = "[name = 'street']")
    public  WebElement Street;

    @FindBy(css = "[name = 'city']")
    public WebElement City;

    @FindBy(xpath = "//div[@name=\"parent_id\"]//input")
    public WebElement Company;

    @FindBy(xpath = "//div[@name=\"state_id\"]//input")
    public WebElement State;

    @FindBy(xpath = "(//input[@class=\"o_input ui-autocomplete-input\"])[2]")
    public WebElement SlectState;

    @FindBy(css = "[class=\"o_field_char o_field_widget o_input o_address_zip\"]")
    public WebElement ZIP;

    @FindBy(xpath = "//div[@name='country_id']//input")
    public WebElement Country;

    @FindBy(css = "[name='vat']")
    public  WebElement TIN;

    @FindBy(xpath = "//div[@name=\"category_id\"]//input")
    public WebElement Tags;

    @FindBy(css = "[name=\"function\"]")
    public WebElement Job_Position;

    @FindBy(css = "[name=\"phone\"]")
    public WebElement Phone;

    @FindBy(css = "[name=\"mobile\"]")
    public WebElement Mobile;

    @FindBy(css = "[name=\"email\"]")
    public WebElement Email;

    @FindBy(xpath = "(//td[@style=\"width: 100%;\"]//input)[13]")
    public WebElement Website;

    @FindBy(xpath = "//div[@name=\"title\"]//input")
    public  WebElement Title;

    @FindBy(xpath = "(//select[@class=\"o_input o_field_widget\"]//option)[2]")
    public WebElement Language;

    @FindBy(css = "[class=\"btn btn-primary btn-sm o_form_button_save\"]")
    public  WebElement Save;

    @FindBy(css = "[class='o_field_char o_field_widget o_required_modifier']")
    public WebElement CustomerPage;





}


