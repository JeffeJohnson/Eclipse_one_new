Feature: Validation of login page in  facebook web application.

Scenario: TC01_Validating login page using invalid login credentials.
Given user launch the facebook web application.
When user enter invalid username and password.
And user click the login button.
Then verify whether error message is displayed.
Then verify whether error message with password wrong is displayed.

Scenario Outline: TC02_Validating login page using invalid login credentials.
Given user launch the facebook web application.
When user enter invalid "<username>" and "<password>".
And user click the login button.
Then verify whether error message is displayed.
Then verify whether error message with password wrong is displayed.

Examples:
|username|password|
|jeffe@213|hello22|
|sher@123|heooi|
