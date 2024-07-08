package testNG_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_6 {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void openApp(String bn) {
		if (bn.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(bn.equals("firefox")){
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void skillRary() throws InterruptedException {

		driver.get("https://demoapp.skillrary.com/");

		String title = driver.getTitle();
		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);

		WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));

		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();

		driver.findElement(By.xpath("(//a[text()='selenium'])[1]")).click();

		Thread.sleep(3000);
		WebElement plus_btn = driver.findElement(By.xpath("//button[@id='add']"));

		Thread.sleep(3000);
		a.doubleClick(plus_btn).perform();

	}

	@AfterMethod
	public void closeApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
