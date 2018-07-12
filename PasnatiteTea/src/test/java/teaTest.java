import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class teaTest
{
    WebDriver driver;
    HomePage home;
    menuPage menu;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver" , "C:\\Devolopment\\web-driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        home = PageFactory.initElements(driver, HomePage.class);
        menu = PageFactory.initElements(driver, menuPage.class);

    }

    @Given("the correct web address")
    public void theCorrectWebAdress()
    {
        driver.get("http://www.practiceselenium.com/");
    }

    @When("I navigate to the 'Menu' page")
    public void  navigateToMenuFecture()
    {
        home.clickMenuLink();
    }

    @Then("I can browse a list of the available products.")
    public void  browzwListOfAvaibleProdeucts()
    {
        home.clickMenuLink();
        Assert.assertEquals("Menu",driver.getTitle());
    }


//    @Given("the correct web address")
//    public void correcWebAdress()
//    {
//        driver.get("http://www.practiceselenium.com/menu.html");
//    }

    @When("I click the checkout button")
    public void  clickCheckOutButton()
    {
        home.clickMenuLink();
        menu.clickCheckOutButton();

    }
    @Then("I am taken to the checkout page")
    public void checkOutPage()
    {
        home.clickMenuLink();
        menu.clickCheckOutButton();
        Assert.assertEquals("Check Out", driver.getTitle());
    }

    @After
    public void tearDown ()
    {

        driver.quit();
    }

}


