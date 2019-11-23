Feature:YK-Student-US005
  @US005
  Scenario: Verifying to access emailLogin page on new tab
    Given User navigates "urlStudentPage" page
    When User able to see myNAuLogin button  and click
    Then User shoudl able to access "login.microsoftonline.com" on an ew tab

