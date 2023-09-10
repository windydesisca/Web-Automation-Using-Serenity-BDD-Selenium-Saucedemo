@Purchase
  Feature: Sales
    As a user i want purchase one item from list product

  Scenario: User filter product list
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page
    When User filter list  product by "Name (Z to A)"
    And User click item "Sauce Labs Onesie"
    And User click item "Test.allTheThings() T-Shirt (Red)"
    And User click cart keranjang
    When User already on cart page
    And User clicks remove product Test.allTheThings T-Shirt Red
    And User click button Check Out
    When User input "Windy" as a firstName "Desisca" as a lastName and "234501" as a postalCode
    And User click button Continue
    And User already on Checkout Overview
    Then Verify button finish
    And User already on Checkout: Complete! page

