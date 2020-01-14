package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NotesPage extends BasePage {

    @FindBy(xpath= "//button[contains(text(), 'Create')]")
    public WebElement createButton;

    @FindBy(className= "note-editable")
    public WebElement textBox;

    @FindBy(className= "o_form_button_save")
    public WebElement saveButton;

    @FindBy(css= ".o_thread_message_content p")
    public WebElement noteSavedMessage;

    @FindBy(xpath= "//div[@class='o_dropdown_kanban dropdown']/a")
    public WebElement noteDropDown;

    @FindBy(xpath= "//a[@data-type='delete']")
    public WebElement deleteButton;

    @FindBy(xpath= "//span[contains(text(), 'Ok')]/parent::button")
    public WebElement okButton;

    @FindBy(xpath= " //div[@data-original-title='<p>0 records</p>']/span[contains(text(), 'Today')]")
    public WebElement noNotes;

    @FindBy(className= "oe_kanban_global_click_edit")
    public WebElement noteItem;

    public Actions actions = new Actions(Driver.get());

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

}
