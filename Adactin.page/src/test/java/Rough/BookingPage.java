
package Rough;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage{

	@FindBy(xpath ="//select[@id='location']")
	public static WebElement location;
	@FindBy(id = "hotels")
	public static WebElement hotels;
@FindBy(id = "room_type")
	public static WebElement roomType;
@FindBy(id = "room_nos")
	public static WebElement roomNumber;
@FindBy(id = "datepick_in")
public static WebElement checkIn;

@FindBy(id = "datepick_out")
	public static WebElement checkOut;
@FindBy(id = "adult_room")
	public static WebElement adult;
@FindBy(id = "child_room")
	public static WebElement child;
@FindBy(id = "Submit")
public static WebElement search;
@FindBy(xpath = "//a[text()='Booked Itinerary']")
public static WebElement bookedItenary;
@FindBy(id="checkin_span")
public static WebElement dateInError;
@FindBy(id="checkout_span")
public static WebElement DateOutError;



}
