package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends ParentPage {
    @FindBy(xpath = ".//table//tbody//td[5]")
    private List<WebElement> addToCartButtons;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/Catalog.action?viewProduct=&productId=FI-SW-01";
    }

    public ShoppingCart addTopProductToCart() {
        clickOnElement(addToCartButtons.get(0));
        return new ShoppingCart(webDriver);
    }

}
