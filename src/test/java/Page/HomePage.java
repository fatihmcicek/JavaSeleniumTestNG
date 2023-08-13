package Page;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ReusableMethods {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By ACCEPT_COOKIES = By.xpath("//*[@id='a-autoid-0']");
    private final By SEARCH_INPUT = By.xpath("//*[@id='twotabsearchtextbox']");
    private final By CLICK_SEARCH_ICON = By.xpath("//*[@id='nav-search-submit-button']");
    private final By PRODUCT = By.xpath("//*[@cel_widget_id='MAIN-SEARCH_RESULTS-2']");


    public HomePage searchProduct() {
        clickElement(ACCEPT_COOKIES);
        clickElement(SEARCH_INPUT);
        sendKeysElement(SEARCH_INPUT, "Macbook Air M2");
        clickElement(CLICK_SEARCH_ICON);
        clickElement(PRODUCT);
        return new HomePage(driver);
    }

}
