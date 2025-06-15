Feature: Test SwagLab appliation for Login

  Background: 
    Given Open Swaglab appliation

  Scenario: Test for title
    When user get the current title
    Then Ttile should be match "Swag Labs"

  Scenario: Test with valid credentials
    When user enter valid username and password
    And click on login button
    Then user should be login and navigate to Inventory page
