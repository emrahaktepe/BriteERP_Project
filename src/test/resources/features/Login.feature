@Login
Feature:  Login
  As user, I want to be able to login into BriteERP
  under different roles with username and password

  Scenario:
    Given user is on main page
    Then user clicks on sign in button
    Then user enters valid username and password and login
    Then page title should be "Odoo"
