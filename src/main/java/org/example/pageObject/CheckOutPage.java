package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    public static WebDriver webDriver;

    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        CheckOutPage.webDriver = driver;
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement bttnCheckout;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement bttnContinue;

    public void clickButtonCheckout(){
        bttnCheckout.click();
    }

    public void setFirstName(String frstName){
        firstName.sendKeys(frstName);
    }

    public void setLastName(String lstName){
        lastName.sendKeys(lstName);
    }

    public void setPostalCode(String pstCode){
        postalCode.sendKeys(pstCode);
    }

    public void clickButtonContinue(){
        bttnContinue.click();
    }

}
