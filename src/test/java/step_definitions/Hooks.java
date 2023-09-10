package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;

    @Before //
    public void openBrowser(){
        //membuka setup chrome agar bisa terbuka
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(co); //inisiasi library selenium


        //memanggil html yang ingin dibuka
        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl); //fungsi untuk membuka link html
        driver.manage().window().maximize(); //fungsi untuk memaximize browser

    }
    @After
    public void closeBrowser(){
        driver.quit();
    }

}
