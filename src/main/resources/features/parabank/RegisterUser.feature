Feature: Register user on the webpage

  Scenario: Register a new user
    Given I am on the register page
    When I sign up with correct credentials and store it as user_A
    Then verify that the user user_A is registered
