Feature:YK-Student-US003
  @US003
  Scenario: Verify search box and watermark
    Given User navigates "urlStudentPage" page
    When User able to see search box at right top
    Then Search box should  have "Search..."
  @US003
  Scenario: Verify search box proper input values
    Given User navigates "urlStudentPage" page
    When User enter a key word includes lowercase, uppercase letters and numbers "ABCdef123"
    Then Current url contains the exact key word "ABCdef123"
  @US003
  Scenario: Verify search box negative input values
    Given User navigates "urlStudentPage" page
    When User enters any special character "!@#$%^"
    Then user able see oops! message
  @US003
  Scenario: Verify search box search history
    Given User navigates "urlStudentPage" page
    When User click on search box
    Then user able to see search history "ABCdef123" and "!@#$%^"





