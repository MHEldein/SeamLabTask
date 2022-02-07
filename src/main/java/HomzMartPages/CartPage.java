package HomzMartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final By totalPrice = By.cssSelector("div.mt-2 .price");
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTotalPrice() {
        return driver.findElement(totalPrice).getText();
    }
}

