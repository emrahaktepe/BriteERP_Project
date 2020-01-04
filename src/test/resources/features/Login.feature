@Login
Feature:  Login
  As user, I want to be able to login into BriteERP
  under different roles with username and password

  Scenario:
    Given user is on main page
    Then user clicks on login button
    Then user enter valid "<username>" and "<password>"
      | username                    | password         |
      | eventscrmmanager41@info.com | eventscrmmanager |
      | posmanager54@info.com       | posmanager       |


    Then user clicks login button
    Then the page subtitle should be "<#Inbox - Odoo>"

