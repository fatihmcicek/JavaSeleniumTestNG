package Page;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage extends ReusableMethods {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private final By PRODUCT = By.xpath("//select[@class='brands']");

    public ProductsPage selectProduct(){
        return this;
    }

}
