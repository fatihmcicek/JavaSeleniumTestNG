package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    protected WebDriver driver;

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("report/Spark.html");

    @BeforeClass
    public void Before() {
        extent.attachReporter(spark);
        extent.createTest("First Test Report Html")
                .log(Status.PASS, "This is a logging event for First Test Report Html, and it passed!");
        extent.flush();


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigateToUrl(String url) {
        driver.navigate().to(url);
    }

    @AfterClass
    public void After() {
        driver.quit();
    }
}
