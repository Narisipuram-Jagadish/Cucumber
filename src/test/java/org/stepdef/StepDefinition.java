package org.stepdef;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	@Given(": Launch Facebook application")
	public void launch_Facebook_application() {
		launchBrowser();
		maximize();
		deleteCockies();
		loadUrl("https://www.facebook.com/");
	}

	@Given("I  Launch Facebook Application")
	public void i_Launch_Facebook_Application() {
	      
	}

	@When("I click on create new Account")
	public void i_click_on_create_new_Account() {
		clickElement(driver.findElement(By.id("u_0_2")));
	}

	@Then("I verify signout button is displayed")
	public void i_verify_signout_button_is_displayed() {
	    
	}

	@Given("I Launch Facebook Application")
	public void i_Launch_Facebook_Application1() {
		
	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_and(String string, String string2) {
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		sendDataByXpath(user,string);
		sendDataByXpath(pass,string2);
	}

	@Then("I click on Log in Button")
	public void i_click_on_Log_in_Button() {
		clickElement((driver.findElement(By.id("u_0_b"))));
	}
}