package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CataloguePage extends ParentPage{
    public CataloguePage(WebDriver webDriver) {
        super(webDriver);
    }
    public void openCataloguePage(){
        try{
            webDriver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
            logger.info("Catalogue Page was opened");
        } catch (Exception e){
            logger.error("Cannot open Catalogue page" + e);
            Assert.fail("Cannot open Catalogue page" + e);

        }
    }
}
