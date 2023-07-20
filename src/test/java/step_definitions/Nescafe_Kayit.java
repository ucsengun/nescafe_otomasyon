package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Nescafe_Kayit_POM;
import utilities.DriverClass;


public class Nescafe_Kayit {
    Nescafe_Kayit_POM nku = new Nescafe_Kayit_POM();

    @Given("Nescafe turkiye websitesine eriş.")
    public void nescafeTurkiyeWebsitesineEriş() {
        DriverClass.getDriver().get("https://www.nescafe.com/tr/");
    }

    @When("Üst menüde bulunan Profil logosuna tıkla.")
    public void üstMenüdeBulunanProfilLogosunaTıkla() {
        nku.clickMethod(nku.getProfilIkonu());
    }

    @And("Kayıt Ol seçeneğine tıkla.")
    public void kayıtOlSeçeneğineTıkla() {
        nku.clickMethod(nku.getKayitOlButonu());
    }


    @And("Gelen formu doldururken geçersiz bir ad değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirAdDeğeriGir() {
        nku.clickMethod(nku.getAd());
        nku.sendKeysMethod(nku.getAd(), "88888");
    }
}
