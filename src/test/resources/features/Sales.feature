

Feature: Notes
  As a user I should be able to create new customer
  @Sales
  Scenario: Create new customer
    Given user is on the login page
    And user logs in as posmanager
    Then user navigates to "Sales" then to "Customers"
    And user click on "Create" button
    Then user select "company" and "Address Type"
    And user adds new Customer information:
      | Name          | Street      | City            | Job Position| Phone  |Mobile| Email     |
      | Sanem         | 41 oak st   | Richardson      |Manager      | 11111  |22222 |ggg@hh.com |
