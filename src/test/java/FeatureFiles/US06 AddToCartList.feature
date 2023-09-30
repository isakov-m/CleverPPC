Feature: DataTable Functionality

  Background:
    Given Navigate to cleverppc
    Then click Sign in button
    When enter your email and password and click sign in button
    Then User should be login successfully

  Scenario: Add To Cart List
    Then Element Random Click in Dialog
      | DressesLink            |
      | PRODUCTS               |
      | addToCartButton        |
      | continueShoppingButton |
      | DressesLink            |
    And Verify your Shopping elements ind Add to Cart
      | shoppingCart      |
      | AddToCartElements |









