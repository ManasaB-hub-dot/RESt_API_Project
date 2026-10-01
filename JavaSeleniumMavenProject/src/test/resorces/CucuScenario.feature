@TC1234
Feature: Verifying sauceLab application

Background: User is on login page
	
 Scenario: Verifying login functionality
    Given user enters username
    And enters password
    When click on login button
    Then user able to get Home page