
package DataDriven;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AdactIn extends BaseClass {
	@BeforeClass
	public static void browser() throws IOException {
		start();
		implicitWait();
		launchUrl("http://adactinhotelapp.com/index.php");
	}

	@Test
	public void tc1() throws IOException {
		excelWrite(0, 1, "TestCases", 18);
		excelWrite(0, 1, "Results", 19);
		PageFactory.initElements(d, LogInPage.class);
		LogInPage.userName.sendKeys(excelread(0, 1, 0));
		LogInPage.password.sendKeys(excelread(0, 1, 1));
		LogInPage.login.click();
		excelWrite(0, 2, "tc1", 18);
		excelWrite(0, 2, "fail", 19);
		Assert.assertEquals("Adactin.com - Search Hotel", (d.getTitle()));
		excelWrite(0, 2, "pass", 19);

	}

	@Test
	public void tc2() throws IOException {
		PageFactory.initElements(d, BookingPage.class);
		selectDropDown(BookingPage.location, "visibletext", excelread(0, 3, 2));
		selectDropDown(BookingPage.hotels, "visibletext", excelread(0, 2, 3));
		selectDropDown(BookingPage.roomType, "visibletext", excelread(0, 2, 4));
		BookingPage.checkIn.clear();
		BookingPage.checkIn.sendKeys("20/07/2020");
		BookingPage.search.click();
		excelWrite(0, 3, "tc2", 18);
		excelWrite(0, 3, "fail", 19);
		Assert.assertEquals("Adactin.com - Search Hotel", (d.getTitle()));
		excelWrite(0, 3, "pass", 19);
	}

	@Test
	public void tc3() throws IOException {
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("09/07/2020");
		BookingPage.search.click();
		excelWrite(0, 4, "tc3", 18);
		excelWrite(0, 4, "fail", 19);
		Assert.assertEquals("Adactin.com - Search Hotel", (d.getTitle()));
		excelWrite(0, 4, "pass", 19);
	}

	@Test
	public void tc4() throws IOException {
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("22/07/2020");
		BookingPage.search.click();
		excelWrite(0, 5, "tc4", 18);
		excelWrite(0, 5, "fail", 19);
		Assert.assertEquals("Adactin.com - Select Hotel", (d.getTitle()));
		excelWrite(0, 5, "pass", 19);
	}

	@Test
	public void tc5() throws IOException {
		PageFactory.initElements(d, HotelPage.class);
		System.out.println("Matches the checkin date " + HotelPage.arrival.getAttribute("value"));
		System.out.println("Matches the checkout date " + HotelPage.departure.getAttribute("value"));
		excelWrite(0, 6, "tc5", 18);
		excelWrite(0, 6, "fail", 19);
		Assert.assertTrue(
				HotelPage.arrival.getAttribute("value").compareTo(HotelPage.departure.getAttribute("value")) < 0);
		excelWrite(0, 6, "pass", 19);
	}

	@Test
	public void tc6() throws IOException {

		System.out.println("Matches the room type " + HotelPage.roomType.getAttribute("value"));
		excelWrite(0, 7, "tc6", 18);
		excelWrite(0, 7, "fail", 19);
		Assert.assertEquals("Standard", HotelPage.roomType.getAttribute("value"));
		excelWrite(0, 7, "pass", 19);
	}

	@Test
	public void tc7() throws IOException {
		System.out.println("Matches the number of rooms " + HotelPage.numOfRooms.getAttribute("value"));
		excelWrite(0, 8, "tc7", 18);
		excelWrite(0, 8, "fail", 19);
		Assert.assertEquals("1 Rooms", HotelPage.numOfRooms.getAttribute("value"));
		excelWrite(0, 8, "pass", 19);
	}

	@Test
	public void tc8() throws IOException {
		HotelPage.radiobutton.click();
		HotelPage.next.click();
		PageFactory.initElements(d, FinalPage.class);
		System.out.println("Total price: " + FinalPage.finalbILL.getAttribute("value"));
		excelWrite(0, 9, "tc8", 18);
		excelWrite(0, 9, "fail", 19);
		Assert.assertEquals("Adactin.com - Book A Hotel", d.getTitle());
		excelWrite(0, 9, "pass", 19);
	}

	@Ignore
	public void tc9() {
		HotelPage.logout.click();
	}

	@Test
	public void tc10() throws IOException {
		FinalPage.firstName.sendKeys(excelread(0, 1, 9));
		FinalPage.lastName.sendKeys(excelread(0, 1, 10));
		FinalPage.billingAddress.sendKeys(excelread(0, 1, 11));
		FinalPage.creditCardNumber.sendKeys(excelread(0, 1, 12));
		selectDropDown(FinalPage.creditCardType, "visibletext", excelread(0, 3, 13));
		selectDropDown(FinalPage.expirymonth, "value", excelread(0, 1, 14));
		selectDropDown(FinalPage.expiryyear, "value", excelread(0, 1, 15));
		FinalPage.cvvNumber.sendKeys(excelread(0, 1, 16));
		FinalPage.bookNow.click();
		excelWrite(0, 10, "tc10", 18);
		excelWrite(0, 10, "fail", 19);
		Assert.assertTrue(d.getTitle().equals("Adactin.com - Book A Hotel"));
		excelWrite(0, 10, "pass", 19);
	}

	@Test
	public void tc11() throws IOException {
		System.out.println("YOUR ORDER IS: " + FinalPage.orderNumber.getAttribute("value"));
		excelWrite(0, 11, "tc11", 18);
		excelWrite(0, 11, "pass", 19);
	}

	@Test
	public void tc12() throws IOException {

		FinalPage.myIternary.click();
		System.out.println("Itenaries are not editable");
		excelWrite(0, 12, "tc12", 18);
		excelWrite(0, 12, "fail", 19);
		Assert.assertEquals("Adactin.com - Select Hotel", d.getTitle());
		excelWrite(0, 12, "pass", 19);
	}

	@Test
	public void tc13() throws IOException {
		excelWrite(0, 13, "tc13", 18);
		excelWrite(0, 13, "fail", 19);
		PageFactory.initElements(d, Itenary.class);
		Itenary.logout.click();
		Assert.assertFalse((d.getTitle().equals("Adactin.com - Select Hotel")));
		excelWrite(0, 13, "pass", 19);
	}

	@Test
	public void tc14() throws IOException {

		Itenary.loginAgain.click();
		excelWrite(0, 14, "tc14", 18);
		excelWrite(0, 14, "fail", 19);
		Assert.assertEquals("Adactin.com - Hotel Reservation System", d.getTitle());
		excelWrite(0, 14, "pass", 19);
	}

	@Test
	public void tc15() throws IOException {

		PageFactory.initElements(d, LogInPage.class);
		LogInPage.userName.sendKeys("jagadeshrudra");
		LogInPage.password.sendKeys("j@g@d33sh");
		LogInPage.login.click();
		excelWrite(0, 15, "tc15", 18);
		excelWrite(0, 15, "fail", 19);
		Assert.assertEquals("Adactin.com - Search Hotel", (d.getTitle()));
		excelWrite(0, 15, "pass", 19);

	}

	@Test

	public void tc16() throws IOException {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.bookedItenary.click();
		System.out.println("All the details in booked itinerary page should be same as those entered during booking");
		List<WebElement> rows = d.findElements(By.xpath("(//table)[5]//tr"));
		for (int i = 2; i < rows.size() + 1; i++) {
			WebElement ele = d.findElement(By.xpath("(//table)[5]//tr[" + (i) + "]//td[2]//input"));
			String orderlist = ele.getAttribute("value");
			excelWrite(0, i, orderlist, 17);
		}
		excelWrite(0, 16, "tc16", 18);
		excelWrite(0, 16, "fail", 19);
		Assert.assertEquals("Adactin.com - Select Hotel", (d.getTitle()));
		excelWrite(0, 16, "pass", 19);
	}

	@Test
	public void tc17() throws IOException {

		PageFactory.initElements(d, Itenary.class);
		WebElement ele = d.findElement(By.xpath("(//table)[5]//tr[2]//td[2]//input"));
		Itenary.orderId.sendKeys(ele.getAttribute("value"));
		Itenary.searchOrderId.click();
		excelWrite(0, 17, "tc17", 18);
		excelWrite(0, 17, "fail", 19);
		Assert.assertEquals("Adactin.com - Select Hotel", (d.getTitle()));
		excelWrite(0, 17, "pass", 19);

	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void tc18() throws IOException {
		Itenary.checkbox.click();
		Itenary.cancelSelected.click();
		alertOk();
		List<WebElement> rows = d.findElements(By.xpath("(//table)[5]//tr"));
		List<String> list = new ArrayList<String>();
		for (int i = 2; i < rows.size() + 1; i++) {
			WebElement ele = d.findElement(By.xpath("(//table)[5]//tr[" + (i) + "]//td[2]//input"));
			String orderlist = ele.getAttribute("value");

			list.add(orderlist);

		}
		WebElement ele2 = d.findElement(By.xpath("(//table)[5]//tr[2]//td[2]//input"));
		excelWrite(0, 18, "tc18", 18);
		excelWrite(0, 18, "fail", 19);
		Assert.assertFalse(list.contains(ele2));

		excelWrite(0, 18, "pass", 19);
	}

	@Test
	public void tc19() throws IOException {

		screenshot("D:\\screen\\booking.png");
		excelWrite(0, 19, "tc19", 18);
		excelWrite(0, 19, "pass", 19);
	}

	@Test
	public void tc20() throws IOException {
		PageFactory.initElements(d, Itenary.class);
		Itenary.logout.click();
		excelWrite(0, 20, "tc20", 18);
		excelWrite(0, 20, "fail", 19);
		Assert.assertFalse((d.getTitle().equals("Adactin.com - Select Hotel")));
		excelWrite(0, 20, "pass", 19);
	}

}
