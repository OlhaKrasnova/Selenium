package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("browser launched");

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(("Admin"));
        //driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();



    }
}


