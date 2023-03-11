package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCart extends ParentPage {

    @FindBy(xpath = ".//h2[text()='Shopping Cart']")
    private WebElement pageName;

    @FindBy(xpath = ".//a[@class='Button' and text()='Remove']")
    private WebElement removeButton;

    @FindBy(xpath = ".//*[text()='Remove']")
    private List<WebElement> removeList;

    @FindBy (xpath = ".//table//tbody//td[5]//input")
    private List<WebElement> quantityColumn;

    @FindBy (xpath = ".//*[text()='Your cart is empty.']")
    private WebElement emptyCardMessage;

    public ShoppingCart(WebDriver webDriver) {
        super(webDriver);
    }

    public ShoppingCart checkIsRedirectToShoppingCart() {
        Assert.assertTrue("Failed adding product to shopping cart", isElementDisplayed(pageName));
        return this;
    }

    public ShoppingCart checkProductIsAddedToShoppingCart() {
        Assert.assertEquals("Wrong quantity of products", 1, removeList.size());
        Assert.assertEquals("Wrong quantity of products", 1, Integer.parseInt(quantityColumn.get(0).getAttribute("value")));
        return this;
    }

    public ShoppingCart clickOnRemoveButton() {
        clickOnElement(removeButton);
        return this;
    }

    public ShoppingCart checkShoppingCartIsEmpty() {
        Assert.assertTrue("Product wasn't removed from the cart", isElementDisplayed(emptyCardMessage));
        Assert.assertEquals("Product wasn't removed from the cart", 0, removeList.size());
        return this;
    }
}


