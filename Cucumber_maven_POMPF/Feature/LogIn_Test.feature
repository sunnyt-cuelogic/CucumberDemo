@smoke 
Feature: Login to Gmail 
	I want to test the login to Gmail

Scenario: Gmail Login 
	Given I go to gmail page 
	When I navigate to login url 
	And I enter username and password 
	Then I should not be able to login 
