Feature: Test Inventory page

  Background: 
    Given User must be login with valid credentials
      | standard_user | secret_sauce |
    Given User is on inventory page

  Scenario: Test user added product display in cart page
    When user click on add to cart button
    Then cart page is visible

  Scenario: Test after click on checkout button checkout page should be open
    When user click on checkout button
    Then checkout page is visible
    
 Scenario: Test user fill all the information for dispach
  When user enter first name "ashwini",last name "garad" and address "4140010"
When user click on continue button
 Then checkout display page should be display  
