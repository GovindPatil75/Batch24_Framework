package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcleDataProvider excel;
	
	@BeforeSuite
	public void initilizationsetUp() throws Exception {
		
		 config=new ConfigDataProvider();
		 excel=new ExcleDataProvider();
	}
	
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase(config.getBrowserName())) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get(config.getBaseUrl());
		//driver.get(config.getregisterurl());
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
