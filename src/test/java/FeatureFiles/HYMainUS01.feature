Feature: HY-MAIN-US001
  @HY
  Scenario: Verifying Request Info Button in main page
    Given User navigates to page "urlMain"
    When User hover on "Request Info" button
    Then Color of button should change
    And Button should be a link

  @HY
  Scenario: Verifying Request Info Link in main page
    Given User navigates to page "urlMain"
    When User clicks on "Request Info" button
    Then User should navigate to page "urlRequest"

  Scenario: Verifying Apply Now Button in main page
    Given User navigates to page "urlMain"
    When User hover on "Apply Now" button
    Then Color of button should change
    And Button should be a link

  Scenario: Verifying Apply Now Link in main page
    Given User navigates to page "urlMain"
    When User clicks on "Apply Now" button
    Then User should navigate to page "urlApply"
