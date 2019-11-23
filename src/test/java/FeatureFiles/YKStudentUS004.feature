Feature:YK-Student-US004
  @US004
  Scenario: Verify search box and watermark
    Given User navigates "urlStudentPage" page
    When User able to see Quick links and mouser over all links
    Then All quick links items should be clickable
    And Link text shoudl be change when user mouse over
