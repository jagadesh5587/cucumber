package TestNg;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataDriven.BookingPage;
import DataDriven.HotelPage;
@Test(priority = 6)
public class AdactinTestNgTc5 extends BaseClass {
	public  void tc5() throws IOException {
		PageFactory.initElements(d,BookingPage.class);
		AdactinTestNgTc4 ad4=new AdactinTestNgTc4();
		String[] tc4 = ad4.tc4a();
		for (String string :tc4) {
			System.out.println(string);
		}
		PageFactory.initElements(d,HotelPage.class);
		   String hotelDate = HotelPage.arrDate.getAttribute("value");
		   String hotelDate2= HotelPage.depDate.getAttribute("value");
		   excelWrite(0, 6, "tc5", 18);
			excelWrite(0, 6, "fail", 19);
		   Assert.assertEquals( hotelDate,tc4[0]);
		   Assert.assertEquals(hotelDate2,tc4[1]);
			excelWrite(0, 6, "pass", 19);
		
	}

}
