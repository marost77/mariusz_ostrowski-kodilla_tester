package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");


        WebElement acceptCookies = driver.findElement(By.xpath("//html/body/div[3]/div[9]/div/div[2]/div[2]/button[1]"));
        acceptCookies.click();

        //WebElement inputField = driver.findElement(By.xpath("//html/body/div[3]/div[5]/header/div/div/div[1]/div/form/input"));
        WebElement inputField = driver.findElement(By.xpath("//input[@placeholder=\"czego szukasz?\"]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

    }
}
