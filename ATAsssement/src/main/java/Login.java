import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login
{
    @FindBy(xpath = "//*[@id=\"txtUsername\"]")
    private WebElement username;
    @FindBy(xpath ="//*[@id=\"txtPassword\"]")
    private WebElement password;
    @FindBy (xpath = "//*[@id=\"btnLogin\"]")
    private WebElement loginButton;

    public void Login()
    {
        username.sendKeys("Admin");
        password.sendKeys("AdminAdmin");
        loginButton.click();
    }

}
