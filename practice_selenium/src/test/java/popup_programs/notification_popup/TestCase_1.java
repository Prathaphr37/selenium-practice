package popup_programs.notification_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_1 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-geolocations");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfc.com");
		
		Thread.sleep(10000);
		driver.close();
	}


}
