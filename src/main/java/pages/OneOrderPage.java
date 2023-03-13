package pages;

import model.Order;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElement;

public class OneOrderPage extends ParentPage {

    private final HeaderElement headerElement = new HeaderElement(webDriver);
    @FindBy(xpath = "//*[text()='Thank you, your order has been submitted.']")
    private WebElement successfulOrderMessage;
    @FindBy(xpath = ".//table//tbody//tr//th")
    private WebElement orderInfo;

    public OneOrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/Order.action?newOrder=&confirmed=true";
    }

    public OneOrderPage checkIsRedirectToNewOrderPage() {
        checkURL();
        Assert.assertTrue("Order failed", isElementDisplayed(successfulOrderMessage));
        return this;
    }

    public HeaderElement getHeaderElement() {
        return headerElement;
    }

    public OneOrderPage saveOrderId(Order order) {
        String oi = orderInfo.getText();
        int start = oi.indexOf("#") + 1;
        int end = oi.indexOf(" ", start);
        String orderId = oi.substring(start, end);
        order.setId(orderId);
        return this;
    }
}
