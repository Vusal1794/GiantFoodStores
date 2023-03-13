package com.library.pages;

import com.library.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@id='menu-button']")
    public WebElement menu_dropdown;

    @FindBy(xpath = "//a[@id='mobile-nav-weekly-ad']")
    public WebElement weekly_ad;
    @FindBy(xpath = "//button[@id='shopNow-727039044']")
    public WebElement coke_deal;
    @FindBy(xpath = "//button[@data-product-id='310682']")
    public WebElement drPepperZeroSugar;
    @FindBy(xpath = "//button[@data-product-id='6816']")
    public WebElement cherryCola;
    @FindBy(xpath = "//button[@aria-label='close dialog']")
    public WebElement close_coke_deal_page;
    @FindBy(xpath = "//div[@class='cart-button-content_text']")
    public WebElement cart_button;
    @FindBy(xpath = "//button[@id='qa-cart-primary-btn']")
    public WebElement checkout;
}
