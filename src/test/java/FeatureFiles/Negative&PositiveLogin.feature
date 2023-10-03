Feature: Negative and Positive Login

  Background:

    Given Navigate to cleverppc
    Then  click Sign in button

  Scenario Outline: Login Functionality
    And User send keys in Dialog
      | emailInput    | <email>    |
      | passwordInput | <password> |
    Then Click on Element in Dialog
      | logInButton |

    Examples:
      | email            | password |
      | aaa321@gmail.com | 12234t   |
      | bbb458@gmail.com | g02893   |
      | ccc789@gmail.com | zo3k90   |
      | ddd346@gmail.com | 982hss   |
      | eee746@gmail.com | 123hfb   |
      | abc123@gmail.com | 123456   |