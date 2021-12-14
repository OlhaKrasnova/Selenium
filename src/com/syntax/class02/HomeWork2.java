package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Olga");
        driver.findElement(By.name("lastname")).sendKeys("Krasnova");
        driver.findElement(By.name("reg_email__")).sendKeys("krasnova@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("krasnova@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("olga123");
        driver.findElement(By.name("birthday_month")).sendKeys("Nov");
        driver.findElement(By.name("birthday_day")).sendKeys("30");
        driver.findElement(By.name("birthday_year")).sendKeys("1993");
        driver.quit();

    }
}