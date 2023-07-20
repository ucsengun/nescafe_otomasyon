package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nescafe_Giris_Yap_POM extends MyMethods {
    public Nescafe_Giris_Yap_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='menuitem3']")
    private WebElement profilIkonu;

    @FindBy(xpath = "//ul[@class='register-menu active']//a[contains(text(),'Giriş yap')]")
    private WebElement girisYap;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath =" ")
    private WebElement sifre;
    @FindBy(xpath = "//input[@value='Giriş Yap']")
    private WebElement girisYapButonu;

    public WebElement getProfilIkonu() {
        return profilIkonu;
    }

    public WebElement getGirisYap() {
        return girisYap;
    }

    public WebElement getEmail(){
        return email;
    }
    public WebElement getSifre(){
        return sifre;
    }

    public WebElement getGirisYapButonu(){
        return girisYapButonu;
    }
}
