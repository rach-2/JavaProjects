import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class menuPage
{

    @FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
    private WebElement  checkoutButton;

    public void  clickCheckOutButton()
    {
        checkoutButton.click();
    }
}
