Feature: AddToCart Functionality

  Scenario:  Sepete ürün Ekleme
    Given Navigate to cleverppc
    When Ürün Secme
    Then Ürün Ekleme
    And AddToCart Dogrulama
