package testNG_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_1 {

	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void facebookLogin() {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("manager");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title = driver.getTitle();
		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);
	}

	@AfterMethod
	public void closeApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
