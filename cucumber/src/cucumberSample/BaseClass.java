package cucumberSample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver d;

	public static void implicitWait() {
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void explicitWait(WebElement elements) {
		WebDriverWait explicit = new WebDriverWait(d, 20);
		explicit.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public static void start() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jagadeesh\\eclipse-workspace\\practise\\driver\\chromedriver.exe");
		d = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		d.get(url);
		d.manage().window().maximize();
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static void selectDropDown(WebElement element, String option, String value) {
		Select sc = new Select(element);
		if (option.equals("value")) {
			sc.selectByValue(value);
		} else if (option.equals("index")) {
			sc.selectByIndex(Integer.parseInt(value));
		} else if (option.equals("visibletext")) {
			sc.selectByVisibleText(value);
		}

	}

	public static void scrollElementDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollElementUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void alert(String value) {
		Alert a = d.switchTo().alert();
		a.sendKeys(value);
	}

	public static void alertOk() {
		Alert a = d.switchTo().alert();
		a.accept();
	}

	public static void header(String s) {
		List<WebElement> findele = 
d.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		for (WebElement wb : findele) {
			if (s.equalsIgnoreCase(wb.getText())) {
				actionsHover(wb);
				break;
			}

		}
	}

	public static void subHeader(String s1) {
		List<WebElement> find =
d.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']//following::li//a"));
		for (WebElement web : find) {
			if (s1.equalsIgnoreCase(web.getText())) {
				web.click();
				break;
			}
		}
	}

	public static void alertCancel() {
		Alert a = d.switchTo().alert();
		a.dismiss();
	}

	public static void actionsHover(WebElement element) {
		Actions ac = new Actions(d);
		ac.moveToElement(element).build().perform();
	}

	public static void actionDoubleClick(WebElement element) {
		Actions ac = new Actions(d);
		ac.doubleClick(element).build().perform();
	}

	public static void actionRightClick(WebElement element) {
		Actions ac = new Actions(d);
		ac.contextClick(element).build().perform();
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("javascript:window.scrollBy(0,600)");
	}

	public static void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("javascript:window.scrollBy(3000,0)");
	}

	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void getWindowHandle() {
		 d.getWindowHandle();
		System.out.println(d.getCurrentUrl());
	}

	public static void getWindowHandles

	(String win) {
		Set<String> win2 = d.getWindowHandles();
		for (String string : win2) {
			if (!win.equals(string))
				d.switchTo().window(string);
		}
	}

	/*public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) d;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File source = new File(path);
		FileUtils.copyFile(screenshotAs, source);
	}*/

}
