package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // --- 1. LOCATORS (Private: Only this class knows them) ---
    // These match the HTML 'id' on the website
    private By usernameBox = By.id("user-name");
    private By passwordBox = By.id("password");
    private By loginBtn    = By.id("login-button");

    // --- 2. CONSTRUCTOR ---
    // When we create this page, we pass the active driver to it
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // --- 3. ACTIONS (Public: The test calls these) ---

    // Action to type username
    public void enterUsername(String user) {
        driver.findElement(usernameBox).sendKeys(user);
    }

    // Action to type password
    public void enterPassword(String pass) {
        driver.findElement(passwordBox).sendKeys(pass);
    }

    // Action to click login
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}