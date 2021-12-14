package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Olga");
        driver.findElement(By.id("customer.lastName")).sendKeys("Krasnova");
        driver.findElement(By.id("customer.address.street")).sendKeys("906 Lewis Ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("Rockville");
        driver.findElement(By.id("customer.address.state")).sendKeys("MD");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20851");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.name("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("Olga123");
        driver.findElement(By.id("customer.password")).sendKeys("Olga123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Olga123");
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}