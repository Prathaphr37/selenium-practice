package findElements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetion_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		for (WebElement lv : sugg) {
			String text = lv.getText();
			if (text.equalsIgnoreCase("selenium download")) {
				lv.click();
				break;
			}
		}
		
		Thread.sleep(3000);
//		driver.close();
	}
}
