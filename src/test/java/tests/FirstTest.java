package tests;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(priority = 1)
	public void firstTest() {
		System.out.println("First Test .. ");
	}

	@Test(priority = 2)
	public void setup() {
		System.out.println(" Webdriver Setup ..");
		System.out.println("Open Browser ..");
	}

	@Test(priority = 3)
	public void login() {	
		System.out.println("User Login ... ");
	}

	@Test(priority = 4)
	public void closeBrowser() {
		System.out.println("Closing browser ...");
	}
}
