@regression @smoke
Feature: CRM Login Feature

  User Story:
  As a user, I should be able to login; so that I can land on homepage.

  Background: For all scenarios user is on the login page of the CRM application
    Given user is on the login page of the CRM application

  Scenario: As a user, I should be able to login
    When user enter username in the usernameInputBox
    And user enters password in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "Portal"