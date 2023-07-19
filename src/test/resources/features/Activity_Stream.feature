@Activity
Feature: As a user I should be able to see all the options on the Activity stream page
  Background: user should be able to login
    Given user is on the login page of the CRM application
    When user enter username in the usernameInputBox
    And user enters password in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "Portal"

  Scenario: Verify  that user views options on the Activity stream page
    When : user should be able to click on Activity Button
    Then : user should be able to see activity page options
      |MESSAGE|
      |TASK|
      |EVENT|
      |POLL|
      |MORE|

    Scenario: Verify the users view options under the MORE tab
      Given : user should be able to see activity page options
        |MESSAGE|
        |TASK|
        |EVENT|
        |POLL|
        |MORE|
      When : user click on more tab
      Then : user should be able to see more options
      |File|
      |Appreciation|
      |Announcement|
      |Workflow|