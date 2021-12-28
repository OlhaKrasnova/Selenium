package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //go to the website ebay.com
        driver.get("https://www.ebay.com");

        //get all the links that are there on ebay.com
        //as we have multiple elements with tagname "a"
        List<WebElement> links = driver.findElements(By.tagName("a"));

        //print the size of list

        System.out.println("The size of list containing links is:" + links.size());

        //print all the links
        for (WebElement link : links) {
            String linkText = link.getText();
            if (!linkText.isEmpty()) {
                System.out.println(linkText);

                String linkAddress=link.getAttribute("href");
                System.out.println(linkAddress);

                System.out.println("----------------");


            }


        }
    }
}

