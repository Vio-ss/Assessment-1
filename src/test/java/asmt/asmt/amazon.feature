@tag
Feature: As a Amazon user I should be able to login and logout with valid credentials

  @tag1
  Scenario: Check homepage
    Given user in home page 
    When user clicks on signin
    Then user enters details and continue
    And user in cart page 
    When user deletes cart items if present
    And user in products page 
    When user choose Electronics and headphone
    And user add top result to cart
    Then user search macbook pro
    And user add second available item
    And user return to cart page
    When user remove headphone and reduce macbook pro quantity
    And user click checkout
    Then user click account
    And user sign out
  
  

