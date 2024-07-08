package webdriversMethods_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(5000);
		driver.close();
	}

}
