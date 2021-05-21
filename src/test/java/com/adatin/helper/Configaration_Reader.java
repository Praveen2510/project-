package com.adatin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configaration_Reader {
	
public static Properties p;
 
	public void Configiration_Reader() throws Throwable {

		File f = new File("C:\\Users\\Praveen\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\adactin\\properties\\Configaration.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
		
	}
	
	
	
	}

