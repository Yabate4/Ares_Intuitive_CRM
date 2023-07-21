@B29G7-332
Feature: Creating a Poll functionality

  User Story:
  As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Scenario: The delivery should be to 'All employees' by default.
    Given User is on the crm home page.
    Then User should click the POLL option
    And User should see All employees should be displayed as a default


  Scenario: User should be able to create a poll by adding questions and multiple answers.
    Given User is on the crm home page.
    Then User should click the POLL option
    And User type question in Question input box
    And User type answer in the Answer input box
    And User type another answer in the second Question input box
    Then User type text in the poll text area a message
    Then User click send option



  Scenario: User should be able to select the “Allow multiple choice” checkbox
    Given User is on the crm home page.
    Then User should click the POLL option
    And User should click Allow multiple choice box.


  Scenario: User should see Error message: "The message title is not specified"
    Given User is on the crm home page.
    Then User should click the POLL option
    Then User clicks send
    And User should see  Error message The message title is not specified should appear.


  Scenario: User should see Error message: "Please specify at least one person"
    Given User is on the crm home page.
    Then User should click the POLL option
    Then User type question in the Question input box
    And User type answer in the input box
    Then User type message in the poll input box area and select an employee
    Then User click All employees button to unselect employees
    And User click send button
    And User should see  Error message Please specify at least one person should appear.

  Scenario: User should see Error message: "The question text is not specified." should appear
    Given User is on the crm home page.
    Then User should click the POLL option
    Then User type in the poll input box a message
    And User fill in an answer in the Answer input box
    And User click send button
    And User should see  Error message The question text is not specified. should appear


  Scenario: User should see Error message: "The question "........." has no answers."
    Given User is on the crm home page.
    Then User should click the POLL option
    Then User type a question in the Question input box
    Then User type in the message poll input box
    Then User clicks send button
    And User should see  Error message  The question "........." has no answers. should appear.