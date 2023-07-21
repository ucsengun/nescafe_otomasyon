package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
        nku.sendKeysMethod(nku.getAd(), "?");

        nku.sendKeysMethod(nku.getSoyad(), "sssllll");

        Select select = new Select(nku.getDogumTarihiGun());
        select.selectByVisibleText("10");

        Select select1 = new Select(nku.getDogumTarihiAy());
        select1.selectByVisibleText("04");

        Select select2 = new Select(nku.getDogumTarihiYil());
        select2.selectByVisibleText("2001");


        nku.sendKeysMethod(nku.getEmailKayit(), "sssss@gmail.com");

        nku.sendKeysMethod((nku.getSifreKayit()), "abcdefgh");
        nku.sendKeysMethod(nku.getSifreOnayi(), "abcdefgh");


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

          //  Thread.sleep(3000);
        }

        nku.clickMethod(nku.getNestleGrupHaberBulteni());


    }

    @Then("Üye ol butonuna tıkla.")
    public void üyeOlButonunaTıkla() {
        nku.clickMethod(nku.getUyeOlButonu());

        Assert.assertTrue(nku.getHataMesaji().isDisplayed());
    }

    @And("Gelen formu doldururken geçersiz bir soyad değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirSoyadDeğeriGir() throws InterruptedException {
        nku.sendKeysMethod(nku.getAd(), "ilhan");

        nku.sendKeysMethod(nku.getSoyad(), "888?/8.8;8");

        Select select = new Select(nku.getDogumTarihiGun());
        select.selectByVisibleText("22");

        Select select1 = new Select(nku.getDogumTarihiAy());
        select1.selectByVisibleText("06");

        Select select2 = new Select(nku.getDogumTarihiYil());
        select2.selectByVisibleText("1977");


        nku.sendKeysMethod(nku.getEmailKayit(), "88888@gmail.com");

        nku.sendKeysMethod((nku.getSifreKayit()), "abcdefgh");
        nku.sendKeysMethod(nku.getSifreOnayi(), "abcdefgh");



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

          //  Thread.sleep(3000);
        }

        nku.clickMethod(nku.getNestleGrupHaberBulteni());

    }

    @And("Gelen formu doldururken geçersiz bir email değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirEmailDeğeriGir() throws InterruptedException {
        nku.sendKeysMethod(nku.getAd(), "Besim");

        nku.sendKeysMethod(nku.getSoyad(), "Tibuk");

        Select select = new Select(nku.getDogumTarihiGun());
        select.selectByVisibleText("22");

        Select select1 = new Select(nku.getDogumTarihiAy());
        select1.selectByVisibleText("06");

        Select select2 = new Select(nku.getDogumTarihiYil());
        select2.selectByVisibleText("1977");


        nku.sendKeysMethod(nku.getEmailKayit(), "7763wd?w3dwdw8931");

        nku.sendKeysMethod((nku.getSifreKayit()), "abcdefgh");
        nku.sendKeysMethod(nku.getSifreOnayi(), "abcdefgh");



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

          //  Thread.sleep(3000);
        }

        nku.clickMethod(nku.getNestleGrupHaberBulteni());

    }

    @And("Gelen formu doldururken geçersiz bir şifre değeri gir.")
    public void gelenFormuDoldururkenGeçersizBirŞifreDeğeriGir() throws InterruptedException {
        nku.sendKeysMethod(nku.getAd(), "leblebi");

        nku.sendKeysMethod(nku.getSoyad(), "kafa");

        Select select = new Select(nku.getDogumTarihiGun());
        select.selectByVisibleText("22");

        Select select1 = new Select(nku.getDogumTarihiAy());
        select1.selectByVisibleText("06");

        Select select2 = new Select(nku.getDogumTarihiYil());
        select2.selectByVisibleText("1977");


        nku.sendKeysMethod(nku.getEmailKayit(), "88888@gmail.com");

        nku.sendKeysMethod((nku.getSifreKayit()), "1");
        nku.sendKeysMethod(nku.getSifreOnayi(), "1");



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

           // Thread.sleep(3000);
        }

        nku.clickMethod(nku.getNestleGrupHaberBulteni());

    }
    @And("Gelen formu doldururken tüm değerleri geçerli bir şekilde doldur.")
    public void gelenFormuDoldururkenTümDeğerleriGeçerliBirŞekildeDoldur() throws InterruptedException {
        nku.sendKeysMethod(nku.getAd(), "Besim");

        nku.sendKeysMethod(nku.getSoyad(), "Tibuk");

        Select select = new Select(nku.getDogumTarihiGun());
        select.selectByVisibleText("22");

        Select select1 = new Select(nku.getDogumTarihiAy());
        select1.selectByVisibleText("06");

        Select select2 = new Select(nku.getDogumTarihiYil());
        select2.selectByVisibleText("1977");


        nku.sendKeysMethod(nku.getEmailKayit(), "abckamil@gmail.com");

        nku.sendKeysMethod((nku.getSifreKayit()), "abcdefgh");
        nku.sendKeysMethod(nku.getSifreOnayi(), "abcdefgh");



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

           // Thread.sleep(3000);
        }

        nku.clickMethod(nku.getNestleGrupHaberBulteni());
    }

    @Then("Kontrol et.")
    public void kontrolEt() {
        Assert.assertTrue(nku.getBasariMesaji().isDisplayed());
    }
}
