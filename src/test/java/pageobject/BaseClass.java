package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
    WebDriver driver;
    WebDriverWait wait;
    public By userName1 = new By.ByName("username");
    public By password = new By.ByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    public By loginButton = new By.ByXPath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

}
