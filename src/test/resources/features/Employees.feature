Feature: Employees feature

  Background:
    Given user is on main page
    Then user clicks on sign in button
    Then user enters valid username and password and login

  @Employees
  Scenario:
    Given   user navigates to "Employees" page
    And     clicks on Create button
    Then    enters following information to create a new employee
    |fullName       |jobDetail |workAddress               |workLocation |workEmail            |workMobile   |workPhone    |department |jobPosition      |manager        |coach      |workingHours |otherInformation |
    |Abuzer Kadayif |Employee  |123 Menemen Rd. Menemen, TX|Center       |a.kadayif@apple.com  |504 444 2424 |408 606 5775  |CRM      |QA Test Engineer |Michael Knight |Bruce Lee  |40         |  Deneme               |
    Then     clicks on Private Information tab and enters following information
    |nationality  |identificationNo |passportNo  |bankAccountNumber |gender  |maritalStatus|numberOfChildren|visaNo |workPermitNo |visaExpireDate |privateAddress         |dateOfBirth|placeOfBirth|
    |American     |1234567890       |AB4445566   |300 239 222       |Male    |Married      |12              |887799 |PERM 3-45-67 |10/20/2021     |123 Wood St. Irvine, CA|10/25/1977 |California  |
    Then     clicks on HR Settings tab and enters following information
    |relatedUser|badgeID |medicalExam|companyVehicle |home_workDistance|
    |Brad Pitt  |ABK3333 |01/10/2020 |Tesla Model S  |Hundred         |
    Then    clicks save button
    Then    verifies that confirmation message is displayed at page
