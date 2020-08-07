package TestNg;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataDriven.LogInPage;
@Test(priority = 1)
public class AdactinTestNgTc1 extends BaseClass{
	
	public void tc1() throws IOException {
		start("chrome");
		implicitWait();
		launchUrl("http://adactin.com/HotelApp/index.php");
		PageFactory.initElements(d,LogInPage.class);
		LogInPage.userName.sendKeys(excelread(0,1,0));
		LogInPage.password.sendKeys(excelread(0,1,1));
		LogInPage.login.click();
		excelWrite(0, 2, "tc1", 18);
		excelWrite(0, 2, "fail", 19);
		Assert.assertEquals("Adactin.com - Search Hotel", (d.getTitle()));
		excelWrite(0, 2, "pass", 19);	
		
		}
}
