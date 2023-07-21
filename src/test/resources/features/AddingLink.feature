@B29G7-328
Feature: User should be able to add link and text in message

    User story: As a user, I should be able to add link in message.
        AC:
    1. User should be able to attach a link to the specified text.
    2. By clicking on the link user should be able to navigate to the correct URL.
    3. Link should open in a new tab

  Background: login page
    Given User is logged in, and on homepage

  Scenario: User should be able to to add link text in message
    And User should be able to see and click MESSAGE button
    Then Link button should be visible and clickable
    When User enter text "google"
    And User enter URL Link "www.google.com"
    Then User should click on Save button
    And User should click SEND button
    When User click on created Link
    Then Link should be open in new tab

