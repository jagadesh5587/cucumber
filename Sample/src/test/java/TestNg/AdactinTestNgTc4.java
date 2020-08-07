package TestNg;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataDriven.BookingPage;
import DataDriven.HotelPage;


public class AdactinTestNgTc4 extends BaseClass {
public	String attribute1;
public	String attribute2;
public	String attribute3;
public String attribute4;
@Test(priority = 4)
	public String[] tc4a() throws IOException {
		String ar[]=new String[4];
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.checkIn.clear();
		BookingPage.checkIn.sendKeys("20/07/2020");
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("27/07/2020");
		ar[0] = BookingPage.checkIn.getAttribute("value");
		ar[1] = BookingPage.checkOut.getAttribute("value");
		ar[2]= BookingPage.location.getAttribute("value");
		ar[3]= BookingPage.roomType.getAttribute("value");
		 BookingPage.search.click();
			 excelWrite(0, 5, "tc4", 18);
				excelWrite(0, 5, "fail", 19);
				PageFactory.initElements(d, HotelPage.class);
				String currentLocation = HotelPage.location.getAttribute("value");
				Assert.assertEquals(currentLocation,ar[2]);
				excelWrite(0, 5, "pass", 19);
		
		
		return ar;

	}
@Test(priority = 5)
public void tc4() throws IOException {
	//AdactinTestNgTc4 gh=new AdactinTestNgTc4();
	//String[] tc4a = gh.tc4a();
	PageFactory.initElements(d, BookingPage.class);
	 BookingPage.search.click();
	/* excelWrite(0, 5, "tc4", 18);
		excelWrite(0, 5, "fail", 19);
		PageFactory.initElements(d, HotelPage.class);
		String currentLocation = HotelPage.location.getAttribute("value");
		Assert.assertEquals(currentLocation,tc4a[2]);
		excelWrite(0, 5, "pass", 19);*/
	
}

	

	

}
