package firefoxOption_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class IncognitoMode {

	public static void main(String[] args) throws InterruptedException {

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-geolocations");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
//		options.addArguments("--incognito");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.hdfc.com");
		
		Thread.sleep(10000);
		driver.close();

	}

}
