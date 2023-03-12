package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends ParentPage{

    @FindBy(xpath = ".//*[text()='My Orders']")
    private WebElement myOrders;

    @FindBy(xpath = ".//h3[text()='Account Information']")
    private WebElement accountInfo;

    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OrdersPage clickOnMyOrdersLink() {
        clickOnElement(myOrders);
        return new OrdersPage(webDriver);
    }

    public AccountPage checkIsRedirectToAccountPage() {
        //TODO checkURL
        Assert.assertTrue("Account Page wasn't opened", isElementDisplayed(accountInfo));
        return this;

    }
}
