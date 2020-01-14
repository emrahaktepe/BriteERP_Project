Feature: CRM feature


  Background:
    Given user is on main page
    Then user clicks on sign in button
    Then user enters valid username and password and login

  @CRM
  Scenario: create new company account at CRM Page
    When  user is able to navigate to "CRM" page
    Then  click Customer button
    Then  click Create button to add new Company information as follow
    |Name           |Street           |City   |State|ZIP  |Country      |TIN    |Tag     |Job_Position   |Phone     |Mobile    |Email                |Website          |
    |Asan Piqak inc.|8700SW Alabama st|Houston|Texas|77025|United States|889767 |Prospect|General Manager|3327768765|3327768765|Asan.Yaman@gmail.com |www.AsanPiqak.com|
    Then  click save button
    Then  verify the added company "Asan Piqak inc." is displayed at Customer page

