Feature: Validate if navigation bar is visible


  Background:
    Given user go to vytrack login page


  Scenario: validate navigation bar
    When user enter username and password, then click login button
    Then user should be able to see options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  @wip
  Scenario Outline: login with different role
    When user choose "<role>"
    Then user is on the dashboard
    Examples:
      | role  |
      | Sales |
      | Store |
