import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployePage
{
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement fristName;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id=\"select-options-99629067-3ce1-e2a5-6f8a-2877b65d08ae\"]")
    private WebElement country;
    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
    private WebElement addLoginDetailsLink;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userName;
    @FindBy(xpath = "//*[@id=\"select-options-d9596250-73a2-d9b2-f170-3ba83cce59e4\"]")
    private  WebElement status;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    private WebElement comfirmPassword;
    @FindBy(xpath = "//*[@id=\"systemUserSaveBtn\"]")
    private WebElement saveButonn;


    public void fillEmployyeeDetails()
    {
        fristName.sendKeys("Tester");
        lastName.sendKeys("Test");
        country.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectAddLoginDetails()
    {
        addLoginDetailsLink.click();
    }

    public void  fillInLoginDetails()
    {
        userName.sendKeys("username");
        password.sendKeys("password");
        comfirmPassword.sendKeys("password");
    }

    public void clickSaveButton()
    {
        saveButonn.click();
    }

}
