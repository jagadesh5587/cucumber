package TestNgPractise;

import org.testng.annotations.Test;

import DataDriven.BaseClass;

public class TestFb extends BaseClass{
	@Test
	public void facebook() {
		start();
		implicitWait();
		launchUrl("https://www.google.com/");
	}
	
	
}