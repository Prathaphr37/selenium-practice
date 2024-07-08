package webdriversMethods_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriversMethods_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("title = "+title);
		
		System.out.println("-----------------------------");
		
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println("URL="+url);
		System.out.println("-----------------------------");
		
		
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
