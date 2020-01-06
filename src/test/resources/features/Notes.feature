@Notes
  Feature: Notes
    As a user I should be able to create and delete a note
    with a valid username and password


    Background: open login page and login
      Given user is on the login page
      Then user logs in

    Scenario: Verify Notes page
      Given user is on the Discuss page
      Then user navigates to "Notes"
      And user verifies that "Notes" page subtitle is displayed

    Scenario: Create a new note
      And user clicks "Create" button
      Then user enters "test note" to the text box then click "Save" button
      And user verifies that "Note created" message is displayed

    Scenario: Delete a note
      Then user navigates to "Action" then to "Delete"
      And user clicks "Ok" button to confirm
      Then user navigates to "Notes" page
      And user verifies that the "test note" is not displayed
