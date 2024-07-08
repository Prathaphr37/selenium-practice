package datadriventesting_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestCase_8 {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fi = new FileInputStream("./src/test/resources/details.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.createRow(0);
		Cell cel = row.createCell(0);
		 cel.setCellValue("Hi");
		
		FileOutputStream fo = new FileOutputStream("./src/test/resources/details.xlsx");
		book.write(fo);
		book.close();
		
		
	}
}
