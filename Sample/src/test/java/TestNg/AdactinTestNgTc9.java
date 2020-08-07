package TestNg;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataDriven.HotelPage;

@Test
public class AdactinTestNgTc9 extends BaseClass{
	public void tc9() throws IOException {
		PageFactory.initElements(d,HotelPage.class);
		HotelPage.radiobutton.click();
		HotelPage.next.click();
		HotelPage.logout.click();
		excelWrite(0, 10, "tc9", 18);
		excelWrite(0, 10, "fail", 19);
		Assert.assertFalse((d.getTitle().equals("Adactin.com - Select Hotel")));
		excelWrite(0, 10, "pass", 19);
		System.out.println(d.getTitle());
		
		
	}

}
