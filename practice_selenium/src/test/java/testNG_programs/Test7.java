package testNG_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void ebay() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.id("identify_email")).sendKeys("prathaphr@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("did_submit")).click();
		
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
