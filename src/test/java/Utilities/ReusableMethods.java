package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods {
    WebDriver driver;

    public ReusableMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By xpath){
        WebElement element = driver.findElement(xpath);
        element.click();
    }

    public void sendKeysElement(By xpath, String value){
        WebElement element = driver.findElement(xpath);
        element.sendKeys(value);
    }
}
