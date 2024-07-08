package chromeOption_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartMaximizeMode {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-geolocations");
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
//		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfc.com");
		
		Thread.sleep(10000);
		driver.close();
	}
}
