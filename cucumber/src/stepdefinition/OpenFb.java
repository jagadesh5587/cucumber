package stepdefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberSample.BaseClass;

public class OpenFb extends BaseClass{
	@Given("^launch fb url$")
	public void launch_fb_url() throws Throwable {
		start();
		launchUrl("https://www.facebook.com/");
	
	}

	@When("^enter user name and password$")
	public void enter_user_name_and_password() throws Throwable {
		d.findElement(By.id("email")).sendKeys("jagadeesh");
		d.findElement(By.id("pass")).sendKeys("jagadeesh");
	   	}

	@Then("^click login$")
	public void click_login() throws Throwable {
	   d.findElement(By.id("u_0_b")).click();
	}
	

	@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
		d.findElement(By.id("email")).sendKeys(arg1);
		d.findElement(By.id("pass")).sendKeys(arg2);
		
	    
	}

}