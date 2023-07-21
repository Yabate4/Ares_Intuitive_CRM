Feature: Employees page access
  User Story: User want to access the Employees page and be able to see 8 modules and company structure.
  Accounts are: hr, helpdesk, marketing.

  Background: for all scenarios user successfully logged in under each account.
    Given user is on the home page of the application.
    When user enter username in the usernameInputBox
    And user enters password in the passwordInputBox
    And user click the login button

  @first
  Scenario: Users access Employees module and sees the 8 modules in the Employees page
    When User access Employees module.
    Then Users sees the following 8 modules in the Employees page
      |Company Structure|
      |Find Employee|
      |Telephone Directory|
      |Staff Changes|
      |Efficiency Report|
      |Honored Employees|
      |Birthdays|
      |New page|
  @second
  Scenario: User is on employee page and sees Company structure
    When User access Employees module.
    And user on the employee home page sees "Company Structure"
