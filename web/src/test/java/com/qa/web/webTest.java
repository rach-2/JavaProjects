package com.qa.web;

public class webTest {
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Devolopment/web-driver/cromedriver.exc");
		 driver =  new ChromeDriver();
	}

	

	public webTest() 
	{
		// TODO Auto-generated constructor stub
	}

}
