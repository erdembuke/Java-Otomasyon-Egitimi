package Selenium.Tests;

import Section03.OOP03.Interface.GirisSayfasi;
import Selenium.Pages.AnaSayfa;
import Selenium.Pages.GirisYap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginTest {
    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYap girisYap;


    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYap = new GirisYap(driver);
        driver.get("https://www.hepsiburada.com");

    }

    @AfterEach
    void tearDown() {
        driver.close();
    }

    @Test
    void hepsiburadaLoginTest() {
        // anasayfaya giris ve hesabim tusuna basmak
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.hesabim); // wait
        anaSayfa.tusaBas(anaSayfa.hesabim);

        // giris yap tusuna basmak
        anaSayfa.elementClickableOlanaKadarBekle(anaSayfa.girisYap); // wait
        anaSayfa.tusaBas(anaSayfa.girisYap);

        // login sayfasindaki email input'a text gondermek
        girisYap.elementGozukeneKadarBekle(girisYap.emailAdresi); // wait
        girisYap.textYaz(girisYap.emailAdresi,"selenium@selenium.com");

        // email gonderdikten sonra giris yap tusuna basmak
        girisYap.elementGozukeneKadarBekle(girisYap.girisYapTusu); // wait
        girisYap.tusaBas(girisYap.girisYapTusu);

        }

        @Test
        void urunAramaTest() {
            anaSayfa.elementGozukeneKadarBekleCSS(anaSayfa.searchBox);
            anaSayfa.textYazCSS(anaSayfa.searchBox, "SAAB");
            anaSayfa.klavyeTusunaBasCSS(anaSayfa.searchBox, Keys.ENTER);


        }


    }

