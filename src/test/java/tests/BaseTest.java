package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.InventoryPage;
import pages.LoginPage;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;

    protected InventoryPage inventoryPage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.loginPage = new LoginPage(driver);
        this.inventoryPage = new InventoryPage(driver);
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://www.saucedemo.com");
    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
        driver.quit();
    }

}
