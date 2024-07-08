package datadriventesting_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_9 {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='WKTcLC']/..//div[@class='Nx9bqj']"));
	

		FileInputStream fi = new FileInputStream("./src/test/resources/details.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet("Sheet3");

		int j=0;
		for (int i = 1; i < titles.size(); i++) {

			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(titles.get(j).getText());
			row.createCell(1).setCellValue(prices.get(j).getText());
			j++;
		}

		FileOutputStream fo = new FileOutputStream("./src/test/resources/details.xlsx");
		book.write(fo);
		book.close();
	}
}
