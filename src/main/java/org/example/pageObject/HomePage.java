package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public static WebDriver webDriver;

    //locator dapat dipanggil lewat webdriver

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement  filterProduct;

    //untuk select keranjang
    @FindBy(xpath = "//a[.='2']")
    private WebElement cartKeranjang;


    public void selectFilterProduct(String fltrProduct) {
        Select filter = new Select(filterProduct);
        filter.selectByVisibleText(fltrProduct);
    }

    public void clickButtonAddToCard(String item){
        String xpath = "//div[text()='" + item + "']/ancestor::div[@class='inventory_item']//button";
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void clickCart(){
        cartKeranjang.click();
    }


}
