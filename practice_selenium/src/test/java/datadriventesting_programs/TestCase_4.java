package datadriventesting_programs;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestCase_4 {

	public static void main(String[] args) throws Throwable {

		FileInputStream fi = new FileInputStream("./src/test/resources/details.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet("Sheet1");

		int lat_Row = sheet.getLastRowNum();
		int last_cel = sheet.getRow(1).getLastCellNum();

//		System.out.println(lat_Row);
//		System.out.println(last_cel);

		for (int i = 1; i <= lat_Row; i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < last_cel; j++) {
				Cell cel = row.getCell(j);
				String data = cel.toString();
				System.out.print(data + "  ");
			}

			System.out.println();
		}
		book.close();
	}
}
