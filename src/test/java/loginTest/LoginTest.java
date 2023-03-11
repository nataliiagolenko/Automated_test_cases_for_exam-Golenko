package loginTest;

import baseTest.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void validLogin() {
        cataloguePage
                .openCataloguePage()
                .getHeaderElement().clickOnSignInLink()
                .checkLoginPageIsOpened()
                .enterUsernameIntoInputUsername("user1234test1234")
                .enterPasswordIntoInputPassword("qwerty123")
                .clickOnLoginButton()
                .getHeaderElement().checkUserIsLoggedIn()
                .checkCataloguePageIsOpened()

        ;
    }
}
