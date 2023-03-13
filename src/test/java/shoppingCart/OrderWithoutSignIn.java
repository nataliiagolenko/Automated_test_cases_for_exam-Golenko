package shoppingCart;

import baseTest.BaseTest;
import org.junit.Test;

public class OrderWithoutSignIn extends BaseTest {
    @Test
    public void TC5_orderUnauthorizedUser() {
        cataloguePage
                .openCataloguePage()
                .clickOnFishCategory()
                .checkIsRedirectToFishCategoryPage()
                .clickOnTopSubCategory()
                .addTopProductToCart()
                .checkIsRedirectToShoppingCart()
                .checkProductIsAddedToShoppingCart()
                .clickOnProceedToCheckOutButtonUnauthorized()
                .checkIsRedirectToLoginPage();
    }
}

