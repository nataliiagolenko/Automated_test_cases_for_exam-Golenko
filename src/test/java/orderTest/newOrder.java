package orderTest;

import baseTest.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class newOrder extends BaseTest {
    @Before
    public void setUp() {
        super.setUp();
        createNewUser();
    }

    @Test
    public void TC3_createNewOrder() {
        cataloguePage
                .openCataloguePage()
                .getHeaderElement().clickOnSignInLink()
                .checkLoginPageIsOpened()
                .enterUsernameIntoInputUsername("123newuser456")
                .enterPasswordIntoInputPassword("qwerty1234")
                .clickOnLoginButton()
                .getHeaderElement().checkUserIsLoggedIn()
                .checkCataloguePageIsOpened()
                .clickOnFishCategory()
                .checkIsRedirectToFishCategoryPage()
                .clickOnTopSubCategory()
                .addTopProductToCart()
                .checkIsRedirectToShoppingCart()
                .checkProductIsAddedToShoppingCart()
                .clickOnProceedToCheckoutButton()
                .checkIsRedirectToOrderSummaryPage()
                .clickOnContinueButton()
                .checkIsRedirectToOrderConfirmationPage()
                .clickOnConfirmButton()
                .checkIsRedirectToNewOrderPage()
                .getHeaderElement().clickOnMyAccountPage()
                .checkIsRedirectToAccountPage()
                .clickOnMyOrdersLink()
        ;

    }
}
