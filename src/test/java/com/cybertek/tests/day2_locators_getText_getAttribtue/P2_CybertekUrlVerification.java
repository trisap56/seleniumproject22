package com.cybertek.tests.day2_locators_getText_getAttribtue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        // URL test
        String expInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expInUrl)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");
        }

        // Title test
        String expTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");

        }

        driver.quit();

    }

}
