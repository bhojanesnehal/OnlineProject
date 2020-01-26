Feature: AdmitLTE login Feature


Scenario: AdmitLTE login Scenario
Given user opens the browser and enters the AdminLtE url in browser
Then login page opens
When user enter username and password and clicks on login button 
Then user login should successful and user enter on dashboard page
Then verify dashboard user name
Then verify Dashborad User Status


