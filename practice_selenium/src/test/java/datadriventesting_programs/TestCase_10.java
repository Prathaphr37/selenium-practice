package datadriventesting_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_10 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fi = new FileInputStream("./src/test/resources/details.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet("Sheet4");
		String url = sheet.getRow(1).getCell(0).getStringCellValue();
		String un = sheet.getRow(1).getCell(1).getStringCellValue();
		String pwd = sheet.getRow(1).getCell(2).getStringCellValue();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.findElement(By.name("username")).sendKeys(un);

		driver.findElement(By.name("password")).sendKeys(pwd);

		WebElement btn = driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]"));
		wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
	}
}
