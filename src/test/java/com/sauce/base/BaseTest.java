package com.sauce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;
    public Properties prop; // 1. New variable to hold our config data

    @BeforeMethod
    public void setup() throws IOException { // Added "throws IOException" to handle file errors

        // --- 2. Load the Config File ---
        prop = new Properties();
        // System.getProperty("user.dir") gives the path to your project folder dynamically
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
        prop.load(fis);

        // --- 3. Use the Data from Config ---
        String browserName = prop.getProperty("browser"); // Reads "chrome"
        String url = prop.getProperty("url");             // Reads "https://www.saucedemo.com/"

        System.out.println("Running on Browser: " + browserName);

        // Simple check to support multiple browsers in the future
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            throw new RuntimeException("Browser not supported: " + browserName);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Use the URL from the config file, not hardcoded!
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}