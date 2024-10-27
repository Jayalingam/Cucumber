package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

		// 4. To Fill Text box (SendKeys)
		public static void toFillTextBox(WebElement element, String data) {
			element.sendKeys(data);

		}

	// 5. To wait (Thread.Sleep)
	public static void holdProgram(int time) throws InterruptedException {

		Thread.sleep(time);
	}

}
