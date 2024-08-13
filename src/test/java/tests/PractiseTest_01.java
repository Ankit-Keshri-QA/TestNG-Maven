package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PractiseTest_01 {

	// Attributes Covered -> priority , enabled , groups

	@Test
	public void def() {
		System.out.println("DEF Test Case ");
		// Assert.assertEquals(1, 2);
	}

	@Test
	public void abc() {
		System.out.println("ABC Test Case");
	}

	@Test(enabled = false)
	public void disableTest_01() {
		System.out.println("Disabled Test Case 1 ..");
	}

	@Test(priority = 1)
	public void mno() {
		System.out.println("MNO Test Case ..");
	}

	@Test(priority = 3)
	public void fop() {
		System.out.println("FOP Test Case ..");
	}

	@Test(priority = 2)
	public void kli() {
		System.out.println("KLI Test Case ..");
	}

	@Test(enabled = false)
	public void disableTest_02() {
		System.out.println("Disabled Test Case 2 ..");
	}

}
