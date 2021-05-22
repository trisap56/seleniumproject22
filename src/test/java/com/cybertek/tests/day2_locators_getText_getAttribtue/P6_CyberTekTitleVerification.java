package com.cybertek.tests.day2_locators_getText_getAttribtue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CyberTekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(3000);
        driver.findElement(By.className("nav-link")).click();
        Thread.sleep(3000);
        String expTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expTitle)){
            System.out.println("Title verification successful");
        } else {
            System.out.println("Title verification failed");

        }
        driver.quit();
    }
}
