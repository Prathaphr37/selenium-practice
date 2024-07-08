package testNG_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public Object[][] readData(String sn) throws EncryptedDocumentException, IOException {

		FileInputStream fi = new FileInputStream("./src/test/resources/details.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet(sn);

		int last_row = sheet.getLastRowNum() + 1;
		int last_cell = sheet.getRow(1).getLastCellNum();

		Object[][] ob = new Object[last_row][last_cell];

		for (int i = 0; i < last_row; i++) {
			for (int j = 0; j < last_cell; j++) {
				ob[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}

		book.close();
		return ob;
	}

}
