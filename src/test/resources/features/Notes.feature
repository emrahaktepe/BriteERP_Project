@Notes
  Feature: Notes
    As a user I should be able to create and delete a note
    with a valid username and password


    Background: open login page and login
      Given user is on main page
      Then user clicks on sign in button
      Then user enters valid username and password and login
      Then page title should be "Odoo"
      Then user navigates to "Notes"
      And page title should be displayed as "Notes - Odoo"

    Scenario: Create a new note
      And user clicks create button
      Then user enters "test note" to the text box then click save button
      And user verifies that new note is created

    Scenario: Delete a note
      Then user clicks notes drop down clicks then to delete
      And user clicks ok button to confirm
      Then user verifies that the note is not displayed
