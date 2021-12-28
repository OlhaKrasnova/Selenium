package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //locate the element checkbox

        WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckBox.click();
        Thread.sleep(2000);
        //uncheck
        singleCheckBox.click();

        //check all textboxes
        //select an xpath that has common attributes for all 4 checkboxes

        List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        // print nmber of elements

        int size=checkBoxes.size();
        System.out.println("The total number of checkboxes is: "+size);

        for(WebElement checkbox:checkBoxes){
            //checkbox.click();

            //select checkbox with value Option 3

            //get the attribute Value of all checkboxes

            String valuesofAttribute=checkbox.getAttribute("value");
            System.out.println(valuesofAttribute);

            //check olny attribute with value Option-3
            if(valuesofAttribute.equalsIgnoreCase("Option-3")){
                checkbox.click();
            }

        }




    }
}
