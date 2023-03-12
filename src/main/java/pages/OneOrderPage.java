package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElement;

public class OneOrderPage extends ParentPage{

    @FindBy(xpath = "//*[text()='Thank you, your order has been submitted.']")
    private WebElement successfulOrderMessage;

    private final HeaderElement headerElement = new HeaderElement(webDriver);

    public OneOrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OneOrderPage checkIsRedirectToNewOrderPage() {
        Assert.assertTrue("Order failed", isElementDisplayed(successfulOrderMessage));
        return this;
    }

    public HeaderElement getHeaderElement() {
        return headerElement;
    }
}
