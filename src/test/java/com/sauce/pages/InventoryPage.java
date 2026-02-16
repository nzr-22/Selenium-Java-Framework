package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver;

    // 1. Locators
    private By backpackAddBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge      = By.className("shopping_cart_badge");

    // 2. Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Actions
    public void addBackpackToCart() {
        driver.findElement(backpackAddBtn).click();
    }

    public String getCartItemCount() {
        return driver.findElement(cartBadge).getText();
    }
}