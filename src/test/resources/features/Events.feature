@Events
  Feature: Events
    As a user I should be able to create event under Events module

    Background: Go to Events module
      Given user is on the login page
      Then user logs in
      Then user navigates to "Events" then click

    Scenario: Create event
      Then user click on "Create" button
      Then user adds new event information:
