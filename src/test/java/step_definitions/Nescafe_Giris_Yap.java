package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
      //  nky.clickMethod(nky.getEmail());
        jse.executeScript("arguments[0].value = 'abcd';", nky.getEmail());
       // nky.sendKeysMethod(nky.getEmail(), "abcd");
      //  jse.executeScript("arguments[0].value = 'abcd'", nky.getSifre());


        WebElement element = (WebElement) jse.executeScript("return document.getElementsByName('username')[0]");
        element.sendKeys("test_username");


        //  jse.executeScript("arguments[0].click();", nky.getGirisYapButonu());
        nky.clickMethod(nky.getGirisYapButonu());
    }


    @Then("Giriş yap butonuna tıkla.")
    public void girişYapButonunaTıkla() {
        //jse.executeScript("arguments[0].click();", nky.getGirisYapButonu());
        // nky.clickMethod(nky.getGirisYapButonu());
    }

    @And("Gelen giriş sayfasını doldururken geçersiz bir şifre değeri gir.")
    public void gelenGirişSayfasınıDoldururkenGeçersizBirŞifreDeğeriGir() {
        
    }

    @And("Gelen giriş sayfasını doldururken email kısmını boş bırak.")
    public void gelenGirişSayfasınıDoldururkenEmailKısmınıBoşBırak() {
        
    }

    @And("Gelen giriş sayfasını doldururken şifre kısmını boş bırak.")
    public void gelenGirişSayfasınıDoldururkenŞifreKısmınıBoşBırak() {
        
    }

    @And("Gelen giriş sayfasını doldururken tüm değerleri uygun bir şekilde gir.")
    public void gelenGirişSayfasınıDoldururkenTümDeğerleriUygunBirŞekildeGir() {
    }
}
