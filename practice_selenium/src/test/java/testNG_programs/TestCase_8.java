package testNG_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//it is failed in fire fox browser
public class TestCase_8 {

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
	public void instagramLogin() {

		driver.get("https://www.instagram.com/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manager");

		driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]")).click();

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
