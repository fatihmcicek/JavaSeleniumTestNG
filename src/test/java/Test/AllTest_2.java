package Test;

import Page.HomePage;
import Page.ProductsPage;
import Utilities.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllTest_2 extends BaseTest {

    private HomePage homePage;
    private ProductsPage productsPage;

    private static final String mainUrl = "https://www.amazon.com.tr/";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeClass
    public void before() {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        navigateToUrl(mainUrl);
    }

    @Test
    public void checkTest() {
        homePage.clickZeroCarButton();
        logger.info("Logger Test");
        logger.error("Added Report Html Doc");
        productsPage.selectProduct();

    }

}
