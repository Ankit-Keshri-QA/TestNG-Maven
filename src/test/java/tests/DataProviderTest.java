package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "dp")
	public void loginTest(String user, String pass) {

		System.out.println(user + " -- " + pass);

	}

	@Test(dataProvider = "order", dataProviderClass = CustomDataProvider.class)
	public void productOrder(String user, String pass, String prod) {
		System.out.println();
		System.out.println(user + " -- " + pass+" -- > "+prod);

	}

	@DataProvider(name = "dp")
	public Object[][] getData() {
		Object[][] data = { { "abc@gmail.com", "pass123" }, { "def@gmail.com", "pass312" },
				{ "ijk@gmail.com", "pass990" } };

		return data;
	}

}
