Feature: nescafe kayit

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken geçersiz bir ad değeri gir.
    Then Üye ol butonuna tıkla.

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken geçersiz bir soyad değeri gir.
    Then Üye ol butonuna tıkla.

  Scenario:
  Given "https://www.nescafe.com/tr" websitesine eriş.
  When Üst menüde bulunan Profil logosuna tıkla.
  And Kayıt Ol seçeneğine tıkla.
  And Gelen formu doldururken geçersiz bir email değeri gir.
  Then Üye ol butonuna tıkla.

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken geçersiz bir şifre değeri gir.
    Then Üye ol butonuna tıkla.