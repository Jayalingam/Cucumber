Feature: To validate Facebook Login Page

  Scenario: To validate login by email and password
    Given user have to open facebook login page
    And maximize the screen
    When user have to enter email and password
    And user have to click login button
    Then user have to enter another page