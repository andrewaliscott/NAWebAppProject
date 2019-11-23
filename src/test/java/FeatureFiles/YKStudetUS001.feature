Feature: YK-Student-US001
@US001
Scenario: Verify student page button
Given User access "urlMain"
When User hover on the student button
Then Button supposed to be clickable
And The color of the button should change
@US001
Scenario: Verify student page  url
Given User access "urlMain"
When User clicks the student button
Then User navigates student page and verify "urlStudentPage"
