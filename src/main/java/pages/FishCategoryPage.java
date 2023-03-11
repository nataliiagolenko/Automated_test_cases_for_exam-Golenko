package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FishCategoryPage extends ParentPage{

    @FindBy (xpath = ".//table//tbody//td[1]")
    private List<WebElement> productIds;

    @FindBy (xpath = ".//h2[text()='Fish']")
    private WebElement pageName;

    public FishCategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public FishCategoryPage checkIsRedirectToFishCategoryPage() {
        Assert.assertTrue("Wrong category page is opened", isElementDisplayed(pageName));
        return this;
    }

    public ProductPage clickOnTopSubCategory() {
        clickOnElement(productIds.get(0));
        return new ProductPage(webDriver);
    }

}
