@Login
Feature:  Login
  As user, I want to be able to login into BriteERP
  under different roles with username and password

  Scenario:
    Given user is on main page
    Then user clicks on login button
    Then user enter valid username and password
    Then user clicks lohin button
    Then user should see the
    Then user closes the browser