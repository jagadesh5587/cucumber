package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Highlight extends BaseClass{
	public static void main(String[] args) {
		start();
		implicitWait();
		launchUrl("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("xman");
		d.findElement(By.name("btnK")).click();
		
		JavascriptExecutor js=  (JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('style','background-color:pink;border:4px solid black;font-size:25')", d.findElement(By.xpath("(//a[@class='fl'])[11]")));
		//"arguments[0].style.border='3px solid red'"
	}

}
