package webdriversMethods_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_04 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.close();
	}
}
