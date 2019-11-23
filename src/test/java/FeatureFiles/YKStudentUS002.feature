Feature:YK-Student-US002
  @US002
  Scenario: Verify student page left side menu items
    Given User navigates "urlStudentPage" page
    When Check the menu items
    Then Verify the menu items
      |Students|Registrar|Bursar’s Office|International Students|IT Services|Grievance Procedure|
  @US002
  Scenario:Verify menu items color change
    Given User navigates "urlStudentPage" page
    When Mouse hovers on menu items
    Then Verify the menu items text color change