Feature: Register Functionality

  Scenario: Yeni hesap olusturma
    Given CleverPPC de hesap olusturma sayfasina git
    When Kullanici tum zorunlu bilgileri doldurdukta sonra Register butonuna tiklar.
    Then Kullanici basariyla kayit yaptigini dogrular.
