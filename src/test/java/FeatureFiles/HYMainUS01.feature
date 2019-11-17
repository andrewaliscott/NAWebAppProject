Feature: HY-MAIN-US001
   @HY01
  Scenario: Verifying Request Info Button in main page
    Given User navigates to page "main"
    When User hover on "request" button
    Then Color of "request" button should change
    And "request" should be a link

  @HY01
  Scenario: Verifying Request Info Link in main page
    Given User navigates to page "main"
    When User clicks on "request" button
    Then User should navigate to page "request"

  @HY01
  Scenario: Verifying Apply Now Button in main page
    Given User navigates to page "main"
    When User hover on "apply" button
    Then Color of "apply" button should change
    And "apply" should be a link

  @HY01
  Scenario: Verifying Apply Now Link in main page
    Given User navigates to page "main"
    When User clicks on "apply" button
    Then User should navigate to page "apply"

  @HY01
  Scenario: Verifying 365 Portal Button in main page
    Given User navigates to page "main"
    When User hover on "portal" button
    Then Color of "portal" button should change
    And "portal" should be a link

  @HY01
  Scenario: Verifying 365 Portal Link in main page
    Given User navigates to page "main"
    When User clicks on "portal" button
    Then User should navigate to page "portal"