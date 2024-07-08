package webdriversMethods_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriversMethods_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(3000);
		driver.close();
	}
}
