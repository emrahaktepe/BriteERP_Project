package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
        Driver.get().manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public WebElement navigateBetweenTabs(String tabName) {
        String tabs = "//ul/li/a/span[contains(text(),'" + tabName + "')]";
        WebElement tab = Driver.get().findElement(By.xpath(tabs));
        return tab;

    }


}
