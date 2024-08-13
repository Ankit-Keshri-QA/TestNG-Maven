package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMSeleniumTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
	}

	@Test(priority = 2)
	public void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt = 'company-branding']"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is missing ...");

	}

	@Test(priority = 1)
	public void pageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");

	}

	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
