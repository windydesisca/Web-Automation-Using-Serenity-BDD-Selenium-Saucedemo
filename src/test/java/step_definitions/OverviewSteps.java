package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OverviewSteps {

    private final WebDriver driver = Hooks.driver;

    OverviewPage overviewPage = new OverviewPage(driver);

    @Then("User already on Checkout Overview")
    public void verifyCheckoutOverview() throws InterruptedException {
        overviewPage.verifyCheckoutOverview();
        Thread.sleep(3000);
    }
    @Then("Verify button finish")
    public void clickFinish() throws InterruptedException {
        overviewPage.clickFinish();
        Thread.sleep(3000);
    }

    @And("User already on Checkout: Complete! page")
    public void verifyCheckoutCompletePage() throws InterruptedException {
        Assert.assertTrue(overviewPage.verifyFinishOrder());
        Thread.sleep(2000);
    }
}
