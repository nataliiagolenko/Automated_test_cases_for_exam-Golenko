package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    @FindBy(xpath = ".//input[@name='signon']")
    private WebElement loginButton;

    @FindBy(xpath = ".//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = ".//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//*[text()='You must sign on before attempting to check out.  Please sign on and try checking out again.']")
    private WebElement warningMessage;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage checkLoginPageIsOpened() {
        //TODO checkURL
        Assert.assertTrue("Wrong page is opened", isElementDisplayed(loginButton));
        return this;
    }

    public LoginPage enterUsernameIntoInputUsername(String username) {
        enterTextIntoElement(usernameField, username);
        return this;
    }

    public LoginPage enterPasswordIntoInputPassword(String password) {
        enterTextIntoElement(passwordField, password);
        return this;
    }

    public CataloguePage clickOnLoginButton() {
        clickOnElement(loginButton);
        return new CataloguePage(webDriver);
    }

    public LoginPage checkIsRedirectToLoginPage(){
        checkLoginPageIsOpened();
        Assert.assertTrue("No warning message", isElementDisplayed(warningMessage));
        return this;
    }
}
