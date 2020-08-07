package TestNg;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataDriven.BookingPage;

@Test(priority = 2)
public class AdactinTestNgTc2 extends BaseClass {
	public void tc2() throws IOException {
        PageFactory.initElements(d, BookingPage.class);
		selectDropDown(BookingPage.location, "visibletext", excelread(0, 3, 2));
		selectDropDown(BookingPage.hotels, "visibletext", excelread(0, 2, 3));
		selectDropDown(BookingPage.roomType, "visibletext", excelread(0, 2, 4));
		BookingPage.checkIn.clear();
		BookingPage.checkIn.sendKeys("20/07/2020");
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("09/07/2020");
		BookingPage.search.click();
		System.out.println(BookingPage.dateInError.getText());
		System.out.println(BookingPage.DateOutError.getText());
		excelWrite(0, 3, "tc2", 18);
		excelWrite(0, 3, "fail", 19);
		Assert.assertTrue(BookingPage.dateInError.getText().equals("Check-In Date shall be before than Check-Out Date"));
		excelWrite(0, 3, "pass", 19);

	}

}
