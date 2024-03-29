Feature: AdmitLTE login Feature

@regression
Scenario Outline: AdmitLTE login Scenario
Given user is already on the login page
#When user enter "kiran@gmail.com" and "123456" and clicks on login button //data driven with not using Examples keyword
When user enter "<username>" and "<password>" and clicks on login button 
Then user login should successful and user enter on Home page
Examples:
| username | password |
| kiran@gmail.com | 123456 |



 #by using data table
#@regression
#Scenario: AdmitLTE login Scenario#Given user is already on the login page
#When user enter username and password and clicks on login button 
#| username | password |
#| kiran@gmail.com | 123456 |
#Then user login should successful and user enter on Home page

@smoke
Scenario Outline: add new user Scenario
Given user is already on the login page
When user enter "<username>" and "<password>" and clicks on login button 
Then user login should successful and user enter on Home page
When  user clicks on Users link and clicks on Add user button 
Then users fills the content as username,mobile,email,gender,state and password
Then clicks on submit button
Then the pop up should popped up with successful user added message
Then close the browser
Examples:
| username | password |
| kiran@gmail.com | 123456 |

