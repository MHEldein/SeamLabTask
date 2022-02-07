package HomzMartTests;

import Base.TestsBase;
import HomzMartPages.CartPage;
import HomzMartPages.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartPageTests extends TestsBase {
    private ProductsPage pp;
    private CartPage cp;

    @Test
    public void verify_ProductPrice_Against_TotalPrice() {
        pp = homePage.chooseOutdoors();
        cp = pp.addProdcutToCart(3);
        assertTrue(pp.getProductPrice().contains(cp.getTotalPrice()));
    }
}
