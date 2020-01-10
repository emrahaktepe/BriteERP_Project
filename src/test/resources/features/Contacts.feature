@Contacts
  Feature: Contacts
    As a user I should be able to create new contact

    Scenario: Create a Contact
      Given user is on the login page
      When user logs in as posmanager
      And user navigates to "Contacts" module
      Then user clicks "Create" button
      Then user fill the form

        |Name |Street         |City     |ZIP  |Country |TIN            |Job_Position  |Phone       |Mobile       |Email       |Website         |
        |Esra |261 Shasta Dr. |Plano    |7525 |Turkey  |e.ASDFG123     |Sale Director |821 208 9264|123 456 7890 |adf@mail.com|www.odoo.com    |

       Then user click on save button
       Then verify the added contact "Esra" is displayed at Contacts page
