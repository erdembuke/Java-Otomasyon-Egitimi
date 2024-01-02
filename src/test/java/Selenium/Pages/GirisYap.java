package Selenium.Pages;

import org.openqa.selenium.WebDriver;

public class GirisYap extends Sayfa{
    public final String emailAdresi = "txtUserName";
    public final String girisYapTusu = "btnLogin";

    public GirisYap(WebDriver driver) {
        super(driver);
    }
}
