package com.amazon_add_to_cart.testScripts;

import com.amazon_add_to_cart.action.ActionOnWebElements;
import com.amazon_add_to_cart.baseclass.Base_Class;
import com.amazon_add_to_cart.pageobject.Home_page;
import com.amazon_add_to_cart.pageobject.Items_list;
import com.amazon_add_to_cart.utilites.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TC_Home_page extends Base_Class {

    Home_page homePage;
    Items_list itemsList;
    ActionOnWebElements actionOnWebElements;
    Utilities utilities;
    JavascriptExecutor jse;

    @BeforeMethod
    public void objectOfClass() {
        homePage = new Home_page(driver);
        itemsList = new Items_list(driver);
        actionOnWebElements = new ActionOnWebElements(driver);
        utilities = new Utilities(driver);
        jse = (JavascriptExecutor) driver;
    }

    @Test(description = "TC_001 - Checks that Company logo is visible or not", enabled = true, priority = 0)
    public void tc_001() throws Exception {
        if (homePage.verifyHomepageLogo.isEnabled()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }

    @Test(description = "TC_002 - Add 5-items on add-to-cart section ", enabled = true ,priority = 1)
    public void tc_002() throws Exception {

        //Add 3-Mistake Of My Life in Add-To-Cart
        actionOnWebElements.sendKeys(homePage.searchBox, "3-mistake of my life");
        actionOnWebElements.clickOnButton(homePage.searchIcon);
        actionOnWebElements.clickOnButton(itemsList.book_3mistakes);
        String parentHandle = driver.getWindowHandle();
        utilities.windowHandle(driver);
        WebElement addToCartItem_1 =  utilities.explicitWait(itemsList.add_to_card_1);
        actionOnWebElements.clickOnButton(addToCartItem_1);
        Thread.sleep(5000);

        //Close the Current Page/Window/Child Window Handle page
        driver.close();

        //Switch to Parent Window Handler page
        driver.switchTo().window(parentHandle);

        //Add Iphone 15 Pro in Add-To-Cart
        actionOnWebElements.sendKeys(homePage.searchBox, "iphone 15 pro max 256gb blue titanium");
        actionOnWebElements.clickOnButton(homePage.searchIcon);
        actionOnWebElements.clickOnButton(itemsList.iphone_15Pro);
        utilities.windowHandle(driver);
        WebElement addToCartItem_2 =  utilities.explicitWait(itemsList.add_to_card_2);
        actionOnWebElements.clickOnButton(addToCartItem_2);
        Thread.sleep(5000);

        //Close the Current Page/Window/Child Window Handle page
        driver.close();

        //Switch to Parent Window Handler page
        driver.switchTo().window(parentHandle);

        //Add Puma Shoes in Add-To-Cart
        actionOnWebElements.sendKeys(homePage.searchBox, "puma Mens Sear Running Shoe");
        actionOnWebElements.clickOnButton(homePage.searchIcon);
        actionOnWebElements.clickOnButton(itemsList.puma_Shoes);
        utilities.windowHandle(driver);
        WebElement addToCartItem_3 =  utilities.explicitWait(itemsList.add_to_card_1);
        actionOnWebElements.clickOnButton(addToCartItem_3);
        Thread.sleep(5000);

        //Close the Current Page/Window/Child Window Handle page
        driver.close();

        //Switch to Parent Window Handler page
        driver.switchTo().window(parentHandle);

        //Add LG TV in Add-To-Cart
        actionOnWebElements.sendKeys(homePage.searchBox, "LG 80 cm (32 inches) HD Ready Smart LED TV 32LM563BPTC (Dark Iron Gray)");
        actionOnWebElements.clickOnButton(homePage.searchIcon);
        actionOnWebElements.clickOnButton(itemsList.lg_Tv);
        utilities.windowHandle(driver);
        WebElement addToCartItem_4 =  utilities.explicitWait(itemsList.add_to_card_1);
        actionOnWebElements.clickOnButton(addToCartItem_4);
        Thread.sleep(5000);

        //Close the Current Page/Window/Child Window Handle page
        driver.close();

        //Switch to Parent Window Handler page
        driver.switchTo().window(parentHandle);

        //Add Samsung Refrigerator in Add-To-Cart
        actionOnWebElements.sendKeys(homePage.searchBox, "Samsung 236 L, 3 Star, Digital Inverter, Frost Free Double Door Refrigerator");
        actionOnWebElements.clickOnButton(homePage.searchIcon);
        actionOnWebElements.clickOnButton(itemsList.samsung_DoubleRefrigerator);
        utilities.windowHandle(driver);
        WebElement addToCartItem_5 =  utilities.explicitWait(itemsList.add_to_card_2);
        actionOnWebElements.clickOnButton(addToCartItem_5);
        Thread.sleep(5000);

        //Close the Current Page/Window/Child Window Handle page
        driver.close();

        //Switch to Parent Window Handler page
        driver.switchTo().window(parentHandle);

        actionOnWebElements.clickOnButton(itemsList.add_to_cart_button);

        //Checks current page is add-to-cart section or not
        String title = driver.getTitle();
        if (title.equals("Amazon.in Shopping Cart")){
            actionOnWebElements.clickOnButton(itemsList.proceed_To_Buy);
            Assert.assertTrue(true);
            Thread.sleep(5000);
            driver.quit();
        } else {
            utilities.screenShotCapture(driver,"TC-001");
            Assert.assertFalse(false);
            Thread.sleep(5000);
            driver.quit();
        }


    }




}
