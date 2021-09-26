Feature: Verify Login Scenarios
  Background:
    Given I navigate to sauceDemo website
    When I input username

  Scenario: Verify Login without Password
    And I click LOGIN button
    Then Verify if "Epic sadface: Password is required" is required appear

  Scenario: Verify Login with wrong Password
    And I put wrong Password
    And I click LOGIN button
    Then Verify if "Epic sadface: Username and password do not match any user in this service" is required appear

  Scenario: Verify Login with correct Password
    And I put correct Password
    And I click LOGIN button, in case of the password is correct
    Then Verify if login was successful The new window title would be "Swag Labs"