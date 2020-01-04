package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//head//title")
    public WebElement mainPageTitle;
}
