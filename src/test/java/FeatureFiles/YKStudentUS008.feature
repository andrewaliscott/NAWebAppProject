Feature:YK-Student-US008
  @US008
  Scenario: Verifying Internatinal Student menu
    Given User navigates "urlStudentPage" page
    When User click on International Students Button
    Then User should able too "Student Visas","Becterial Meningitis"and "Study Abroad" menus
    And User able to see 17 panel collapse button



