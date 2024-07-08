package actions_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		Actions a = new Actions(driver);
		
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
	}
}
