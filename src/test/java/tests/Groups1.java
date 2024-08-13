package tests;

import org.testng.annotations.Test;

public class Groups1 {

	@Test(groups = { "sanity" })
	public void TC_01() {
		System.out.println("DEF Test Case ");
	}

	@Test(groups = { "regression" })
	public void TC_02() {
		System.out.println("ABC Test Case");
	}

	@Test(groups = { "smoke", "regression", "sanity" })
	public void TC_03() {
		System.out.println("BCD Test Case");
	}

	@Test(groups = { "sanity", "regression" })
	public void TC_04() {
		System.out.println("BCD Test Case");
	}
}
