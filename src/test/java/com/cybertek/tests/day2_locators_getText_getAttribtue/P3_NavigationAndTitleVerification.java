package com.cybertek.tests.day2_locators_getText_getAttribtue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {

        //Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to google.com
        driver.get("https://google.com");

        //Click Gmail link
        driver.findElement(By.linkText("Gmail")).click();

        //Verify title contains Gmail
        String expInTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expInTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");
        }

        //Go back to google
        driver.navigate().back();

        //Verify title equals: Google
        String expGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if(actualGoogleTitle.equals(expGoogleTitle)){
            System.out.println("Title verification success!");
        } else {
            System.out.println("Title verification failed!");
        }

        driver.quit();

    }
}
