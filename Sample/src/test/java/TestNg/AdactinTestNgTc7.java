package TestNg;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DataDriven.BookingPage;
import DataDriven.HotelPage;
import DataDriven.LogInPage;
@Test
public class AdactinTestNgTc7 extends BaseClass {
	public void tc7() throws IOException {
		
	
	start("chrome");
	implicitWait();
	launchUrl("http://adactinhotelapp.com/index.php");
	PageFactory.initElements(d, LogInPage.class);
	LogInPage.userName.sendKeys(excelread(0, 1, 0));
	LogInPage.password.sendKeys(excelread(0, 1, 1));
	LogInPage.login.click();
	PageFactory.initElements(d, BookingPage.class);
	selectDropDown(BookingPage.location, "visibletext", excelread(0, 3, 2));
	selectDropDown(BookingPage.hotels, "visibletext", excelread(0, 2, 3));
	selectDropDown(BookingPage.roomType, "visibletext", excelread(0, 2, 4));
	BookingPage.checkIn.clear();
	BookingPage.checkIn.sendKeys("20/07/2020");
	BookingPage.checkOut.clear();
	BookingPage.checkOut.sendKeys("27/07/2020");
	String roomTypeGiven = BookingPage.roomType.getAttribute("value");
	BookingPage.search.click();
	PageFactory.initElements(d,HotelPage.class);
	String roomType2 = HotelPage.roomType.getAttribute("value");
	excelWrite(0, 8, "tc7", 18);
	excelWrite(0, 8, "fail", 19);
	Assert.assertEquals(roomTypeGiven,roomType2);
	excelWrite(0, 8, "pass", 19);
	
	
	}

}
