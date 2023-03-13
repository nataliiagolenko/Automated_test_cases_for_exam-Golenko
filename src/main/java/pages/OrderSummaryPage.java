package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage extends ParentPage {
    @FindBy(xpath = ".//input[@value='Continue']")
    private WebElement continueButton;

    public OrderSummaryPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/Order.action?newOrderForm=";
    }

    public OrderSummaryPage checkIsRedirectToOrderSummaryPage() {
        checkURL();
        Assert.assertTrue("User is not redirected to order summary page", isElementDisplayed(continueButton));
        return this;
    }

    public OrderConfirmationPage clickOnContinueButton() {
        clickOnElement(continueButton);
        return new OrderConfirmationPage(webDriver);
    }
}
