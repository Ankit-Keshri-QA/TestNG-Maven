package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PractiseTest_02 {

	// Attributes Covered - dependsOnMethods , alwaysRun , groups 

	@Test
	public void startCar() {
		System.out.println("Start Test Case ");
	}

	@Test(dependsOnMethods = { "startCar" })
	public void driveCar() {
		System.out.println("Drive Test Case");
		Assert.fail();
	}

	@Test(dependsOnMethods = { "driveCar" })
	public void stopCar() {
		System.out.println("Stop Test Case");
	}

	@Test(dependsOnMethods = { "driveCar", "stopCar" }, alwaysRun = true)
	public void parkCar() {
		System.out.println("Park Test Case");
	}

	@Test(alwaysRun = true)
	public void i_have_a_car() {
		System.out.println("Always Runs ..");
	}

}
