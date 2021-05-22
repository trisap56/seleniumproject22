package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification successful!");
        } else {
            System.out.println("login page title verification failed!");
        }

        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement inputPassword =driver.findElement(By.id("ctl00_MainContent_password"));

        inputUsername.sendKeys("Tester");
        inputPassword.sendKeys("test");

        WebElement clickLogin = driver.findElement(By.id("ctl00_MainContent_login_button"));
        clickLogin.click();

        String expectedTitleAfterLogin = "Web Orders";
        String actualTitleAfterLogin = driver.getTitle();

        if(actualTitleAfterLogin.equals(expectedTitleAfterLogin)){
            System.out.println("Home page title verification passed!");
        } else {
            System.out.println("Home page title verification failed!");
        }

        driver.quit();
    }
}
