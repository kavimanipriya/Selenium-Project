Feature: Leaftaps Login functionality- postive

Background:
Given Launch the browser
And Load the application url

Scenario: TC001_Login to application


Given Enter  Username as Demosalesmanager
And Enter password as crmsfa
When Click on Login Button
Then Homepage should be displayed

Scenario: TC002_Login to application - Negative


Given Enter  Username as Demosalesmanager
And Enter password as crmsfa123
When Click on Login Button
Then Error message should be displayed

