Feature: Test Inventory page

  Background: 
    Given User must be login with valid credentials
      | standard_user | secret_sauce |
    Given User is on inventory page

  Scenario: TEst fortotal product count
    When user get the current count of product
    Then total product should match to 6

  Scenario: Test for product details
    When User getthe product details
    Then All product should be display

  Scenario: Test for add product to cart
    When User add product to cart "Sauce Labs Bolt T-Shirt"
    Then Product should beadded to the cart

  Scenario: Lunch add to cart page
    When user click on cart option
    Then cart page should be open
