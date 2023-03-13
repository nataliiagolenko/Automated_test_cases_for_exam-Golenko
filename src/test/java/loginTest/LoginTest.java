package loginTest;

import baseTest.BaseTest;
import libs.TestData;
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
                .enterUsernameIntoInputUsername(TestData.LOGIN)
                .enterPasswordIntoInputPassword(TestData.PASSWORD)
                .clickOnLoginButton()
                .getHeaderElement().checkUserIsLoggedIn()
                .checkCataloguePageIsOpened();
    }
}
