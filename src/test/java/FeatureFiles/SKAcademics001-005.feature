Feature:SKAcademics001-005
  Scenario: Functionality of Academics web link
    Given User navigates the main page
    When User clicks Academics menu
    Then User will be able to navigate to "urlAcademics"
    And User will be able to see logo of NAU

  Scenario: Functionality of NAU web link on Academics page
    Given User navigates the main page
    When User clicks Academics menu
    Then  User click logo of NAU in Academics page
    And User should navigate to the main page

  Scenario: Functionality of Academics text link on Academics page
    Given User navigates the main page
    When User does hover over on Academics
    Then User should be able see the sub section menu
    And The background color of Academic text link should change

  Scenario: Functionality of Admissions text link on Academics page
    Given User navigates the main page
    When User does hover over on Admissions
    Then User should be able see the sub section menu
    And The background color of Admissions text link should change

  Scenario: Functionality of Faculty & Staff text link on Academics page
    Given User navigates the main page
    When User does hover over on Faculty & Staff
    Then User should be able see the sub section menu
    And The background color of Faculty & Staff text link should change

  Scenario: Functionality of Campus Life text link on Academics page
    Given User navigates the main page
    When User does hover over on Campus Life
    Then User should be able see the sub section menu
    And The background color of Campus Life  text link should change

  Scenario: Functionality of Student text link on Academics page
    Given User navigates the main page
    When User does hover over on Campus Life
    Then User should be able see the sub section menu
    And The background color of Campus Life  text link should change

  Scenario: Functionality of About NAU text link on Academics page
    Given User navigates the main page
    When User does hover over on About NAU
    Then User should be able see the sub section menu
    And The background color of About NAU text link should change