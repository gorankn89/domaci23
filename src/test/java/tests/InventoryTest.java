package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest{

    @Test
    public void addToCart() throws InterruptedException {
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.clickSecondButtonToAddToCart();
        Thread.sleep(5000);
        Assert.assertTrue(inventoryPage.isCartHavingSomething());
        inventoryPage.clickRemoveSecondButtonFromCart();
        Assert.assertTrue(!(inventoryPage.isCartHavingSomething()));


    }

}
