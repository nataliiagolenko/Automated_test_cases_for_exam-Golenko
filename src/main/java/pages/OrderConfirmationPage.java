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

    //    public OrderConfirmationPage checkIsRedirectToOrderConfirmationPage() {
//        Assert.assertTrue("User wasn't redirected to Order Confirmation page", isElementDisplayed(confirmButton));
//        return this;
//    }
    public OrderConfirmationPage checkIsRedirectToOrderConfirmationPage() {

        String text = orderInfo.getText();

        Assert.assertTrue("User wasn't redirected to Order Confirmation page", orderInfo.getText().startsWith(CONFIRMATION_MESSAGE));
        return this;
    }

    public OneOrderPage clickOnConfirmButton() {
        clickOnElement(confirmButton);
        return new OneOrderPage(webDriver);
    }
}
