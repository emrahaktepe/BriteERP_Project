Feature: CRM feature


  Background:
    Given user is on main page
    Then user clicks on login button
    Then user enter valid username and password
    Then user clicks lohin button
    Then user navigates to "Notes"

  @CRM
  Scenario: create new account
    Given click Create button
    Then  user input Opportunity Title as ""
