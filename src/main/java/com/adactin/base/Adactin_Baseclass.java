package com.adactin.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Baseclass {
	public static WebDriver driver;

	//browser Launch

		public static WebDriver getSite(String link) {
			if (link.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver2\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (link.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");
				driver = new FirefoxDriver();

			}
			return driver;

		}

	//sendkeys	
		public static void inputValue(WebElement element, String s) {
			element.sendKeys(s);
		}

	//close
		public static void close() {
			driver.close();
		}

	//quite
		public static void quite() {
			driver.quit();
		}

	//navigat To
		public static void goTo(String url) {
			driver.navigate().to(url);
		}

	//navigate back
		public static void goBack() {
			driver.navigate().back();
		}
	//navigite Forward

		public static void goForward() {
			driver.navigate().forward();
		}

	//Navigate Refersh
		public static void goReferesh() {
			driver.navigate().refresh();
		}

	//get
		public static void get(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}

	//alert
		public static void alert() {
			driver.switchTo().alert();
		}

	//frames

		public static void switchto(WebElement element) {

			driver.switchTo().frame(element);
		}
		
		
		//click
	public static void click(WebElement element) {
element.click();
}	//actions
	//moveto elements
		public static void moveTO(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
					}
	
//contextClick
		public static void writeClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.click();
			}		
		//singleDropdown
		//Text
		public static void SltbyVisibleText(WebElement element , String st) {
		Select s = new Select(element);
		s.selectByVisibleText(st);
		}
		//Value
		
		public static void SltbyValue(WebElement element , String st) {
		Select s = new Select(element);
		s.selectByValue(st);
		}
		
		
	//take Screenshot	

		public static void takeSnap() throws IOException {
			TakesScreenshot tc = (TakesScreenshot) driver;
			File source =tc.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Praveen\\eclipse-workspace\\Selinium\\SCREENSHOT\\screen.png");
		FileUtils.copyFile(source, destination);
		}
	//wait	
	protected static void implictWait() {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		
		
		
		
		

	}









