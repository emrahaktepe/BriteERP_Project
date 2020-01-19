package com.briteERP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class EmployeesPage extends BasePage{

//==============  menu item
    @FindBy     (linkText = "Employees")
    public WebElement employeesTopMenu;

//==============  buttons create and import
    @FindBy     (xpath = "//button[@accesskey='c']")
    public WebElement createEmployeeButton;

    @FindBy     (xpath= "//button[contains(text(), 'Import')]")
    public WebElement importEmployeeButton;

//==============search box
    @FindBy     (css = ".o_searchview_input")
    public WebElement searchBox;

//==============top rightbuttons reverse and forward
    @FindBy     (css = " button[accesskey='p']")
    public WebElement previousButton;

    @FindBy     (css = " button[accesskey='n']")
    public WebElement nextButton;

//==============left side menu
    @FindBy (css = "a[data-menu='161']")
    public WebElement employeesSideMenu;

    @FindBy (css = "a[data-menu='292']")
    public WebElement badgesSideMenu;

    @FindBy (css = "a[data-menu='293']")
    public WebElement challengesSideMenu;

    @FindBy (css = "a[data-menu='294']")
    public WebElement goalsHistorySideMenu;

    @FindBy (css = "a[data-menu='163']")
    public WebElement departmentsSideMenu;

        @FindBy (css = ".o_kanban_card_header_title")
        public WebElement departmentTitles;

//============== Import Button
    @FindBy (css = ".o_import_validate")
    public WebElement importButtonTestImport;

    @FindBy (css = ".o_import_import")
    public WebElement importButtonImport;

    @FindBy (css = ".o_import_cancel")
    public WebElement importButtonCancel;

//============== Create Button
    @FindBy (css = "input[name='name']")
    public WebElement employeesName;

    @FindBy (css = ".o_input .ui-autocomplete-input")
    public WebElement jobDetailInputBox;

//============== Contact Information
    @FindBy (css = "div[name='address_id'] .o_input.ui-autocomplete-input")
    public WebElement workAddress;

    @FindBy (css = "input[name='work_location']")
    public WebElement workLocation;

    @FindBy (css = "input[name='work_email']")
    public WebElement workEmail;

    @FindBy (css = "input[name='mobile_phone']")
    public WebElement workMobile;

    @FindBy (css = "input[name='work_phone']")
    public WebElement workPhone;

//============== Position
    @FindBy (css = "div[name=department_id] input")
    public WebElement department;

    @FindBy (css = "div[name=job_id] input")
    public WebElement jobPosition;

    @FindBy (css = "div[name=parent_id] input")
    public WebElement manager;

    @FindBy (css = "div[name=coach_id] input")
    public WebElement coach;

    @FindBy (css = "div[name=resource_calendar_id] input")
    public WebElement workingHours;

    @FindBy (css = "textarea[placeholder='Other Information ...'] ")
    public WebElement otherInformation;

//============== Private Information
    @FindBy (linkText = "Private Information")
    public WebElement privateInformationMenu;

//============== Citizenship & Other Information
    @FindBy (css = "div[name=country_id] .o_input")
    public WebElement nationalityCountry;

    @FindBy (css = "input[name=identification_id]")
    public WebElement identificationNo;

    @FindBy (css = "input[name=passport_id]")
    public WebElement passportNo;

    @FindBy (css = "[name=bank_account_id] .o_input")
    public WebElement bankAccountNumber;

//============== Status
    @FindBy (css = "select[name=gender]")
    public WebElement gender;

    @FindBy (css = "select[name=marital]")
    public WebElement maritalStatus;

    @FindBy (css = "input[name=children]")
    public WebElement numberOfChildren;

//============== Work Permit
    @FindBy (css = "input[name=visa_no]")
    public WebElement visaNo;

    @FindBy (css = "input[name=permit_no]")
    public WebElement workPermitNo;

    @FindBy (css = "input[name=visa_expire]")
    public WebElement visaExpireDate;

//============== Contact Information
    @FindBy (css = "div[name=address_home_id] .o_input")
    public WebElement privateAddress;

//============== Birth
    @FindBy (css = "input[name=birthday]")
    public WebElement dateOfBirth;

    @FindBy (css = "input[name=place_of_birth]")
    public WebElement placeOfBirth;

//============== HR Settings
    @FindBy (linkText = "HR Settings")
    public WebElement hrSettingsMenu;

//============== Status
    @FindBy (css = "div[name=user_id] .o_input")
    public WebElement relatedUser;

//============== Attendance
    @FindBy (css = "input[name=barcode]")
    public WebElement badgeID;

//============== Current Contract
    @FindBy (css = "input[name=medic_exam]")
    public WebElement medicalExam;

    @FindBy (css = "input[name=vehicle]")
    public WebElement companyVehicle;

    @FindBy (css = "input[name=vehicle_distance]")
    public WebElement home_WorkDistance;

//============== Save / Discard
    @FindBy (css = "span[title='Edit']")
    public WebElement photoUpload;

//============== Save / Discard
    @FindBy (css = ".o_form_button_save")
    public WebElement buttonSave;

    @FindBy (css = ".o_form_button_cancel")
    public WebElement buttonDiscard;

//==============    Discard --> Warning --> OK & Cancel
    @FindBy (css = ".modal-footer .btn-primary")
    public WebElement discardWarningButtonOK;

    @FindBy (css = ".modal-footer .btn-default")
    public WebElement discardWarningButtonCancel;

    @FindBy (css = ".o_thread_message_content > p")
    public WebElement employeeCreatedMessage;



















}
