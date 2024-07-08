package javascriptExecutor_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		driver.close();
}
}
