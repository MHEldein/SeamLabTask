package HomzMartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    private final WebDriver driver;
    private final By furniture_menu = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/span[1]/img[1]");
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductsPage chooseOutdoors() {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(furniture_menu)).click();
        List<WebElement> furnitureElements = new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("sub"), 0));
        for (int i = 0; i < furnitureElements.size(); i++) {
            if (furnitureElements.get(i).getText().equals("Outdoors")) {
                furnitureElements.get(i).click();
            }
            break;
        }
        return new ProductsPage(driver);
    }
}
