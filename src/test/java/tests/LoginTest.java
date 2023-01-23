package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTestUsers() throws InterruptedException {
        // Standard Usser Loged in Normaly
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        //Locked in user test
        this.beforeMethod();
        loginPage.login("locked_out_user", "secret_sauce");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText(), "Epic sadface: Sorry, this user has been locked out.");
        //StandardUser Wrong password Test
        this.beforeMethod();
        loginPage.login("standard_user", "sweet_sauce");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }
}
