package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    goto http://syntaxprojects.com/window-popup-modal-demo.php
click on follow on instagram
get the title and of new window and print it on the console
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement instaBtn = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        instaBtn.click();

        System.out.println(driver.getTitle());
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String newWindow = iterator.next();
            driver.switchTo().window(newWindow);
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.instagram.com/Syntaxtechs/")) {
                System.out.println(driver.getTitle());

                driver.quit();


            }
        }
    } }
