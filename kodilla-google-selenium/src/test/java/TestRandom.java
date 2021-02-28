import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RandomGoogleSearch;

public class TestRandom {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\projects\\kodilla-course\\kodilla-google-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.pl");
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/span/div/div/iframe")));
        driver.findElement(By.xpath("//html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/span/span")).click();
    }

    @Test
    public void random(){
        RandomGoogleSearch googleSearch = new RandomGoogleSearch(driver);
        googleSearch.searchResults();
    }

}
