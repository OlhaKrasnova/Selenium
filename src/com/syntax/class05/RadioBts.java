package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement female=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        //female.click();

        //check if radio btn is displayed
        boolean isDisplayed=female.isDisplayed();
        System.out.println("The radio is displayed on the webPage :"  + isDisplayed);

        //check if radio btn is enabled
        boolean isEnabled=female.isEnabled();
        System.out.println("The radio button is enabled:"+isEnabled);

        //check if female radio btn is selected
        boolean isSelected=female.isSelected();
        System.out.println("The female radio button is selected:"+isSelected);

        //Select female radio btn only if its enabled
        if(isEnabled) {
            female.click();
        }

        //after clicking the button print if its selected or not
        isSelected= female.isSelected();

        System.out.println("The female button is selected on the page:" +isSelected);





        }




    }

