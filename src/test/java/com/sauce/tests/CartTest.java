package com.sauce.tests;

import com.sauce.base.BaseTest;
import com.sauce.pages.InventoryPage;
import com.sauce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {
        // 1. Login (We reuse the code we wrote before!)
        LoginPage login = new LoginPage(driver);
        login.enterUsername(prop.getProperty("username"));
        login.enterPassword(prop.getProperty("password"));
        login.clickLogin();

        // 2. Add Item to Cart (New Logic)
        InventoryPage inventory = new InventoryPage(driver);
        inventory.addBackpackToCart();

        // 3. Verify '1' appears on the cart icon
        String items = inventory.getCartItemCount();
        Assert.assertEquals(items, "1", "Cart count should be 1!");
    }
}