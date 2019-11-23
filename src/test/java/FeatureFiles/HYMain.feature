Feature: HY-Main Page Functionality

  Scenario: Verifying Request Info Link in main page
    Given User navigates to page "main"
    When User clicks on "request" button
    Then User should navigate to page "request"

  Scenario: Verifying Apply Now Link in main page
    Given User navigates to page "main"
    When User clicks on "apply" button
    Then User should navigate to page "apply"

  @Test
  Scenario: Verifying 365 Portal Link in main page
    Given User navigates to page "main"
    When User clicks on "portal" button
    And User will sign in with following information
      |username|password|
    Then User should navigate to page "portal"

  Scenario: Verifying location of Search Input Box in main page
    Given User navigates to page "main"
    When User sees "search" box on right side of menu bar
    Then "search" box should hold watermark

  Scenario: Verifying functionality of Search Input Box in main page
    Given User navigates to page "main"
    When User types "something" on "search" box
    And User clicks on "search" button
    Then User should navigate to page "search"

  #@Test
  Scenario:
    Given User navigates to page "main"
    When User sees "<string>" box on right side of menu bar
    Then Logo should be there in specific conditions

  #@Test
  Scenario:
  Given User navigates to page "main"
  When User clicks on "logo" button
  Then User should navigate to page "main"

  #@Test
  Scenario:
    Given User navigates to page "main"
    When User clicks on "logo" button
    Then User should navigate to page "main"

# Scenario: Verifying Request Info Button in main page
#  Given User navigates to page "main"
#  When User hover on "request" button
#  Then Color of "request" button should change
#  And "request" should be a link