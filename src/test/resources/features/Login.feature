@Login
Feature:  Login
  As user, I want to be able to login into BriteERP
  under different roles with username and password

  Scenario:
    Given user is on main page
#<<<<<<< HEAD
#    Then user clicks on login button
#    Then user enter valid username and password
#    Then user clicks login button
#    Then user should see the
#    Then user closes the browser
#    Then user accepts
#=======
    Then user clicks on sign in button
    Then user enters valid username and password and login
    Then page title should be "Odoo"
#>>>>>>> fcfc42eb9a64c03654ea7946632e5c4c660989e2
