package tests;

import org.testng.annotations.Test;

public class Groups2 {

	@Test(groups = { "regression" })
	public void TC_05() {
		System.out.println("DEF Test Case ");
	}

	@Test(groups = { "smoke", "regression" })
	public void TC_06() {
		System.out.println("ABC Test Case");
	}

	@Test(groups = { "sanity", "regression", "smoke" })
	public void TC_07() {
		System.out.println("BCD Test Case");
	}

	@Test(groups = { "sanity" })
	public void TC_08() {
		System.out.println("BCD Test Case");
	}

	@Test(groups = { "smoke", "regression", "sanity" })
	public void TC_09() {
		System.out.println("BCD Test Case");
	}
}
