package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected LoginPage login;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.login = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
