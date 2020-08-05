package Rough;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BaseClass {

	@FindBy(id = "username")
	public static WebElement userName;
	
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(id = "login")
	public static WebElement login;
	
	
	
	
	

}
