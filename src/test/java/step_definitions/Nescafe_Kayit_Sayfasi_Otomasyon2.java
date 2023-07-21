package step_definitions;

import io.cucumber.java.en.Then;
import pages.Nescafe_Kayit_Otomasyon2_POM;

public class Nescafe_Kayit_Sayfasi_Otomasyon2 {

    Nescafe_Kayit_Otomasyon2_POM nko = new Nescafe_Kayit_Otomasyon2_POM();
    @Then("Üye olunduğunda gelmesi gereken bilgilendirme metnini kontrol et.")
    public void üyeOlunduğundaGelmesiGerekenBilgilendirmeMetniniKontrolEt() {
        nko.clickMethod(nko.getAydinlatmaMetni());
    }
}
