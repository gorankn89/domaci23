package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
@FindBy (id = "add-to-cart-sauce-labs-bike-light")
    private WebElement secondAddToCartButton;
@FindBy (id = "remove-sauce-labs-bike-light")
    private WebElement secondRemoveFromCartButton;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickSecondButtonToAddToCart(){
        secondAddToCartButton.click();
    }
    public void clickRemoveSecondButtonFromCart(){
        secondRemoveFromCartButton.click();
    }

}
