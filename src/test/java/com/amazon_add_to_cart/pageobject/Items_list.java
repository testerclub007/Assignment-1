package com.amazon_add_to_cart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Items_list {
    public WebDriver driver;

    public Items_list(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//    @FindBy(css = "img[alt='Puma Men's Dazzler Sneakers']")
//    public WebElement puma_Shoes ;

    @FindBy(css = "img[alt='THE 3 MISTAKES OF MY LIFE']")
    public WebElement book_3mistakes;

    @FindBy(xpath = "//span[text()='Apple iPhone 15 Pro Max (256 GB) - Blue Titanium']")
    public WebElement iphone_15Pro;
    @FindBy(xpath = "//span[text()='Mens Sear Running Shoe']")
    public WebElement puma_Shoes;
    @FindBy(xpath = "//span[text()='LG 80 cm (32 inches) HD Ready Smart LED TV 32LM563BPTC (Dark Iron Gray)']")
    public  WebElement lg_Tv;

    @FindBy (xpath = "//span[text()='Samsung 236 L, 3 Star, Digital Inverter, Frost Free Double Door Refrigerator (RT28C3053S8/HL, Silver, Elegant Inox, 2023 Model)']")
    public WebElement samsung_DoubleRefrigerator;



    @FindBy (xpath = "//input[@id='add-to-cart-button']")
    public WebElement add_to_card_1;
    @FindBy (xpath = "(//input[@id='add-to-cart-button'])[2]")
    public WebElement add_to_card_2;

    @FindBy(xpath = "//a[@id='nav-cart']")
    public  WebElement add_to_cart_button;

    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    public  WebElement proceed_To_Buy;
}

