package Selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void elementGozukeneKadarBekle(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));

    }

    public void elementClickableOlanaKadarBekle(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
    }

    public void tusaBas(String elementId) {
        driver.findElement(By.id(elementId)).click();
    }

    public void textYaz(String elementId, String text) {
        driver.findElement(By.id(elementId)).sendKeys(text);
    }

    public void elementGozukeneKadarBekleCSS(String elementCSS) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementCSS)));
    }

    public void textYazCSS(String elementcss, String text) {
        driver.findElement(By.cssSelector(elementcss)).sendKeys(text);
    }

    public void klavyeTusunaBasCSS(String elementId, Keys klavyeTusu) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }
}
