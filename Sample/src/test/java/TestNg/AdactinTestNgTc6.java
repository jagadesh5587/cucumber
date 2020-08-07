package TestNg;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DataDriven.BookingPage;
import DataDriven.HotelPage;
import DataDriven.LogInPage;
@Test
public class AdactinTestNgTc6 extends BaseClass {
	public void tc6() throws IOException {
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
		String NumberOfRoomsGiven = BookingPage.roomNumber.getAttribute("value");
	String a=NumberOfRoomsGiven.substring(0,1);
	BookingPage.search.click();
		PageFactory.initElements(d,HotelPage.class);
		String NumberOfRoomsShown = HotelPage.numOfRooms.getAttribute("value");
		String b= NumberOfRoomsShown.substring(0,1);
		excelWrite(0, 7, "tc6", 18);
		excelWrite(0, 7, "fail", 19);
		Assert.assertEquals(a,b);
		excelWrite(0, 7, "pass", 19);
		d.quit();
		
		

		
		
	}

}
