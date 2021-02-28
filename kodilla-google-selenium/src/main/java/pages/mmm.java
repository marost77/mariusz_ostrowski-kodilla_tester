package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mmm {



        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\projects\\kodilla-course\\kodilla-google-selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 5);
            driver.get("http://www.google.com");

            driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/span/div/div/iframe")));

           // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/span/span")));
            driver.findElement(By.xpath("//html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/span/span")).click();

            //driver.switchTo().frame("consent.google.com");


           // public RandomGoogleResult randomResult(WebDriver driver){
             //   WebDriverWait wait = new WebDriverWait(driver, 10);
                //wait.until(ExpectedConditions.elementToBeClickable(randomPage.);
               // RandomGoogleResult randomPage = new RandomGoogleResult(driver);
               // return randomPage;
           // }

           // public void searchRandom(){
              //  PageFactory.initElements(driver, GoogleSearch.class);
                //inputField.sendKeys("Kodilla");
               // randomPage = randomResult(driver);
    }
}
