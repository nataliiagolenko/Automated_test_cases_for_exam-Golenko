package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneOrderPage extends ParentPage{

    @FindBy(xpath = "//*[text()='Thank you, your order has been submitted.']")
    private WebElement successfulOrderMessage;

    public OneOrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OneOrderPage checkIsRedirectToNewOrderPage() {
        Assert.assertTrue("Order failed", isElementDisplayed(successfulOrderMessage));
        return this;
    }
}
