package Test;

import Page.HomePage;
import Utilities.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllTests extends TestBase {

    private HomePage homePage;

    private static final String mainUrl = "https://www.amazon.com.tr/";

    @BeforeClass
    public void before() {
        homePage = new HomePage(driver);

        navigateToUrl(mainUrl);
    }

    @Test
    public void checkTest() {
        homePage.clickZeroCarButton();
    }
}
