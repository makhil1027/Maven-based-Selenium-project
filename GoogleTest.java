package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

public class GoogleTest {

    @Test
    public void testGoogle() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\Windows"); // Update this path

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        System.out.println("Title: " + driver.getTitle()); // Print the title of the page
        driver.quit(); // Close the browser
    }
}
