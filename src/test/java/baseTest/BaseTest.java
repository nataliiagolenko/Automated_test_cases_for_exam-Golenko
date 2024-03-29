package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CataloguePage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected CataloguePage cataloguePage;

    @Before
    public void setUp() {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(ops);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        cataloguePage = new CataloguePage(webDriver);

    }

    /**
     * Додала метод створення юзера, оскільки періодично базу очіщують
     */
    protected void createNewUser() {
        cataloguePage
                .openCataloguePage()
                .getHeaderElement().clickOnSignInLink()
                .clickOnRegisterNowLink()
                .fillInRegistrationForm()
                .clickOnSaveAccountButton();
    }

    @After
    public void tearDown() {
        webDriver.quit();
        logger.info("Browser was closed");

    }

}
