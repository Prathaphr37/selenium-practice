package firefoxOption_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DisableGeoLocationAndNotification {

	public static void main(String[] args) throws InterruptedException {

		
	
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-geolocations");
		options.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfc.com");
		
		Thread.sleep(10000);
		driver.close();
	}

}
