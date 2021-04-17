Feature: Login functionality for LeafTaps

Background:
Given Open the chrome browser
And Load the application url


Scenario Outline: TC001_Login with positive credential

Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCsr'|'crmsfa'|



Scenario: TC002_Login with negative credential

Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa123'
When Click on Login button
But Error message should be displayed


