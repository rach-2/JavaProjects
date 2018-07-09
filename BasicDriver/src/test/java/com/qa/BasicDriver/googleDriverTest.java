package com.qa.BasicDriver;

import org.junit.Before;


public class googleDriverTest{

    WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "c/development/web-driver/chromedriver.exe");
        driver = new chromeDriver();



    }
}
