Feature: signup page
Scenario: validate the signup 
Given user Should be at signup page
When user click on continue with facebook
Then user should redirect to next page

Scenario: validate the log in to facebook
Given user should be at login page
When user enter the gmail "xyz@gmail.com"
And user enter the password "123"
Then user should be get errror message 