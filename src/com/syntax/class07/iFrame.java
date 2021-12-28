package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //switchto desired frame as our desired webelement is inside that frame
        driver.switchTo().frame("frame1");

        //getting the webelement
        WebElement text1=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text1.getText());
        // as frame 2 doesnt lie inside frame 1 so in order to get there we need to switch to default page
        driver.switchTo().defaultContent();

        //switch to frame 2

        driver.switchTo().frame("frame2");
        WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text2.getText());
        driver.switchTo().defaultContent();


    }
}