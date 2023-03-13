package pages;

import libs.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationFormPage extends ParentPage {


    @FindBy(xpath = ".//input[@name='username']")
    private WebElement userID;

    @FindBy(xpath = ".//input[@name='password']")
    private WebElement newPassword;

    @FindBy(xpath = ".//input[@name='repeatedPassword']")
    private WebElement repeatPassword;

    @FindBy(xpath = ".//input[@name='account.firstName']")
    private WebElement firstName;

    @FindBy(xpath = ".//input[@name='account.lastName']")
    private WebElement lastName;

    @FindBy(xpath = ".//input[@name='account.email']")
    private WebElement email;

    @FindBy(xpath = ".//input[@name='account.phone']")
    private WebElement phone;

    @FindBy(xpath = ".//input[@name='account.address1']")
    private WebElement address1;

    @FindBy(xpath = ".//input[@name='account.address2']")
    private WebElement address2;

    @FindBy(xpath = ".//input[@name='account.city']")
    private WebElement city;

    @FindBy(xpath = ".//input[@name='account.state']")
    private WebElement state;

    @FindBy(xpath = ".//input[@name='account.zip']")
    private WebElement zip;

    @FindBy(xpath = ".//input[@name='account.country']")
    private WebElement country;

    @FindBy(xpath = ".//input[@name='newAccount']")
    private WebElement saveAccountButton;

    public RegistrationFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/Account.action?newAccountForm=";
    }

    public RegistrationFormPage fillInRegistrationForm() {
        enterTextIntoElement(userID, TestData.LOGIN);
        enterTextIntoElement(newPassword, TestData.PASSWORD);
        enterTextIntoElement(repeatPassword, "qwerty1234");
        enterTextIntoElement(firstName, "TestFirstName");
        enterTextIntoElement(lastName, "TestLastName");
        enterTextIntoElement(email, "test@test.com");
        enterTextIntoElement(phone, "12345678");
        enterTextIntoElement(address1, "TestAddress1");
        enterTextIntoElement(address2, "TestAddress2");
        enterTextIntoElement(city, "TestCity");
        enterTextIntoElement(state, "TestState");
        enterTextIntoElement(zip, "54321");
        enterTextIntoElement(country, "TestCountry");
        return this;
    }

    public CataloguePage clickOnSaveAccountButton() {
        clickOnElement(saveAccountButton);
        return new CataloguePage(webDriver);
    }
}
