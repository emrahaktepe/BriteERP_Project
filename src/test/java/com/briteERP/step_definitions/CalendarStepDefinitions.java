package com.briteERP.step_definitions;

import com.briteERP.pages.CalendarPage;
import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class CalendarStepDefinitions {
    CalendarPage calendarPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().findElement(By.linkText("Sign in")).click();
    }

    @Then("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        Driver.get().findElement(By.id("login")).sendKeys("expensesmanager40@info.com");
        Driver.get().findElement(By.id("password")).sendKeys("expensesmanager");
    }

    @Then("user clicks on sign in buttonn")
    public void user_clicks_on_sign_in_buttonn() {
        Driver.get().findElement(By.cssSelector("[type='submit']")).click();
    }

    @Then("user cliks on Calendar tab module")
    public void user_cliks_on_Calendar_tab_module() {
        BrowserUtils.waitForPageToLoad(2000);
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        js.executeScript("arguments[0].click()", Driver.get().findElement(By.xpath("(//span[contains(text(),'Calendar')])[1]")));

    }

    @Then("user clicks on Everybody's Calendar checkbox under Attendees")
    public void user_clicks_on_Everybody_s_Calendar_checkbox_under_Attendees() {
         calendarPage = new CalendarPage();
        // calendarPage.Everybodys_calendar_checkbox.click();
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        js.executeScript("arguments[0].click()",calendarPage.Everybodys_calendar_checkbox);

    }

    @Then("user enters name {string} on search box")
    public void user_enters_name_on_search_box(String string) {
        calendarPage = new CalendarPage();
        calendarPage.searchbox.sendKeys(string,Keys.ENTER);


    }

    @Then("user should be able to see the meetings hosted by {string}")
    public void user_should_be_able_to_see_the_meetings_hosted_by(String string) {
        calendarPage = new CalendarPage();
        BrowserUtils.wait(3);
        String actual = calendarPage.hostName.getText().trim();
        Assert.assertEquals(string, actual);
        System.out.println(string);
        System.out.println(actual);

    }





}
