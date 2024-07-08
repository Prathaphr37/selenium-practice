package testNG_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_9 {

	@DataProvider
	public Object[][] getData() {
		Object[][] ob = new Object[4][2];

		// 1st set
		ob[0][0] = "admin";
		ob[0][1] = "manager";

		// 2st set
		ob[1][0] = "12345";
		ob[1][1] = "6789";

		// 3st set
		ob[2][0] = "admin@123";
		ob[2][1] = "manager@123";

		// 4st set
		ob[3][0] = "@#$%&";
		ob[3][1] = "*&#@%";

		return ob;
	}

	@Test(dataProvider = "getData")
	public void faceBook(String user, String pass) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title = driver.getTitle();
		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);

		Thread.sleep(5000);
		driver.close();
	}
}
