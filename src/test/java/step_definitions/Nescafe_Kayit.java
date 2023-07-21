package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.Nescafe_Kayit_POM;
import utilities.DriverClass;

import java.util.List;
import java.util.stream.Collectors;


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
    public void gelenFormuDoldururkenGeçersizBirAdDeğeriGir() throws InterruptedException {
        nku.sendKeysMethod(nku.getAd(), "88888");

        nku.sendKeysMethod(nku.getSoyad(), "abcd");

        Select select = new Select(nku.getDogumTarihiGun());
        select.selectByVisibleText("22");

        Select select1 = new Select(nku.getDogumTarihiAy());
        select1.selectByVisibleText("06");

        Select select2 = new Select(nku.getDogumTarihiYil());
        select2.selectByVisibleText("1977");


        nku.sendKeysMethod(nku.getEmailKayit(), "88888@gmail.com");
        // jse.executeScript("arguments[0].value = '88888@gmail.com';", nku.getEmailKayit());

        nku.sendKeysMethod((nku.getSifreKayit()), "abcde");
        nku.sendKeysMethod(nku.getSifreOnayi(), "abcde");


        // nku.clickMethod(nku.getAydinlatmaMetniveGizlilikPolitikası());


        ((JavascriptExecutor) DriverClass.getDriver()).executeScript("window.scrollBy(0, -250);");
        System.out.println("Sayfa yukarı kaydırıldı.");

        DriverClass.getDriverWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("#gigya-profile-form > section > div > div.cell.large-22.large-offset-2.xlarge-22.xlarge-offset-2 > div > h2")
                )
        );

        List<WebElement> elements = DriverClass.getDriverWait().until(
                webDriver -> webDriver.findElements(
                        By.cssSelector("#gigya-profile-form > section > div > div.cell.small-24.large-20 > div:nth-child(1) > div")
                )
        );
        System.out.println("Elementler bulundu.");

        elements = elements.stream().filter(element -> {
            System.out.println(element.getAttribute("class"));
            return !element.getAttribute("class").contains("gigya-composite-control-metadata");
        }).collect(Collectors.toList());


        System.out.println("Elementler: " + elements.size() + " adet.");

        for (WebElement element : elements) {

            element.click();

            Thread.sleep(3000);
        }

        //nku.clickMethod(nku.getYurtdisiAktarimi());
        nku.clickMethod(nku.getNestleGrupHaberBulteni());

      //  jse.executeScript("arguments[0].value = '88888';", nku.getAd());

        // Soyad alanına geçersiz bir değer girme
      //  jse.executeScript("arguments[0].value = 'abcd';", nku.getSoyad());


    }

    @Then("Üye ol butonuna tıkla.")
    public void üyeOlButonunaTıkla() {
        nku.clickMethod(nku.getUyeOlButonu());
    }

    @And("Gelen formu doldururken geçersiz bir soyad değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirSoyadDeğeriGir() {
//        nku.sendKeysMethod(nku.getAd(), "88888");
//
//        nku.sendKeysMethod(nku.getSoyad(), "abcd");
//
//        Select select = new Select(nku.getDogumTarihiGun());
//        select.selectByVisibleText("22");
//
//        Select select1 = new Select(nku.getDogumTarihiAy());
//        select1.selectByVisibleText("06");
//
//        Select select2 = new Select(nku.getDogumTarihiYil());
//        select2.selectByVisibleText("1977");
//
//
//        nku.sendKeysMethod(nku.getEmail(), "88888@gmail.com");
//        nku.sendKeysMethod((nku.getSifre()), "abcde");
//        nku.sendKeysMethod(nku.getSifreOnayi(), "abcde");
//
//        nku.clickMethod(nku.getAydinlatmaMetniveGizlilikPolitikası());
//        nku.clickMethod(nku.getYurtdisiAktarimi());
//        nku.clickMethod(nku.getNestleGrupHaberBulteni());
    }

    @And("Gelen formu doldururken geçersiz bir email değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirEmailDeğeriGir() {
//        nku.sendKeysMethod(nku.getAd(), "88888");
//
//        nku.sendKeysMethod(nku.getSoyad(), "abcd");
//
//        Select select = new Select(nku.getDogumTarihiGun());
//        select.selectByVisibleText("22");
//
//        Select select1 = new Select(nku.getDogumTarihiAy());
//        select1.selectByVisibleText("06");
//
//        Select select2 = new Select(nku.getDogumTarihiYil());
//        select2.selectByVisibleText("1977");
//
//
//        nku.sendKeysMethod(nku.getEmail(), "88888@gmail.com");
//        nku.sendKeysMethod((nku.getSifre()), "abcde");
//        nku.sendKeysMethod(nku.getSifreOnayi(), "abcde");
//
//        nku.clickMethod(nku.getAydinlatmaMetniveGizlilikPolitikası());
//        nku.clickMethod(nku.getYurtdisiAktarimi());
//        nku.clickMethod(nku.getNestleGrupHaberBulteni());
    }

    @And("Gelen formu doldururken geçersiz bir şifre değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirŞifreDeğeriGir() {
//        nku.sendKeysMethod(nku.getAd(), "88888");
//
//        nku.sendKeysMethod(nku.getSoyad(), "abcd");
//
//        Select select = new Select(nku.getDogumTarihiGun());
//        select.selectByVisibleText("22");
//
//        Select select1 = new Select(nku.getDogumTarihiAy());
//        select1.selectByVisibleText("06");
//
//        Select select2 = new Select(nku.getDogumTarihiYil());
//        select2.selectByVisibleText("1977");
//
//
//        nku.sendKeysMethod(nku.getEmail(), "88888@gmail.com");
//        nku.sendKeysMethod((nku.getSifre()), "abcde");
//        nku.sendKeysMethod(nku.getSifreOnayi(), "abcde");
//
//        nku.clickMethod(nku.getAydinlatmaMetniveGizlilikPolitikası());
//        nku.clickMethod(nku.getYurtdisiAktarimi());
//        nku.clickMethod(nku.getNestleGrupHaberBulteni());
    }
}
