package Test;

import Page.HomePage;
import Page.ProductsPage;
import Utilities.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllTests extends BaseTest {

    private HomePage homePage;
    private ProductsPage productsPage;

    private static final String mainUrl = "https://www.amazon.com.tr/";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeClass
    public void before() {
        homePage = new HomePage(driver);

        navigateToUrl(mainUrl);
    }

    @Test (description = "Search Prodcut Dynamic")
    public void checkTest() throws InterruptedException {
        homePage.searchProduct();

    }
}
