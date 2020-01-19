package com.briteERP.step_definitions;

import com.briteERP.pages.EmployeesPage;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class EmployeesStepDefinitions {

    WebDriverWait wait= new WebDriverWait(Driver.get(),5);

    EmployeesPage employeesPage = new EmployeesPage();



    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String page) {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Employees")));
        employeesPage.navigateBetweenTabs(page).click();
    }

    @Given("clicks on Create button")
    public void clicks_on_button() {
    employeesPage.createEmployeeButton.click();
    }

    @Then("enters following information to create a new employee")
    public void enters_following_information_to_create_a_new_employee(List<Map<String, String>> workInformationTable) {
        employeesPage.employeesName.sendKeys(workInformationTable.get(0).get("fullName"));
        employeesPage.jobDetailInputBox.sendKeys(workInformationTable.get(0).get("jobDetail"), Keys.ENTER);
        employeesPage.workAddress.sendKeys(workInformationTable.get(0).get("workAddress"), Keys.ENTER);
        employeesPage.workLocation.sendKeys(workInformationTable.get(0).get("workLocation"));
        employeesPage.workEmail.sendKeys(workInformationTable.get(0).get("workEmail"));
        employeesPage.workMobile.sendKeys(workInformationTable.get(0).get("workMobile"));
        employeesPage.workPhone.sendKeys(workInformationTable.get(0).get("workPhone"));
        employeesPage.department.sendKeys(workInformationTable.get(0).get("department"), Keys.ENTER);
        employeesPage.jobPosition.sendKeys(workInformationTable.get(0).get("jobPosition"), Keys.ENTER);
        employeesPage.manager.sendKeys(workInformationTable.get(0).get("manager"), Keys.ENTER);
        employeesPage.coach.sendKeys(workInformationTable.get(0).get("coach"), Keys.ENTER);
        employeesPage.workingHours.sendKeys(workInformationTable.get(0).get("workingHours"), Keys.ENTER);
        employeesPage.otherInformation.click();
        employeesPage.otherInformation.sendKeys(workInformationTable.get(0).get("otherInformation"));
        BrowserUtils.wait(1);
    }

    @Then("clicks on Private Information tab and enters following information")
    public void clicks_on_private_information_tab_and_enters_following_information(List<Map<String, String>> privateInformationTable) {
        employeesPage.privateInformationMenu.click();
        employeesPage.nationalityCountry.sendKeys(privateInformationTable.get(0).get("nationality"), Keys.ENTER);
        employeesPage.identificationNo.sendKeys(privateInformationTable.get(0).get("identificationNo"));
        employeesPage.passportNo.sendKeys(privateInformationTable.get(0).get("passportNo"));
        employeesPage.bankAccountNumber.sendKeys(privateInformationTable.get(0).get("bankAccountNumber"), Keys.ENTER);

        //employeesPage.gender.sendKeys(privateInformationTable.get(0).get("gender"));
        BrowserUtils.selectFromDropdown(employeesPage.gender, "Female");

        //employeesPage.maritalStatus.sendKeys(privateInformationTable.get(0).get("maritalStatus"));
        BrowserUtils.selectFromDropdown(employeesPage.maritalStatus, "Married");

        employeesPage.numberOfChildren.sendKeys(privateInformationTable.get(0).get("numberOfChildren"));
        employeesPage.visaNo.sendKeys(privateInformationTable.get(0).get("visaNo"));
        employeesPage.workPermitNo.sendKeys(privateInformationTable.get(0).get("workPermitNo"));
        employeesPage.visaExpireDate.sendKeys(privateInformationTable.get(0).get("visaExpireDate"));
        employeesPage.privateAddress.sendKeys(privateInformationTable.get(0).get("privateAddress"), Keys.ENTER);
        employeesPage.dateOfBirth.sendKeys(privateInformationTable.get(0).get("dateOfBirth"), Keys.ENTER);
        employeesPage.placeOfBirth.sendKeys(privateInformationTable.get(0).get("placeOfBirth"));
        BrowserUtils.wait(1);
    }

    @Then("clicks on HR Settings tab and enters following information")
    public void clicks_on_hr_settings_tab_and_enters_following_information(List<Map<String, String>> hrSettingsTable) {
        employeesPage.hrSettingsMenu.click();
        employeesPage.relatedUser.sendKeys(hrSettingsTable.get(0).get("relatedUser"), Keys.ENTER);
        BrowserUtils.wait(1);
        employeesPage.badgeID.sendKeys(hrSettingsTable.get(0).get("badgeID"));
        BrowserUtils.wait(1);
        employeesPage.medicalExam.sendKeys(hrSettingsTable.get(0).get("medicalExam"), Keys.ENTER);
        BrowserUtils.wait(1);
        employeesPage.companyVehicle.sendKeys(hrSettingsTable.get(0).get("companyVehicle"));
        BrowserUtils.wait(1);
        employeesPage.home_WorkDistance.clear();
        employeesPage.home_WorkDistance.click();
        //employeesPage.home_WorkDistance.sendKeys(hrSettingsTable.get(0).get("home_WorkDistance"));
        BrowserUtils.wait(1);
    }

    @Then("clicks save button")
    public void clicks_button() {
        employeesPage.buttonSave.click();
    }

    @Then("verifies that confirmation message is displayed at page")
    public void verifies_that_confirmation_message_is_displayed_at_page() {
        employeesPage.employeeCreatedMessage.isDisplayed();
    }

}
