package Base;

import HomzMartPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestsBase {
    public static WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://homzmart.com/en/");
        //Thread.Sleep(5000)
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    /*@AfterMethod
    public void tearDown(){
        driver.quit();
    }*/
}
