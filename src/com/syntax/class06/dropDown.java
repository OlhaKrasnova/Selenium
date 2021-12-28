package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //find the web element drop down

        driver.findElement(By.cssSelector("select#multi-select"));
        //we can use select class so we make an object
        WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));

        Select select=new Select(statesDD);
        boolean ismul=select.isMultiple();
        System.out.println(ismul);

        select.selectByIndex(2);

        Thread.sleep(2000);

        select.selectByVisibleText("Texas");

        Thread.sleep(2000);

        select.selectByValue("Ohio");
        Thread.sleep(2000);

        select.deselectByIndex(2);

        Thread.sleep(2000);
        select.deselectByVisibleText("Texas");

        //use iterator to get all the options text and print in console
        //get all the options
        List<WebElement> allOptions = select.getOptions();
        Iterator<WebElement> itr = allOptions.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getText());
        }


    }
}
