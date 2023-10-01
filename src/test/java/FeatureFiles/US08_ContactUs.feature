Feature: Conntact Us Functionality


  Background:
    Given Navigate to cleverppc
    Then  click Sign in button
    When  enter your email and password and click sign in button
    Then  User should be login successfully

  Scenario: Contact Us and Send a Email
    When Click on Element
      | contactUsButton |
    And Select Information's
      | selectCustomerService |
      | selectOrderNumber     |
      | selectProduct         |
    Then User Send Keys
      | emailInput |
      | textInput  |
    When User Upload File
      | chooseFileButton |
      | Robot            |
      | sendButton       |
      | successMessage   |


