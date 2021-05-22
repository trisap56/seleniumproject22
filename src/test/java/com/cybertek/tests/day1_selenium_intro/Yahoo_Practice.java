package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://yahoo.com");
        String actualTitle = driver.getTitle();
        System.out.println("title: " + driver.getTitle());

        String expectedTitle = "Yahoo";

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification passed!");
        } else {
            System.out.println("Title is not as expected. Verification failed!");
        }

        driver.quit();
    }
}
