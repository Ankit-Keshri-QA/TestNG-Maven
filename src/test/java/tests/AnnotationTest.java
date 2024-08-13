package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - Runs once before all tests in this suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - Runs once after all tests in this suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - Runs before any test method in the <test> tag");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test - Runs after all test methods in the <test> tag");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Runs once before the first test method in this class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class - Runs once after all the test methods in this class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Runs before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method - Runs after each test method");
	}

	@Test(priority = 1)
	public void testMethod1() {
		System.out.println("Test Method 1 - Actual test case execution");
	}

	@Test(priority = 2)
	public void testMethod2() {
		System.out.println("Test Method 2 - Actual test case execution");
	}

}
