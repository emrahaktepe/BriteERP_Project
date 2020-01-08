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

    @FindBy(css = "[className =o_input ui-autocomplete-input']")
    public WebElement Company;

    @FindBy(css = "[id=\"o_field_input_40\"]")
    public WebElement State;

    @FindBy(css = "[class=\"o_field_char o_field_widget o_input o_address_zip\"]")
    public WebElement ZIP;

    @FindBy(css = "[id=\"o_field_input_40\"]")
    public WebElement Country;

    @FindBy(css = "[name='vat']")
    public  WebElement TIN;

    @FindBy(css = "[id=\"o_field_input_6799\"]")
    public WebElement Tags;

    @FindBy(css = "[name=\"function\"]")
    public WebElement Job_Position;

    @FindBy(css = "[name=\"phone\"]")
    public WebElement Phone;

    @FindBy(css = "[name=\"mobile\"]")
    public WebElement Mobile;

    @FindBy(css = "[name=\"email\"]")
    public WebElement Email;

    @FindBy(css = "[id=\"o_field_input_6805\"]")
    public WebElement Website;

    @FindBy(css = "[class=\"btn btn-primary btn-sm o_form_button_save\"]")
    public  WebElement Save;

    @FindBy(css = "[class='o_field_char o_field_widget o_required_modifier']")
    public WebElement CustomerPage;

    @FindBy()
    public WebElement CompanyList;


//    @FindBy(partialLinkText = "Contact created")
//    public WebElement message;
//
//    public void FillUp(){
//       Sheet.sendKeys();
//    }


}


