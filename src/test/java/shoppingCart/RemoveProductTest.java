package shoppingCart;

import baseTest.BaseTest;
import org.junit.Test;

public class RemoveProductTest extends BaseTest {

    @Test
    public void removeProduct(){
        cataloguePage
                .openCataloguePage()
                .clickOnFishCategory()
                .checkIsRedirectToFishCategoryPage()
                .clickOnTopSubCategory()
                .addTopProductToCart()
                .checkIsRedirectToShoppingCart()
                .checkProductIsAddedToShoppingCart()
                .clickOnRemoveButton()
                .checkShoppingCartIsEmpty()
        ;
    }
}
