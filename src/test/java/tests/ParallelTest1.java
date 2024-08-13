package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(("https://blazedemo.com/"));
	}

	@Test(priority = 2)
	public void greetTest() {
		WebElement greet = driver.findElement(By.xpath("//div[@class='container']/h1"));
		Assert.assertEquals(greet.getText(), "Welcome to the Simple Travel Agency!");

	}

	@Test(priority = 1)
	public void pageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "BlazeDemo");
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
