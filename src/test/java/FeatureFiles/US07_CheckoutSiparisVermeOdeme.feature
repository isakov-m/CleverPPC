Feature: Checkout

  Background:
    Given Navigate to cleverppc
    Then click Sign in button
    When enter your email and password and click sign in button
    Then User should be login successfully
    And Element Random Click in Dialog
    Then Verify your Shopping elements ind Add to Cart


  Scenario: Shopping and Payment
    And Shop and Payment
      | shoppingCart          |
      | proceedCheckoutButton |
      | proceedCheckoutButton |
      | IAgree                |
      | proceedCheckoutButton |
    When Check the Payment Methods
      | paypalButton     |
      | paypalMessage    |
      | BackPage         |
      | creditCardButton |
      | BackPage         |
      | bankWireButton   |
    Then Finish the Payment
      | Total-price           |
      | confirmButton         |
      | shoppingFinishMessage |
      | orderNumber           |

