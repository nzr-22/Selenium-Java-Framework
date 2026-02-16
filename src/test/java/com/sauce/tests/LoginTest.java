package com.sauce.tests;

import com.sauce.base.BaseTest;
import com.sauce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage login = new LoginPage(driver);

        // OLD WAY (Hardcoded):
        // login.enterUsername("standard_user");

        // NEW WAY (Professional):
        // We use 'prop' which we inherited from BaseTest
        login.enterUsername(prop.getProperty("username"));
        login.enterPassword(prop.getProperty("password"));

        login.clickLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"), "URL did not contain 'inventory'. Login Failed!");
    }
}