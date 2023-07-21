@B29G7-333 @appreciation
Feature: Appreciation Feature
  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.

  Background: User should be logged in the CRM and have access to features
    Given user is on the login page of the CRM application
#    Then user logs in the CRM



  @B29G7-363 @appreciation
  Scenario Outline: User sends an appreciation by filling in the mandatory fields - using the default option of "All employees"
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user types text into the Message Content field
    And user sees that the All employees option is selected in the To field
    And user clicks the SEND button
    Then user sees the appreciation message displayed on message board

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-365 @appreciation
  Scenario Outline: User sends an appreciation by filling in the mandatory fields - using the default option of "All employees" and choosing one additional employee group
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user types text into the Message Content field
    And user sees that the All employees option is selected in the To field
    Then user clicks the Add more option in the To field
    And user clicks on the employees and departments option
    And user clicks on the first available group
    And user clicks on the first available option
    And user closes the Add more option window
    And user clicks the SEND button
    Then user sees the appreciation message displayed on message board

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |
  @B29G7-367 @appreciation
  Scenario Outline: User sends appreciation by filling in the mandatory fields - using the default option of "All employees" and choosing one email address
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user types text into the Message Content field
    And user sees that the All employees option is selected in the To field
    Then user clicks the Add more option in the To field
    And user clicks on the marketing1@cybertekschool.com option
    And user closes the Add more option window
    And user clicks the SEND button
    Then user sees the appreciation message displayed on message board

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-369 @appreciation
  Scenario Outline: User is able to send an appreciation by filling in the mandatory fields - by choosing one email address group
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user types text into the Message Content field
    And user sees that the All employees option is selected in the To field
    Then user clicks on x to cancel the All employees selection
    Then user clicks on the To field
    And user clicks on the marketing1@cybertekschool.com option
    And user closes the Add more option window
    And user clicks the SEND button
    Then user sees the appreciation message displayed on message board

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-370 @appreciation
  Scenario Outline: User is able to send an appreciation by filling in the mandatory fields - by choosing an employee group
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user types text into the Message Content field
    And user sees that the All employees option is selected in the To field
    Then user clicks on x to cancel the All employees selection
    Then user clicks on the To field
    And user clicks on the employees and departments option
    And user clicks on the first available group
    And user clicks on the first available option
    And user closes the Add more option window
    And user clicks the SEND button
    Then user sees the appreciation message displayed on message board

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-374 @appreciation
 Scenario Outline: User sees error message for the Message Content mandatory field when the Message Content field is empty
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user clicks the SEND button
    Then user sees an error message for title field "The message title is not specified"

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-375 @appreciation
 Scenario Outline: User sees error message for the Message Content mandatory field when the To field is empty
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user types text into the Message Content field
    And user sees that the All employees option is selected in the To field
    Then user clicks on x to cancel the All employees selection
    And user clicks the SEND button
    Then user sees an error message for to field "Please specify at least one person."

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-371 @appreciation
  Scenario Outline: User can see that the delivery by default is set to All employees
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    Then user sees that the To field has the "All employees" option selected by default

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-372 @appreciation
  Scenario Outline: User can cancel sending appreciation at any time before sending - after clicking the Appreciation tab
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user click on the CANCEL button
    Then user can see that the MORE tab is now displayed

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @B29G7-373 @appreciation
  Scenario Outline: User can cancel sending appreciation at any time before sending - after clicking the Appreciation tab and typing text
    When user enter "<username>" in the usernameInputBox
    And user enters "<password>" in the passwordInputBox
    And user click the login button
    Then user should see that the title of the page is "<title>"
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    And user types text into the Message Content field
    And user click on the CANCEL button
    Then user can see that the MORE tab is now displayed

    Examples: Credentials to login as hr
      | username                       | password | title  |
      | hr78@cybertekschool.com        | UserUser | Portal |
      | marketing35@cybertekschool.com | UserUser | Portal |
      | helpdesk14@cybertekschool.com  | UserUser | Portal |

  @testingOptions
  Scenario:
    When user clicks the MORE tab
    And user clicks on the Appreciation option
    Then user clicks the Add more option in the To field
    And user clicks on the employees and departments option
    And user clicks on the first available group
    And user clicks on the first available option







