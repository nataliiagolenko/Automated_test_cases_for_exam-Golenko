package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElement;

public class CataloguePage extends ParentPage {

    private final HeaderElement headerElement = new HeaderElement(webDriver);
    @FindBy(xpath = ".//img[@src='../images/fish_icon.gif']")
    private WebElement fishCategory;

    public CataloguePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/Catalog.action";
    }

    public CataloguePage openCataloguePage() {
        try {
            webDriver.get(base_url + getRelativeURL());
            logger.info("Catalogue Page was opened");
        } catch (Exception e) {
            logger.error("Cannot open Catalogue page" + e);
            Assert.fail("Cannot open Catalogue page" + e);
        }
        return new CataloguePage(webDriver);
    }


    public CataloguePage checkCataloguePageIsOpened() {
        checkURL();
        Assert.assertTrue("Wrong page is opened", isElementDisplayed(fishCategory));
        return this;
    }

    public HeaderElement getHeaderElement() {
        return headerElement;
    }

    public FishCategoryPage clickOnFishCategory() {
        clickOnElement(fishCategory);
        return new FishCategoryPage(webDriver);
    }
}
