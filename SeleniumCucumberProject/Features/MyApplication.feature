Feature: Test Facebook smoke scenario

Scenario: Test login with valid credentials
Given Open firefox and start application
When I enter valid "shaheeruddinsyeds@gmail.com" and valid "liviya5A6"
Then user should be able to login successfully