package Page;

import Utilities.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage extends ReusableMethods {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectProduct() {

        System.out.println("ProductsPage");

        new ProductsPage(driver);

    }
}
