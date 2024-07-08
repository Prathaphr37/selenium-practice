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

public class TestCase_2 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = null;

		FileInputStream fi = new FileInputStream("./src/test/resources/data2.properties");
		Properties pobj = new Properties();
		pobj.load(fi);

		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String UN = pobj.getProperty("username");
		String PASS = pobj.getProperty("password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PASS);

		WebDriverManager.chromedriver().setup();

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		driver.get(URL);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		wait.until(ExpectedConditions.visibilityOf(un)).sendKeys(UN);

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys(PASS);

		WebElement btn = driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]"));
		wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
	}
}
