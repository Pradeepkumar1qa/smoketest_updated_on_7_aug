@tag
Feature: search box
    want to check wether search box is showing proper result or not 

 Scenario: user successufully navigate to the website
	Given User is on Home Page
	When User provide some inputs to search box and click the search button
	Then should show message related to that word 
	
	
