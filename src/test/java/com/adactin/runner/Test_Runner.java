package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.base.Adactin_Baseclass;
import com.adactin.properties.File_Reader_Manager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//features//Adactin_Features"
,glue = "com.adactin.stepdefinition")

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		

	String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		
		 Adactin_Baseclass.getSite(browser);
		Thread.sleep(4000);
		
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	


