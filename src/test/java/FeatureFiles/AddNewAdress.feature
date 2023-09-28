Feature: DataTable Functionality

  Background:
    Given Navigate to cleverppc
    Then click Sign in button
    When enter your email and password and click sign in button
    Then User should be login successfully

  Scenario: Add a new Adress
    And Navigate to SiteMap
    Then Navigate to Addresses Click Add New Address Button
    Then Clik to Select Adress Infromations
    And And Send Keys
    Then Click Save Button
    Then Succes Message should be displayed


