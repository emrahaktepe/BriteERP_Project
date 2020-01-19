@Calendar
Feature: As a user I should be able to see scheduled meetings entering host name

  Scenario:
    Given user is on login page
    Then user enters valid username and password
    Then user clicks on sign in buttonn
    Then user cliks on Calendar tab module
    Then user clicks on Everybody's Calendar checkbox under Attendees
    Then user enters name 'Tabriz' on search box
    Then user should be able to see the meetings hosted by 'Tabriz'
