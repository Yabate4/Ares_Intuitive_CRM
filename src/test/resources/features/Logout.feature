@logout
Feature: CRM Logout feature

    User Story:
        As a user, I should be able to log out


  Background: users should access to the CRM home page successfully
    Given users are on the CRM home page

  @logoutCRM
  Scenario: As a user, I should be able to log out
    When users click the profile name
    And users should see the Log out option
    And users click the Log out button
    Then users should be back to the CRM login page

  @options
  Scenario: Users should see five options under profile name after clicking the profile name
    When users click the profile name
    Then users should see five options under profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

