package chromeOption_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--headless");
//		options.addArguments("headless");
		options.addArguments("--disable-geolocations");
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='WKTcLC']/..//div[@class='Nx9bqj']"));

		for (int i = 0; i < titles.size(); i++) {
			String t = titles.get(i).getText();
			String p = prices.get(i).getText();
			System.out.println(t + "=" + p);
		}

		Thread.sleep(5000);
		driver.close();
	}
}
