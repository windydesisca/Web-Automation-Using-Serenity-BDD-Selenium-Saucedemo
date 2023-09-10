package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    private final WebDriver driver = Hooks.driver;

    CartPage cartPage = new CartPage(driver);

    @When("User already on cart page")
    public void verifyCartPage(){
        Assert.assertTrue(cartPage.verifyCardPage());
    }

    @And("User clicks remove product Test.allTheThings T-Shirt Red")
    public void removeItem(){
        cartPage.clickRemoveItem();
    }



}

