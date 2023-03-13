package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends ParentPage {

    public static final String CONFIRMATION_MESSAGE = "Please confirm the information below and then press continue...";

    @FindBy(xpath = "//a[@class='Button' and text()='Confirm']")
    private WebElement confirmButton;

    @FindBy(xpath = ".//div[@id='Catalog']")
    private WebElement orderInfo;

    public OrderConfirmationPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/Order.action";
    }

    public OrderConfirmationPage checkIsRedirectToOrderConfirmationPage() {
        checkURL();
        Assert.assertTrue("User wasn't redirected to Order Confirmation page", orderInfo.getText().startsWith(CONFIRMATION_MESSAGE));
        return this;
    }

    public OneOrderPage clickOnConfirmButton() {
        clickOnElement(confirmButton);
        return new OneOrderPage(webDriver);
    }
}
