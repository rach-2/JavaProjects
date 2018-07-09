import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gh {

    WebDriver driver;

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","C:\\Devolopment\\web-driver\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public void methond(){
        driver.get("http://www.google.com");
    }
    @After
    public void  tearDown(){
        driver.quit();
    }



}
