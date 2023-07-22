package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nescafe_Kayit_POM extends MyMethods {
    public Nescafe_Kayit_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='menuitem3']")
    private WebElement profilIkonu;

    @FindBy(xpath = "//ul[@class='register-menu active']//a[contains(text(),'Kayıt ol')]")
    private WebElement kayitOlButonu;

    @FindBy(xpath = "(//input[@name='profile.firstName'])[3]")
    private WebElement ad;

    @FindBy(xpath = "(//input[@name='profile.lastName'])[3]")
    private WebElement soyad;

    @FindBy(xpath = "(//select[@name='profile.birthDay'])[3]")
    private WebElement dogumTarihiGun;

    @FindBy(xpath = "(//select[@name='profile.birthMonth'])[3]")
    private WebElement dogumTarihiAy;

    @FindBy(xpath = "(//select[@name='profile.birthYear'])[3]")
    private WebElement dogumTarihiYil;

    @FindBy(xpath = "(//input[@name='email'])[3]")
    private WebElement emailKayit;

    @FindBy(css = "input[placeholder='Şifreni gir *']")
    private WebElement sifreKayit;

    @FindBy(css = "input[placeholder='Şifreyi onaylayın *']")
    private WebElement sifreOnayi;

    @FindBy(css = "#gigya-profile-form > section > div > div.cell.small-24.large-20 > div:nth-child(1) > div.gigya-container.gigya-visible-when.gigya-container-enabled > div > label > span > label")
    private WebElement aydinlatmaMetniveGizlilikPolitikası;

    @FindBy(css = "gigya-composite-control-checkbox gigya-terms-error")
    private WebElement yurtdisiAktarimi;

    @FindBy(xpath = "//*[@id='gigya-profile-form']/section/div/div[7]/div[1]/div[3]")
    private WebElement nestleGrupHaberBulteni;

    @FindBy(xpath = "//input[@value='Üye ol']")
    private WebElement uyeOlButonu;

    @FindBy(xpath= "//span[@role='alert']")
    private WebElement hataMesaji;

    @FindBy(css = "#gigya-resend-verification-code-form > section > div > div.cell.small-24.large-14.large-offset-5.xlarge-14.xlarge-offset-5 > div > label")
    private WebElement basariMesaji;

    public WebElement getProfilIkonu() {
        return profilIkonu;
    }

    public WebElement getKayitOlButonu() {
        return kayitOlButonu;
    }

    public WebElement getAd() {
        return ad;
    }

    public WebElement getSoyad() {
        return soyad;
    }

    public WebElement getDogumTarihiGun() {
        return dogumTarihiGun;
    }
    public WebElement getDogumTarihiAy() {
        return dogumTarihiAy;
    }

    public WebElement getDogumTarihiYil() {
        return dogumTarihiYil;
    }

    public WebElement getEmailKayit() {
        return emailKayit;
    }

    public WebElement getSifreKayit(){
        return sifreKayit;
    }

    public WebElement getSifreOnayi(){
        return sifreOnayi;
    }

    public WebElement getAydinlatmaMetniveGizlilikPolitikası(){
        return aydinlatmaMetniveGizlilikPolitikası;
    }

    public WebElement getYurtdisiAktarimi(){
        return yurtdisiAktarimi;
    }

    public WebElement getNestleGrupHaberBulteni(){
        return nestleGrupHaberBulteni;
    }

    public WebElement getUyeOlButonu(){
        return uyeOlButonu;
    }

    public WebElement getHataMesaji(){
        return hataMesaji;
    }

    public WebElement getBasariMesaji(){
        return basariMesaji;
    }
}
