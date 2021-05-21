package com.adactin.properties;

import org.openqa.selenium.WebDriver;

import com.adatin.helper.Configaration_Reader;

public class File_Reader_Manager {

	private  File_Reader_Manager(){
	
	}
	public static File_Reader_Manager getInstance() {
		 File_Reader_Manager file = new  File_Reader_Manager();
		 return file;
	}
	public   Configaration_Reader getInstanceCR() throws Throwable {
	Configaration_Reader reader = new Configaration_Reader();
	return reader;
}
}