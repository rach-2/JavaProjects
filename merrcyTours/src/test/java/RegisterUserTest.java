import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserTest
{
    WebDriver driver;
    @Before
    public  void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Devolopment\\web-driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test()
    {
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        Home home = PageFactory.initElements(driver,Home.class);
        registerUser addUser = PageFactory.initElements(driver, registerUser.class);
        Login login = PageFactory.initElements(driver, Login.class);

        home.clickRegisterButton();
        addUser.registerUser();
        login.login();

        Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());



    }
}
