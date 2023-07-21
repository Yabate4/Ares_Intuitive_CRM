@B29G7-423
Feature: Default

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC1:* {color}
	#
	#User should be able to send an appreciation by filling in the mandatory fields.
	#
	#{color:#4c9aff}*TC1:* {color}
	#
	#Verify that the user is able to send an appreciation by filling in the mandatory fields:
	# * 'Message Content'
	# * 'To' - using the default option of "All employees"
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	# 
	#
	# 
	@B29G7-425
	Scenario: Verify that the user is able to send an appreciation by filling in the mandatory fields - using the default option of "All employees" - AUTOMATED
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		 
		    Given user is on the login page of the CRM application
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
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC1:* {color}
	#
	#User should be able to send an appreciation by filling in the mandatory fields.
	#
	#{color:#4c9aff}*TC2:* {color}
	#
	#Verify that the user is able to send an appreciation by filling in the mandatory fields:
	# * 'Message Content'
	# * 'To' - using the default option of "All employees" and choosing one additional employee group
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	@B29G7-428
	Scenario: Verify that the user is able to send an appreciation by filling in the mandatory fields - using the default option of "All employees" and choosing one additional employee group - AUTOMATED
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		 
		    Given user is on the login page of the CRM application
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
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC1:* {color}
	#
	#User should be able to send an appreciation by filling in the mandatory fields.
	#
	#{color:#4c9aff}*TC3:* {color}
	#
	#Verify that the user is able to send an appreciation by filling in the mandatory fields:
	# * 'Message Content'
	# * 'To' - using the default option of "All employees" and choosing one email address
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	@B29G7-429
	Scenario: Verify that the user is able to send an appreciation by filling in the mandatory fields - using the default option of "All employees" and choosing one email address - AUTOMATED
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		  
		    Given user is on the login page of the CRM application
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
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC1:* {color}
	#
	#User should be able to send an appreciation by filling in the mandatory fields.
	#
	#{color:#4c9aff}*TC4:* {color}
	#
	#Verify that the user is able to send an appreciation by filling in the mandatory fields:
	# * 'Message Content'
	# * 'To' by choosing one email address
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	@B29G7-431
	Scenario: Verify that the user is able to send an appreciation by filling in the mandatory fields - by choosing one email address - AUTOMATED
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		  
		    Given user is on the login page of the CRM application
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
		    
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC1:* {color}
	#
	#User should be able to send an appreciation by filling in the mandatory fields.
	#
	#{color:#4c9aff}*TC5:* {color}
	#
	#Verify that the user is able to send an appreciation by filling in the mandatory fields:
	# * 'Message Content'
	# * 'To' by choosing one employee group
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	@B29G7-434
	Scenario: Verify that the user is able to send an appreciation by filling in the mandatory fields - by choosing one employee group - AUTOMATION
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		  
		    Given user is on the login page of the CRM application
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
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC2:*{color}
	#
	#The delivery should be to 'All employees' by default.
	#
	# 
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	# 
	#
	# 
	@B29G7-436
	Scenario: Verify that the delivery should be to 'All employees' by default - AUTOMATION
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		  
		    Given user is on the login page of the CRM application
		    When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then user should see that the title of the page is "<title>"
		    When user clicks the MORE tab
		    And user clicks on the Appreciation option
		    Then user sees that the To field has the "All employees" option selected by default
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC3:* {color}
	#
	#User should be able to cancel sending appreciation at any time before sending.
	#
	#{color:#4c9aff}*TC1:* {color}
	# * Verify that the user is able to cancel sending appreciation at any time before sending - after clicking the 'Appreciation' tab 
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	@B29G7-438
	Scenario: Verify that the user is able to cancel sending appreciation at any time before sending - after clicking the 'Appreciation' tab - AUTOMATION
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		 
		    Given user is on the login page of the CRM application
		    When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then user should see that the title of the page is "<title>"
		    When user clicks the MORE tab
		    And user clicks on the Appreciation option
		    And user click on the CANCEL button
		    Then user can see that the MORE tab is now displayed
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC3:* {color}
	#
	#User should be able to cancel sending appreciation at any time before sending.
	#
	#{color:#4c9aff}*TC2:* {color}
	# * Verify that the user is able to cancel sending appreciation at any time before sending - after entering text in the 'Message Content' field
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	@B29G7-439
	Scenario: Verify that the user is able to cancel sending appreciation at any time before sending - after entering text in the 'Message Content' field
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		 
		    Given user is on the login page of the CRM application
		    When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then user should see that the title of the page is "<title>"
		    When user clicks the MORE tab
		    And user clicks on the Appreciation option
		    And user types text into the Message Content field
		    And user click on the CANCEL button
		    Then user can see that the MORE tab is now displayed
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC1:* {color}
	#
	#User should be able to send an appreciation by filling in the mandatory fields.
	#
	#{color:#4c9aff}*TC6:* {color}
	#
	#Verify that the user is NOT able to send an appreciation when user does not fill up the 'Message Content' mandatory field and that an error message pops up displaying that :
	# * "The message title is not specified" for the 'Message Content' mandatory field
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	# 
	@B29G7-440
	Scenario: Verify that the user sees error messages for the 'Message Content' mandatory field when the 'Message Content' is empty - AUTOMATION
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		  
		    Given user is on the login page of the CRM application
		    When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then user should see that the title of the page is "<title>"
		    When user clicks the MORE tab
		    And user clicks on the Appreciation option
		    And user clicks the SEND button
		    Then user sees an error message for title field "The message title is not specified"
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |	

	#{color:#de350b}*US:*{color}
	#
	#As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
	#
	#{color:#00875a}*AC1:* {color}
	#
	#User should be able to send an appreciation by filling in the mandatory fields.
	#
	#{color:#4c9aff}*TC6:* {color}
	#
	#Verify that the user is NOT able to send an appreciation by leaving the 'To' field empty and that a pop-up message is displayed :
	# * "Please specify at least one person." for the 'To' mandatory field
	#
	#{color:#de350b}_*Data used for login pre-condition:*_{color}
	#
	#+{color:#403294}_*HR Users:*_{color}+
	#
	#*Username:* [hr5@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr12@cybertekschool.com|mailto:hr12@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [hr18@cybertekschool.com|mailto:hr18@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Marketing Users:*_{color}+
	#
	#*Username:* [helpdesk3@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk14@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [helpdesk27@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#+{color:#403294}_*Helpdesk Users:*_{color}+
	#
	#*Username:* [marketing2@cybertekschool.com|mailto:helpdesk2@cybertekschool.com] / *Password:* UserUser
	#
	#*Username:* [marketing8@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	#*Username:* [marketing23@cybertekschool.com|mailto:marketing8@cybertekschool.com] */ Password:* UserUser
	#
	# 
	@B29G7-441
	Scenario: Verify that the user sees error messages for the 'To' mandatory field when the 'To' fields is empty
		Feature: Appreciation Feature
		  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
		
		  
		    Given user is on the login page of the CRM application
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
		
		    Examples: Credentials to login as hr/marketing/helpdesk
		      | username                       | password | title  |
		      | hr78@cybertekschool.com        | UserUser | Portal |
		      | marketing35@cybertekschool.com | UserUser | Portal |
		      | helpdesk14@cybertekschool.com  | UserUser | Portal |