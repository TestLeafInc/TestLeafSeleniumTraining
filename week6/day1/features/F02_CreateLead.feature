Feature: Create Lead functionality for LeafTaps


@regression @functional
Scenario: TC003_Create Lead with mandatory informations

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on crmsfa link
Then MyHomePage should be displayed
When Click on Leads link