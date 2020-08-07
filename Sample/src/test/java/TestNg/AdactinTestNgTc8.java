package TestNg;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DataDriven.HotelPage;
@Test
public class AdactinTestNgTc8 extends BaseClass {
	public void tc8() throws IOException {
		PageFactory.initElements(d,HotelPage.class);
		String a=HotelPage.pricepernight.getAttribute("value").substring(6);
		String b=HotelPage.numofdays.getAttribute("value").substring(0,1);
		String c=HotelPage.numOfRooms.getAttribute("value").substring(0,1);
		int d=Integer.parseInt(a);
		int e=Integer.parseInt(b);
		int f=Integer.parseInt(c);
		int i=d*e*f+10;
		String s = HotelPage.totalPrice.getAttribute("value").substring(6);
		int h=Integer.parseInt(s);
		excelWrite(0, 9, "tc8", 18);
		excelWrite(0, 9, "fail", 19);
		Assert.assertEquals(h,i);
		excelWrite(0, 9, "pass", 19);

	}

}
