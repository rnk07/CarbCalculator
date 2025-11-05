Feature: Validate system shows an error for invalid input

Background:
Given  user is going to carb calculator site

Scenario: Verify if system shows an error for invalid inputs
	When Metrics units is selected default
	And enter invalid input for all the fields
	And Click on calculate button
	Then Verify if system shows an error or not