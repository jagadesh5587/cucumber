package Rough;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Rework extends BaseClass{
	@Test
	public void tc() {
		start();
		implicitWait();
		launchUrl("http://adactin.com/HotelApp/index.php");
		
	}
	@Test
	public String tc1() {
		PageFactory.initElements(d,LogInPage.class);
		LogInPage.userName.sendKeys("jagadeshrudra");
		LogInPage.password.sendKeys("j@g@d33sh");
		String attribute = LogInPage.userName.getAttribute("value");
		System.out.println(attribute);
		LogInPage.login.click();
		return attribute;
		
		
		
		
	
		
		
	}
	
	
	
	
	
	
}