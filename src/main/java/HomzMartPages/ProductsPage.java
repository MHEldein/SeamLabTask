package HomzMartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
    private final WebDriver driver;
    private final By thirdProduct = By.cssSelector("div.xs6:nth-child(3) div.card-body .btn");
    private final By checkOut = By.className("btn-1");
    private final By priceContainer = By.cssSelector("div.xs6:nth-child(3) div.price .num");
    private WebDriverWait wait;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage addThirdProdcutToCart() {
        driver.findElement(thirdProduct).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut)).click();
        return new CartPage(driver);
    }

    public String getProductPrice() {
        return driver.findElement(priceContainer).getText();
    }
}
