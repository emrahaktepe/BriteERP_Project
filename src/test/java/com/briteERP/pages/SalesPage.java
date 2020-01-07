package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage extends BasePage{

    @FindBy(linkText = "Sales")
    public WebElement SalesPage;

    @FindBy(xpath = "//li[.='Quotations']")
    public  WebElement Quotations;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=447&action=48\"]")
    public WebElement Customers;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
   public WebElement Create;

    @FindBy(css = "[class=\"o_form_sheet\"]")
    public WebElement Sheet;

    @FindBy(name = "name")
    public WebElement name;


    @FindBy(css = "[class=\"btn btn-primary btn-sm o_form_button_save\"]")
   public WebElement Save;

    @FindBy(partialLinkText = "Contact created")
    public WebElement message;

    public void FillUp(){
       Sheet.sendKeys();
    }


}


