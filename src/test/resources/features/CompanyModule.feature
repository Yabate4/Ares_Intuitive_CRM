@B29G7-447
Feature: As a user, I should be able to access to the Company page .

	Background:
		Given user is on the login page of the CRM application

	#{color:#de350b} _*US:*_{color}
	#
	#_As a user, I should be able to access to the Company page ._
	#
	#{color:#de350b}*_AC:_*{color} Verify users see the following modules in the Company page shown as design
	#  
	#  Official Information
	#  Our Life
	#  About Company
	#  Photo Gallery
	#  Video
	#  Career
	#  Business News (RSS)
	#  More
	@B29G7-448
	Scenario Outline: Verify users see the following modules in the Company page shown as design
		When user enter "<username>" in the usernameInputBox
		    And user enters "<password>" in the passwordInputBox
		    And user click the login button
		    Then click on Company module
		      | Official Information |
		      | Our Life             |
		      | About Company        |
		      | Photo Gallery        |
		      | Video                |
		      | Career               |
		      | Business News (RSS)  |
		      | More                 |
		
		    Examples:
		      | username                      | password |
		      | hr1@cybertekschool.com        | UserUser |
		      | helpdesk1@cybertekschool.com  | UserUser |
		      | marketing1@cybertekschool.com | UserUser |