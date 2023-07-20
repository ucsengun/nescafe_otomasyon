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

    @FindBy(xpath = "(//input[@id='gigya-textbox-32384114701464324'])[1]")
    private WebElement ad;

    @FindBy(xpath = "(//input[@id='gigya-textbox-56470341204781944'])[1]")
    private WebElement soyad;

    @FindBy(xpath = "(//select[@id='gigya-dropdown-70507658919696960'])[1]")
    private WebElement dogumTarihiGun;

    @FindBy()
    private WebElement dogumTarihiAy;

    @FindBy()
    private WebElement dogumTarihiYil;

    @FindBy()
    private WebElement email;

    @FindBy()
    private WebElement sifre;

    @FindBy()
    private WebElement sifreOnayi;

    @FindBy()
    private WebElement aydinlatmaMetniveGizlilikPolitikası;

    @FindBy()
    private WebElement yurtdisiAktarimi;

    @FindBy()
    private WebElement nestleGrupHaberBulteni;

    @FindBy()
    private WebElement uyeOlButonu;

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
        return ad;
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

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSifre(){
        return sifre;
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
}
