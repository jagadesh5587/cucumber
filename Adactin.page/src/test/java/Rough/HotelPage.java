package Rough;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage {
	@FindBy(xpath = "(//input[@class='select_text'])[4]")
	public static WebElement arrival;
	@FindBy(id = "dep_date_0")
	public static WebElement departure;
	@FindBy(id="rooms_0")
	public static WebElement numOfRooms;
	@FindBy(id = "room_type_0")
	public static WebElement roomType;
	@FindBy(id = "total_price_0")
	public static WebElement totalPrice;
	@FindBy(xpath = "//a[text()='Logout']")
	public static WebElement logout;
	@FindBy(id = "radiobutton_0")
	public static WebElement radiobutton;
	@FindBy(id = "continue")
	public static WebElement next;
	@FindBy(id="location_0")
	public static WebElement location;
	@FindBy(id="arr_date_0")
	public static WebElement arrDate;
	@FindBy(id="dep_date_0")
	public static WebElement depDate;
	@FindBy(id = "price_night_0")
	public static WebElement pricepernight;
	@FindBy(id = "no_days_0")
	public static WebElement numofdays;
	
}
