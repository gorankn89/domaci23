package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SideBarPage;

public class SideBarTest extends BaseTest {
    private SideBarPage sidebarHamburger;
@BeforeMethod
public void initialase(){
    sidebarHamburger = new SideBarPage(driver);
}
@Test
    public void logout(){
    // Standard Usser Loged in Normaly
    loginPage.login("standard_user", "secret_sauce");
    //Otvaramo SideBarHamburger
    sidebarHamburger.clickHamburger();
    sidebarHamburger.clickLogOut();
    System.out.println(driver.getCurrentUrl());
    String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals(currentUrl, "https://www.saucedemo.com/");
}
}
