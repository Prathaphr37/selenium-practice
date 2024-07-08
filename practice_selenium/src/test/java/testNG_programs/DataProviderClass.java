package testNG_programs;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider
	public Object[][] data() {
		Object[][] ob = new Object[4][2];

		// 1st set
		ob[0][0] = "admin";
		ob[0][1] = "manager";

		// 2st set
		ob[1][0] = "12345";
		ob[1][1] = "6789";

		// 3st set
		ob[2][0] = "admin@123";
		ob[2][1] = "manager@123";

		// 4st set
		ob[3][0] = "@#$%&";
		ob[3][1] = "*&#@%";

		return ob;
	}

	@DataProvider
	public Object[][] excel_data() throws EncryptedDocumentException, IOException {
		ExcelData elib = new ExcelData();
		 Object[][] value = elib.readData("Sheet5");

		return value;

	}

}
