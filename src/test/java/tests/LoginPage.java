package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.LoginApp;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseTest{

    @Test(description = "Verify the login on OrangeHRM Web app with valid credentials")
    public void login() throws InterruptedException {
        LoginApp lgn = new LoginApp(driver);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "OrangeHRM");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(pageTitle,"OrangeHRM");
        Thread.sleep(4000);
        lgn.lgnApp(data.getProperty("username"), data.getProperty("password"));
        softAssert.assertAll();
        if (pageTitle.equalsIgnoreCase("OrangeHRM")) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Not a match");
        }
        WebElement alert = driver.findElement(By.xpath("//div[@class = 'oxd-alert oxd-alert--error']"));
        Assert.assertEquals(alert.getText(),"Invalid credentials");

    }
    @Test(description = "Verify the login on OrangeHRM Web app with valid credentials")
    public void login2() throws InterruptedException {
        LoginApp lgn = new LoginApp(driver);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "OrangeHRM");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(pageTitle,"OrangeHRM");
        Thread.sleep(4000);
        lgn.lgnApp("admin", "admin123");
        softAssert.assertAll();
        if (pageTitle.equalsIgnoreCase("OrangeHRM")) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Not a match");
        }
    }
}
