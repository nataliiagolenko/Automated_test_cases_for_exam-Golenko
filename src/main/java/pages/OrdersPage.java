package pages;

import model.Order;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrdersPage extends ParentPage {

    @FindBy(xpath = ".//table//tbody//td[1]")
    private List<WebElement> listOfOrderID;

    public OrdersPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/Order.action?listOrders=";
    }

    public OrdersPage checkCreatedOrderIsDisplayedIOnThePage(Order order) {
        WebElement lastOrderID = listOfOrderID.get(listOfOrderID.size() - 1);
        Assert.assertEquals("Order wasn't found", order.getId(), lastOrderID.getText());
        return this;
    }
}
