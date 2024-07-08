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
import org.testng.xml.XmlTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void openApp(String bn) {
		WebDriverManager.chromedriver().setup();
		if (bn.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (bn.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void facebookLogin(XmlTest xml) {

		driver.get(xml.getParameter("url"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(xml.getParameter("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(xml.getParameter("password"));
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
