Feature: AdmitLTE add new user Feature

Scenario Outline: login Scenario
When user enter "<username>" and "<password>" and clicks on login button 
Then user login should successful and user enter on Home page
Examples:
| username | password | 
|kiran@gmail.com|123456|

@first
Scenario Outline: add new user Scenario
When user enter "kiran@gmail.com" and "123456" and clicks on login button 
When  user clicks on Users link and clicks on Add user button 
Then users fills the content as "<username>" ,"<mobile>", "<email>","<gender>","<state>" and "<password>"
Then clicks on submit button
Then the pop up should popped up with successful user added message

Examples:
| username | mobile | email|gender|state|password|
|Snehal | 123456 |bhojane@gmail.com|Female|Maharashtra|123|
|Vikas | 1234 |Bodade@gmail.com|Male|Maharashtra|1456|

@smoke
Scenario: visit operators link scenario
When user enter "kiran@gmail.com" and "123456" and clicks on login button 
When  user clicks on opertors link
Then verify operators page

@regression
Scenario: Logout scenario
When user enter "kiran@gmail.com" and "123456" and clicks on login button 
When  user clicks on Logout 
Then user should land on Login page 