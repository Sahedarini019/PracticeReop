package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
	//Cucumber Hooks to run all scenarios
	@Before
	public void beforeScenario() {
		System.out.println("It will run before the scenario starts");
	}
	@After
	public void afterScenario() {
		System.out.println("It will run after the scenario finishes");
	}
	
	// 
	
	//Customized Hooks to run specific scenario
	@Before({"@Smoke"})
	public void beforeTagScenrio() {
		System.out.println("It will run before the scenario starts");
	}
	@After({"@Smoke"})
	public void afterTagScenario() {
		System.out.println("It will run after the scenario finishes");
	}
	//
	
	@Given("^open browser$")
	public void openBrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //driver = new ChromeDriver();
	    
	}
	
	@Given("^go to facebook\\.com$")
	public void go_to_facebook_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.get("http://www.facebook.com");
	    
	}

	@When("^user type valid userID in userID textbox$")
	public void user_type_valid_userID_in_userID_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("email")).sendKeys("myUserID");
	   
	}

	@When("^user type valid password in password box$")
	public void user_type_valid_password_in_password_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("pass")).sendKeys("myPassword");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("login button")).click();
	    
	}

	@Then("^user should see profile page$")
	public void user_should_see_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		boolean result = driver.findElement(By.xpath("")).getText().equals("AlAmin"); // Verify whats visible on the page
//		if(result) {
//			System.out.println("I am in profile page");
//		}
//		else {
//			System.out.println("Not in profile page");
//		}
	}
		
		@When("^user type \"([^\"]*)\" in userID textbox$")
		public void user_type_in_userID_textbox(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("email")).sendKeys(arg1);
		}

		@When("^user type \"([^\"]*)\" in password box$")
		public void user_type_in_password_box(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("password")).sendKeys(arg1);
		}

		@Then("^user should not see profile page$")
		public void user_should_not_see_profile_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			boolean result = driver.findElement(By.xpath("")).getText().equals("AlAmin"); // Verify whats visible on the page
			if(!result) {
				System.out.println("I am in profile page");
			}
			else {
				System.out.println("Not in profile page");
			}
		}
		

	}

