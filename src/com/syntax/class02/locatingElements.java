package com.syntax.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.name("email")).sendKeys("krasnova@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("12345");
        //driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();

    }

}
