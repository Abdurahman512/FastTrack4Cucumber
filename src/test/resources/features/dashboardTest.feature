Feature: Validate if navigation bar is visible


  @wip
  Scenario: validate navigation bar
    Given  user go to vytrack login page
    When user enter username and password, then click login button
    Then user should be able to see options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

