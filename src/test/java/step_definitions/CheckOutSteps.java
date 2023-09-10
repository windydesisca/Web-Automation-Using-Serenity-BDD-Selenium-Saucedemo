package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckOutPage;
import org.openqa.selenium.WebDriver;

public class CheckOutSteps {

    private final WebDriver driver = Hooks.driver;

    CheckOutPage checkOutPage = new CheckOutPage(driver);

    @And("User click button Check Out")
    public void clickButtonCheckout() throws InterruptedException {
        checkOutPage.clickButtonCheckout();
        Thread.sleep(2000);
    }

    @When("User input {string} as a firstName {string} as a lastName and {string} as a postalCode")
    public void inputCredential(String frstName, String lstName, String pstCode) throws InterruptedException {
        checkOutPage.setFirstName(frstName);
        checkOutPage.setLastName(lstName);
        checkOutPage.setPostalCode(pstCode);
    }

    @And("User click button Continue")
    public void clickButtonContinue() throws InterruptedException {
        checkOutPage.clickButtonContinue();
        Thread.sleep(2000);
    }
}
