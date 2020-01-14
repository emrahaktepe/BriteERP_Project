package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public boolean waitUntilLoaderMaskDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Loader mask not found!");
            e.printStackTrace();
            return true; // no loader mask, all good, return true
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return false;
    }


}
