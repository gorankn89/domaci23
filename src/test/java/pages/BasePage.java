package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @BeforeClass
    public void beforeClass(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
