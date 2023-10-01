Feature:  Login funtionality

  Background:
    Given Navigate to cleverppc
    Then  click Sign in button

  Scenario: Login

    When  Enter fail your email and password and click sign in button
    Then  User should be login successfully
    When  enter your email and password and click sign in button
    Then  User should be login successfully




