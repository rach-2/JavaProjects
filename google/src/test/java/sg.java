public class sg {
}



//    WebDriver driver;
//
//    String url;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
//        driver = new ChromeDriver();
//
//
//    }
//
//    @When("^I search for \"([^\"]*)\"$")
//    public void i_search_for(String arg1) {
//        // Write code here that turns the phrase above into concrete actions
//        searchClass page = PageFactory.initElements(driver, searchClass.class);
//        page.sendKeysToSearch(arg1);
//    }
//
//    @Then("^I am taken to a list of data for that search$")
//    public void i_am_taken_to_a_list_of_data_for_that_search() {
//        // Write code here that turns the phrase above into concrete actions
//        assertTrue(!url.equals(driver.getCurrentUrl()));
//    }
//
//    @Given("^I go to \"([^\"]*)\" website$")
//    public void i_go_to_website(String arg1) {
//        // Write code here that turns the phrase above into concrete actions
//        driver.get(arg1);
//        url = driver.getCurrentUrl();
//    }
//
//    @After
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
//    }