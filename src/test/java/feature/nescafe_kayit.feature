Feature: nescafe kayit

  Scenario: Kayıt Formunu Geçerli Bir Biçimde Doldur
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken tüm değerleri geçerli bir şekilde doldur.
    And Üye ol butonuna tıkla.
    Then Kontrol et.

  Scenario: Kayıt Formu Geçersiz Ad  Hata Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken geçersiz bir ad değeri gir.
    And Üye ol butonuna tıkla.


  Scenario: Kayıt Formu Geçersiz Soyad Hata Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken geçersiz bir soyad değeri gir.
    Then Üye ol butonuna tıkla.

  Scenario: Kayıt Formu Geçersiz Email Hata Doğrulaması
  Given Nescafe turkiye websitesine eriş.
  When Üst menüde bulunan Profil logosuna tıkla.
  And Kayıt Ol seçeneğine tıkla.
  And Gelen formu doldururken geçersiz bir email değeri gir.
  Then Üye ol butonuna tıkla.

  Scenario: Kayıt Formu Geçersiz Şifre Hata Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken geçersiz bir şifre değeri gir.
    Then Üye ol butonuna tıkla.