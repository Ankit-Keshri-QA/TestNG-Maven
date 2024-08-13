package tests;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	
	@DataProvider(name = "order")
	public Object[][] getData() {
		Object[][] data = { { "abc@gmail.com", "pass123","iphone" }, { "def@gmail.com", "pass312","samsung" },
				{ "ijk@gmail.com", "pass990","oneplus" } };

		return data;
	}
	
}
