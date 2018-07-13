import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StepDifantion
{
    WebDriver driver;
    Login login;
    AdminPage  adminPage;
    AddEmployePage addEmployePage;
    searchEmployyePage searchEmployye;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver" ,"C:\\Devolopment\\web-driver\\chromedriver.exe");
        driver = new ChromeDriver();
        login = PageFactory.initElements(driver, Login.class);
        adminPage = PageFactory.initElements(driver, AdminPage.class);
        addEmployePage = PageFactory.initElements(driver, AddEmployePage.class);

    }

    @Given("the login page")
    public void theLoginPage()
    {
        driver.get("https://qa-trials641.orangehrmlive.com/auth/login");
    }

    @When("I login")
    public void login()
    {

        login.Login();
    }

    @And("I click the PIM tab")
    public void clickThePimTab()
    {
        adminPage.clickPinTab();
    }

    @And( " then the Add Employee Tab")
    public void  clickAddEmployyeTab()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adminPage.clickAddEmpoyyeLink();
    }

    @And("I fill out the Employee Details correctly")
    public void fillOutTheEmplloyeDetails()
    {
        addEmployePage.fillEmployyeeDetails();
    }
    @And("I choose to create Login Details by clicking the appropriate button")
    public void choseLoginDetails()
    {
        addEmployePage.selectAddLoginDetails();
    }

    @And("I fill out the Login Details correctly")
    public void fillLoginDetails()
    {
        addEmployePage.fillInLoginDetails();
    }

    @And("I click the Save button")
    public void clickTheSaveButton()
    {
         addEmployePage.clickSaveButton();
    }


    @Then("I can search for the Employee I have just created")
    public void SearchForEmployee()
    {
            searchEmployye.searchEmployee();
    }

    @And("select them for inspection")
    public void selectThemForInspection()
    {
        searchEmployye.clickEmployyee();
        Assert.assertEquals("Employee List", driver.getTitle());
    }

@After
    public void  tearDown()
    {
        driver.quit();
    }

}
