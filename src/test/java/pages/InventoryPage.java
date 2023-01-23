package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
@FindBy (id = "add-to-cart-sauce-labs-bike-light")
    private WebElement secondAddToCartButton;
@FindBy (id = "remove-sauce-labs-bike-light")
    private WebElement secondRemoveFromCartButton;

@FindBy (xpath = ("//*[@id=\"shopping_cart_container\"]/a"))
private WebElement lista;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickSecondButtonToAddToCart(){
        secondAddToCartButton.click();
    }
    public void clickRemoveSecondButtonFromCart(){
        secondRemoveFromCartButton.click();
    }
    public boolean isCartHavingSomething () {
        lista.findElements(By.tagName("span"));
        System.out.println("ISPIS STATUSA SPANA");
        System.out.println(lista.getText());
        this.lista.getSize();
        if(lista.getText().length() == 0){
            return false;
        }
        return true;
    }

}
