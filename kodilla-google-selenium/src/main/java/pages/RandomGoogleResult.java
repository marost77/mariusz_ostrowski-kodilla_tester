package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class RandomGoogleResult extends AbstractPage {

    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;


    public RandomGoogleResult(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);
    }

    public void drawResult(){
        Random generator = new Random();
        int n = generator.nextInt(results.size());
        results.get(n).click();
    }

}
