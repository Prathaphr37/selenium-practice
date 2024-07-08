package findElements_programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='WKTcLC']/..//div[@class='Nx9bqj']"));

		
		for (int i = 0; i < titles.size(); i++) {
			String n = titles.get(i).getText();
			String p = prices.get(i).getText();

//			String p1 = p.substring(1);
//			String p2 = p1.replace(",", "");
//			int p3 = Integer.parseInt(p2);

			int p1 = Integer.parseInt(p.substring(1).replace(",", ""));

			if (p1 >= 2500) {
				System.out.println(n + " = " + p1);
			}

		}

		Thread.sleep(5000);
		driver.close();
	}
}
