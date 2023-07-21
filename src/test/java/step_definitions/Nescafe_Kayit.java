package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.Nescafe_Kayit_POM;
import utilities.DriverClass;


public class Nescafe_Kayit {
    Nescafe_Kayit_POM nku = new Nescafe_Kayit_POM();

    JavascriptExecutor jse = (JavascriptExecutor) DriverClass.getDriver();

    @Given("Nescafe turkiye websitesine eriş.")
    public void nescafeTurkiyeWebsitesineEriş() {
        DriverClass.getDriver().get("https://www.nescafe.com/tr/");
        DriverClass.getDriver().findElement(By.id("_evidon-accept-button")).click();
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
        nku.sendKeysMethod(nku.getAd(), "88888");

        nku.sendKeysMethod(nku.getSoyad(), "abcd");

        Select select = new Select(nku.getDogumTarihiGun());
        select.selectByVisibleText("22");

        Select select1 = new Select(nku.getDogumTarihiAy());
        select.selectByVisibleText("06");

        Select select2 = new Select(nku.getDogumTarihiYil());
        select.selectByVisibleText("1977");

        nku.clickMethod(nku.getEmail());
        nku.sendKeysMethod(nku.getEmail(), "88888@gmail.com");
        nku.clickMethod(nku.getSifre());
        nku.sendKeysMethod((nku.getSifre()), "abcde");
        nku.clickMethod(nku.getSifreOnayi());
        nku.sendKeysMethod(nku.getSifreOnayi(), "abcde");

        nku.clickMethod(nku.getAydinlatmaMetniveGizlilikPolitikası());

      //  jse.executeScript("arguments[0].value = '88888';", nku.getAd());

        // Soyad alanına geçersiz bir değer girme
      //  jse.executeScript("arguments[0].value = 'abcd';", nku.getSoyad());

        // E-posta alanına geçersiz bir değer girme
       // jse.executeScript("arguments[0].value = '88888@gmail.com';", driver.findElement(By.name("email")));

        // Şifre alanına geçersiz bir değer girme
       // jse.executeScript("arguments[0].value = 'abcde';", nku.getSifre());

        // Şifre onayı alanına geçersiz bir değer girme
       // jse.executeScript("arguments[0].value = 'abcde';", nku.getSifreOnayi());

        // Aydınlatma metni ve gizlilik politikasını kabul etme
        //jsExecutor.executeScript("arguments[0].click();", driver.findElement(By.name("acceptTerms")));

    }

    @Then("Üye ol butonuna tıkla.")
    public void üyeOlButonunaTıkla() {
        nku.clickMethod(nku.getUyeOlButonu());
    }

    @And("Gelen formu doldururken geçersiz bir soyad değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirSoyadDeğeriGir() {
        
    }

    @And("Gelen formu doldururken geçersiz bir email değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirEmailDeğeriGir() {
        
    }

    @And("Gelen formu doldururken geçersiz bir şifre değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirŞifreDeğeriGir() {
    }
}
