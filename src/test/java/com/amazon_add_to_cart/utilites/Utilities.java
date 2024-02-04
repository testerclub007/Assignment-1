package com.amazon_add_to_cart.utilites;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Set;

public class Utilities {
    public WebDriver driver;

    public Utilities (WebDriver driver) {
        this.driver = driver;
    }
    public WebElement explicitWait (WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(element));
        return addToCartButton;
    }
    public void windowHandle (WebDriver driver){
        String parentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
            }
        }
    }
    public void screenShotCapture (WebDriver driver, String testName) throws Exception {
        // Steps 1:- Convert WebDriver Object to TakesScreenshot Interface.
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // Steps 2:- Call getScreenShotAs() Method to Create Image File
        File sourceImage = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // Steps 3 :- Where this file will be placed.
        File destination = new File("Screenshots//"+testName+".png");

        // Steps 4 :- Copy SourceImage File to Destination
        FileUtils.copyFile(sourceImage,destination);

    }



}
