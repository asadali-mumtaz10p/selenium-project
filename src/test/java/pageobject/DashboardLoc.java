package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DashboardLoc extends BaseClass{
    public void dashboard1(){
        WebElement topBarr = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
        String actualText = topBarr.getText();
        String expectedText = "Dashboard";
        Assert.assertEquals(actualText, expectedText,"Expected and Actual are not same");
        WebElement ActionLeaves = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/p"));
        ActionLeaves.click();
    }
}
