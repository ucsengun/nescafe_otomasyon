Feature: nescafe giriş yap

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken geçersiz bir email değeri gir.
    Then Giriş yap butonuna tıkla.

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken geçersiz bir şifre değeri gir.
    Then Giriş yap butonuna tıkla.

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken email kısmını boş bırak.
    Then Giriş yap butonuna tıkla.

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken şifre kısmını boş bırak.
    Then Giriş yap butonuna tıkla.

  Scenario:
    Given "https://www.nescafe.com/tr" websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Üye Girişi seçeneğine tıkla.
    And Gelen giriş sayfasını doldururken tüm değerleri uygun bir şekilde gir.
    Then Giriş yap butonuna tıkla.

