Feature: Login functionality

  Scenario: Successful login

    Given the user is on the login page
    When the user logs in with valid credentials
    Then the user should see the inventory page