

Feature: Notes
  As a user I should be able to create new customer
  @Sales
  Scenario: Create new customer
    Given user is on the login page
    And user logs in as posmanager
    Then user navigates to Sales page
    And user verifies that "Quotations" page subtitle is displayed
    Then user click on "Customers" button
    And user click on Create button to add new information as follow
      |Name           |Street           |City   |State  |ZIP  |Country      |TIN    |Tags     |Job_Position   |Phone     |Mobile    |Email              |Company|
      |JASMIN         |4231 oak street  |Plano  |Avaeiro|77025|ABCD         |889767 |Prospect |General Manager|3327768765|3327768765|jasmin@gmail.com   |CybrCo |
    Then user clicks on save button
    Then  verify the added customer "JASMIN" is displayed at Customer page