Feature: Vytrack login


  @wip
  Scenario: login as driver
    Given user go to vytrack login page
    When user enter username and password, then click login button
    Then user is on the dashboard
