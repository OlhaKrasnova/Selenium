package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    /*
    goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
click on follow on instagram
click on facebook.com
get all windows handles
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        WebElement InstaBTN=driver.findElement(By.xpath("//a[contains(@title,'Instagram')]"));
        InstaBTN.click();

        WebElement FbBtn = driver.findElement(By.xpath("//a[contains(@title,'Facebook')]"));
        FbBtn.click();

        Set<String> allWindowHandles=driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it=allWindowHandles.iterator();
        String instagramHandle=it.next();
        String facebookHandle=it.next();

        System.out.println(instagramHandle);
        System.out.println(facebookHandle);

    }
}
