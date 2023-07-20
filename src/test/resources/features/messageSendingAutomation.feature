@B29G7-420
Feature: Default

	
	@B29G7-419
	Scenario: 2 User should be able to send a message by filling in the mandatory fields .   Mandatory fields
		Given user is on the Activity Stream page
		When user click on the message button
		    And writes his message
		    Then user should see his message is sent and displayed on top	

	
	@B29G7-418
	Scenario: 1 User should be able to send a message by filling in the mandatory fields.   Mandatory fields
		Given user is on the Activity Stream page
		    When user click on the message button
		    And writes his message
		    And user remove the All employees
		    And user able to select the specific name of employee or All employees
		    Then user should see his message is sent and displayed on top	

	
	@B29G7-421
	Scenario: 3 User should be able to send a message by filling in the mandatory fields 2.   Mandatory fields
		Given user is on the Activity Stream page
		When user click on the message button
		    And writes his message
		    And user remove the All employees
		    And user able to select the specific name of employee
		    Then user should see his message is sent and displayed on top use explicit wait	

	
	@B29G7-422
	Scenario: 4 User should be able to send a message by filling in the mandatory fields 2.   Mandatory fields
		Given user is on the Activity Stream page
		When user click on the message button
		    And writes his message
		    #And user remove the All employees
		    And user able to select the specific Email of employee
		    Then user should see his message is sent and displayed on top	

	# 
	#
	# 
	@B29G7-424
	Scenario:  5 Verify if User should be able to see Error messages for mandatory message fields:"The message title is not specified"  
		Given user is on the Activity Stream page
		When user click on the message button
		    And user remove the All employees
		    And user able to select the specific name of employee or All employees
		    Then user should see Error messages for mandatory message fields:The message title is not specified	

	
	@B29G7-426
	Scenario: 6 Verify if User should be able to see Error messages for mandatory message fields:"The message title is not specified"
		Given user is on the Activity Stream page
		  When user click on the message button
		      # And user remove the All employees
		      # And user able to select the specific name of employee or All employees
		    Then user should see Error messages for mandatory message fields:The message title is not specified	

	
	@B29G7-427
	Scenario: 7 Verify if User should be able to see Error messages for mandatory reciepient fields:"Please specify at least one person."
		Given user is on the Activity Stream page
		When user click on the message button
		    And writes his message
		    And user remove the All employees
		    #And user able to select the specific name of employee or All employees
		    Then user should see Error messages for mandatory reciepient fields:Please specify at least one person.	

	
	@B29G7-430
	Scenario: 8 Verify if User should be able to see Error messages for mandatory reciepient fields:"Please specify at least one person."  
		Given user is on the Activity Stream page
		When user click on the message button
		    And writes his message
		    And user remove the All employees
		    #And user able to select the specific name of employee or All employees
		    Then user should see Error messages for mandatory reciepient fields:Please specify at least one person.	

	
	@B29G7-432
	Scenario: 9 Verify that User should be able to cancel sending messages at any time before sending.  
		Given user is on the Activity Stream page
		When user click on the message button
		    And writes his message
		    And user remove the All employees
		    And user able to select the specific name of employee or All employees
		    Then user should cancel his message	

	
	@B29G7-433
	Scenario: 10 Verify that User should be able to cancel sending messages at any time before sending.  
		Given user is on the Activity Stream page
		   When user click on the message button
		    #And writes his message
		    And user remove the All employees
		    And user able to select the specific name of employee or All employees
		    Then user should cancel his message	

	
	@B29G7-435
	Scenario: 11 Verify that User should be able to cancel sending messages at any time before sending.  
		Given user is on the Activity Stream page
		  When user click on the message button
		    And writes his message
		    And user remove the All employees
		    #And user able to select the specific name of employee or All employees
		    Then user should cancel his message	

	
	@B29G7-437
	Scenario:  12 Verify that User should be able to cancel sending messages at any time before sending.  
		Given user is on the Activity Stream page
		When user click on the message button
		    #And writes his message
		    #And user remove the All employees
		    #And user able to select the specific name of employee or All employees
		    Then user should cancel his message	

	
	@B29G7-442
	Scenario:  13 Verify that the message delivery should be to 'All employees' by default.  
		Given user is on the Activity Stream page
		When user click on the message button
		    #And writes his message
		    #And user remove the All employees
		    #And user able to select the specific name of employee or All employees
		    Then user should see that the message is to'All employees' by default.