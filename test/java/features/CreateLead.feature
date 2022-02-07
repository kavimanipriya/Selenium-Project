Feature: Leaftaps CreatLead functionality

Scenario: TC003_CreatLead functionality

Given Launch the browser
And Load the application url
And Enter  Username as Demosalesmanager
And Enter password as crmsfa
When Click on Login Button
And Click on CRM/SFA Link
And Click on Leads
And Create Company Name
And Create FirstName
And Create LastName
When Click on Submit Button
Then  should be created