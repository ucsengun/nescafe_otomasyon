package step_definitions;

import io.cucumber.java.en.And;
import pages.Nescafe_Giris_Yap_POM;
import pages.Nescafe_Kayit_POM;

public class Nescafe_Giris_Yap {

    Nescafe_Giris_Yap_POM nky = new Nescafe_Giris_Yap_POM();
    @And("Üye Girişi seçeneğine tıkla.")
    public void üyeGirişiSeçeneğineTıkla() {
        nky.clickMethod(nky.getGirisYap());

    }
}
