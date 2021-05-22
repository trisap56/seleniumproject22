package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        // If a web element is not found, this will wait UP To given seconds
        //If a web element is located before 15 seconds, it will move on.
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //CREATE A LOCATOR THAT RETURNS US ALL THE LINKS ON THE PAGE
        //body//a --> this will return all of the links on the page
        List<WebElement> listOfLinks =driver.findElements(By.xpath("//body//a"));

        for (WebElement listOfLink : listOfLinks) {
            System.out.println("title: " + listOfLink.getText());
            System.out.println("link: "+ listOfLink.getAttribute("href"));
        }

        //PRINT HOW MANY TOTAL LINKS
        int numOfLinks = listOfLinks.size();

        System.out.println("numOfLinks = " + numOfLinks);



        driver.quit();
    }
}
