Feature: Login to SauceDemo

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter username "standard_user" and password "secret_sauce"
    And I click login button
    Then I should be redirected to inventory page
    And I should see products

  Scenario: Failed login with invalid credentials
    Given I am on the login page
    When I enter username "invalid_user" and password "wrong_password"
    And I click login button
    Then I should see error message "Epic sadface: Username and password do not match any user in this service"