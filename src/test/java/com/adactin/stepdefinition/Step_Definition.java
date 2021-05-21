package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adaactin.pom.Login_Page;
import com.adactin.base.Adactin_Baseclass;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Adactin_Baseclass {
	public static WebDriver driver = Test_Runner.driver;
	public static Login_Page log = new Login_Page(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		get(url);
	}

	@When("^user  Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		inputValue(log.getUsername(), "PraveenR");
	}

	@When("^user  Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		inputValue(log.getPassword(), "7904269448");
	}

	@Then("^user Click On The Login Button And it Navigates to Search Hotel Field$")
	public void user_Click_On_The_Login_Button_And_it_Navigates_to_Search_Hotel_Field() throws Throwable {
		click(log.getLogin());
	}

}
