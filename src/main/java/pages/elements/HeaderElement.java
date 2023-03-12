package pages.elements;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AccountPage;
import pages.CataloguePage;
import pages.CommonActionsWithElements;
import pages.LoginPage;

public class HeaderElement extends CommonActionsWithElements {

    @FindBy(xpath = ".//a[text()='Sign In']")
    private WebElement signIn;

    @FindBy(xpath = ".//a[text()='Sign Out']")
    private WebElement signOut;

    @FindBy(xpath = ".//a[text()='My Account']")
    private WebElement myAccount;

    public HeaderElement(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage clickOnSignInLink() {
        clickOnElement(signIn);
        return new LoginPage(webDriver);
    }

    public CataloguePage checkUserIsLoggedIn() {
        Assert.assertTrue("Login failed", isElementDisplayed(signOut));
        return new CataloguePage(webDriver);
    }

    public AccountPage clickOnMyAccountPage() {
        clickOnElement(myAccount);
        return new AccountPage(webDriver);
    }
}
