package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        //get the address/handle of the page/window
        String signUpPageHandle = driver.getWindowHandle();
        System.out.println("The window handle for signup page is: " + signUpPageHandle);
        //click on help
        WebElement helpBTN=driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termsBTN=driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacyBTN=driver.findElement(By.xpath("//a[text()='Privacy']"));

        //click on them to open up new windows
        helpBTN.click();
        termsBTN.click();
        privacyBTN.click();
        //to get all the window handles
        Set<String> allWindowHandles=driver.getWindowHandles();
        //print the size of allWindowHandles
        System.out.println(allWindowHandles.size());

        //in order to print all window handles we need to iterate through the set
        Iterator<String> it=allWindowHandles.iterator();
        while(it.hasNext()){
            String handle = it.next();
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println(title);
                break;
            }
        }}}
        /*signUpPageHandle=it.next();
        String  helpPageHandle=it.next();
        String termsPageHandle=it.next();
        String privacyPageHandle=it.next();

        System.out.println(signUpPageHandle);
        System.out.println(helpPageHandle);
        System.out.println(termsPageHandle);
        System.out.println(privacyPageHandle);

        //switch to help page
        driver.switchTo().window(helpPageHandle);
        System.out.println(driver.getTitle());
            }
        }*/