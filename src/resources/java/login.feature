Feature: Login Functionality
@Data-Driven
Scenario: Login Using Registered credentials
Given user must be on Login page
And user enters registered credentials
|value|
|AlexUser|
|Alex123|
Then user must be in Home Page