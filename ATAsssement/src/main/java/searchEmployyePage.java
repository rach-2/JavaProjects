import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchEmployyePage
{
    @FindBy(xpath = "//*[@id=\"employee_name_quick_filter_employee_list_value\"]")
    private WebElement searchBar;
    @FindBy(xpath = "//*[@id=\"quick_search_icon\"]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"employeeListTable\"]/tbody/tr[1]/td[3]")
    private WebElement employeDetails;

    public void searchEmployee()
    {
        searchBar.sendKeys("tester test");
        searchBar.click();
    }

    public void clickEmployyee()
    {
        employeDetails.click();
    }
}
