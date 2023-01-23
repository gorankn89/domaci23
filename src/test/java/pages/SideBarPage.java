package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBarPage extends BasePage {
    @FindBy (xpath = "//*[@id=\"react-burger-menu-btn\"]")
    private WebElement hamburgerButton;

    @FindBy (id = "logout_sidebar_link")
    private WebElement logOutLink;

    public SideBarPage(WebDriver driver) {
        super(driver);
    }
    public void clickHamburger() {
        hamburgerButton.click();
    }

    public void clickLogOut() {
        logOutLink.click();
    }
}
