package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    public static WebDriver webDriver;

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        OverviewPage.webDriver = driver;
    }
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish1;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement subTotal;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxTotal;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement totalOrder;

    public void verifyCheckoutOverview(){
        subTotal.isDisplayed();
        taxTotal.isDisplayed();
        totalOrder.isDisplayed();
    }
    public void clickFinish(){
        String buttonFinish = "//button[@id='finish']";
        webDriver.findElement(By.xpath(buttonFinish)).isDisplayed();
        Float subTotalValue = Float.valueOf(subTotal.getText().replace("Item total: $", ""));
        Float taxValue = Float.valueOf(taxTotal.getText().replace("Tax: $", ""));
        Float totalOrderValue = Float.valueOf(totalOrder.getText().replace("Total: $", ""));

        if(subTotalValue + taxValue == totalOrderValue){
            webDriver.findElement(By.xpath(buttonFinish)).click();
        }
    }
    @FindBy(xpath = "//div[@id='checkout_info_container']")
    private WebElement checkoutForm;

    public boolean verifyCheckoutForm(){
        return checkoutForm.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement priceOfGoodsVerification;
    public String verifyPriceOfGoods() {
        return priceOfGoodsVerification.getText().replace("Total: ", "");
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement finishOrderVerification;
    public boolean verifyFinishOrder() {
        return finishOrderVerification.isDisplayed();
    }

}
