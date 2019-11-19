Feature: HY-Main Page Functionality

  Scenario: Verifying Request Info Button in main page
    Given User navigates to page "main"
    When User hover on "request" button
    Then Color of "request" button should change
    And "request" should be a link

  Scenario: Verifying Request Info Link in main page
    Given User navigates to page "main"
    When User clicks on "request" button
    Then User should navigate to page "request"

  Scenario: Verifying Apply Now Button in main page
    Given User navigates to page "main"
    When User hover on "apply" button
    Then Color of "apply" button should change
    And "apply" should be a link

  Scenario: Verifying Apply Now Link in main page
    Given User navigates to page "main"
    When User clicks on "apply" button
    Then User should navigate to page "apply"

  Scenario: Verifying 365 Portal Button in main page
    Given User navigates to page "main"
    When User hover on "portal" button
    Then Color of "portal" button should change
    And "portal" should be a link

  Scenario: Verifying 365 Portal Link in main page
    Given User navigates to page "main"
    When User clicks on "portal" button
    Then User should navigate to page "portal"

  @Test
  Scenario: Verifying location of Search Input Box in main page
    Given User navigates to page "main"
    When User sees "search" box on right side of menu bar
    Then "search" box should hold "placeholder" watermark

  @Test
  Scenario: Verifying functionality of Search Input Box in main page
    Given User navigates to page "main"
    When User types "something" on "search" box
    And User clicks on "search" button
    Then User should navigate to page "search"