package step_definitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import pages.Nescafe_Giris_Yap_POM;
import pages.Nescafe_Kayit_POM;
import utilities.DriverClass;


public class Nescafe_Giris_Yap {

    JavascriptExecutor jse = (JavascriptExecutor) DriverClass.getDriver();

    Nescafe_Giris_Yap_POM nky = new Nescafe_Giris_Yap_POM();
    @And("Üye Girişi seçeneğine tıkla.")
    public void üyeGirişiSeçeneğineTıkla() {
        nky.clickMethod(nky.getGirisYap());
    }

    @And("Gelen giriş sayfasını doldururken geçersiz bir email değeri gir.")
    public void gelenGirişSayfasınıDoldururkenGeçersizBirEmailDeğeriGir() {
        nky.clickMethod(nky.getEmail());
        nky.sendKeysMethod(nky.getEmail(), "abcd");
        jse.executeScript("arguments[0].click()", nky.getEmail());


    }
}
