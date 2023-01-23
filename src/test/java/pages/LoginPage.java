package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String password){
        this.username.clear();
        this.password.clear();

        this.username.sendKeys(username);
        this.password.sendKeys(password);

        loginButton.click();
    }
}
