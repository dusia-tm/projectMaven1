package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;
import pages.realthome.RealtHomePage;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/main/div/div/div/div/div[1]");

    public RealtListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 1);
        return this;
    }
}
