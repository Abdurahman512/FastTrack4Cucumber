Feature: Validate if navigation bar is visible


  Background:
    Given user go to vytrack login page

  @wip
  Scenario: validate navigation bar
    When user enter username and password, then click login button
    Then user should be able to see options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  Scenario Outline: login with different role
    When user choose manager "<role>"
    Then user should be able to see options
    Examples:
    |role|
    |Sales|
    |Store|
