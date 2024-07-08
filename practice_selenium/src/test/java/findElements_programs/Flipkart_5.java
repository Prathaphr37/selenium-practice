package findElements_programs;

import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Multiset.Entry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='WKTcLC']/..//div[@class='Nx9bqj']"));

		TreeMap<Integer,String> map = new TreeMap<>();
		for (int i = 0; i < titles.size(); i++) {
			String n = titles.get(i).getText();
			String p = prices.get(i).getText();

//			String p1 = p.substring(1);
//			String p2 = p1.replace(",", "");
//			int p3 = Integer.parseInt(p2);

			int p1 = Integer.parseInt(p.substring(1).replace(",", ""));

			map.put(p1, n);
		}
		
		
		for ( java.util.Map.Entry<Integer, String> lv : map.entrySet()) {
			
			System.out.println(lv.getValue()+" = "+lv.getKey());
		}
		

		Thread.sleep(5000);
		driver.close();
	}
}
