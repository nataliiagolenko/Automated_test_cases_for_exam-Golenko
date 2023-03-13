package shoppingCart;

import baseTest.BaseTest;
import org.junit.Test;

public class AddProductTest extends BaseTest {

    @Test
    public void TC2_addProduct() {
        cataloguePage
                .openCataloguePage()
                .clickOnFishCategory()
                .checkIsRedirectToFishCategoryPage()
                .clickOnTopSubCategory()
                .addTopProductToCart()
                .checkIsRedirectToShoppingCart()
                .checkProductIsAddedToShoppingCart();
    }
}
