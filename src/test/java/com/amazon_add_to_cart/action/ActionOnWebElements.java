package com.amazon_add_to_cart.action;

import com.amazon_add_to_cart.utilites.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionOnWebElements {
    public WebDriver driver;
    Utilities utilities;

    public ActionOnWebElements(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnButton (WebElement element ) throws InterruptedException {
        Thread.sleep(5000);
        element.click();
    }



    public void sendKeys(WebElement element, String text) throws Exception{
        Thread.sleep(3000);
        element.clear();
        Thread.sleep(3000);
        element.sendKeys(text);
    }
    public String getTexts(WebElement element){
        String text = element.getText();
        return text;
    }

}


