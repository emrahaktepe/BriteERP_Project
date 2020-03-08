package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends  BasePage{

    @FindBy(xpath = "(//div[@class='o_checkbox'])[4]/input")
    public WebElement Everybodys_calendar_checkbox;

    @FindBy(css = "[class='o_searchview_input']")
    public WebElement searchbox;

    @FindBy(css = "[class='o_field_name o_field_type_char']")
    public WebElement hostName;


}
