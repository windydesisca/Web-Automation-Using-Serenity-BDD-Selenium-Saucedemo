package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User filter list  product by {string}")
    public void selectFilterProduct(String filterProduct) throws InterruptedException {
        homePage.selectFilterProduct(filterProduct);
        Thread.sleep(1000);
    }

    @When("User click item {string}")
    public void clickButtonAddToCartItem(String item) throws InterruptedException {
        homePage.clickButtonAddToCard(item);
        Thread.sleep(1000);
    }

    @Then("User click cart keranjang")
    public void clickCart() throws InterruptedException {
        homePage.clickCart();
    }


}
