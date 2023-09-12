package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.UtilsConfig;

import java.util.Properties;

public class BaseTest {

    WebDriver driver;
    ChromeOptions options;

    Properties data;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        this.options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        data = UtilsConfig.getProperty("data");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
