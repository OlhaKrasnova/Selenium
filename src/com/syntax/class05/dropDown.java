package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //navigate
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // find the element "drop down"
        WebElement days = driver.findElement(By.cssSelector("select#select-demo"));
        //use the select class to select from drop down
        Select select = new Select(days);
        //select.selectByIndex(1);
       // Thread.sleep(2000);

       // select.selectByIndex(2);

        //select.selectByVisibleText("Thursday"); //select by text

        select.selectByValue("Wednesday");



    }
}
