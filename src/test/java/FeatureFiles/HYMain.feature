Feature: HY-Main Page Functionality

  @Test
  Scenario: HY-Main-US01 Verifying Request Info Link in main page
    Given User navigates to "main" page
    When User clicks on "request" button
    Then User should navigate to "request" page

  @Test
  Scenario: HY-Main-US02 Verifying Apply Now Link in main page
    Given User navigates to "main" page
    When User clicks on "apply" button
    Then User should navigate to "apply" page

  @Test
  Scenario: HY-Main-US03 Verifying 365 Portal Link in main page
    Given User navigates to "main" page
    When User clicks on "portal" button
    And User will sign in with following information
      |username|password|
    Then User should navigate to "portal" page

  @Test
  Scenario: HY-Main-US04 Verifying location of Logo in main page
    Given User navigates to "main" page
    When User sees logo on top of main page
    Then Logo should be there in specific conditions

  @Test
  Scenario: HY-Main-US04 Verifying functionality of Logo in main page
    Given User navigates to "main" page
    When User clicks on "logo" button
    Then User should navigate to "main" page

  @Test
  Scenario Outline: HY-Main-US05 Verifying functionality of drop-down menus under logo in main page
    Given User navigates to "main" page
    When User hovers on "<menu>" title
    Then Color of "<menu>" title should change
    And "<menu>" title should be a link
    And Submenus should be displayed under "<menu>" title
    Examples:
      |menu|
      |Admissions|
      |Academics|
      |Faculty&Staff|
      |CampusLife|
      |Students|
      |AboutNAU|

  @Test
  Scenario: HY-Main-US06 Verifying location of Search Input Box in main page
    Given User navigates to "main" page
    When User sees search box on right side of menu bar
    Then Search box should hold watermark

  @Test
  Scenario: HY-Main-US06 Verifying functionality of Search Input Box in main page
    Given User navigates to "main" page
    When User types "something" on "search" box
    And User clicks on "submit" button
    Then User should navigate to "search" page