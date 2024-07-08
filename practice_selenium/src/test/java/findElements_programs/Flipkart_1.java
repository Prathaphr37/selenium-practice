package findElements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		System.out.println(titles.size());
		for (WebElement lv : titles) {
			System.out.println(lv.getText());
		}
		
		System.out.println("----------------");
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='WKTcLC']/..//div[@class='Nx9bqj']"));
		System.out.println(prices.size());
		for (WebElement lv : prices) {
			System.out.println(lv.getText());
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}
