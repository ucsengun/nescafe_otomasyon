Feature: nescafe giriş yap

  Scenario: Üye Girişi Geçersiz Email Hata Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken geçersiz bir email değeri gir.
    Then Giriş yap butonuna tıkla.

  Scenario: Üye Girişi Geçersiz Şifre Hata Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken geçersiz bir şifre değeri gir.
    Then Giriş yap butonuna tıkla.

  Scenario: Üye Girişi Email Kısmı Boş Bırakma Hata Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken email kısmını boş bırak.
    Then Giriş yap butonuna tıkla.

  Scenario: Üye Girişi Şifre Kısmı Boş Bırakma Hata Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken şifre kısmını boş bırak.
    Then Giriş yap butonuna tıkla.

  Scenario: Üye Girişi Tamamen Doldurulduğunda Başarılı Girişin Doğrulaması
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken tüm değerleri uygun bir şekilde gir.
    Then Giriş yap butonuna tıkla.

