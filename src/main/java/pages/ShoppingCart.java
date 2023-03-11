package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCart extends ParentPage {

    @FindBy(xpath = ".//h2[text()='Shopping Cart']")
    private WebElement pageName;

//    @FindBy(xpath = ".//a[@class='Button' and text()='Remove']")
//    private WebElement removeButton;

    @FindBy(xpath = ".//*[text()='Remove']")
    private List<WebElement> removeButton;

    @FindBy (xpath = ".//table//tbody//td[5]//input")
    private List<WebElement> quantityColumn;

    public ShoppingCart(WebDriver webDriver) {
        super(webDriver);
    }

    public ShoppingCart checkIsRedirectToShoppingCart() {
        Assert.assertTrue("Failed adding product to shopping cart", isElementDisplayed(pageName));
        return this;
    }

    public ShoppingCart checkProductIsAddedToShoppingCart() {
        Assert.assertEquals("Wrong quantity of products", 1, removeButton.size());
        Assert.assertEquals("Wrong quantity of products", 1, Integer.parseInt(quantityColumn.get(0).getAttribute("value")));
        return this;
    }
}
