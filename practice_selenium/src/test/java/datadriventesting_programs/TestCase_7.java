package datadriventesting_programs;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_7 {

	public static void main(String[] args) throws Throwable {

		FileInputStream fi = new FileInputStream("./src/test/resources/insta.proprties");
		Properties pobj = new Properties();
		pobj.load(fi);

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(pobj.getProperty("url"));

		driver.findElement(By.name("username")).sendKeys(pobj.getProperty("username"));

		driver.findElement(By.name("password")).sendKeys(pobj.getProperty("password"));

		driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]")).click();
	}
}
