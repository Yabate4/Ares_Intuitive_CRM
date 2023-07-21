@B29G7-410
Feature: Company Structure feature

  User Story: As a user, I should be able to use functions on Company Structure under Employee menu.
  AC1: All user types should be able to display company structure.
  AC2: Hr user should be able to add a department from the company structure.
  AC3: There is no “ADD DEPARTMENT” option for Helpdesk and Marketing users.

  Background: For all scenarios user is on the login page of the CRM application
    Given user is on the login page of the CRM application


	#{color:#de350b}*User Story:*{color} As a user, I should be able to use functions on Company Structure under Employee menu.{color:#de350b}
	#*AC1:*{color} All user types should be able to display company structure.
	#
	# 
  @B29G7-407
  Scenario Outline: All user types should be able to display company structure.
    Given user login to CRM application with "<username>" and "<password>" credentials
    When user click the Employees page button on sidebar
    Then user should see the title of the page is "Company Structure"

    Examples:
      | username                      | password |
      | hr3@cybertekschool.com        | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com | UserUser |

	#{color:#de350b}*User Story:*{color} As a user, I should be able to use functions on Company Structure under Employee menu.{color:#de350b}
	#*AC2:*{color} Hr user should be able to add a department from the company structure.
	#
	# 
  @B29G7-408
  Scenario: Hr user should be able to add a department from the company structure.
    Given user login to CRM application with "hr3@cybertekschool.com " and "UserUser" credentials
    When user click the Employees page button on sidebar
    And user write department name as "test department" into department name input box
    And user select the option as " .  . GoodGuys" from parent department dropdown box
    And user click the add button
    Then user should see created department by itself

	#{color:#de350b}*User Story:*{color} As a user, I should be able to use functions on Company Structure under Employee menu.{color:#de350b}
	#*AC3:*{color} There is no “ADD DEPARTMENT” option for Helpdesk and Marketing users.
	#
	# 
  @B29G7-409
  Scenario Outline: There is no “ADD DEPARTMENT” option for Helpdesk and Marketing users.
    Given user login to CRM application with "<username>" and "<password>" credentials
    When user click the Employees page button on sidebar
    Then user should not see the add department button

    Examples:
      | username                      | password |
      | helpdesk3@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com | UserUser |