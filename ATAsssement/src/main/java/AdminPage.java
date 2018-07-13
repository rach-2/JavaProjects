import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage
{
    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[3]")
    private WebElement pinTab;
    @FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
   private  WebElement addEmployeeLink;
//    @FindBy(id = "menu_pim_addEmployee")
//    private  WebElement addEmployeeLink;

    public void clickPinTab()
    {
        pinTab.click();
    }

    public void clickAddEmpoyyeLink()
    {

        addEmployeeLink.click();
        //addEmployeeLink.
        //addEmployeeLink.sendKeys(Keys.);
    }


}
