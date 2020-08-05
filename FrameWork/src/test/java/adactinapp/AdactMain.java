package adactinapp;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import DataDriven.BaseClass;
import DataDriven.BookingPage;
import DataDriven.FinalPage;
import DataDriven.HotelPage;
import DataDriven.Itenary;
import DataDriven.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactMain extends BaseClass {
	@Given("^Launch hotel reservation application using URL as in test data$")
	public void launch_hotel_reservation_application_using_URL_as_in_test_data() throws Throwable {
		start();
		launchUrl("http://adactinhotelapp.com/index.php");
	}

	@When("^Login to the application using username and password as in test data$")
	public void login_to_the_application_using_username_and_password_as_in_test_data() throws Throwable {
		PageFactory.initElements(d, LogInPage.class);
		LogInPage.userName.sendKeys(excelread(0, 1, 0));
		LogInPage.password.sendKeys(excelread(0, 1, 1));
		LogInPage.login.click();
	}

	@Then("^Select location as in test data$")
	public void select_location_as_in_test_data() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);
		selectDropDown(BookingPage.location, "visibletext", excelread(0, 3, 2));
	}

	@Then("^Select hotel as in test data$")
	public void select_hotel_as_in_test_data() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);

		selectDropDown(BookingPage.hotels, "visibletext", excelread(0, 2, 3));
	}

	@Then("^Select room type as in test data$")
	public void select_room_type_as_in_test_data() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);
		selectDropDown(BookingPage.roomType, "visibletext", excelread(0, 2, 4));
	}

	@Then("^Select no-of-rooms as in test data$")
	public void select_no_of_rooms_as_in_test_data() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);

	}

	@Then("^Enter check-in-date later than check-out-date$")
	public void enter_check_in_date_later_than_check_out_date() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.checkIn.clear();
		BookingPage.checkIn.sendKeys("20/08/2020");

	}

	@Then("^Verify that system gives an error saying check-in-date should not be later than check-out-date$")
	public void verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()
			throws Throwable {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.search.click();
		Assert.assertTrue(
				BookingPage.dateInError.getText().equals("Check-In Date shall be before than Check-Out Date"));
	}

	@Then("^Enter check-out-date as in test data$")
	public void enter_check_out_date_as_in_test_data() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("09/08/2020");
	}

	@Then("^Verify that application throws error message$")
	public void verify_that_application_throws_error_message() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.search.click();
		Assert.assertTrue(
				BookingPage.dateInError.getText().equals("Check-In Date shall be before than Check-Out Date"));
	}

	@Then("^Enter check-in and check-out dates$")
	public void enter_check_in_and_check_out_dates() throws Throwable {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.checkIn.clear();
		BookingPage.checkIn.sendKeys("20/08/2020");
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("27/08/2020");

	}

	@Then("^Click on Search button$")
	public void click_on_Search_button() {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.search.click();
	}

	@And("^Verify that hotel displayed is the same as selected in search Hotel form$")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
		PageFactory.initElements(d, HotelPage.class);
		String hotelDate = HotelPage.arrDate.getAttribute("value");
		String hotelDate2 = HotelPage.depDate.getAttribute("value");
		Object[] tc4 = { "20/07/2020", "27/07/2020" };

		Assert.assertEquals(hotelDate, tc4[0]);
		Assert.assertEquals(hotelDate2, tc4[1]);
	}

	@Then("^getting the details of the hotel page$")
	public void getting_the_details_of_the_hotel_page() throws IOException {
		String ar[] = new String[4];
		implicitWait();
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.checkIn.clear();
		BookingPage.checkIn.sendKeys("20/07/2020");
		BookingPage.checkOut.clear();
		BookingPage.checkOut.sendKeys("28/07/2020");
		ar[0] = BookingPage.checkIn.getAttribute("value");
		ar[1] = BookingPage.checkOut.getAttribute("value");
		ar[2] = BookingPage.location.getAttribute("value");
		ar[3] = BookingPage.roomType.getAttribute("value");
		DataDriven.AdactinTestNgTc4 ad4 = new DataDriven.AdactinTestNgTc4();
		String[] tc4 = ad4.tc4a();
		for (String string : tc4) {
			System.out.println(string);
		}

	}

	@Then("^No-of-rooms should be displayed and match with number of rooms in search hotel page$")
	public void no_of_rooms_should_be_displayed_and_match_with_number_of_rooms_in_search_hotel_page() throws Throwable {
		PageFactory.initElements(d, HotelPage.class);
		String room = HotelPage.numOfRooms.getAttribute("value");
		Assert.assertEquals(room, "1 Rooms");
	}

	@Then("^verification of the rooms types should be same$")
	public void verification_of_the_rooms_types_should_be_same() throws Throwable {
		PageFactory.initElements(d, HotelPage.class);
		String type = HotelPage.roomType.getAttribute("value");
		Assert.assertEquals(type, "Double");
	}

	@Then("^verification of the total price$")
	public void verification_of_the_total_price() throws Throwable {
		PageFactory.initElements(d, HotelPage.class);
		String a = HotelPage.pricepernight.getAttribute("value").substring(6);
		System.out.println(a);
		String b = HotelPage.numofdays.getAttribute("value").substring(0, 1);
		System.out.println(b);
		String c = HotelPage.numOfRooms.getAttribute("value").substring(0, 1);
		int d = Integer.parseInt(a);
		int e = Integer.parseInt(b);
		int f = Integer.parseInt(c);
		int i = d * e * f + 10;
		String s = HotelPage.totalPrice.getAttribute("value").substring(6);
		int h = Integer.parseInt(s);
		Assert.assertEquals(h, i);
	}

	@Then("^User should logout from the application$")
	public void user_should_logout_from_the_application() throws Throwable {
		PageFactory.initElements(d, HotelPage.class);
		HotelPage.logout.click();
	}

	@Then("^select hotel and click on continue button$")
	public void select_hotel_and_click_on_continue_button() throws Throwable {
		PageFactory.initElements(d, HotelPage.class);
		HotelPage.radiobutton.click();
		HotelPage.next.click();
	}

	@And("^total price in last form$")
	public void total_price_in_last_form() {
		PageFactory.initElements(d, FinalPage.class);
		String totalPrice = FinalPage.totalbill.getAttribute("value").substring(6);
		String g = FinalPage.gst.getAttribute("value").substring(6);
		int rs = Integer.parseInt(totalPrice);
		double dollar = Double.parseDouble(g);
		double totalDollar = rs + dollar;
		String sub = FinalPage.finalbILL.getAttribute("value").substring(6);
		double sub1 = Double.parseDouble(sub);
		Assert.assertEquals(totalDollar, sub1, 0.001);
	}

	@Given("user is on final page of booking to enter the first name")
	public void user_is_on_final_page_of_booking_to_enter_the_first_name() throws IOException {
		PageFactory.initElements(d, FinalPage.class);
		FinalPage.firstName.sendKeys(excelread(0, 1, 9));

	}

	@Then("last name is entered")
	public void last_name_is_entered() throws IOException {
		PageFactory.initElements(d, FinalPage.class);
		FinalPage.lastName.sendKeys(excelread(0, 1, 10));
	}

	@Then("entering billing address")
	public void entering_billing_address() throws IOException {
		PageFactory.initElements(d, FinalPage.class);
		FinalPage.billingAddress.sendKeys(excelread(0, 1, 11));

	}

	@Then("entering credit card number")
	public void entering_credit_card_number() throws IOException {
		PageFactory.initElements(d, FinalPage.class);
		FinalPage.creditCardNumber.sendKeys(excelread(0, 1, 12));
	}

	@Then("entering credit card type")
	public void entering_credit_card_type() throws IOException {
		PageFactory.initElements(d, FinalPage.class);
		selectDropDown(FinalPage.creditCardType, "visibletext", excelread(0, 3, 13));
	}

	@Then("user enters cvv number")
	public void user_enters_cvv_number() throws IOException {
		PageFactory.initElements(d, FinalPage.class);
		FinalPage.cvvNumber.sendKeys(excelread(0, 1, 16));
	}

	@Then("user enters expiry date of the card")
	public void user_enters_expiry_date_of_the_card() throws IOException {
		PageFactory.initElements(d, FinalPage.class);
		selectDropDown(FinalPage.expirymonth, "value", excelread(0, 1, 14));
		selectDropDown(FinalPage.expiryyear, "value", excelread(0, 1, 15));
	}

	@Then("clickin on book now button")
	public void clickin_on_book_now_button() {
		PageFactory.initElements(d, FinalPage.class);
		FinalPage.bookNow.click();
	}

	@Then("order number should be generated")
	public void order_number_should_be_generated() {
		PageFactory.initElements(d, FinalPage.class);
		Assert.assertTrue(FinalPage.orderNumber.isDisplayed());

	}

	@When("Click on My itinerary button")
	public void click_on_my_itinerary_button() {
		PageFactory.initElements(d, FinalPage.class);
		FinalPage.myIternary.click();
	}

	@Then("click on booked itinery")
	public void click_on_booked_itinery() {
		PageFactory.initElements(d, BookingPage.class);
		BookingPage.bookedItenary.click();
	}

	@Then("entering order id")
	public void entering_order_id() {
		PageFactory.initElements(d, Itenary.class);
		Itenary.orderId.sendKeys("9112AP917T");
		Itenary.searchOrderId.click();

	}

	@And("Click on Cancel Order Number")
	public void Click_on_Cancel_Order_Number() {
		PageFactory.initElements(d, Itenary.class);
		Itenary.checkbox.click();
		Itenary.cancelSelected.click();

	}

	@Then("Click Yes on pop up which asks where to cancel order or not")
	public void Then_Click_Yes_on_pop_up_which_asks_where_to_cancel_order_or_not() {
		PageFactory.initElements(d, Itenary.class);
		Alert a = d.switchTo().alert();
		a.accept();
	}

	@And("verifying the cancelled order is no more exist")
	public void verifying_the_cancelled_order_is_no_more_exist() {
		PageFactory.initElements(d, Itenary.class);
		Assert.assertTrue(Itenary.error.isDisplayed());
	}

	@Given("login in the page again")
	public void login_in_the_page_again() {
		PageFactory.initElements(d, Itenary.class);
		Itenary.loginAgain.click();
	}

	@Then("verifying booking page title")
	public void verifying_booking_page_title() {

		Assert.assertEquals("Adactin.com - Search Hotel", d.getTitle());
	}

	@Then("verifying hotel page title")
	public void verifying_hotel_page_title() {
		Assert.assertEquals("Adactin.com - Select Hotel", d.getTitle());

	}

}