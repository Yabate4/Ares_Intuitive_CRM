Feature: User should be able to access Drive page

  User story: As a user, I want to access the Drive page.
  Acceptance criteria:
  1. Verify the users view the following 6 modules on the Drive page.
  My Drive
  All Documents
  Company Drive
  Sales and Marketing
  Top Management’s documents
  Drive Cleanup

  Background:
    Given User is logged in, and on homepage


  Scenario: As a User I should be able to access Drive page and to se six modules displayed
    Given User should be able to login with valid credential
    When User click Drive module from homepage
    Then Driver page should open with six modules displayed
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |



