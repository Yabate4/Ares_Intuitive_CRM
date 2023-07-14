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

    @wip
  Scenario Outline: As a user, I should be able to login
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"

    @hr
    Examples: Credentials to login as hr
      | username               | password | title  |
      | hr1@cybertekschool.com | UserUser | Portal |
      | hr2@cybertekschool.com | UserUser | Portal |
      | hr3@cybertekschool.com | UserUser | Portal |

    @helpDesk
    Examples: Credentials to login as helpDesk
      | username                     | password | title  |
      | helpdesk1@cybertekschool.com | UserUser | Portal |
      | helpdesk2@cybertekschool.com | UserUser | Portal |
      | helpdesk3@cybertekschool.com | UserUser | Portal |

    @marketing
    Examples: Credentials to login as Marketing
      | username                      | password | title  |
      | marketing1@cybertekschool.com | UserUser | Portal |
      | marketing2@cybertekschool.com | UserUser | Portal |
      | marketing3@cybertekschool.com | UserUser | Portal |