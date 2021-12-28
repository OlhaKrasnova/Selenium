package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException{
        /*
        goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)
         */
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.findElement(By.cssSelector("input[name *='first_name']")).sendKeys("Olga");
        driver.findElement(By.cssSelector("input[name *='last_name']")).sendKeys("Krasnova");
        driver.findElement(By.cssSelector("input[name *='email']")).sendKeys("krasnova@gmail.com");
        driver.findElement(By.cssSelector("input[name *='phone']")).sendKeys("240-355-5555");
        driver.findElement(By.cssSelector("input[name *='address']")).sendKeys("123 King St.");
        driver.findElement(By.cssSelector("input[name *='city']")).sendKeys("Baltimore");
        driver.findElement(By.cssSelector("select[name *='state']")).click();
        driver.findElement(By.xpath("//option[text()='Maryland']")).click();
        driver.findElement(By.cssSelector("input[name *='zip']")).sendKeys("22060");
        driver.findElement(By.cssSelector("input[name *='website']")).sendKeys("www.website.com");
        driver.findElement(By.xpath("//input[@name='hosting'][@value='no']")).click();
        driver.findElement(By.cssSelector("textarea[name *='comment']")).sendKeys("helloBatch11");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        driver.quit();



    }
    }

