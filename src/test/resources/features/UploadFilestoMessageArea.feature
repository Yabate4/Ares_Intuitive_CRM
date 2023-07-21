@B29G7-417
Feature: As a user, I should be able to upload files and pictures as messages


	Background:
		Given user is on the login page of the CRM application
	#_{color:#de350b}*US:*{color}_
	#
	#As a user, I should be able to upload files and pictures as messages
	#
	#_{color:#de350b}*AC1:*{color}_
	#
	#User should be able to upload files and pictures.
	#Supported file formats .pdf, .txt, .jpeg, .png, .docx
	@B29G7-414
	Scenario Outline: Verify that user should be able to upload files and pictures. Supported file formats .pdf, .txt, .jpeg, .png, .docx
		    When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then click on message button
		    Then Click on Upload files icon
		    Then Click to Upload files and images option
		
		    Examples:
		      | username                      | password |
		      | hr80@cybertekschool.com        | UserUser |
		      | helpdesk80@cybertekschool.com  | UserUser |
		      | marketing80@cybertekschool.com | UserUser |

	#{color:#de350b}_*US:*_{color}
	#
	#As a user, I should be able to upload files and pictures as messages
	#
	#{color:#de350b}_*AC2:*_{color}
	#
	#User should be able to insert the files and images into the text.
	#
	# 
	@B29G7-415
	Scenario Outline: Verify that user should be able to insert the files and images into the text.
		When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then click on message button
		    Then Click on Upload files icon
		    Then Click to Upload files and images option
		    Then  Click on Insert in text button
		
		    Examples:
		      | username                      | password |
		      | hr80@cybertekschool.com        | UserUser |
		      | helpdesk80@cybertekschool.com  | UserUser |
		      | marketing80@cybertekschool.com | UserUser |

	#{color:#de350b}_*US:*_{color}
	#
	#As a user, I should be able to upload files and pictures as messages
	#
	#{color:#de350b}_*AC3:*_{color}
	#
	#User should be able to remove files and images at any time before sending.
	@B29G7-416
	Scenario Outline: Verify that User should be able to remove files and images at any time before sending.
		    When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then click on message button
		    Then Click on Upload files icon
		    Then Click to Upload files and images option
		    Then  Click on Insert in text button
		    Then Click x(delete) button
		
		    Examples:
		      | username                      | password |
		      | hr80@cybertekschool.com        | UserUser |
		      | helpdesk80@cybertekschool.com  | UserUser |
		      | marketing80@cybertekschool.com | UserUser |