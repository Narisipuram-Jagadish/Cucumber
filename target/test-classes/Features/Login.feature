Feature: Validation of Login details 
Background: 
	Given : Launch Facebook application 
Scenario: Tc01-Validation of log in block 
	Given  I  Launch Facebook Application 
	When   I click on create new Account 
	Then   I verify signout button is displayed 
	
	
	
	
	
Scenario Outline: TC-02 validation of login with valid credentials 
	Given  I Launch Facebook Application 
	When   I enter valid "<username>" and "<password>" 
	Then   I verify signout button is displayed 
	And    I click on Log in Button 
	
	Examples: 
		|username       |password|	
		|jagadish93|shekhar9963492118| 