package org.github;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.baseclass.BaseClass;

public class GitHubLogin extends BaseClass{
	
	WebDriver driver;
	
	@Given("user have to open facebook login page")
	public void user_have_to_open_facebook_login_page(){
		System.out.println("Login Page");
		openChromeBrowser();
		maxWindow();
		launchUrl("https://github.com/Jayalingam/Cucumber");
	
		
	}
	
	@And("maximize the screen")
	public void maximize_the_screen() {
		System.out.println("Maximize the Screen");

	}

	@When("user have to enter email and password")
	public void user_have_to_enter_email_and_password() {
		System.out.println("Enter Email and Password");
	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() {
		System.out.println("Click Login Button");
	}

	@Then("user have to enter another page")
	public void user_have_to_enter_another_page() {
		
		System.out.println("check home Page");
		
//		String url = driver.getCurrentUrl();
//		if (url.contains("privacy_mutation_token")) {
//			System.out.println("Invalid Page");
//			
//		}
//		else {
//			System.out.println("Valid Login");
//		}
			
		
	}

	
}