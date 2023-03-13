package orderTest;

import baseTest.BaseTest;
import libs.TestData;
import model.Order;
import org.junit.Before;
import org.junit.Test;

public class NewOrder extends BaseTest {
    @Before
    public void setUp() {
        super.setUp();
        createNewUser();
    }

    @Test
    public void TC3_createNewOrder() {
        Order order = new Order();

        cataloguePage
                .openCataloguePage()
                .getHeaderElement().clickOnSignInLink()
                .checkLoginPageIsOpened()
                .enterUsernameIntoInputUsername(TestData.LOGIN)
                .enterPasswordIntoInputPassword(TestData.PASSWORD)
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
                .saveOrderId(order)
                .getHeaderElement().clickOnMyAccountPage()
                .checkIsRedirectToAccountPage()
                .clickOnMyOrdersLink()
                .checkCreatedOrderIsDisplayedIOnThePage(order);
    }
}
