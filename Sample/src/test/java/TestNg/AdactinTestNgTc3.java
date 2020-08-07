package TestNg;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataDriven.BookingPage;

@Test(priority = 3)
public class AdactinTestNgTc3 extends BaseClass {
	public void tc3() throws IOException {
		 PageFactory.initElements(d, BookingPage.class);
		BookingPage.checkIn.clear();
		BookingPage.checkIn.sendKeys("10/07/2020");
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("07/07/2020");
		BookingPage.search.click();
		excelWrite(0, 4, "tc3", 18);
		excelWrite(0, 4, "fail", 19);
	Assert.assertTrue(BookingPage.dateInError.getText().equals("Check-In Date shall be before than Check-Out Date"));
		excelWrite(0, 4, "pass", 19);

	}

}
