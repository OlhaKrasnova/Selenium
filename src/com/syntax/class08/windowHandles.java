package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
//find new tab button
        WebElement newTab = driver.findElement(By.cssSelector("button#tabButton"));
        //find new window button
        WebElement newWindow = driver.findElement(By.cssSelector("button#windowButton"));
        //click on newtab and window btn

        newTab.click();
        newWindow.click();
        //print the handle of the main page/home page/parent page
        String parentHandle = driver.getWindowHandle();
        System.out.println(parentHandle);
        //to switch to newtab and get the text
        //1. get all handles
        Set<String> allHandles=driver.getWindowHandles();

        //2. find the desired handle i.e of newtab by iterating through the set
        Iterator<String> it=allHandles.iterator();
        //2.get the first handle
        while(it.hasNext()){
            String handler=it.next();
            driver.switchTo().window(handler);
            //now get the title and check if its a desired tab or not

            if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
        //successful switch

        WebElement text=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());
        //click on new windows message button

        //driver.switchTo().defaultContent();
        driver.switchTo().window(parentHandle);
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();




    }
}
