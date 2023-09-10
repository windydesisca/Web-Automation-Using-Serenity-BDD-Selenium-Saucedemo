package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        CartPage.driver = driver;
    }

    //select element for verify user already on cart page
    @FindBy(xpath = "//div[@class='cart_list']")
    private WebElement yourCartPage;

    //select element to remove item
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeItem;



    public boolean verifyCardPage(){
        return yourCartPage.isDisplayed();
    }
    public void clickRemoveItem(){
        removeItem.click();
    }






}
