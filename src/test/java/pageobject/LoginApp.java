package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginApp extends BaseClass{


    public void lgnApp(String userName2, String password2) throws InterruptedException {
        WebElement userName = driver.findElement(this.userName1);
        WebElement password = driver.findElement(this.password);
        WebElement loginButton = driver.findElement(this.loginButton);
        userName.sendKeys(userName2);
        password.sendKeys(password2);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginButton.click();
    }
    public LoginApp(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        this.driver = driver;
    }
}