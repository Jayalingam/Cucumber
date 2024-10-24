package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	// 1. To Launch Chrome Browser
		public static void openChromeBrowser() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		// 2. To Maximize Browser Window
		public static void maxWindow() {

			driver.manage().window().maximize();
		}
		
		// 3. To Launch a URL
		public static void launchUrl(String url) {

			driver.get(url);
		}

}
