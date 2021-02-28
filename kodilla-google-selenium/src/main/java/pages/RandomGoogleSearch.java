package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RandomGoogleSearch extends AbstractPage{

    @FindBy(css = "input[title=Szukaj]")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private RandomGoogleResult googleResults;

    public RandomGoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, RandomGoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.drawResult();
    }

    public RandomGoogleResult loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        RandomGoogleResult googleResults = new RandomGoogleResult(driver);
        return googleResults;
    }
}
