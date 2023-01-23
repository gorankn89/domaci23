package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        login.login("standard_user", "secret_sauce");

    }

}
