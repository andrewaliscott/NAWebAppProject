Feature: BS-Campus-US001
  @Test
  Scenario: Verifying Campus Life Button in main page
    Given User navigates to page "urlMain"
    When User hover on "Campus" button
    Then Color of button should change


  Scenario: Verifying Campus Life Link in main page
    Given User navigates to page "urlMain"
    When User click on "Campus" button
    Then User should navigate to "Campus"