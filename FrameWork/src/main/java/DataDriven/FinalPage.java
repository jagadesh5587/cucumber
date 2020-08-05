package DataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage {
	@FindBy(id = "total_price_dis")
	public static WebElement totalbill;
	@FindBy(id = "gst_dis")
	public static WebElement gst;
	@FindBy(id = "final_price_dis")
	public static WebElement finalbILL;
@FindBy(id = "first_name")
	public static WebElement firstName;
@FindBy(id = "last_name")
public static WebElement lastName;
@FindBy(id = "address")
public static WebElement billingAddress;
@FindBy(id = "cc_num")
public static WebElement creditCardNumber;
@FindBy(id = "cc_type")
public static WebElement creditCardType;
@FindBy(id = "cc_exp_month")
public static WebElement expirymonth;
@FindBy(id = "cc_exp_year")
public static WebElement expiryyear;
@FindBy(id = "cc_cvv")
public static WebElement cvvNumber;
@FindBy(id = "book_now")
public static WebElement bookNow;
@FindBy(id = "order_no")
public static WebElement orderNumber;
@FindBy(id = "my_itinerary")
public static WebElement myIternary;


}
