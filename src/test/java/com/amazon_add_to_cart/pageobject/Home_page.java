package com.amazon_add_to_cart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
    public WebDriver driver;

    public Home_page (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#nav-logo-sprites")
    public WebElement verifyHomepageLogo;

    @FindBy (xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy (xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchIcon;
}
