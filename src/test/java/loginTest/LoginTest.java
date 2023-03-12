package loginTest;

import baseTest.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Before
    public void setUp() {
        super.setUp();
        createNewUser();
    }

    @Test
    public void TC1_validLogin() {
        cataloguePage
                .openCataloguePage()
                .getHeaderElement().clickOnSignInLink()
                .checkLoginPageIsOpened()
                .enterUsernameIntoInputUsername("123newuser456")
                .enterPasswordIntoInputPassword("qwerty1234")
                .clickOnLoginButton()
                .getHeaderElement().checkUserIsLoggedIn()
                .checkCataloguePageIsOpened();
    }
}
