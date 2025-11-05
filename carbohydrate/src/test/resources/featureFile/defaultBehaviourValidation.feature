Feature: Validate bydefault behaviour Carbohydrate Calculator Site

Background:
Given  user is going to carb calculator site

Scenario: Verify the carbohydrate calculatoe is opening
	And system display application
	Then verify the title displays carbohydrate calculator
	
Scenario: Verify the form if showing default value or not upon landing. 
	When Metrics units is selected default
	And verify age has by default value 
	And verify gender has by default value
	And verify height has by default value
	And verify weight has by default value
	And verify light activity is preselected
	And click on Setting 
	And verify St jeror BMR calculaiton is selected
	And verify body fat has by default value
	
