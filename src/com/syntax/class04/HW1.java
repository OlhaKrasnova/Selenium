package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException  {
      /*
      Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
       */

                System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
                WebDriver driver=new ChromeDriver();
                driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//div[@id='divUsername']//following-sibling::input")).sendKeys("Admin");
                driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
                Thread.sleep(4000);
                WebElement text= driver.findElement(By.xpath("//span[@id='spanMessage']"));
                System.out.println(text.getText());









            }
}
