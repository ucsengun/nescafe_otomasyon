package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nescafe_Kayit_Otomasyon2_POM extends MyMethods {
    public Nescafe_Kayit_Otomasyon2_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Aydınlatma Metnini')]")
    private WebElement aydinlatmaMetni;


    public WebElement getAydinlatmaMetni() {
        return aydinlatmaMetni;
    }
}
