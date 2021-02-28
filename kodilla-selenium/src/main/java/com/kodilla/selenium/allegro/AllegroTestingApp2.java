package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://allegro.pl/");

        WebElement acceptCookies = driver.findElement(By.xpath("//html/body/div[2]/div[9]/div/div/div/div/div[2]/div[2]/button[1]"));
        acceptCookies.click();

        WebElement inputField = driver.findElement(By.cssSelector("div>form>input"));

        inputField.sendKeys("Mavic mini");
        inputField.submit();

       // wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("section>article")));

        List<WebElement> searchResults = driver.findElements(By.cssSelector("section>article"));
        for (WebElement w : searchResults) {
            System.out.println(w.getText());
            System.out.println("----------------");
        }
    }
}
