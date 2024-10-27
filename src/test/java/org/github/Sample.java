package org.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.out.println("Demo");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://github.com/Jayalingam/Cucumber");
		
		
	}

}
