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
        PageFactory.initElements(driver,this);
    }

    private final By SEARCH_INPUT = By.xpath("//*[@id='twotabsearchtextbox']");

    public ProductsPage clickZeroCarButton(){
        clickElement(SEARCH_INPUT);
        sendKeysElement(SEARCH_INPUT,"Macbook Air M2");
        return new ProductsPage(driver);
    }

}
