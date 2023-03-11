package orderTest;

import baseTest.BaseTest;
import org.junit.Test;

public class newOrder extends BaseTest {
    @Test
    public void TC3_createNewOrder() {
        cataloguePage
                .openCataloguePage()
                .getHeaderElement().clickOnSignInLink()
                .checkLoginPageIsOpened()
                .enterUsernameIntoInputUsername("user1234test1234")
                .enterPasswordIntoInputPassword("qwerty123")
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

        ;

    }
}
