package DataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Itenary {
	@FindBy(id = "logout")
	public static WebElement logout;
	@FindBy(xpath = "//a[text()='Click here to login again']")
	public static WebElement loginAgain;
	@FindBy(xpath = "//input[@name='ids[]']")
	public static WebElement checkbox;
	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	public static WebElement cancelSelected;
	@FindBy(xpath = "(//input[@class='reg_button'])[2]")
	public static WebElement searchHotels;
	@FindBy(id = "order_id_text")
	public static WebElement orderId;
	@FindBy(id = "search_hotel_id")
	public static WebElement searchOrderId;
	}


