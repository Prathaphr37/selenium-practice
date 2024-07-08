package datadriventesting_programs;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_3 {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fi = new FileInputStream("./src/test/resources/details.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cel = row.getCell(0);
		String data = cel.getStringCellValue();
		
		System.out.println(data);
		
		book.close();
	}
}
